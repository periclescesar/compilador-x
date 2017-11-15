package syntacticTree;

import parser.*;


public class DoWhileNode extends StatementNode {
    public StatementNode stat;
    public ExpreNode expr;

    public DoWhileNode(Token t, ExpreNode e, StatementNode s3) {
        super(t);
        expr = e;
        stat = s3;
    }
}