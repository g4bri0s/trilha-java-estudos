public class SmartTv {
    boolean alimentacao = false;
    int canal = 1;
    int volume = 20;

    public void alimentar(int novaAlimentacao) {
        alimentacao = (novaAlimentacao == 1 ? !alimentacao : alimentacao);
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal == 1) {
            canal = canal + 1;
        } else if (novoCanal == -1) {
            canal = canal - 1;
        } else {
            canal = novoCanal;
        }
    }

    public void mudarVolume(int novoVolume) {
        volume = (novoVolume >= 1 ? volume + 1 : volume - 1);
    }
}
