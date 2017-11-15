package syntacticTree;

import parser.*;


public class SwitchCaseStatNode extends StatementNode {
    public StatementNode stat;
    public ExpreNode expr;

    public SwitchCaseStatNode(Token t, ExpreNode e, StatementNode s3) {
        super(t);
        expr = e;
        stat = s3;
    }
}