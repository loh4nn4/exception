package model.exceptions;

public class DomainException extends Exception{ //exce��o personalizada
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //construtor para personalizar mensagem de exce��o
		super(msg);
	}
}
