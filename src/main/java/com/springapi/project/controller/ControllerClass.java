package com.springapi.project.controller;

import com.springapi.project.FillgasService;
import com.springapi.project.dto.RequestDto;
import com.springapi.project.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;


@RestController
public class ControllerClass {
    private FillgasService fillgasService;
    @Autowired
    public ControllerClass(FillgasService fillgasService) {
        this.fillgasService = fillgasService;
    }


    @PostMapping("/fill_gas")
    public ResponseDto fillGas(@RequestBody RequestDto request) {
        return fillgasService.fillGas(request);
    }
}

