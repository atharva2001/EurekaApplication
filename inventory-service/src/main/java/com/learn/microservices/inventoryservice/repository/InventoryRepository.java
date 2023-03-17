package com.learn.microservices.inventoryservice.repository;

import com.learn.microservices.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {

   Optional<Inventory> findBySkuCode();
}
