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
        for (Object element : c) {
            if (!contains(element)){// if elements not represent in c return false
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {// add all elements that not represent in set
        boolean modified = false;// Is set change?
        for (E element : c) {
            if (!contains(element)) {// if element not represent in c then add element in c
                add(element);
                modified = true;// set has been changed
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {// pick a same elements from collection and set then remove the rest
        boolean modified = false;// Is set changed?
        Iterator<E> iterator = iterator();// read all set elements
        while (iterator.hasNext()) {// while current element isn't the last element in set
            E element = iterator.next();// change current element to next element
            if (!c.contains(element)) {// if current element isn't in set then remove current element
                iterator.remove();
                modified = true;// set has been changed
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {// remove all element in set that represent in collection
        boolean modified = false;// Is set changed?
        Iterator<E> iterator = iterator();// read all set elements
        while (iterator.hasNext()) {//  while current element isn't the last element in set
            E element = iterator.next();// change current element to next element
            if (c.contains(element)) {// if current element is in set then remove
                iterator.remove();
                modified = true;// set has been changed
            }
        }
        return modified;
    }

    @Override
    public void clear() {// clear all elements in set
        map.clear();
    }
}
