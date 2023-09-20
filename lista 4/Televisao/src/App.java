public class App {
    public static void main(String[] args){
        Televisao estadoTV = new Televisao();

        estadoTV.observar();

        estadoTV.ligar();
        estadoTV.observar();

        estadoTV.desligar();
        estadoTV.observar();

        estadoTV.quebrada();
        estadoTV.observar();


    }
}
