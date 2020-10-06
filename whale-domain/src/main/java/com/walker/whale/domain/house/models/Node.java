package com.walker.whale.domain.house.models;

import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 */
@SuperBuilder
public abstract class Node {
  @Singular
  public List<Node> children;
  public Node parent;

  public Node() {
    this.children = new ArrayList<>();
  }

  public void addChild(Node node) {
    this.children.add(node);
    node.setParent(this);
  }

  public List<Node> getChildren() {
    return this.children;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }
}
