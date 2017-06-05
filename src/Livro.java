import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by mauricio on 11/05/2017.
 */
public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean impresso;

    public Livro(Autor autor){
        this();
        this.autor = autor;
        this.impresso = true;
    }

    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    void mostraDetalhes(){
        System.out.println("Mostrando detalhes do livro:");
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);

        if(temAutor()){
            autor.mostraDetalhes();
        }

        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.3)
            return false;

        System.out.println("Aplica desconto no Livro");

        this.valor -= this.valor * porcentagem;
        return true;
    }

    boolean temAutor(){
        return  this.autor != null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }
}
