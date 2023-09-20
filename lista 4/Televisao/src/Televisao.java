class Televisao{
    private String estado;

    public Televisao(String estado){
        this.estado = estado;
    }
    public void ligar(){
        if(estado.equals("Desligada")){
            estado = "ligada";
            System.out.println("A televisão foi ligada");
        }else if(estado.equals("Quebrada")) {
            System.out.println("A televisão está quebrada");
        }else{
            System.out.println("A televisão já está ligada");
        }
    }
    public void desligar(){
        if(estado.equals("ligada")){
            estado = "desligada";
            System.out.println("A televisão foi desligada");
        }else if(estado.equals("Quebrada")) {
            System.out.println("A televisão está quebrada");
        }else{
            System.out.println("A televisão já está desligada");
        }
    }
    public void quebrada(){
        if(estado.equals("quebrada")){
            System.out.println("A televisão está quebrada");
        }else{
            estado = "quebrada";
            System.out.println("A televisão já estava quebrada");
        }
    }
    public void observar(){
        System.out.println("A televisão está: " + estado);
    }
}