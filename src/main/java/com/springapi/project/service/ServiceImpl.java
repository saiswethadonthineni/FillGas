package com.springapi.project.service;

import com.springapi.project.FillgasService;
import com.springapi.project.dto.RequestDto;
import com.springapi.project.dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ServiceImpl implements FillgasService {
    @Override
    public ResponseDto fillGas(RequestDto request) {
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
