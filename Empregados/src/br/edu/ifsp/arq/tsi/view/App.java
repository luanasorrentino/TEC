    package br.edu.ifsp.arq.tsi.view;

    import br.edu.ifsp.arq.tsi.controller.PessoasController;
    import br.edu.ifsp.arq.tsi.model.EmpregadosModel;
    
    public class App {
        public static void main(String[] args) throws Exception {
            PessoasController controller = PessoasController.getInstance();
    
            if(controller.save(new Pessoa("Ana Maria", "Feminino", "123.456.789-00", "16/09/1995", "1300.00"))){
                System.out.println("Cadastro realizado com sucesso!");
            }else{
                System.out.println("Cadastro NÃO realizado!");
            }
            if(controller.save(new Pessoa("Juliana Santos", "Feminino", "789.456.123-00", "23/11/2002", "2100.00"))){
                System.out.println("Cadastro realizado com sucesso!");
            }else{
                System.out.println("Cadastro NÃO realizado!");
            }
            System.out.println("Relatório das Pessoas Cadastradas:");
            for(Pessoa p: controller.getPessoa()){
                System.out.println(p);
            }

            Pessoa p1 = controller.findByNome("ana maria");
            if(p1 != null){
                System.out.println(p1.getNome() + " cadastrada.");
                p1.setNome("Ana Maria Pereira");
                if(controller.update(p1)){
                    System.out.println(p1.getNome() + " foi modificada.");
                }
                if(controller.remove(p1)){
                    System.out.println("Removida com sucesso.");
                }
            }
            System.out.println("Relatório das Pessoas Cadastradas:");
            for(Pessoa p: controller.getPessoa()){
                System.out.println(p);
            }
            
            Pessoa p1 = controller.findByCpf("123.456.789-00");
            if(p1 != null){
                System.out.println(p1.getNome() + " cadastrada.");
                p1.setNome("Ana Maria Pereira");
                if(controller.update(p1)){
                    System.out.println(p1.getNome() + " foi modificada.");
                }
                if(controller.remove(p1)){
                    System.out.println("Removida com sucesso.");
                }
            }
            System.out.println("Relatório das Pessoas Cadastradas:");
            for(Pessoas p: controller.getPessoas()){
                System.out.println(p);
            }
    
        }
    } 
