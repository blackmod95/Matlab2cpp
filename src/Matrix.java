import java.util.ArrayList;

public class Matrix<T> {
    ArrayList<T> data;
    ArrayList<Integer> size;

    Matrix() {
        // Элементы матрицы
        this.data = new ArrayList<T> ();
        // Размеры матрицы по каждому измерению. Первый элемент - размер строки, второй - размер столбца, а дальше третьего измерения и тд
        this.size = new ArrayList<Integer> ();
    }

    Matrix(ArrayList<T> data, ArrayList<Integer> size) {
        this.data = data;
        this.size = size;
    }
}