package com.ariba
package devices

import com.ariba.visitors.Visitor

class Firewall extends Visitable {

  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getStatus(): String = {
    "Firewall is OK"
  }
}
