package consulta.viacep.modelos;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Endereco {
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ddd;
	
	public Endereco(String cep, String logradouro, String complemento, String bairro, 
			String localidade, String uf, String ddd) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.ddd = ddd;
		
	}
	
	public void salvaEndereco(Endereco endereco) throws IOException {
		System.out.println("criando arquivo");
		Gson gson = new GsonBuilder().create();
		FileWriter writer = new FileWriter("enderecosguardados.json");
		writer.write(gson.toJson(endereco));
		writer.close();
		System.out.println("arquivo finalizado");
	}
	
	
		
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cep: " + this.cep + "\n" +
        "Logradouro: " + this.logradouro + "\n" +
        "Complemento: " + this.complemento + "\n" +
        "Bairro: " + this.bairro + "\n" +
        "Localidade: " + this.localidade + "\n" +
        "Uf: " + this.uf + "\n" +
        "DDD: " + this.ddd + "\n";
	}

}
