package converter;

public abstract class Validator<T> {
    abstract boolean isValid(T t);
}
