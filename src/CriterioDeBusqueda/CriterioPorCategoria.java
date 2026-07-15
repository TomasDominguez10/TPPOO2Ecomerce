package CriterioDeBusqueda;

import Item.Item;

import java.util.function.Predicate;

public class CriterioPorCategoria  extends CriterioSimple {

    private String categoria;

    public CriterioPorCategoria() {
        this.categoria = categoria;
    }

    @Override
    public Predicate<Item> condicionDeFiltro() {
        return item -> item.getCategoria().equals(this.categoria);
    }


}
