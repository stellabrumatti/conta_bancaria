package conta_bancaria.controller;

import java.util.ArrayList;
import java.util.List;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	private List<Conta> listarContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void listarTodas() {
		for(var conta : listarContas) {
			conta.visualizar();
		}

		
	}

	@Override
	public void cadastrar(Conta conta) {
		listarContas.add(conta);
		System.out.println("Conta cadastrada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		
		
	}

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	
		
	}

}
