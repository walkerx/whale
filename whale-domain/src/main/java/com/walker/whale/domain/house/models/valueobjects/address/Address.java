package com.walker.whale.domain.house.models.valueobjects.address;


/**
 * @author walker
 */
public class Address {
  private Country country;
  private Province province;
  private City city;
  private District district;
  private Community community;
  private Coordinate coordinate;
  private String description;

  /**
   * building 几栋
   */
  private String building;
  /**
   * 楼层
   */
  private Floor floor;
  /**
   * 门牌
   */
  private Doorplate number;
//  private String unit;
}
