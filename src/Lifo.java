@SuppressWarnings("ALL")
public class Lifo<T> extends AbstractBuffer<T> {



    public Lifo(int s) {
        this.array = (T[]) new Object[s];
    }


    public Lifo() {
        this.array= (T[]) new Object[(int)((Math.random() * (99 - 3)) + 3)];
    }

    public T pop() {
        T tmp = this.array[size-1];
        size--;
        return tmp;

    }


}
