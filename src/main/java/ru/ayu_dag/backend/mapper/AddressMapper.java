package ru.ayu_dag.backend.mapper;

import org.springframework.stereotype.Component;
import ru.ayu_dag.backend.model.Address;

@Component
public class AddressMapper {

    public Address toEntity(com.kuliginstepan.dadata.client.domain.address.Address addressDto) {
        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setStreet(addressDto.getStreet());
        address.setHouse(addressDto.getHouse());
        address.setGeoLat(addressDto.getGeoLat());
        address.setGeoLon(addressDto.getGeoLon());
        address.setFiasId(addressDto.getFiasId());
        return address;
    }
}