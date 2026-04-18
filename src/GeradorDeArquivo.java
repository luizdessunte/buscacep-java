import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvaJson(Endereço endereço) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Salva o conteúdo com o CEP como nome do arquivo (ex.: 01001-000.json).
        FileWriter escrita = new FileWriter(endereço.cep() + ".json");
        escrita.write(gson.toJson(endereço));
        escrita.close();
    }

}
