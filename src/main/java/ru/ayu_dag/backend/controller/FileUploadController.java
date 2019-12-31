package ru.ayu_dag.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@CrossOrigin(origins = "*")
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResponseEntity<String> UploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getBytes().length);
        System.out.println(file.getOriginalFilename());
        System.out.println(file.isEmpty());
        return new ResponseEntity<>("Load File with Name" + file.getOriginalFilename(), HttpStatus.OK);
    }
}
