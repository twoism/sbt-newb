
package com.twitter.newb

import org.specs._

object ThingSpec extends Specification {
  "Thing" should {
    val thing = new Thing()
    "speak" in {
      thing.speak() must be_==("hello?")
    }
  }
}
