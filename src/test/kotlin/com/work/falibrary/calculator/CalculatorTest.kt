package com.work.falibrary.calculator

import Calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
}

class CalculatorTest {

    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

        if (calculator.number != 8) {
            throw IllegalStateException()
        }
    }
}