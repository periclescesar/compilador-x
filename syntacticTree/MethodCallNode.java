package syntacticTree;

import parser.Token;

public class MethodCallNode extends StatementNode {
	 public ListNode args;

	    public MethodCallNode(Token t, ListNode l) {
	        super(t);
			args = l;
	    }
}
