package org.example.splitwise.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transactions {
    private User userFrom;
    private User userTo;
    private  int amount;
}
