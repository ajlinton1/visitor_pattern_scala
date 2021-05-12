import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import com.ariba.devices.{Firewall, Hub, Server}
import com.ariba.visitors.{Visitor, VisitorGetStatus, VisitorPatternMatcher}

class VisitorPatternSpec extends AnyFlatSpec {

  "Visit hub" should "be done" in {
    val hub = new Hub()
    val visitor = new VisitorGetStatus()
    hub.accept(visitor)
  }

  "Visit devices" should "be done" in {
    val devices = Array(new Firewall(), new Hub(), new Server())
    val visitor = new VisitorGetStatus()
    for (device <- devices) {
      device.accept(visitor)
    }
  }

  "Visit devices via pattern matching" should "be done" in {
    val devices = Array(new Firewall(), new Hub(), new Server())
    val visitor = new VisitorPatternMatcher()
    for (device <- devices) {
      device.accept(visitor)
    }
  }

}
