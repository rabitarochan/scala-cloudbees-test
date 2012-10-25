package com.rabitarochan.cloudbees_test

import org.specs2.mutable._

class CalcSpec extends Specification {
  "Calc#increment" should {
    "return 2 for 1" in {
      Calc.increment(1) === 2
    }
    
    "return 100 for 99" in {
      Calc.increment(99) === 100
    }
  }
  
  "Calc#decrement" should {
    "return 0 for 1" in {
      Calc.decrement(1) === 0
    }
    
    "return 98 for 99" in {
      Calc.decrement(99) === 98
    }
    
    "return -1 for 0" in {
      val i = 0
      Calc.decrement(i) === -1
    }
  }
}