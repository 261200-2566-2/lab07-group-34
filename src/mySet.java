import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class mySet<E> implements Set<E> {// implements Set from Hashmap
    private final HashMap<E, Object> map = new HashMap<>();

    @Override
    public int size() {// size of set
        return map.size();
    }

    @Override
    public boolean isEmpty() {// Is set empty?
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {// Is elements in set has any elements like o?
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {// reading all set elements
        return map.keySet().iterator();
    }

    @Override
    public <T> T[] toArray(T[] a) {// change set to array by receive parameter as array
        return map.keySet().toArray(a);
    }

    @Override
    public Object[] toArray() {// change object to array
        return map.keySet().toArray();
    }

    @Override
    public boolean add(E e) {// add 'e' to set
        return map.put(e, true) == null;
    }

    @Override
    public boolean remove(Object o) {// remove 'o' from set
        return map.remove(o) != null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {// find that if elements in collection are present in set?
        return map.keySet().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {// pick a same elements from collection and set then remove the rest
        return map.keySet().retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {// remove all element in set that represent in collection
        return map.keySet().removeAll(c);
    }

    @Override
    public void clear() {// clear all elements in set
        map.clear();
    }

}
