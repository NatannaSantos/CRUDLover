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


@NotNull
@Pattern(regexp = "\\d{2}/\\d{2}/\\d{4}")
String dataFabricacao,

@NotNull
double valor, 

@NotNull
int anoModelo
){
    
}
 