package symtable;


// corresponde a uma declaracao de metodo na tabela de simbolos
public class EntryMethod extends EntryTable {
    public EntryTable type; // tipo de retorno do metodo
    public int dim; // numero de dimensoes do retorno
    public EntryRec param; // tipo dos parametros
    public int totallocals; // numero de variaveis locais
    public int totalstack; // tamanho da pilha necessaria
    public boolean fake; // true se eh um falso construtor
    public boolean hassuper; // true se metodo possui chamada super

    // cria elemento para inserir na tabela 
    public EntryMethod(String n, EntryTable p, int d, EntryRec r) {
        name = n;
        type = p;
        dim = d;
        param = r;
        totallocals = 0;
        totalstack = 0;
        fake = false;
        hassuper = false;
    }

    public EntryMethod(String n, EntryTable p, boolean b) {
        name = n;
        type = p;
        dim = 0;
        param = null;
        totallocals = 0;
        totalstack = 0;
        fake = b;
        hassuper = false;
    }

    public String dscJava() {
        String s = strDim(dim);
        s += type.dscJava();

        return s;
    }
}
