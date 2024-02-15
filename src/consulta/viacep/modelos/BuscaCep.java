package consulta.viacep.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BuscaCep {

	public Endereco consultaCep() throws IOException, InterruptedException {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um cep para buscar: ");
		String busca = leitura.nextLine();
		String url = "https://viacep.com.br/ws/" + busca.replace(" ", "") + "/json/";
		System.out.println("Cep selecionado: ");
		System.out.println("*****************");

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response;

		response = client.send(request, BodyHandlers.ofString());
		String json = response.body();
		Gson gson = new GsonBuilder().create();
		Endereco umEndereco = gson.fromJson(json, Endereco.class);
		leitura.close();

		return umEndereco;
	}

}
