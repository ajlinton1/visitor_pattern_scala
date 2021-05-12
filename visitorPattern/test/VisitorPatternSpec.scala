import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import com.ariba.devices.{Firewall, Hub, Server, Visitable}
import com.ariba.visitors.{Visitor, VisitorGetStatus, VisitorGetStatusMatcher}

class VisitorPatternSpec extends AnyFlatSpec {

  "Visit hub" should "be done" in {
    val hub = new Hub("OK")
    val visitor = new VisitorGetStatus()
    hub.accept(visitor)
  }

  "Visit devices" should "be done" in {
    val devices = Array(new Firewall("OK"), new Hub("OK"), new Server("OK"))
    val visitor = new VisitorGetStatus()
    for (device <- devices) {
      device.accept(visitor)
    }
  }

  "Visit devices via pattern matching" should "be done" in {
    val devices = Array(new Firewall("OK"), new Hub("OK"), new Server("OK"))
    val visitor = new VisitorGetStatusMatcher()
    for (device <- devices) {
      device.accept(visitor)
    }
  }

  "Visit devices via function" should "be done" in {
    val devices = Array(new Firewall("OK"), new Hub("OK"), new Server("OK"))

    def visitor(target: Visitable) = {
      target match {
        case firewall: Firewall => { println(firewall.getStatus())}
        case hub: Hub => { println(hub.getStatus())}
        case server: Server => { println(server.getStatus())}
      }
    }
    
    for (device <- devices) {
      device.acceptFunction(visitor)
    }
  }

}
