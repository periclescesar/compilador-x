package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
	public Token name;
    public ListNode switchcases;

    public SwitchNode(Token t, Token t2, ListNode l) {
        super(t);
		name = t2;
        switchcases = l;
    }
}
