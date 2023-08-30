package data_structures.common;

public interface DataStructure<T> {

    boolean add(T value);
    T remove(T value);
    T lookup(T value);
}
