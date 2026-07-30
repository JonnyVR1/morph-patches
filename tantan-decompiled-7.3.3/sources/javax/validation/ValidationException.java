package javax.validation;

/* JADX INFO: loaded from: classes2.dex */
public class ValidationException extends RuntimeException {
    public ValidationException(String str) {
        super(str);
    }

    public ValidationException() {
    }

    public ValidationException(String str, Throwable th) {
        super(str, th);
    }

    public ValidationException(Throwable th) {
        super(th);
    }
}
