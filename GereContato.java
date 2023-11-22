
/**
 * Escreva a descrição da classe GereContato aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.out;
public class GereContato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<Contato>cont;
   

    /**
     * COnstrutor para objetos da classe GereContato
     */
    public GereContato()
    {
        // inicializa variáveis de instância
        cont = new ArrayList<Contato>();
    }
  
     public void addContato(Contato novoC)
    {
        cont.add(novoC);
    }
    
    public void imprimir()
    {
      for(Contato c: cont)
      {
        System.out.println(c);
      }
    }
    
    public ArrayList<Contato>ImprimirRS(String classe)
    {
      for(Contato c: cont)
      {
        if(c.getClass().getName().equals(classe))
        {
          System.out.println(c.toString());
        }
      }
      return cont;
    }
    
    public void imprimirNumRS(String nome)
    {
      int x=0;
      for(Contato c:cont)
      {
        if(c.getClass().getName().equals("RedeSocial"))
        {
          x++;
        }
      }
      out.println("Existem " + x + " contatos nas redes sociais");
    }
    
    public int procuraContato(String ncont)
    {
        int pos=0;
        while(pos < cont.size() && !ncont.equals(cont.get(pos).getNome()))
        {
          pos++;
        }
        if(pos == cont.size())
        {
          return -1;
        } else{
          return pos;
        }
      
    }
    
   
    public void imprimeContato(String nome)
    {
      int resul = procuraContato(nome);
      if(resul == -1)
      {
        System.out.println("Não existe este contato");
      }else
      {
        System.out.println(cont.get(resul));
      }
    }
    
    public void imprimeNome()
     {
     out.println();
    }
}
