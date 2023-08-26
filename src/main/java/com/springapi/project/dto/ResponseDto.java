package com.springapi.project.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponseDto {
    private double noOfGallonsFilled;
    private double pricePerGallon;

    public ResponseDto(double noOfGallonsFilled, double pricePerGallon, LocalDateTime transactionDate, double totalPrice) {
        this.noOfGallonsFilled = noOfGallonsFilled;
        this.pricePerGallon = pricePerGallon;
        this.transactionDate = transactionDate;
        this.totalPrice = totalPrice;
    }

    private LocalDateTime transactionDate;
    private double totalPrice;


}
