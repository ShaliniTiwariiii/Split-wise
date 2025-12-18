package org.example.splitwise.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.splitwise.model.Transactions;

import java.util.List;

@Getter
@Setter
public class SettleUpGroupResponseDTO {
    private ResponseStatus responseStatus;
    private String failureMessage;
    private List<Transactions>transactions;
}
