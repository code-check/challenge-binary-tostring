import org.scalatest._

class BinaryTest extends FlatSpec with Matchers {
  "Binary" should "extend IBinary" in {
    Binary.isInstanceOf[IBinary] shouldEqual true
  }
  "toBinaryString(0)" should "be 0" in {
    Binary.toBinaryString(0) shouldEqual "0"
  }
  "toBinaryString(1)" should "be 1" in {
    Binary.toBinaryString(1) shouldEqual "1"
  }
  "toBinaryString(2)" should "be 10" in {
    Binary.toBinaryString(2) shouldEqual "10"
  }
  "toBinaryString(3)" should "be 11" in {
    Binary.toBinaryString(3) shouldEqual "11"
  }
  "toBinaryString(4)" should "be 100" in {
    Binary.toBinaryString(4) shouldEqual "100"
  }
}
