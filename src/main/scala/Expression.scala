sealed trait Expression {
  def eval: Double
}

case class Constant(value: Double) extends Expression {
  def eval: Double = value
}

case class Add(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval + right.eval
}

case class Subtract(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval - right.eval
}

case class Multiply(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval * right.eval
}

case class Divide(left: Expression, right: Expression) extends Expression {
  def eval: Double = left.eval / right.eval
}
