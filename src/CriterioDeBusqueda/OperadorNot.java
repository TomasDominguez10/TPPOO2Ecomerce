package CriterioDeBusqueda;

import java.util.List;

public class OperadorNot  implements CriterioDeBusqueda {

    private CriterioDeBusqueda criterio;

    public OperadorNot (CriterioDeBusqueda criterio) {
        this.criterio = criterio;
    }

    @Override
    public List<Item> filtrarItems(List<Item> items) {
        List<Item> itemsQueCumplen = this.criterio.filtrarItems(items);
        return items.stream()
                .filter(item -> !itemsQueCumplen.contains(item))
                .toList();
    }


}
