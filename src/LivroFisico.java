/**
 * Created by mauricio on 04/06/2017.
 */
public class LivroFisico extends Livro {

    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaImpressao(){
        return this.getValor() * 0.05;
    }
}
