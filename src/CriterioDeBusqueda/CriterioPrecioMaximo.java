package CriterioDeBusqueda;

import Item.Item;

import java.util.function.Predicate;

public class CriterioPrecioMaximo  extends CriterioDeBusqueda{

        private double precioMaximo;

        public CriterioPrecioMaximo(double precioMaximo){
            this.precioMaximo = precioMaximo;
        }

        @Override
        public Predicate<Item> condicionDeFiltro() {
            return item -> item.getPrecioBase() <= this.precioMaximo;
        }
}
