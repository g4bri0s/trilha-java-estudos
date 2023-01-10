public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void alimentar() {
        ligada = !ligada;
    }

    public void mudarCanal() {
        canal = canal + 1;

    }

    public void aumentarVolume() {
        volume = volume + 1;
    }

    public void diminuirVolume() {
        volume = volume - 1;
    }
}