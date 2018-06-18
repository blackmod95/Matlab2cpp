import java.util.ArrayList;

public class Matrix<T> {
    ArrayList<T> data;
    Integer rowSize;
    Integer columnSize;
    boolean toInit;

    Matrix() {
        // Элементы матрицы
        this.data = new ArrayList<T> ();
        // Размеры матрицы по каждому измерению. Первый элемент - размер строки, второй - размер столбца, а дальше третьего измерения и тд
        this.rowSize = 0;
        this.columnSize = 0;
        this.toInit = true;
    }

    Matrix(ArrayList<T> data, Integer rowSize, Integer columnSize) {
        this.data = data;
        this.rowSize = rowSize;
        this.columnSize = columnSize;
        this.toInit = true;
    }
}