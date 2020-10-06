package com.walker.whale.domain.house.models;

import lombok.experimental.SuperBuilder;

/**
 * @author walker
 */
public abstract class Leaf {

  public Node parent;

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }
}
