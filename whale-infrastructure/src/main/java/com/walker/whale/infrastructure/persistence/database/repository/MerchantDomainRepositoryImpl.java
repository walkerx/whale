package com.walker.whale.infrastructure.persistence.database.repository;


//import com.walker.whale.domain.merchant.repositories.MerchantDomainRepository;
import com.walker.whale.shared.dto.response.MerchantResult;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author walker
 */
@Repository
public class MerchantDomainRepositoryImpl implements MerchantDomainRepository {
//  @Autowired
//  private MerchantRepository merchantRepository;

  @Override
  public Optional<MerchantResult> search(String name, Integer size, Integer offset){
//    return merchantRepository.findByName(name);
    return Optional.empty();
  }
}
