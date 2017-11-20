package syntacticTree;

import parser.*;


public class SwitchCaseNode extends StatementNode {
	public ExpreNode expr;
    public ListNode stat;

    public SwitchCaseNode(Token t, ExpreNode e, ListNode l) {
        super(t);
        expr = e;
        stat = l;
    }
}