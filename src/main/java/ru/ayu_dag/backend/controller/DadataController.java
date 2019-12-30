package ru.ayu_dag.backend.controller;

import com.kuliginstepan.dadata.client.domain.Suggestion;
import com.kuliginstepan.dadata.client.domain.address.Address;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ru.ayu_dag.backend.model.Hotel;
import ru.ayu_dag.backend.service.DadataService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DadataController {
    private final DadataService dadataService;

    @GetMapping(value = "/address")
    public Flux<Suggestion<Address>> searchAddress(@RequestParam String query) {
        return dadataService.getSuggestionsForAddress(query);
    }

    @GetMapping(value = "/test")
    public Hotel test() {
        return new Hotel(1L, "name", "desc", "location");
    }
}