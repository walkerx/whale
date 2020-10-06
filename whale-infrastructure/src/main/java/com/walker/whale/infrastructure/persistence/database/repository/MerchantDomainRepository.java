package com.walker.whale.infrastructure.persistence.database.repository;

import com.walker.whale.shared.dto.response.MerchantResult;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public interface MerchantDomainRepository {
  /**
   * 搜索
   * @param name, size, offset
   * @return list
   */
  Optional<MerchantResult> search(String name, Integer size, Integer offset);

}
