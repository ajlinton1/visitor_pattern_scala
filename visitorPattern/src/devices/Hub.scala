package com.ariba
package devices

import visitors.Visitor

case class Hub(status: String) extends Visitable{

  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getStatus(): String = {
    "Hub is " + status
  }


}
