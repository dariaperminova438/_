import java.util.*;

public class SimpleHashTable<K,V> {
    private ArrayList<LinkedList<AbstractMap.SimpleEntry<K,V>>> table = new ArrayList<>();
    
    public SimpleHashTable(int size) {
        for (int i = 0; i < size; i++) table.add(new LinkedList<>());
    }
    
    public void put(K key, V value) {
        var bucket = table.get(Math.abs(key.hashCode()) % table.size());
        for (var entry : bucket) 
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        bucket.add(new AbstractMap.SimpleEntry<>(key, value));
    }
    
    public V get(K key) {
        for (var entry : table.get(Math.abs(key.hashCode()) % table.size()))
            if (entry.getKey().equals(key)) return entry.getValue();
        return null;
    }
}
