package syntacticTree;

import parser.*;


public class AssignmentNode extends StatementNode {

	 public ExpreNode exp1;
	 public ExpreNode exp2;

    public AssignmentNode(Token t, ExpreNode exp1, ExpreNode exp2) {
        super(t);
        exp1 = exp1;
        exp2 = exp2;
    }
}