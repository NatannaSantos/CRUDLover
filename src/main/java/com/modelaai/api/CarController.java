package com.modelaai.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dto.CarDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repository.CarRepository;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @GetMapping
    public List<Car> listAll(){
        return repository.findAll();
    }

    @PostMapping
    public void createCar(@RequestBody @Valid CarDTO req){
        repository.save(new Car(req));      
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
