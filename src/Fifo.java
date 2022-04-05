public class Fifo <T> extends AbstractBuffer<T> {


    public Fifo(int s) {
        this.array = (T[]) new Object[s];
    }



    public Fifo() {
        this.array= (T[]) new Object[(int)((Math.random() * (99 - 3)) + 3)];
    }

    public T pop() {
        T tmp= this.array[0];
        size--;
        for(int j=1;j<array.length;j++) {
            array[j-1]=array[j];
        }
        return tmp;


    }

}