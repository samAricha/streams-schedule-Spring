package com.example.streams_schedule.controller;

import com.example.streams_schedule.model.LiveStream;
import com.example.streams_schedule.repository.LiveStreamRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository){
        this.repository = repository;
    }
    //http://localhost:8080/streams
    @GetMapping
    public List<LiveStream> findAll(){
        return repository.findAll();
    }

    //GET http://localhost:8080/streams/1234-2345-3456-8798
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id){
        return repository.findById(id);
    }

    //POST http://localhost:8080/streams/
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@Valid @RequestBody LiveStream stream){//using jackson for the mapping of the body
       return repository.create(stream);
    }

    //PUT http://localhost:8080/streams/
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void update(@RequestBody LiveStream stream, @PathVariable String id){

        repository.update(stream, id);

    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){

        repository.delete(id);

    }


}
