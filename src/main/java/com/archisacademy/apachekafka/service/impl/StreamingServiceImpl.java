package com.archisacademy.apachekafka.service.impl;

import com.archisacademy.apachekafka.service.StreamingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class StreamingServiceImpl implements StreamingService {

    @Value("${spring.kafka.template.default-topic}")
    private String topicName;

    private final KafkaTemplate<String,Object> kafkaTemplate;

    public StreamingServiceImpl(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String sendMessage(String message) {
        //todo:write kafka codes here
        System.out.println("Sending Message to kafka broker: "+message);
        kafkaTemplate.send(topicName,message);
        return "Message sent successfully";
    }

    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void receiveMessage(String message){
        System.out.println("Received Message From Kafka Broker: "+message);
    }
}
