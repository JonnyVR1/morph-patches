package javax.validation;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintViolationException extends ValidationException {
    private final Set<Object> constraintViolations;

    public ConstraintViolationException(String str, Set<Object> set) {
        super(str);
        if (set == null) {
            this.constraintViolations = null;
        } else {
            this.constraintViolations = new HashSet(set);
        }
    }

    public Set<Object> getConstraintViolations() {
        return this.constraintViolations;
    }

    public ConstraintViolationException(Set<Object> set) {
        this(null, set);
    }
}
