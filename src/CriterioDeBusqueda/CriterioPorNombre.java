package CriterioDeBusqueda;

import Item.Item;

import java.util.function.Predicate;

public class CriterioPorNombre  extends CriterioPorCategoria{



        private String nombre;

        public CriterioPorNombre(String nombre){
            super();
            this.nombre = nombre;
        }

        @Override
        public Predicate<Item> condicionDeFiltro() {
            return item -> item.getNombre().contains(this.nombre);
        }
    }
}
