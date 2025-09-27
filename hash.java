import java.util.*;
class H<K,V> {
    ArrayList<LinkedList<AbstractMap.SimpleEntry<K,V>>> t=new ArrayList<>();
    H() { for(int i=0;i<10;i++) t.add(new LinkedList<>()); }
    void p(K k,V v) { 
        for(var e:t.get(k.hashCode()%10)) if(e.getKey().equals(k)) {e.setValue(v);return;}
        t.get(k.hashCode()%10).add(new AbstractMap.SimpleEntry<>(k,v));
    }
    V g(K k) {
        for(var e:t.get(k.hashCode()%10)) if(e.getKey().equals(k)) return e.getValue();
        return null;
    }
}
