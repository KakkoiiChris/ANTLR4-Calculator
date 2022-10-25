import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

/**
 * ANTLR4-Calculator
 
 * Copyright (C) 2022, KakkoiiChris
 *
 * File:    Main.kt
 
 * Created: Tuesday, October 25, 2022, 00:27:42
 *
 * @author Christian Bryce Alexander
 */
fun main() {
    val visitor = Visitor()
    
    while (true) {
        print("> ")
        
        val source = readln().takeIf { it.isNotBlank() } ?: break
        
        val lexer = CalculatorLexer(CharStreams.fromString(source))
        
        val tokens = CommonTokenStream(lexer)
        
        val parser = CalculatorParser(tokens)
        
        val expr = parser.expr()
        
        val result = visitor.visit(expr)
        
        println("($result)")
    }
}