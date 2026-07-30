package p149l;

/* JADX INFO: loaded from: classes2.dex */
public class phi0 {

    /* JADX INFO: renamed from: a */
    protected mhi0 f148934a;

    /* JADX INFO: renamed from: b */
    protected Throwable f148935b;

    public phi0(mhi0 mhi0Var, Throwable th) {
        this.f148934a = mhi0Var;
        this.f148935b = th;
    }

    public String toString() {
        return this.f148934a + ": " + this.f148935b.getMessage();
    }
}
