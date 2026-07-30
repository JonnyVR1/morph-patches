package javax.servlet;

/* JADX INFO: loaded from: classes2.dex */
public class ServletException extends Exception {
    private Throwable rootCause;

    public ServletException(String str, Throwable th) {
        super(str, th);
        this.rootCause = th;
    }

    public Throwable getRootCause() {
        return this.rootCause;
    }

    public ServletException(String str) {
        super(str);
    }

    public ServletException() {
    }

    public ServletException(Throwable th) {
        super(th);
        this.rootCause = th;
    }
}
