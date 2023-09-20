class Lampada{
   private String estado;
   
   public Lampada(String estado){
    this.estado = estado;
}
    public void acender(){
        if(estado.equals("Apagado")){
            estado = "Aceso";
            System.out.println("A lâmpada foi acesa");
        }else {
            System.out.println("A lâmpada já está acesa");
        }
    }
    public void apagar(){
        if(estado.equals("Aceso")){
            estado = "Apagado";
            System.out.println("A lâmpada foi apagada");
        }else{
            System.out.println("A lâmpada já está apagada");
        }
    }
    public void imprimir(){
        System.out.println("Estado da lâmpada: " + estado);
    }
}