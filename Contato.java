
/**
 * Escreva a descrição da classe Contato aqui.
 * 
 * @author (Fernand a Fortes) 
 * @version (número de versão ou data)
 */
import java.util.Arrays;
import static java.lang.System.out;
public class Contato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private int tele;
    private String tipo;
    private String[] nomeCom; 
    /**
     * COnstrutor para objetos da classe Contato
     */
    public Contato(String nome,int tele,String tipo)
    {
        // inicializa variáveis de instância
       this.nome = nome;
       this.tele = tele;
       this.tipo = tipo;
       nomeCom = nome.split(" ");
    }
    
    public String getNome()
    {
      return nome;
    }
    
    public String[] getNomeCom()
     {   
      return nomeCom;
    }
    
     public int getTele()
    {
      return tele;
    }
    
    public String getTipo()
    {
      return tipo;
    }

    public String Nomecom()
    {
     String[] completo = nome.split(";") ;
     return Arrays.toString(completo);
    }
    
    
    public String toString()
    {
     StringBuilder s = new StringBuilder();
     s.append("Nome:"+ Nomecom() + "\n");
     s.append("Tele:"+ tele+ "\n");
     s.append("Tipo:"+ tipo+ "\n");
     return   s.toString();
    }
    
    
}
