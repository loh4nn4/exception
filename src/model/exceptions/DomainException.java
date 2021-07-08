package model.exceptions;

public class DomainException extends Exception{ //exceção personalizada
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //construtor para personalizar mensagem de exceção
		super(msg);
	}
}
