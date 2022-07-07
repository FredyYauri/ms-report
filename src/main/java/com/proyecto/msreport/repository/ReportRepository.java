package com.proyecto.msreport.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends ReactiveMongoRepository {
}
