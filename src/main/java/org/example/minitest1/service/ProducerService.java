package org.example.minitest1.service;


import org.example.minitest1.model.DTO.ProducerDTO;
import org.example.minitest1.model.Producer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProducerService extends IService<Producer>{
    Page<ProducerDTO> findQuantityInProducerByIdProducer(Pageable pageable);
}
