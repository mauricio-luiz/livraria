/**
 * Created by mauricio on 04/06/2017.
 */
public class Ebook extends Livro {

    private String waterMark;

    public Ebook(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem){
        if(porcentagem > 0.15)
            return false;

        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
        System.out.println("Aplica desconto no Ebook");
        return true;
    }

    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }

    public String getWaterMark(){
        return this.waterMark;
    }
}
