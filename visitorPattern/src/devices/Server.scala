package com.ariba
package devices

import visitors.Visitor

class Server extends Visitable{

  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getStatus(): String = {
    "Server is OK"
  }


}
