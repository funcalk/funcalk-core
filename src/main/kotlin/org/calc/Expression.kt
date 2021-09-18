package org.calc

sealed class Expression {
  abstract fun calculate(): Double
}

data class Number(private val value: Double) : Expression() {
  override fun calculate(): Double = value
}

data class Plus(
  private val left: Expression,
  private val right: Expression
) : Expression() {
  override fun calculate(): Double = left.calculate() + right.calculate()
}