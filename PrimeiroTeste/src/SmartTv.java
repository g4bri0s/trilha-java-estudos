public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void alimentar() {
        ligada = !ligada;
    }

    public void aumentarCanal() {
        canal = canal + 1;
    }

    public void diminuirCanal() {
        canal = canal - 1;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume() {
        volume = volume + 1;
    }

    public void diminuirVolume() {
        volume = volume - 1;
    }
}