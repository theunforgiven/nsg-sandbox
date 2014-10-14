package nsg

import org.scalatest.{FunSpec, Matchers}


class SandboxSpec extends FunSpec with Matchers {

  describe("a sandbox") {
    it("should allow for playing") {
      true should be(true)
    }
  }

}
