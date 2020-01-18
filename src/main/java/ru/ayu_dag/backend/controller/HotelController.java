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
    public void createHotel(@RequestBody HotelCreateDto hotelCreateDto) {
        System.out.println(hotelCreateDto);
    }
}
