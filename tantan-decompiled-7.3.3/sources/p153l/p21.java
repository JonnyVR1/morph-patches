package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class p21 {
    private o21 context;
    private gse0 request;
    private lse0 response;
    private Throwable throwable;

    public p21(o21 o21Var, gse0 gse0Var, lse0 lse0Var, Throwable th) {
        this.context = o21Var;
        this.request = gse0Var;
        this.response = lse0Var;
        this.throwable = th;
    }

    public o21 getAsyncContext() {
        return this.context;
    }

    public gse0 getSuppliedRequest() {
        return this.request;
    }

    public lse0 getSuppliedResponse() {
        return this.response;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public p21(o21 o21Var, gse0 gse0Var, lse0 lse0Var) {
        this(o21Var, gse0Var, lse0Var, null);
    }

    public p21(o21 o21Var, Throwable th) {
        this(o21Var, null, null, th);
    }

    public p21(o21 o21Var) {
        this(o21Var, null, null, null);
    }
}
