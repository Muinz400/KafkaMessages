package com.spring.KafkaMessages;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final com.spring.KafkaMessages.Producer producer;

    public Controller(Producer producer) {
        this.producer = producer;
    }
        @PostMapping("/publish")
        public void writeMessageToTopic (@RequestParam("message") String message){
            this.producer.writeMessage(message);

        }
    }
