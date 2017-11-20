package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
    public ListNode stat, def;
	public ExpreNode expr;

    public SwitchNode(Token t, ExpreNode e, ListNode l, ListNode d) {
        super(t);
        stat = l;
        expr = e;
		def = d;
    }
}