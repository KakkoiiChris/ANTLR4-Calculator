/**
 * ANTLR4-Calculator
 
 * Copyright (C) 2022, KakkoiiChris
 *
 * File:    Visitor.kt
 
 * Created: Tuesday, October 25, 2022, 00:56:07
 *
 * @author Christian Bryce Alexander
 */
class Visitor : CalculatorBaseVisitor<Double>() {
    private val vars = mutableMapOf<String, Double>()
    
    override fun visitExpr(ctx: CalculatorParser.ExprContext): Double {
        return visit(ctx.assign())
    }
    
    override fun visitAssign(ctx: CalculatorParser.AssignContext): Double {
        if (ctx.IDENTIFIER()?.text?.isNotEmpty() == true) {
            val name = ctx.IDENTIFIER().text
            
            val value = visit(ctx.multiplicative())
            
            vars[name] = value
            
            return value
        }
        
        return visit(ctx.multiplicative())
    }
    
    override fun visitMultiplicative(ctx: CalculatorParser.MultiplicativeContext): Double {
        return when (ctx.getChild(1)?.text) {
            "*"  -> visit(ctx.additive(0)) * visit(ctx.additive(1))
            "/"  -> visit(ctx.additive(0)) / visit(ctx.additive(1))
            "%"  -> visit(ctx.additive(0)) % visit(ctx.additive(1))
            else -> visit(ctx.additive(0))
        }
    }
    
    override fun visitAdditive(ctx: CalculatorParser.AdditiveContext): Double {
        return when (ctx.getChild(1)?.text) {
            "+"  -> visit(ctx.negate(0)) + visit(ctx.negate(1))
            "-"  -> visit(ctx.negate(0)) - visit(ctx.negate(1))
            else -> visit(ctx.negate(0))
        }
    }
    
    override fun visitNegate(ctx: CalculatorParser.NegateContext): Double {
        if (ctx.childCount == 2) {
            return -visit(ctx.terminal())
        }
        
        return visit(ctx.terminal())
    }
    
    override fun visitTerminal(ctx: CalculatorParser.TerminalContext): Double {
        if (ctx.NUMBER()?.text?.isNotEmpty() == true) {
            return ctx.NUMBER().text.toDouble()
        }
        
        if (ctx.IDENTIFIER()?.text?.isNotEmpty() == true) {
            return vars[ctx.IDENTIFIER().text] ?: Double.NaN
        }
        
        return visit(ctx.expr())
    }
}