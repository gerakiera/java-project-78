package hexlet.code.schemas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BaseSchema<T> {
    public List<Predicate<T>> listOfPredicates = new ArrayList<>();
    public boolean isValid(T t) {
        for (Predicate<T> predicate : listOfPredicates) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }
}
