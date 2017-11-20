package syntacticTree;

import parser.*;


public class IfExpressionNode extends ExpreNode {

    public ExpreNode expr1;
    public ExpreNode expr2;
	public ExpreNode cen;

    public IfExpressionNode(Token t, ExpreNode e1, ExpreNode e2, ExpreNode c) {
        super(t == null ? e1.position : t);
        expr1 = e1;
        expr2 = e2;
		cen = c;
    }

}