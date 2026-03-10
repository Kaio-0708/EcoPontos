package Model;

public class ItemFonte implements Item{
	
	private String titulo;
	private String fonte;
	private int ano;
	private boolean verificada;
	private int relevancia;
	
	public ItemFonte(String titulo, String fonte, int ano, boolean verificada, int relevancia) {
		this.titulo = titulo;
		this.fonte = fonte;
		this.ano = ano;
		this.verificada = verificada;
		this.relevancia = relevancia;
	}
	
	@Override
	public String exibirResumo() {
		
		String verificadaTexto = verificada ? "[verificada]" : "[nao verificada]";
		
		return "FONTE: \"" + titulo + "\" - " + fonte +
	               " (" + ano + ") " + verificadaTexto +
	               " relevancia=" + relevancia;
	}

	@Override
	public String exibirDetalhamento() {
		return "FONTE (ano=" + ano +
	               ", verificada=" + verificada +
	               ", relevancia=" + relevancia + "):\n" +
	               "Titulo: " + titulo + "\n" +
	               "Fonte: " + fonte + "\n" +
	               "Créditos do item: " + calcularCreditos();
	}

	@Override
	public int calcularCreditos() {
		
		int creditos;

	    if (verificada) {
	        creditos = 15;
	    } else {
	        creditos = 5;
	    }

	    return creditos;
	}
}
