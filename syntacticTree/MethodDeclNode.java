package syntacticTree;

import parser.*;


public class MethodDeclNode extends GeneralNode {
    public int dim;
    public Token name;
    public MethodBodyNode body;
    private Token modificador;
	private Token finall;

    public MethodDeclNode(Token t, int k, Token t4, MethodBodyNode b, Token t2, Token t3) {
        super(t);
        dim = k;
        name = t4;
        body = b;
		this.modificador = t2;
		this.finall = t3;
    }
}
