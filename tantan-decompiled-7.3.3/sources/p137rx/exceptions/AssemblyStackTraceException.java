package p137rx.exceptions;

/* JADX INFO: loaded from: classes3.dex */
public final class AssemblyStackTraceException extends RuntimeException {
    private static final long serialVersionUID = 2038859767182585852L;

    public AssemblyStackTraceException(String str, Throwable th) {
        super(str, th);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    public AssemblyStackTraceException(String str) {
        super(str);
    }
}
