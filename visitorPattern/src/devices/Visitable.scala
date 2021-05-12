package com.ariba
package devices

import com.ariba.visitors.{Visitor, VisitorGetStatusMatcher}

trait Visitable {

  def accept(visitor: Visitor): Unit

  def accept(visitor: VisitorGetStatusMatcher): Unit = {
    visitor.visit(this)
  }

  def acceptFunction(visitor: Visitable => Unit): Unit = {
    visitor(this)
  }

}
