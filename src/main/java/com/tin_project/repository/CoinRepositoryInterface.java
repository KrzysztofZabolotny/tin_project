package com.tin_project.repository;

import com.tin_project.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoinRepositoryInterface extends JpaRepository<Coin, Long> {


}
