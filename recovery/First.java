package recovery;

import parser.*;

import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet switchcasesstat = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(langXConstants.VAR_TYPE));
        methoddecl.add(new Integer(langXConstants.FINAL));
        methoddecl.add(new Integer(langXConstants.PRIVATE));
        methoddecl.add(new Integer(langXConstants.PUBLIC));
        methoddecl.add(new Integer(langXConstants.PROTECTED));

        vardecl.add(new Integer(langXConstants.VAR_TYPE));
        vardecl.add(new Integer(langXConstants.FINAL));
        vardecl.add(new Integer(langXConstants.PRIVATE));
        vardecl.add(new Integer(langXConstants.PUBLIC));
        vardecl.add(new Integer(langXConstants.PROTECTED));

        classlist.add(new Integer(langXConstants.CLASS));

        constructdecl.add(new Integer(langXConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(langXConstants.IDENT)); // first do atribstat
        statlist.add(new Integer(langXConstants.PRINT));
        statlist.add(new Integer(langXConstants.READ));
        statlist.add(new Integer(langXConstants.RETURN));
        statlist.add(new Integer(langXConstants.SUPER));
        statlist.add(new Integer(langXConstants.IF));
        statlist.add(new Integer(langXConstants.FOR));
        statlist.add(new Integer(langXConstants.LBRACE));
        statlist.add(new Integer(langXConstants.BREAK));
        statlist.add(new Integer(langXConstants.WHILE));
        statlist.add(new Integer(langXConstants.DO));
        statlist.add(new Integer(langXConstants.SWITCH));
        statlist.add(new Integer(langXConstants.CASE));
        statlist.add(new Integer(langXConstants.DEFAULTT));

        switchcasesstat.add(new Integer(langXConstants.CASE));
        switchcasesstat.add(new Integer(langXConstants.DEFAULTT));
    
    }
}
