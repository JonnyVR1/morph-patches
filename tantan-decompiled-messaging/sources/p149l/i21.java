package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class i21 {
    private h21 context;
    private bke0 request;
    private gke0 response;
    private Throwable throwable;

    public i21(h21 h21Var, bke0 bke0Var, gke0 gke0Var, Throwable th) {
        this.context = h21Var;
        this.request = bke0Var;
        this.response = gke0Var;
        this.throwable = th;
    }

    public h21 getAsyncContext() {
        return this.context;
    }

    public bke0 getSuppliedRequest() {
        return this.request;
    }

    public gke0 getSuppliedResponse() {
        return this.response;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public i21(h21 h21Var, bke0 bke0Var, gke0 gke0Var) {
        this(h21Var, bke0Var, gke0Var, null);
    }

    public i21(h21 h21Var, Throwable th) {
        this(h21Var, null, null, th);
    }

    public i21(h21 h21Var) {
        this(h21Var, null, null, null);
    }
}
