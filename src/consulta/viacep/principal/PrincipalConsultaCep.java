package consulta.viacep.principal;


import java.io.IOException;


import consulta.viacep.modelos.BuscaCep;
import consulta.viacep.modelos.Dialogos;
import consulta.viacep.modelos.Endereco;

public class PrincipalConsultaCep {

	public static void main(String[] args) throws IOException, InterruptedException {
		int status = 0;
		Dialogos dialogos = new Dialogos();
		while (status != 1) {

			
			dialogos.inicia();
			int resposta = dialogos.opcoes();
			if (resposta == 1) {
				BuscaCep consultaCep = new BuscaCep();
				Endereco endereco = consultaCep.consultaCep();
				System.out.println(endereco);
				if (dialogos.salvar() == 1) {
					endereco.salvaEndereco(endereco);

				} else {
					status = 1;
				}

			} else {
				status = 1;

			}
		}
		dialogos.finaliza();

	}

}
