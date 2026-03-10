package Model;

public class ItemMidia implements Item{
	
	private String link;
	private String titulo;
	private int duracaoSegundos;
	
	public ItemMidia(String link, String titulo, int duracaoSegundos) {
		if (duracaoSegundos < 0) {
		    throw new IllegalArgumentException("Duração inválida");
		}
		
		this.link = link;
		this.titulo = titulo;
		this.duracaoSegundos = duracaoSegundos;
	}
	
	@Override
	public String exibirResumo() {
		return "MIDIA: \"" + titulo + "\" (" + link + ") - " + duracaoSegundos + "s";
	}

	@Override
	public String exibirDetalhamento() {
		
		int minutos = duracaoSegundos / 60;
		
		return "MIDIA (duracao=" + duracaoSegundos + "s => " + minutos + "min):\n" +
	               "Titulo: " + titulo + "\n" +
	               "Link: " + link + "\n" +
	               "Créditos do item: " + calcularCreditos();
	}

	@Override
	public int calcularCreditos() {
		
		int minutos = duracaoSegundos / 60;
		
		int creditos = minutos * 5;
		
		if(creditos > 50) {
			creditos = 50;
		}
		
		return creditos;
	}
}
