package p133rx.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class OnCompletedFailedException extends RuntimeException {
    private static final long serialVersionUID = 8622579378868820554L;

    public OnCompletedFailedException(Throwable th) {
        super(th == null ? new NullPointerException() : th);
    }

    public OnCompletedFailedException(String str, Throwable th) {
        super(str, th == null ? new NullPointerException() : th);
    }
}
