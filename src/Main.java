import java.io.IOException;
import java.util.Scanner;

public class Main {
     public static void main (String[] args) {
         Scanner leitura = new  Scanner(System.in);
         ConsultaCEP consultaCEP = new ConsultaCEP();

         // Entrada do usuário: o valor digitado será enviado para a API ViaCEP.
         System.out.println("Digite o CEP: ");
        var cep = leitura.nextLine();


    try {
        // Faz a consulta HTTP e mapeia a resposta JSON para o record Endereço.
        Endereço novoEndereço = consultaCEP.buscaEndereço(cep);
        System.out.println(novoEndereço);

        // Persiste o resultado em arquivo JSON para consulta posterior.
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
        geradorDeArquivo.salvaJson(novoEndereço);

    } catch (RuntimeException | IOException e) {
        System.out.println(e.getMessage());
        System.out.println("Finalizando a aplicação!");
    }


     }
}