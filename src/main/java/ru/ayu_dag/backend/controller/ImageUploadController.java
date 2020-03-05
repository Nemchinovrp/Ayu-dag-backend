package ru.ayu_dag.backend.controller;

import com.jlefebure.spring.boot.minio.MinioException;
import com.jlefebure.spring.boot.minio.MinioService;
import io.minio.messages.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;


@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ImageUploadController {
    private final MinioService minioService;

    @PostMapping(value = "/upload")
    public ResponseEntity<UUID> UploadFile(@RequestParam("file") MultipartFile file) {
        UUID uuid = UUID.randomUUID();
        Path path = Paths.get(uuid.toString());
        try {
            minioService.upload(path, file.getInputStream(), file.getContentType());
        } catch (com.jlefebure.spring.boot.minio.MinioException e) {
            throw new IllegalStateException("The file cannot be upload on the internal storage. Please retry later", e);
        } catch (IOException e) {
            throw new IllegalStateException("The file cannot be read", e);
        }
        return new ResponseEntity<>(uuid, HttpStatus.OK);
    }

    @GetMapping(value = "/image")
    public void getImage() throws MinioException, IOException {
        InputStream inputStream = minioService.get(Paths.get("4dde0faf-c1b8-4c01-a4c6-d3aed1758d7f"));
        System.out.println(inputStream.available());
        System.out.println(inputStream.toString());
        System.out.println(inputStream.read());
    }

    @GetMapping(value = "/all")
    public List<Item> testMinio() throws com.jlefebure.spring.boot.minio.MinioException {
        return minioService.list();
    }
}
