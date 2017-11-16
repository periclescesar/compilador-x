package syntacticTree;

import parser.*;


public class SwitchCaseNode extends StatementNode {
    public StatementNode stat;
	public ExpreNode expr;

    public SwitchCaseNode(Token t, ExpreNode e1, StatementNode s) {
        super(t);
		expr = e1;
        stat = s;
    }
}
