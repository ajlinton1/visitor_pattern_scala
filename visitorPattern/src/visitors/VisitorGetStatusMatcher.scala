package com.ariba
package visitors

import devices.{Firewall, Hub, Server, Visitable}

class VisitorGetStatusMatcher extends VisitorMatcher {

  override def visit(target: Visitable): Unit = {

    target match {
      case firewall: Firewall => { println(firewall.getStatus())}
      case hub: Hub => { println(hub.getStatus())}
      case server: Server => { println(server.getStatus())}
    }
    // Throws a runtime error is target does match a case.
    // Disadvantage as compiler won't require all classes to be covered
  }

}
