package com.josephcrawley.Spitfire.entities;
import com.josephcrawley.util.Log;

public class PrintStatement extends Statement {

    private Expression operand;

    public PrintStatement(Expression operand) {
        this.operand = operand;
    }

    public Expression getOperand() {
        return operand;
    }

    @Override
    public void analyze(Log log, SymbolTable table, Subroutine owner, boolean inLoop) {
        // TODO Auto-generated method stub
    }
}
