package com.ariba
package devices

import com.ariba.visitors.Visitor

case class Firewall(status: String) extends Visitable {

  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getStatus(): String = {
    "Firewall is " + status
  }
}
