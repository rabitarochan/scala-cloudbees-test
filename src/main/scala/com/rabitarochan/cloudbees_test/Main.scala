package com.rabitarochan.cloudbees_test

object Main extends App {
  val i = 1
  
  val inc = Calc.increment(i)
  println("inc: " + inc)
  
  val dec = Calc.decrement(i)
  println("dec: " + dec)
}