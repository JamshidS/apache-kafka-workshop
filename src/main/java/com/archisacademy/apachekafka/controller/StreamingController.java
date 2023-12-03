package com.archisacademy.apachekafka.controller;

import com.archisacademy.apachekafka.service.StreamingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stream")
public class StreamingController {
    private final StreamingService service;

    public StreamingController(StreamingService service) {
        this.service = service;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message){
        return service.sendMessage(message);
    }
}
