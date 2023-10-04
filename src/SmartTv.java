public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void aumentar () {
        volume++; 
    }

    public void abaixar () {
        volume--; 
    }

    public void avancar () {
        canal = ++canal; 
    }

    public void retornar () {
        canal = --canal; 
    }

}
