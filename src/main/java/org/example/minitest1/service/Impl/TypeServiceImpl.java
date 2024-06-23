package org.example.minitest1.service.Impl;


import org.example.minitest1.model.DTO.TypeDTO;
import org.example.minitest1.model.Type;
import org.example.minitest1.repository.TypeRepository;
import org.example.minitest1.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class TypeServiceImpl implements TypeService {
    private final TypeRepository typeRepository;

    @Autowired
    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public void save(Type type) {
        typeRepository.save(type);
    }

    @Override
    public void delete(Long id) {
        typeRepository.deleteById(id);
    }

    @Override
    public Iterable<Type> findAll() {
        return typeRepository.findAll();
    }

    @Override
    public Optional<Type> findById(Long id) {
        return typeRepository.findById(id);
    }

    @Override
    public Page<TypeDTO> findQuantityInTypeByIdType(Pageable pageable) {
        return typeRepository.findQuantityInProducerByIdProducer(pageable);
    }
}
