package com.modelaai.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

public record CarDTO(

@NotNull
String modelo, 

@NotNull
String fabricante, 

@Past
@NotNull
String dataFabricacao,

@NotBlank
@Pattern(regexp = "^[0-9]{10},[0-9]{2}")
double valor, 

@NotBlank
int anoModelo
){
    
}
 