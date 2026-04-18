public class Main {
     public static void main (String[] args) {
    ConsultaCEP consultaCEP = new ConsultaCEP();
    Endereço novoEndereço = consultaCEP.buscaEndereço("01001-000");

    System.out.println(novoEndereço);


     }
}