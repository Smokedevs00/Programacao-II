
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {
    
private String nome;
private String idade;
private String cpf;
private String email;
private String materia;
private int nota1;
private int nota2;
private int nota3;
private int nota4;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
public String getIdade() {
    return idade;
}

public void setIdade(String idade) {
    this.idade = idade;
}
public String getCpf() {
    return cpf;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
public String getMateria() {
    return materia;
}

public void setMateria(String materia) {
    this.materia = materia;
}
public int getNota1() {
    return nota1;
}

public void setNota1(int nota12) {
    this.nota1 = nota12;
}
public int getNota2() {
    return nota2;
}

public void setNota2(int nota22) {
    this.nota2 = nota22;
}
public int getNota3() {
    return nota3;
}

public void setNota3(int nota32) {
    this.nota3 = nota32;
}
public int getNota4() {
    return nota4;
}

public void setNota4(int nota42) {
    this.nota4 = nota42;
}






public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Principal> principais = new ArrayList<>();
        
        boolean rodada = true;

        //O aluno so tera uma materia de refoço e 4 provas 
        //ex: Materia: matematica / nota1= 8 /nota2= 3 /nota3= 6/ nota4= 1
        //rendimento do aluno: 

    while(rodada){
        System.out.println("==================MENU================");
        System.out.println("1- Cadastrar Aluno Na materia de Refoço");
        System.out.println("2- Listar alunos");
        System.out.println("3- Pesquisar Aluno e redimentos");
        System.out.println("4- alterar ");  
        System.out.println("5- Remover Aluno");
        System.out.println("6- Sair");
        System.out.println("======================================");
        String opcao = scanner.nextLine();


         switch(opcao){
                     case "1":{
                        int s, rd;
                        System.out.println("=====Cadastrar aluno======");
                        System.out.println("digite seu nome");
                        String nome = scanner.nextLine();
                        System.out.println("digite seu idade");
                        String idade = scanner.nextLine();
                        System.out.println("digite seu cpf");
                        String cpf = scanner.nextLine();
                        System.out.println("digite seu email");
                        String email = scanner.nextLine();
                        System.out.println("Materia de refoço do aluno");
                        String materia = scanner.nextLine();
                        System.out.println("Digite Suas Notas:");
                        System.out.println("nota1 ");
                        int nota1 = scanner.nextInt();
                        System.out.println("nota2 ");
                        int nota2 = scanner.nextInt();
                        System.out.println("nota3");
                        int nota3 = scanner.nextInt();
                        System.out.println("nota4 ");
                        int nota4 = scanner.nextInt();
                        s = (nota1+nota2+nota3+nota4)/2;
                        rd = 100/s;
                        System.out.println("Seu rendimento e " + rd +"%");
                        System.out.println("=============================");
                        Principal u = new Principal();
                u.setNome(nome);
                u.setIdade(idade);
                u.setCpf(cpf);
                u.setEmail(email);
                u.setMateria(materia);
                u.setNota1(nota1);
                u.setNota2(nota2);
                u.setNota3(nota3);
                u.setNota4(nota4);
        
                principais.add(u);
                break;
            }
            case "2":{
                for(int i = 0; i < principais.size(); i++){

                    principais.get(i);
                        System.out.println("Aluno" + i);
                        System.out.println("Nome:" + principais.get(i).getNome());
                        System.out.println("Idade:" + principais.get(i).getIdade());
                        System.out.println("Cpf:" +  principais.get(i).getCpf());
                        System.out.println("Email:" + principais.get(i).getEmail());
                        
                }
                break;

            }
            case "3":{
                System.out.println("======procura aluno======");
                System.out.println("Digite o cpf");
                String cpf = scanner.nextLine();
        
                for(int i=0; i < principais.size(); i++){

                    Principal uTemp = principais.get(i);
                    if(cpf.equals(uTemp.getCpf())){
                        int s, rd;
                        System.out.println("Aluno encontrado");
                        System.out.println("\nNome:"+ uTemp.getNome());
                        System.out.println("\nEmail:" + uTemp.getEmail());
                        System.out.println("\nCpf:" + uTemp.getCpf());
                        System.out.println("\nMateria:" + uTemp.getMateria());
                        System.out.println("\nnota1: " + uTemp.getNota1());
                        System.out.println("\nnota2: " + uTemp.getNota2());
                        System.out.println("\nnota3: " + uTemp.getNota3());
                        System.out.println("\nnota4: " + uTemp.getNota4());
                        s = (uTemp.getNota1()+uTemp.getNota2()+uTemp.getNota3()+uTemp.getNota4())/2;
                        rd = 100/s;
                        System.out.println("\nRendimento:" + rd + "%");

                        break;

                    }else{
                        System.out.println("aluno com esse cpf nao encontrado");
                    }
                }
                break;

            }
            case "4":{
                System.out.println("======Alterar aluno=====");

                for(int i = 0 ; i < principais.size(); i++){

                    Principal uTemp = principais.get(i);

                    System.out.println(principais.get(i) + uTemp.getCpf());
                    scanner.nextLine();

                }
                System.out.println("Digite o valor de referencia");
                int referencia = scanner.nextInt();
                scanner.nextLine();
            
                System.out.println("digite seu nome:");
                String nome = scanner.nextLine();
                System.out.println("digite seu idade:");
                String idade = scanner.nextLine();
                System.out.println("digite seu cpf:");
                String cpf = scanner.nextLine();
                System.out.println("digite seu email:");
                String email = scanner.nextLine();
                System.out.println("Materia de refoço do aluno:");
                String materia = scanner.nextLine();
                System.out.println("nota1 ");
                int nota1 = scanner.nextInt();
                System.out.println("nota2 ");
                int nota2 = scanner.nextInt();
                System.out.println("nota3");
                int nota3 = scanner.nextInt();
                System.out.println("nota4 ");
                int nota4 = scanner.nextInt();
                Principal u = principais.get(referencia);
        u.setNome(nome);
        u.setIdade(idade);
        u.setCpf(cpf);
        u.setEmail(email);
        u.setMateria(materia);
        u.setNota1(nota1);
        u.setNota2(nota2);
        u.setNota3(nota3);
        u.setNota4(nota4);

                break;

            }
            case "5":{
                System.out.println("======Remover=====");

                for(int i = 0 ; i < principais.size(); i++){

                    Principal uTemp = principais.get(i);

                }
                System.out.println("Digite o valor de referencia");
                int referencia = scanner.nextInt();
                scanner.nextLine();

                principais.remove(referencia);
                break;

            }
            case "6":{
                rodada = false;
                break;

            }

          }

        }
    }  
       
}


    


    
