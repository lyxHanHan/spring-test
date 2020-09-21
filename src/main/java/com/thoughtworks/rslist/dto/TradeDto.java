package com.thoughtworks.rslist.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.*;


@Entity
@Builder
@javax.persistence.Table(name = "trade")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradeDto {
    @Id
    @GeneratedValue
    private int id;
    private int rank;
    private int amount;

    @ManyToOne
    private RsEventDto rsEventDto;

}
