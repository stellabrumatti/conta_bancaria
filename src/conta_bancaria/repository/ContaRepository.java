package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	
	//Método do CRUD
	
	public void listaTodas ();
	public void cadastrar (Conta conta);
	public void atualizar (Conta conta);
	public void procurarPorNumero(int numero);
	public void deletar(int numero);
	
	//Métodos Bncários
	
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void depositar(int numeroOrigem, int numeroDestino, float valor);
	

}
