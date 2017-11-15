package syntacticTree;

import parser.*;


public class WhileNode extends StatementNode {
    public StatementNode stat;
    public ExpreNode expr;

    public WhileNode(Token t, ExpreNode e, StatementNode s3) {
        super(t);
        expr = e;
        stat = s3;
    }
}