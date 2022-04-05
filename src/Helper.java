public class Helper {

    public static <T> void move(Buffer<T> source, Buffer<T> sink) {
        sink.push(source.pop());
    }


}