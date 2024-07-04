package com.lfr.investments.repository;

import com.lfr.investments.entity.AccountStock;
import com.lfr.investments.entity.AccountStockId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountStockRepository extends JpaRepository<AccountStock, AccountStockId> {
}
