package com.github.tsijercic1.auctionapi.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDataResponse {
    private Long id;
    private String name;
    private String description;
    private CategoryDataResponse category;
    private BigDecimal startPrice;
    private Instant auctionStart;
    private Instant auctionEnd;
    private List<String> pictures;
}
