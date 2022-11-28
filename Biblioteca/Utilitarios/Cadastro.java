package Biblioteca.Utilitarios;

import javax.swing.JOptionPane;

public class Cadastro {

    String titulo;
    int data;
    String autor;
    String edicao;
    String lingua;
    String genero;
    float preco;
    int quantidade;

    public void insertTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void insertData(int data) {
        this.data = data;
    }

    public void insertAutor(String autor) {
        this.autor = autor;
    }

    public void insertEdicao(String edicao) {
        this.edicao = edicao;
    }

    public  void insertLingua(String lingua) {
        this.lingua = lingua;
    }

    public  void insertGenero(String genero) {
        this.genero = genero;
    }

    public  void insertPreco(float preco) {
        this.preco = preco;
    }

    public  void insertQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void apresenta(){
        
        JOptionPane.showMessageDialog(null, "titulo: "+titulo + "\nData: "+
                data+"\nAutor: "+autor+"\nedicao: "+edicao+"\nlingua: "+lingua+
                "\ngenero: "+genero+"\npreco: R$ "+preco+"\nquantidade: "+quantidade);


    }

}
