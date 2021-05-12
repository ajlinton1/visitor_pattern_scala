package com.ariba
package visitors

import devices.{Firewall, Hub, Server, Visitable}

class VisitorPatternMatcher {

  def visit(target: Visitable): Unit = {

    target match {
      case firewall: Firewall => { println(firewall.getStatus())}
      case hub: Hub => { println(hub.getStatus())}
      case server: Server => { println(server.getStatus())}
    }
  }

}
