package p153l;

/* JADX INFO: loaded from: classes2.dex */
public class pqi0 {

    /* JADX INFO: renamed from: a */
    protected mqi0 f153676a;

    /* JADX INFO: renamed from: b */
    protected Throwable f153677b;

    public pqi0(mqi0 mqi0Var, Throwable th) {
        this.f153676a = mqi0Var;
        this.f153677b = th;
    }

    public String toString() {
        return this.f153676a + ": " + this.f153677b.getMessage();
    }
}
