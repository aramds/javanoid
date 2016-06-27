package service;

import data.DataMain;

import java.util.HashMap;
import java.util.Map;

public class DataService<T extends DataMain> {

    private final Map<Long, T> dataMap = new HashMap<>();
    private long quantity = 0;

    public void addNew(T dataObject) {
        this.dataMap.put(dataObject.getId(), dataObject);
    }

    public T getById(Long id) {
        return this.dataMap.get(id);
    }

    public void deleteById(Long id) {
        this.dataMap.remove(id);
    }

    public void printData() {
        System.out.println("********************************************* **");
        this.dataMap.forEach(this::formatData);
        System.out.println("Total quantity: " + this.quantity + " item(s).");
        System.out.println("********************************************* **");
    }

    private void formatData(Long id, T data) {
        this.quantity++;
        System.out.println("Item id: " + id);
        System.out.println("Item fields: " + data.toString());
        System.out.println("Item created at: " + data.getCreatedAt());
        System.out.println("Item updated at: " + data.getUpdatedAt());
        System.out.println("-------------------------------------------------");
    }
}
