package ru.ayu_dag.backend.dto;

import com.kuliginstepan.dadata.client.domain.address.Address;
import lombok.Data;

@Data
public class HotelCreateDto {
    private String name;
    private String description;
    private Address address;
}
