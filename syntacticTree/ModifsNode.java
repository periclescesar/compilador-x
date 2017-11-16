package syntacticTree;

import parser.*;


public class ModifsNode extends GeneralNode {
    public Token t1;

    public ModifsNode(Token t) {
        super(t);
        t1 = t;
    }
}
