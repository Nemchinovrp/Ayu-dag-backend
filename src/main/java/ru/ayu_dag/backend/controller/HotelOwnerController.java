package ru.ayu_dag.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.ayu_dag.backend.jwt.JwtTokenProvider;
import ru.ayu_dag.backend.model.Role;
import ru.ayu_dag.backend.model.User;
import ru.ayu_dag.backend.service.UserService;

import java.security.Principal;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HotelOwnerController {
    private final JwtTokenProvider tokenProvider;
    private final UserService userService;

    @PostMapping("/api/hotel_owner/registration")
    public ResponseEntity<?> register(@RequestBody User user) {
        if (userService.findByUsername(user.getUsername()) != null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        user.setRole(Role.HOTEL_OWNER);
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/api/hotel_owner/login")
    public ResponseEntity<?> getUser(Principal principal) {
        if (principal == null) {
            return ResponseEntity.ok(principal);
        }
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) principal;
        User user = userService.findByUsername(authenticationToken.getName());
        user.setToken(tokenProvider.generateToken(authenticationToken));
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}