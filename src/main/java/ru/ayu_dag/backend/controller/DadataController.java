package ru.ayu_dag.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.ayu_dag.backend.service.DadataService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DadataController {
    private final DadataService dadataService;



}
