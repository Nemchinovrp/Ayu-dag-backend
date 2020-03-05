package ru.ayu_dag.backend.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.ayu_dag.backend.model.Address;


@Component
public class AddressMapper {
    private ModelMapper modelMapper = new ModelMapper();

    public Address toEntity(com.kuliginstepan.dadata.client.domain.address.Address addressDto) {
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        return modelMapper.map(addressDto, Address.class);
    }

    public com.kuliginstepan.dadata.client.domain.address.Address toDto(Address address) {
        return modelMapper.map(address, com.kuliginstepan.dadata.client.domain.address.Address.class);
    }
}