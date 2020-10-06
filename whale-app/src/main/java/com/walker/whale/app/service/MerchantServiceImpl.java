package com.walker.whale.app.service;

import com.walker.whale.infrastructure.persistence.database.repository.MerchantRepository;
import com.walker.whale.shared.dto.response.MerchantResult;
import com.walker.whale.shared.services.IMerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author walker
 */
@Service
public class MerchantServiceImpl implements IMerchantService {

  private MerchantRepository merchantRepository;

  @Autowired
  MerchantServiceImpl(MerchantRepository merchantRepository){
    this.merchantRepository = merchantRepository;
  }

  @Override
  public Optional<MerchantResult> query() {
    return merchantRepository.search("test", 1, 2);
  }
}
