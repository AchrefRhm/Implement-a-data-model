package com.example.repositories;

import com.example.entities.PortfolioHolding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioHoldingRepository extends JpaRepository<PortfolioHolding, Long> {
}
