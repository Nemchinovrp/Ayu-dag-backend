package ru.ayu_dag.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ayu_dag.backend.dto.HotelCreateDto;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "hotel")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HotelController {

    @PostMapping(value = "/create")
    public String createHotel(@RequestBody HotelCreateDto hotelCreateDto) {
        String result = hotelCreateDto.toString();
        System.out.println(result);
        return result;
    }
}