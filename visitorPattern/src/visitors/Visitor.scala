package com.ariba
package visitors

import devices.{Firewall, Hub, Server}

trait Visitor {

  def visit(target: Firewall): Unit

  def visit(target: Hub): Unit

  def visit(target: Server): Unit

}
