package com.thoughtworks.rslist.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Trade {
    private int amount ;
    private int rank;

    public Trade (int amount ,int rank){
        this.amount = amount;
        this.rank = rank;
    }
}
