package p133rx.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public class OnErrorFailedException extends RuntimeException {
    private static final long serialVersionUID = -419289748403337611L;

    public OnErrorFailedException(Throwable th) {
        super(th != null ? th.getMessage() : null, th == null ? new NullPointerException() : th);
    }

    public OnErrorFailedException(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
