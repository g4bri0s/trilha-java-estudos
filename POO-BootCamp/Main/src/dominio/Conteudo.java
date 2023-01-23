package dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 15d;

    protected String titulo;
    private String Descricao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double calcularXp();

}
