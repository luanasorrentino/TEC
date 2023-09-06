class Produto{
    String nome;
    double preco;
    int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public void compra(int qtdCompra, int precoCompra){
            qtdEstoque += qtdCompra;
            System.out.println("Compra de " + nome + " quantidade: " + qtdCompra + " preço: R$ " + precoCompra);
    }
    public void venda(int qtdCompra, int precoVenda){
            if (qtdEstoque >= qtdCompra){
                qtdEstoque -= qtdCompra;
                System.out.println("Venda de " + nome + " quantidade: " + qtdCompra + " preço: R$ " + precoVenda);
            } else{
                System.out.println("Quantidade em estoque insuficiente");
            }
    }
    public void imprimir(){
        System.out.println("Quantidade em estoque de " + nome + ":" + qtdEstoque);
    }
}