package Model;

public class ItemTextual implements Item{
	
	private String texto;
	
	public ItemTextual(String texto) {
		if(texto == null || texto.length() > 500) {
			throw new IllegalArgumentException("Texto inválido");
		}
		
		this.texto = texto;
	}
	
	@Override
	public String exibirResumo() {
		return "TEXTO: " + texto;
	}

	@Override
	public String exibirDetalhamento() {
		return "TEXTO (tamanho=" + texto.length() + "):\n" +
	               "\"" + texto + "\"\n" +
	               "Créditos do item: " + calcularCreditos();
	}

	@Override
	public int calcularCreditos() {
		
		int creditos;
		
		if(texto.length() < 50) {
			creditos = 0;
		} else {
	        creditos = texto.length() / 10;

	        if (creditos > 50) {
	            creditos = 50;
	        }
	    }
		
		return creditos;
	}
}
