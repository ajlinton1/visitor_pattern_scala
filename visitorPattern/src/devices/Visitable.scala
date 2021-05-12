package com.ariba
package devices

import com.ariba.visitors.{Visitor, VisitorPatternMatcher}

trait Visitable {

  def accept(visitor: Visitor): Unit

  def accept(visitor: VisitorPatternMatcher): Unit = {
    visitor.visit(this)
  }

}
