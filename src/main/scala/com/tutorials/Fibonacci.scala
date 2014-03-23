package com.tutorials

/**
 * Created by sujay on 3/15/14.
 */
object Fibonacci {

  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, cur: Int, prev: Int): Int = {
      if(n == 0) return prev
      if(n == 1) return cur
      go(n - 1, cur + prev, cur)
    }
    go(n, 1, 0)
  }

  def main(args: Array[String]) = {
    println(fibonacci(6))
  }
}
