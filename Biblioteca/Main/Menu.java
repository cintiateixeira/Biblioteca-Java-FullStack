package Biblioteca.Main;

import java.util.Scanner;

import Biblioteca.Utilitarios.Cadastro;


public class Menu {

    public static void main(String[] args) {

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
}
