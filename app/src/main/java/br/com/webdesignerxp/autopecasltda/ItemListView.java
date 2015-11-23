package br.com.webdesignerxp.autopecasltda;

/**
 * Created by Renato on 11/22/2015.
 */
public class ItemListView {

    private String texto;
    private int icone;

    public ItemListView() {
    }

    public ItemListView(String texto, int icone) {
        this.texto = texto;
        this.icone = icone;
    }

    public int getIcone() {
        return icone;
    }

    public void setIconeRid(int icone) {
        this.icone = icone;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}