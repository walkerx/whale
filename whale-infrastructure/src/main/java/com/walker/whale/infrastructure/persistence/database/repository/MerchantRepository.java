package com.walker.whale.infrastructure.persistence.database.repository;

import com.walker.whale.infrastructure.persistence.database.entity.Merchant;
import com.walker.whale.shared.dto.response.MerchantResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long>,
    JpaSpecificationExecutor<Merchant>, MerchantDomainRepository {
  Optional<MerchantResult> findByName(String name);
}
