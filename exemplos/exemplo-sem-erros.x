//Exemplo de programa

public class programateste01
{
	private final class InnerClass {
		int teste = 0 ;
		
		public void construct(){
			;
		}
		
		private int getNumero(){
			return teste;
		}
    }
    
    private final class InnerClass2 extends InnerClass {
    }

	InnerClass inner = new InnerClass();
	int teste = 0;
	char cwh='a';
    final byte variavel3=1;
    private short variavel4 = 10;
    protected long variavel5=10.1;
    public int variavel1=7;
    int variavel2=10;
    string str = "ab";
    int idade = 0; 
    int cont;
    int cont2;
    string genero;
    boolean cond = true;
    
	public void construct(){
		;
	}
	
	private int getNumero(){
		return teste;
	}
	
	public void testeFor() {
        for (cont = 0; cont < variavel1; cont = (cont + 1)) {
            for(cont2 = 0; cont2 < variavel2; cont2 = (cont2 + 1))
            {
                variavel4 = 2;
            }        
        }
    }
    
    public void testeIf(){
    	boolean isVerdade = true;
    	if(3>2 && isVerdade){
    		print("Verdade");
    		print("Verdade");
    	}
    	if(isVerdade){
    		print("Verdade");
    		print("Verdade");
    	}
    }
    
    public boolean isVerdade(){
    	return 5 < 4 && 3 <= (2+1);
    }
    
    public void soma(){
    	int teste1 = 1 + str; 	
    }
    
	
    
}
