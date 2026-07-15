package CriterioDeBusqueda;

import java.util.List;


public class OperadorBinario  implements CriterioDeBusqueda {

    private CriterioDeBusqueda primerCriterio, segundoCriterio;

    public OperadorBinario(CriterioDeBusqueda primerCriterio, CriterioDeBusqueda segundoCriterio){
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }


    @Override
    public List<CriterioDeBusqueda.Item> filtrarItems(List<CriterioDeBusqueda.Item> items) {
        return List.of();
    }
}
