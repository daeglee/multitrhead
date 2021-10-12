package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Component
@RequiredArgsConstructor
public class Routine {

    private final MemoryRepository memoryRepository;
    @Autowired
    private volatile MemoryRepository2 memoryRepository2;

    @Scheduled(fixedDelay = 1000)
    public void addRandomData(){
        memoryRepository.save(LocalDateTime.now().toString());

        ArrayList<String> strings = new ArrayList<String>(memoryRepository.findAll());

        memoryRepository2.setStringArrayList(strings);
    }

}

