import java.io.Serializable;
import java.util.*;

public class GrowingList<T> implements RandomAccess, Cloneable, Serializable {
    ArrayList<T> list = new ArrayList<>();

    public GrowingList(ArrayList<T> list) {
        this.list = list;
    }


    public int size() {
       return list.size();
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    public <T1> T1[] toArray(T1[] t1s) {
        return list.toArray(t1s);
    }

    public boolean add(T t) {
        return list.add(t);
    }

    private boolean remove(Object dontUse) {
    throw new UnsupportedOperationException();
    }

    public boolean containsAll(Collection<?> collection) {
        return list.containsAll(collection);
    }

    public boolean addAll(Collection<? extends T> collection) {
        return list.addAll(collection);
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        return list.addAll(i, collection);
    }

    private boolean removeAll(Collection<?> dontUse) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> collection) {
        return list.retainAll(collection);
    }

    public void clear() {
        list.clear();
    }

    public T get(int i) {
        return list.get(i);
    }

    public T set(int i, T t) {
        return list.set(i, t);
    }

    public void add(int i, T t) {
        list.add(i, t);
    }

    private T remove(int dontUse) {
        throw new UnsupportedOperationException();
    }

    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }

    public ListIterator<T> listIterator() {
        return list.listIterator();
    }

    public ListIterator<T> listIterator(int i) {
        return list.listIterator(i);
    }

    public List<T> subList(int i, int i1) {
        return list.subList(i,i1);
    }
}
