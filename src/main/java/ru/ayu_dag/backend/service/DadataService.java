package ru.ayu_dag.backend.service;

import com.kuliginstepan.dadata.client.DadataClient;
import com.kuliginstepan.dadata.client.domain.Suggestion;
import com.kuliginstepan.dadata.client.domain.address.Address;
import com.kuliginstepan.dadata.client.domain.address.AddressRequestBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DadataService {
    private final DadataClient client;

    public Flux<Suggestion<Address>> getSuggestionsForAddress(String query) {
        return client.suggestAddress(AddressRequestBuilder.create(query).build());
    }
}
