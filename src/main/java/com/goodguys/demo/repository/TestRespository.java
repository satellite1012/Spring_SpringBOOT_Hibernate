package com.goodguys.demo.repository;

import com.goodguys.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRespository extends JpaRepository<Test,Integer> {
}
