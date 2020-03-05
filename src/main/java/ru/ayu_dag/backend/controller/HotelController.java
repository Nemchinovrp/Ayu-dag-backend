package ru.ayu_dag.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ayu_dag.backend.dto.HotelCreateDto;
import ru.ayu_dag.backend.mapper.AddressMapper;
import ru.ayu_dag.backend.mapper.HotelMapper;
import ru.ayu_dag.backend.model.Address;
import ru.ayu_dag.backend.model.Hotel;
import ru.ayu_dag.backend.repository.AddressRepository;
import ru.ayu_dag.backend.repository.HotelRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "hotel")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HotelController {
    private final AddressRepository addressRepository;
    private final HotelRepository hotelRepository;
    private final AddressMapper addressMapper;
    private final HotelMapper hotelMapper;

    @PostMapping(value = "/create")
    public String createHotel(@RequestBody HotelCreateDto hotelCreateDto) {
        Address address = addressMapper.toEntity(hotelCreateDto.getAddress());
        Address saveAddress = addressRepository.save(address);
        Hotel hotel = hotelMapper.toEntity(hotelCreateDto, saveAddress);
        hotelRepository.save(hotel);
        String result = hotelCreateDto.toString();
        System.out.println(result);
        return result;
    }
}