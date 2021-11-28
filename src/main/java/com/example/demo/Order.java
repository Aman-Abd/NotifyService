package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Order {
    private int Id;
    private int amount;
    private int userId;
    private boolean valid;
    private String subscriptionType;

    @Override
    public String toString() {
        return "Order{" +
                "Id=" + Id +
                ", amount=" + amount +
                ", userId=" + userId +
                ", valid=" + valid +
                ", subscriptionType='" + subscriptionType + '\'' +
                '}';
    }
}
