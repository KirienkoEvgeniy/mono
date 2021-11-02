package com.test.mono.repository;

import com.test.mono.model.RequestPayment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestPayment, Integer> {
}
