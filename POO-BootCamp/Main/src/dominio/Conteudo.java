package dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 15d;

    protected String titulo;
    private String descricao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double calcularXp();

}
