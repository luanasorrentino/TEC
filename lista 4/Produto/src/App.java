public class App{
    public static void main(String[] args) throws Exception{
        
        Produto produto1 = new Produto("Arroz", 8.0, 150);
        Produto produto2 = new Produto("Feijão", 10.0, 200);
    
        produto1.compra(50, 400);
        produto1.venda(150, 1500);
    
        produto2.compra(20, 160);
        produto2.venda(50, 500);
    
        produto1.imprimir();
        produto2.imprimir();
        }
    }