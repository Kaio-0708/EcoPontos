package Facade;

public class FacadeEcoPontos {

    // =========================
    // Moradores
    // =========================
    
    public boolean criarMorador(String nome, String cpf, String senha, String residencia) {
        // TODO implementar
        return false;
    }

    public String[] exibirMoradores() {
        // TODO implementar
        return new String[0];
    }

    public boolean alterarSenhaMorador(String cpf, String senhaAntiga, String novaSenha) {
        // TODO implementar
        return false;
    }

    // =========================
    // Orientações Ambientais
    // =========================

    public int criarOrientacao(String cpf, String senha, String tipo) {
        // TODO implementar
        return -1;
    }

    public boolean adicionarItemTextoOrientacao(String cpf, String senha, int idOrientacao, String texto) {
        // TODO implementar
        return false;
    }

    public boolean adicionarItemMidiaOrientacao(String cpf, String senha, int idOrientacao,
                                                String link, String titulo, int duracaoSegundos) {
        // TODO implementar
        return false;
    }

    public boolean adicionarItemFonteOrientacao(String cpf, String senha, int idOrientacao,
                                                String titulo, String fonte, int ano,
                                                boolean verificada, int relevancia) {
        // TODO implementar
        return false;
    }

    public String[] listarOrientacoes() {
        // TODO implementar
        return new String[0];
    }

    public String[] listarOrientacoesDetalhadas() {
        // TODO implementar
        return new String[0];
    }

    public String listarOrientacao(int idOrientacao) {
        // TODO implementar
        return "";
    }

    public String listarOrientacaoDetalhada(int idOrientacao) {
        // TODO implementar
        return "";
    }

    // =========================
    // Engajamento
    // =========================

    public int consultarCreditosEngajamento(String cpf, String senha) {
        // TODO implementar
        return 0;
    }

    public void curtirOrientacao(String cpf, String senha, int idOrientacao) {
        // TODO implementar
    }

    public String[] rankingMoradoresPorEngajamento() {
        // TODO implementar
        return new String[0];
    }

    // =========================
    // Entregas em Ecopontos
    // =========================

    public int registrarEntregaPapel(String cpf, String senha, double quantidadeKg,
                                     String descricao, String linkComprovacao) {
        // TODO implementar
        return 0;
    }

    public int registrarEntregaPlastico(String cpf, String senha, double quantidadeKg,
                                        String descricao, String linkComprovacao) {
        // TODO implementar
        return 0;
    }

    public int registrarEntregaVidro(String cpf, String senha, double quantidadeKg,
                                     String descricao, String linkComprovacao) {
        // TODO implementar
        return 0;
    }

    public int registrarEntregaEletronico(String cpf, String senha, int quantidadeItens,
                                          String descricao, String linkComprovacao) {
        // TODO implementar
        return 0;
    }

    public int consultarRegraCreditos(String cpf, String senha, String tipoEntrega) {
        // TODO implementar
        return 0;
    }

    // =========================
    // Boletins
    // =========================

    public String gerarBoletim(String cpf, String senha) {
        // TODO implementar
        return "";
    }

    public String gerarBoletimPorTipoMaterial(String cpf, String senha, String tipoMaterial) {
        // TODO implementar
        return "";
    }

    public String gerarBoletimPorTipoOrientacao(String cpf, String senha, String tipoOrientacao) {
        // TODO implementar
        return "";
    }
}