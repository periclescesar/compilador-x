package syntacticTree;

import parser.*;


public class SwitchCasesStatNode extends StatementNode {

    public StatementNode stat1;

    public SwitchCasesStatNode(Token t, StatementNode stat1) {
    	super(t);
        stat1 = stat1;
    }
}