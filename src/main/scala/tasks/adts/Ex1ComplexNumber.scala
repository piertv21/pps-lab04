package tasks.adts

/*  Exercise 1: 
 *  Complete the implementation of ComplexADT trait below, so that it passes
 *  the test in ComplexTest.
 */

object Ex1ComplexNumbers:

  trait ComplexADT:
    type Complex
    def complex(re: Double, im: Double): Complex
    extension (complex: Complex)
      def re(): Double
      def im(): Double
      def sum(other: Complex): Complex
      def subtract(other: Complex): Complex
      def asString(): String

  object BasicComplexADT extends ComplexADT:

    case class ComplexImpl(re: Double, im: Double)

    type Complex = ComplexImpl
    def complex(re: Double, im: Double): Complex = ComplexImpl(re, im)
    extension (complex: Complex)
      def re(): Double = re
      def im(): Double = im
      def sum(other: Complex): Complex = ComplexImpl(re + other.re(), im + other.im())
      def subtract(other: Complex): Complex = ComplexImpl(re - other.re(), im - other.im())
      def asString(): String =
        if im == 0 then
          s"$re"
        else if re == 0 then
          s"$im" + "i"
        else if im > 0 then
          s"$re + $im" + "i"
        else
          s"$re - ${-im}" + "i"