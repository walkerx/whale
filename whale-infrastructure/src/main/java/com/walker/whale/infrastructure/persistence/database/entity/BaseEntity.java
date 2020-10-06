package com.walker.whale.infrastructure.persistence.database.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * entity基类
 * @author walker
 */

@Entity
@MappedSuperclass
public class BaseEntity {
  /***
   * 主键自增id
   */
  @Id
  @Column(name = "id", updatable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;

  /***
   * 数据创建时间
   */
  @CreatedDate
  private Date createTime;

  /***
   * 数据更新时间
   */
  @LastModifiedDate
  private Date updateTime;

  /***
   * 用于数据乐观锁
   */
  @Version
  private Integer version = 0;
}
