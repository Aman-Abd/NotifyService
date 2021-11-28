package com.example.demo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Refund {

    private String id;
    private String amount;
    private String userName;
    private String description;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
