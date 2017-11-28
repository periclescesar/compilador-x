package symtable;


// classe geral para as possiveis entradas na tabela de simbolos
abstract public class EntryTable {
    public String name; // nome do simbolo (var., metodo ou classe)
    public EntryTable next; // apontador para proximo dentro da tabela 
    public int scope; // numero do aninhamento corrente
    public Symtable mytable; // entrada aponta para a tabela da qual ela eh parte

    abstract public String dscJava();

    static public String strDim(int n) {
        String p = "";

        for (int i = 0; i < n; i++)
            p += "[";

        return p;
    }
}
