public class Variable<T> {
    T value;
    boolean toInit;

    Variable(T value) {
        this.value = value;
        this.toInit = true;
    }
}
