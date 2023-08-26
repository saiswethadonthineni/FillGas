package com.springapi.project.controller;

import com.springapi.project.dto.RequestDto;
import com.springapi.project.dto.ResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ControllerClass {
    @PostMapping("/fill_gas")
    public ResponseDto fillGas(@RequestBody RequestDto request) {
        double maxCapacity = request.getMaxGallonCapacity();
        double existingGallons = request.getExistingGallons();

        // Assuming gas price per gallon is $3.50
        double pricePerGallon = 3.50;

        // Calculate how many gallons can be filled
        double availableSpace = maxCapacity - existingGallons;
        double filledGallons = Math.min(availableSpace, existingGallons);

        // Calculate total price
        double totalPrice = filledGallons * pricePerGallon;

        // Get the current date and time
        LocalDateTime transactionDate = LocalDateTime.now();

        return new ResponseDto(filledGallons, pricePerGallon, transactionDate, totalPrice);
    }
}

