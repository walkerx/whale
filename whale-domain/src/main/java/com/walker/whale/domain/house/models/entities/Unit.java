package com.walker.whale.domain.house.models.entities;

import com.walker.whale.domain.house.models.Leaf;
import com.walker.whale.domain.house.models.valueobjects.Orientation;
import com.walker.whale.domain.house.models.valueobjects.address.Address;

/**
 * 可租单元
 * @author walker
 */

public class Unit extends Leaf {
  private String name;
  private Address address;
//  private Money price;
//  private Money basePrice;
  private Float area;
  private Orientation orientation;
  private Banner banner;
}
