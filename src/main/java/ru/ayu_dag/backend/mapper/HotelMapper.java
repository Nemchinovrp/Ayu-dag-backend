package ru.ayu_dag.backend.mapper;

import org.springframework.stereotype.Component;
import ru.ayu_dag.backend.dto.HotelCreateDto;
import ru.ayu_dag.backend.model.Address;
import ru.ayu_dag.backend.model.Hotel;

@Component
public class HotelMapper {

    public Hotel toEntity(HotelCreateDto hotelDto, Address address) {
        return new Hotel(hotelDto.getName(), hotelDto.getDescription(), address);
    }
}