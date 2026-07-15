package CriterioDeBusqueda;

import java.util.ArrayList;
import java.util.List;

public class OperadorAnd  extends OperadorBinario {

    public OperadorAnd (CriterioDeBusqueda primerCriterio, CriterioDeBusqueda segundoCriterio) {
        super(primerCriterio, segundoCriterio);
    }

    @Override
    public List<Item> filtrarItems(List<Item> items) {
        List<Item> primerFiltro = this.getPrimerCriterio().filtrarItems(items);
        List<Item> segundoFiltro = this.getSegundoCriterio().filtrarItems(items);
        List<Item> itemsFiltrados = new ArrayList<>(primerFiltro);
        itemsFiltrados.retainAll(segundoFiltro);
        return itemsFiltrados.stream().distinct().toList();
    }

}
