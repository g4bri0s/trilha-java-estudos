package dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;
   

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + '\'' + ", descricao=" + getDescricao() + '\'' +  ", cargarHoraria=" + cargaHoraria + '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }
}
