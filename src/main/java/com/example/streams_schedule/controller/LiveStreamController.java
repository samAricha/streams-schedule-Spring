package com.example.streams_schedule.controller;

import com.example.streams_schedule.model.LiveStream;
import com.example.streams_schedule.repository.LiveStreamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {


    //http://localhost:8080/streams
    @GetMapping
    public List<LiveStream> findAll(){
        return null;
    }
}
