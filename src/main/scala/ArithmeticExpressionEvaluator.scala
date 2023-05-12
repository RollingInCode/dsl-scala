import ArithmeticDSL._

object ArithmeticExpressionEvaluator {
  def main(args: Array[String]): Unit = {
    // Define an arithmetic expression using the DSL
    val expression: Expression = 2.0 + 3.0 * (4.0 - 1.0) / 3.0

    // Evaluate the expression and print the result
    val result = expression.eval
    println(s"Result of the expression: $result")
  }
}
