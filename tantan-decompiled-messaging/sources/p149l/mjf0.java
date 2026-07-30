package p149l;

/* JADX INFO: loaded from: classes3.dex */
public class mjf0 implements d30 {

    /* JADX INFO: renamed from: a */
    public final d30 f134131a;

    /* JADX INFO: renamed from: b */
    public final bud0.AbstractC15976a f134132b;

    /* JADX INFO: renamed from: c */
    public final long f134133c;

    public mjf0(d30 d30Var, bud0.AbstractC15976a abstractC15976a, long j) {
        this.f134131a = d30Var;
        this.f134132b = abstractC15976a;
        this.f134133c = j;
    }

    @Override // p149l.d30
    public void call() {
        if (this.f134132b.isUnsubscribed()) {
            return;
        }
        long jMo103919a = this.f134133c - this.f134132b.mo103919a();
        if (jMo103919a > 0) {
            try {
                Thread.sleep(jMo103919a);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                f5f.m119489c(e);
            }
        }
        if (this.f134132b.isUnsubscribed()) {
            return;
        }
        this.f134131a.call();
    }
}
