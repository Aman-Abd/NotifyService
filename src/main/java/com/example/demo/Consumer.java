package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    @KafkaListener(topics = "book_requests", groupId = "group_id")
    public void consume(RefundRequest refundRequest) throws IOException {
        System.out.println(String.format("#### -> Notify user by email: -> %s",
                "User " + refundRequest.getUserId() + " purchased book "
                        + refundRequest.getBook().toString()));
    }
}
