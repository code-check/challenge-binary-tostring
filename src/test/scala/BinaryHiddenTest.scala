import org.scalatest._

class BinaryHiddenTest extends FlatSpec with Matchers {
  "toBinaryString" should "validate" in {
    (1 to 10000 by 10).map(Binary.toBinaryString) shouldEqual (1 to 10000 by 10).map(_.toBinaryString)
  }
}
