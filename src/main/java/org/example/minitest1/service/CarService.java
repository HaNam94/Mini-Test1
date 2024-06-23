package org.example.minitest1.service;


import org.example.minitest1.model.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService extends IService<Car>{
    Page<Car> findByNameContainingPageAndSort(String name , Pageable pageable);
    Page<Car> findAllPageAndSort(Pageable pageable);
}
