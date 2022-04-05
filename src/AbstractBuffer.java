public abstract class AbstractBuffer<T> implements Buffer<T> {

    protected int size = 0;
    protected T [] array;


    public void push(T t) {
        array[size++] = t;
    }

    public int capacity() {
        return array.length;
    }

    public int size() {
        return size;
    }

}