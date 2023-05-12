object ArithmeticDSL {
  implicit class NumericOps(val left: Expression) {
    def +(right: Expression): Expression = Add(left, right)
    def -(right: Expression): Expression = Subtract(left, right)
    def *(right: Expression): Expression = Multiply(left, right)
    def /(right: Expression): Expression = Divide(left, right)
  }

  implicit def doubleToExpression(value: Double): Expression = Constant(value)
}
