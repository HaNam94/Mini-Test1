package org.example.minitest1.repository;


import org.example.minitest1.model.DTO.ProducerDTO;
import org.example.minitest1.model.Producer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerRepository extends JpaRepository<Producer,Long> {
    @Query(value = "select producer.name as name , count(car.producer_id) as quantity from producer left join car on producer.id = car.producer_id group by producer.id",countQuery = "SELECT count(*) FROM producer",nativeQuery = true)
    Page<ProducerDTO> findQuantityInProducerByIdProducer(Pageable pageable);
}
