public interface Buffer<T> {

    public void push(T t);

    public T pop ();

    public int size();

    public int capacity();


}