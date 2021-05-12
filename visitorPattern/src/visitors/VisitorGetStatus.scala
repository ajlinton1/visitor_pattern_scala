package com.ariba
package visitors
import devices.{Firewall, Hub, Server}

class VisitorGetStatus extends Visitor {

  override def visit(target: Firewall): Unit = {
    println(target.getStatus())
  }

  override def visit(target: Hub): Unit = {
    println(target.getStatus())
  }

  override def visit(target: Server): Unit = {
    println(target.getStatus())
  }
}
