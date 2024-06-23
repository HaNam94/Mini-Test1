package org.example.minitest1.service;


import org.example.minitest1.model.DTO.TypeDTO;
import org.example.minitest1.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService extends IService<Type>{
    Page<TypeDTO> findQuantityInTypeByIdType(Pageable pageable);
}
