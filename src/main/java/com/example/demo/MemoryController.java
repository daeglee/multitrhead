package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemoryController {

    private final MemoryRepository2 memoryRepository2;

    @GetMapping("/get")
    public List<String> getter(){
        return memoryRepository2.findAll();
    }
}
