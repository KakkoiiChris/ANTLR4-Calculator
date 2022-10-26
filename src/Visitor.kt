import kotlin.math.pow

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
            
            val value = visit(ctx.exponent())
            
            vars[name] = value
            
            return value
        }
        
        return visit(ctx.exponent())
    }
    
    override fun visitExponent(ctx: CalculatorParser.ExponentContext): Double {
        var value = visit(ctx.multiplicative(0))
    
        var i = 0
    
        while (i < ctx.childCount / 2) {
            val op = ctx.getChild((i * 2) + 1)
            val right = ctx.multiplicative(i + 1)
        
            value = when (op.text) {
                "^"  -> value.pow(visit(right))
                else -> visit(ctx.multiplicative(0))
            }
        
            i++
        }
    
        return value
    }
    
    override fun visitMultiplicative(ctx: CalculatorParser.MultiplicativeContext): Double {
        var value = visit(ctx.additive(0))
        
        var i = 0
        
        while (i < ctx.childCount / 2) {
            val op = ctx.getChild((i * 2) + 1)
            val right = ctx.additive(i + 1)
    
            value = when (op.text) {
                "*"  -> value * visit(right)
                "/"  -> value / visit(right)
                "%"  -> value % visit(right)
                else -> visit(ctx.additive(0))
            }
            
            i++
        }
        
        return value
    }
    
    override fun visitAdditive(ctx: CalculatorParser.AdditiveContext): Double {
        var value = visit(ctx.negate(0))
    
        var i = 0
    
        while (i < ctx.childCount / 2) {
            val op = ctx.getChild((i * 2) + 1)
            val right = ctx.negate(i + 1)
        
            value = when (op.text) {
                "+"  -> value + visit(right)
                "-"  -> value - visit(right)
                else -> visit(ctx.negate(0))
            }
        
            i++
        }
    
        return value
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