
/**
 * Escreva a descrição da classe RedeSocial aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class RedeSocial extends Contato
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String NomeRS;
    private String email;
    /**
     * COnstrutor para objetos da classe RedeSocial
     */
    public RedeSocial(String nome,int tele,String tipo,String NomeRS,String email)
    {
        // inicializa variáveis de instância
        super(nome,tele,tipo);
        this.NomeRS = NomeRS;
        this.email= email;
    }
    
    public String getNomeRS()
    {
       return NomeRS;
    }
    
    
    public String GetEmail()
    {
      return email;
    }
    
    public String toString()
    {
      StringBuilder s = new StringBuilder();
      s.append("Nome da rede social:" + NomeRS+ "\n");
      s.append("Email:"+ email+"\n");
      return  super.toString() + s.toString();
    }
}
