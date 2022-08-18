package com.kafka.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${topic.mensagem}", groupId = "group_id")
    public void consume(String message) throws IOException {
        logger.info(String.format("#### -> Consumindo mensagem -> %s", message));
    }
}
