import java.util.ArrayList;

public class Matrix<T> {
    ArrayList<T> data;
    ArrayList<Integer> size;

    Matrix() {
        this.data = new ArrayList<T> ();
        this.size = new ArrayList<Integer> ();
    }

    Matrix(ArrayList<T> data, ArrayList<Integer> size) {
        this.data = data;
        this.size = size;
    }
}