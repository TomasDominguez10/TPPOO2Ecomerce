package CriterioDeBusqueda;

import Item.Item;

import java.util.List;

public interface CriterioDeBusqueda {
    List<Item> filtrarItems(List<Item> items);
}
