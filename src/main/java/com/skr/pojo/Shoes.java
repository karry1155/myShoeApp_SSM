package com.skr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shoes {
    private int identifyID;
    private String shoeID;
    private String shoeSize;
    private double shoePurchasePrice;
    private double shoeTransportationCost;
    private double shoeProfit;
    private String shoeStatus;
}
