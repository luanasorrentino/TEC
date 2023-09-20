public class App {
    public static void main(String[] args) {
        Lampada lampadaEstado = new Lampada();

        lampadaEstado.imprimir();

        lampadaEstado.acender();
        lampadaEstado.imprimir();

        lampadaEstado.apagar();
        lampadaEstado.imprimir();

        lampadaEstado.apagar();
    }
}
