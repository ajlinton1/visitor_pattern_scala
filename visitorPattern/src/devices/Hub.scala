package com.ariba
package devices

import visitors.Visitor

class Hub extends Visitable{

  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getStatus(): String = {
    "Hub is OK"
  }


}
