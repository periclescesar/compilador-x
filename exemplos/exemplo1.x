//Exemplo de programa

public class programateste01
{
    public class innerclass {
    
    }

    //char cwh='a';
    final byte variavel3=1;
    private final short variavel4=10;
    protected long variavel5=10.1;
    public float variavel1=7.0;
    float variavel2=10.1;
    string str = "ab";
    int idade = 0; 
    int cont;
    int cont2;
    string genero;

    public void calcFor() {
        for (cont = 0; cont < variavel1; cont = (cont + 1)) {
            for(cont2 = 0; cont2 < variavel2; cont2 = (cont2 + 1))
            {
                variavel4 = 2;
            }        
        }
    }

    private void calcIf(){
        if((variavel1 != 10) && (variavel2 == 50)){
            int variavel3 = 5;
        }
    }

    protected final void calcDoWhile(){
        do
            genero = "mulher";
        (idade<50);
    }

    void CalcWhile(){
        while (idade != 50)
            genero = "homem";
    }

    void calcSwitchCase(string abc){
        switch(abc){
            case "abc": 
                print("Ordem lexixografica");
            case "123":
                print("Ordem crescente");
            default:
                print("Outra ordem");
        }
    }

    void operadores(){
        if((genero == "homem") || (genero =="mulher"))
            print("Dois generos");
        else
            print("Outros");


        boolean isHomem = true;
        if(!isHomem){
            print("Mulher");
            print("...");
            print("...");
        } else{
            print("");
            print("");
            print("");
        }

        if(isHomem ^ (genero == "homem")){
            print("Definitivamente é homem");
        }
    }


}
