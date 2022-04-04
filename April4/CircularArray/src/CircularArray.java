import java.util.Arrays;
import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{

    private T[] array;

    public CircularArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T get(int index) {
        return array[index];
    }

    public void rotateForward() {
        T t = array[array.length - 1];

        for(int i = array.length-1; i > 0; i--) {
            array[i] = array[i-1];
        }

        array[0] = t;
    }

    public void rotateBackward() {
        T t = array[0];

        for(int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }

        array[array.length-1] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return Arrays.stream(array).iterator();
    }
}
