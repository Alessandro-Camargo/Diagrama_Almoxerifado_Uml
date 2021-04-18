
import java.util.Scanner;

class Main {

    

    

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Cadastro cadastrar = new Cadastro();
        System.out.println("Nome do Colaborador:");
        String nome = sc.next();
        cadastrar.setNome(nome);
        
        System.out.println("Matricula:");
        String matricula = sc.next();
        cadastrar.setMatricula(matricula);

        System.out.println("Setor:");
        String setor = sc.next();
        cadastrar.setSetor(setor);

        System.out.println("Cargo:");
        String cargo = sc.next();
        cadastrar.setCargo(cargo);

        System.out.println("Supervisor:");
        String supervisor = sc.next();
        cadastrar.setSupervisor(supervisor);
      
        Luvas dePano = new Luvas();
        dePano.nome = "Luva de Pano";
        dePano.quantidadeDisp = 10;
        dePano.tamanho = "P,M,G";
        dePano.status();

        Luvas Couro = new Luvas();
        Couro.nome = "Couro";
        Couro.quantidadeDisp = 20;
        Couro.tamanho = "P,M,G,GG";
        Couro.status();

        Luvas Aco = new Luvas();
        Aco.nome = "Malha de Aço";
        Aco.quantidadeDisp = 20;
        Aco.tamanho = "P,M,G,GG";
        Aco.status();

        Luvas Latex = new Luvas();
        Latex.nome = "Latex";
        Latex.quantidadeDisp = 35;
        Latex.tamanho = "M,G,GG";
        Latex.status();



    }
}
