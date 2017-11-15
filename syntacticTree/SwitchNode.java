package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
    public SwitchCasesStatNode stat1;

    public SwitchNode(Token t, SwitchCasesStatNode stat) {
        super(t);
        stat1 = stat;
    }
}