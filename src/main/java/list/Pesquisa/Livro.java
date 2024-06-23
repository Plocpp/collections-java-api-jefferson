package main.java.list.Pesquisa;

public class Livro {
    private String tiluto;
    private String autor;
    private int anoPublicacao;

    public Livro(String tiluto, String autor, int anoPublicacao) {
        this.tiluto = tiluto;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTiluto() {
        return tiluto;
    }

    public void setTiluto(String tiluto) {
        this.tiluto = tiluto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tiluto='" + tiluto + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
