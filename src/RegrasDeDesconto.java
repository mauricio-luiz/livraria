/**
 * Created by mauricio on 19/05/2017.
 */
public class RegrasDeDesconto {

    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turine");

        LivroFisico livro = new LivroFisico(autor);
        livro.setValor(59.90);

        if(!livro.aplicaDescontoDe(0.3)){
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        }else{
            System.out.println("Valor do livro com desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if(!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no livro não pode ser maior do que 30%");
        }else{
            System.out.println("Valor do livro com desconto: " + ebook.getValor());
        }




    }
}
