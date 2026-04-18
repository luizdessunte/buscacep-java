import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCEP {
    public Endereço buscaEndereço(String cep){
        // Monta a URL no formato exigido pela API pública ViaCEP.
        URI endereço = URI.create("https://viacep.com.br/ws/" + cep + "/json/");


        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereço)
                .build();


        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Converte o JSON de resposta diretamente para o record Endereço.
            return new Gson().fromJson(response.body(), Endereço.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar CEP");
        }


    }
}
