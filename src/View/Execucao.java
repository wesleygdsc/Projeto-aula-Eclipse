package View;

import Model.Pessoa;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
        pessoa.setNome("Wesley Guedes");        
        System.out.println(pessoa.getNome());
        
        pessoa.setEndereco("Rua duarte de lemos");
        System.out.println(pessoa.getEndereco());
        
        
        pessoa.setBairro("Jardim Silva");
        System.out.println(pessoa.getBairro());
        
        
        pessoa.setCep(8141240);
        System.out.println(pessoa.getCep());
        
        
        pessoa.setCidade("São Paulo");
        System.out.println(pessoa.getCidade());
        
        
        pessoa.setEstado("São Paulo");
        System.out.println(pessoa.getEstado());
        
	}
	

}
