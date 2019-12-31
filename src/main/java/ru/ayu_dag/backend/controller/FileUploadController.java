package ru.ayu_dag.backend.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@CrossOrigin(origins = "*")
public class FileUploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public void UploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(file.getName());
        System.out.println(file.getBytes().length);
        System.out.println(file.getOriginalFilename());
    }
}
