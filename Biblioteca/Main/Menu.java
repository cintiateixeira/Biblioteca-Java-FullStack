package Biblioteca.Main;

import java.util.Scanner;

import Biblioteca.Utilitarios.Cadastro;

public class Menu {

    public static void main(String[] args) {
   
        while(true){
                int i = menu();
            if(i==1){cadastro();
            break;}
            else if(i==2){remover();
            break;}
            else if(i==3){pegar();
            break;}
            else if(i==4){devolver();
            break;}
            else{System.out.println("opção inválida");}
        }
   }

    public static void cadastro() {

        Scanner leia = new Scanner(System.in);
        Cadastro livro1 = new Cadastro();

        System.out.println("Nome do livro:");
        livro1.insertTitulo(leia.nextLine());
        System.out.println("Nome do autor:");
        livro1.insertAutor(leia.nextLine());
        System.out.println("data(sem traço nem parentese)");
        livro1.insertData(leia.nextInt());
        System.out.println("Edição do livro:");
        livro1.insertEdicao(leia.nextLine());
        System.out.println("Genero do livro");
        livro1.insertGenero(leia.nextLine());
        System.out.println("Lingua do livro");
        livro1.insertLingua(leia.nextLine());
        System.out.println("Preço do livro");
        livro1.insertPreco(leia.nextFloat());
        System.out.println("Quantidade do livro");
        livro1.insertQuantidade(leia.nextInt());

        livro1.apresenta();
    }

    public static int menu() {
        int x;
        Scanner leia = new Scanner(System.in);
        System.out.println("Menu: \n 1- Cadastro\n2-Remover\n3-Pegar ou Consultar\n4-Devolver ");
        x = leia.nextInt();
        return x;
    }

    // Falta
    // fazer-------------------------------------------------------------------
    public static void devolver() {
        System.out.println("método ainda não feito");
    }

    public static void remover() {
        System.out.println("método ainda não feito");
    }

    public static void pegar() {
        System.out.println("método ainda não feito");
    }
}
