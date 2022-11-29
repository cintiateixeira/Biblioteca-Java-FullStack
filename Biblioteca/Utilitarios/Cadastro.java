package Biblioteca.Utilitarios;

import javax.swing.JOptionPane;

public class Cadastro {

    public Cadastro() {
    }

    String titulo;
    int data;
    String autor;
    int edicao;
    String lingua;
    String genero;
    float preco;
    int quantidade;

    // Setters-------------------------------
    public void insertTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void insertData(int data) {
        this.data = data;
    }

    public void insertAutor(String autor) {
        this.autor = autor;
    }

    public void insertVolume(int edicao){
        this.edicao = edicao;
    }

    public void insertLingua(String lingua) {
        this.lingua = lingua;
    }

    public void insertGenero(String genero) {
        this.genero = genero;
    }

    public void insertPreco(float preco) {
        this.preco = preco;
    }

    public void insertQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // getters---------------------------
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getData() {
        return this.data;
    }

    public int getVolume() {
        return this.edicao;
    }

    public String getLingua() {
        return this.lingua;
    }

    public String getGenero() {
        return this.genero;
    }

    public float getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void apresenta() {

        JOptionPane.showMessageDialog(null,getTitulo()+"\n"+getAutor()+"\n"+getData()+"\n"+getVolume()+
        getGenero()+"\n"+getLingua()+"\n"+getPreco()+"\n"+getQuantidade(),
        "Fichatecnica", JOptionPane.INFORMATION_MESSAGE);
    }

}
