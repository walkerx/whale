package com.walker.whale.userinterface.http.controller;

import com.walker.whale.shared.services.IMerchantService;
import com.walker.whale.shared.dto.response.MerchantResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author walker
 */
@RestController
@RequestMapping("/merchants")
public class MerchantController {
  @Autowired
  private IMerchantService merchantService;

  @GetMapping
  public Optional<MerchantResult> merchantList(){
    return merchantService.query();
  }
}
