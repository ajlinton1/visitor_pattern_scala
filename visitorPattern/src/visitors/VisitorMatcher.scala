package com.ariba
package visitors

import devices.Visitable

trait VisitorMatcher {

  def visit(target: Visitable): Unit

}
