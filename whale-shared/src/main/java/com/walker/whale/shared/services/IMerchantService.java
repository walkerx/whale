package com.walker.whale.shared.services;

import com.walker.whale.shared.dto.response.MerchantResult;

import java.util.Optional;

/**
 * @author walker
 */
public interface IMerchantService {
  /**
   * 查询商户列表
   * @return list
   */
  Optional<MerchantResult> query();
}
