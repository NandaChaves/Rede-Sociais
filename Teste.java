
/**
 * Escreva a descrição da classe Teste aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;
public class Teste
{
    public static int j=0;
    /**
     * COnstrutor para objetos da classe Teste
     */
    public static void main(String [] args)
    {
       GereContato cont = new GereContato();
       Contato [] novoContato = new Contato[100];
       Contato novo;
       Contato metodo;
    
        Scanner ler = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner read = new Scanner(System.in);
        Scanner r = new Scanner(System.in);
        out.println("Escolha as opções");
        out.println("0.Sair");
        out.println("1.Adicionar contato");
        out.println("2.Imprimir todos os contatos");
        out.println("3.Imprimir contatos das redes sociais");
        out.println("4.Imprimir nº de contatos das redes sociais");
        int op = ler.nextInt();
        int z;
        while(op !=0)
        {
        switch(op)
        {
            
          case 1:
          {
               z=0;
             out.println("Qual o nome da pessoa?");
             out.println("Use ; para separar o nome do apelido");
             String nome = l.next();
             out.println("Qual o telefone, deve ter 9 dígitos?");
                 int tele = read.nextInt();
                 int opc;
                 String tipo;
               do{
                 out.println("Este telefone é do tipo:");
                     out.println("1.Amigos?");
                      out.println("2.Família?");
                       out.println("3.Profissional?");
                 opc = read.nextInt();                 
               }while((opc!= 1) && (opc!= 2) && (opc!= 3));
               if(opc == 1)
                 {tipo = "Amigos";} 
                  else if(opc == 2){tipo = "Família";}
                    else{tipo = "Profissional";}
                
               out.println("Este contato tem rede social?true or false");
               boolean sim = read.nextBoolean();
                if(sim == true)
                {
                     out.println("Qual o nome da rede social?");
                     String rede = read.next();
                     out.println("Qual o email?");
                     String email = read.next();
                     novo = new RedeSocial(nome,tele,tipo,rede,email);
                    
                 } else{
                     novo = new Contato(nome,tele,tipo);
                }
                cont.addContato(novo);
            }
          break;
          
           case 2:
            {
               cont.imprimir();
            }
          break;
          
           case 3:
           {
              out.println("Qual o nome do contato ?");
              String nome = read.next();
              cont.imprimeContato(nome);
           }
          break;
           
           case 4:
           {
             String nome = "RedeSocial";
             cont.imprimirNumRS(nome);
           }
          break;
          
          
          default:
           {
            System.out.println("Erro");
           }
          break;
        }//fim do switch
        out.println("0.Sair");
        out.println("1.Adicionar contato");
        out.println("2.Imprimir todos os contatos");
        out.println("3.Imprimir contatos das redes sociais");
        out.println("4.Imprimir nº de contatos das redes sociais");
        op = read.nextInt();
     }//fim do while
    }
}
