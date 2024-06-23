package org.example.minitest1.repository;


import org.example.minitest1.model.DTO.TypeDTO;
import org.example.minitest1.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<Type,Long> {
    @Query(value = "select type.name as name , count(car.type_id) as quantity from type left join car on type.id = car.type_id group by type.id",countQuery = "SELECT count(*) FROM type",nativeQuery = true)
    Page<TypeDTO> findQuantityInProducerByIdProducer(Pageable pageable);
}
