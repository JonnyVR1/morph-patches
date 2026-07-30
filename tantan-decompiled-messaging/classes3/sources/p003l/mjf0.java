package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class mjf0 implements d30 {

    /* JADX INFO: renamed from: a */
    public final d30 f5672a;

    /* JADX INFO: renamed from: b */
    public final bud0.AbstractC0185a f5673b;

    /* JADX INFO: renamed from: c */
    public final long f5674c;

    public mjf0(d30 d30Var, bud0.AbstractC0185a abstractC0185a, long j) {
        this.f5672a = d30Var;
        this.f5673b = abstractC0185a;
        this.f5674c = j;
    }

    @Override // p003l.d30
    public void call() {
        if (this.f5673b.isUnsubscribed()) {
            return;
        }
        long jMo3171a = this.f5674c - this.f5673b.mo3171a();
        if (jMo3171a > 0) {
            try {
                Thread.sleep(jMo3171a);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                f5f.m3962c(e);
            }
        }
        if (this.f5673b.isUnsubscribed()) {
            return;
        }
        this.f5672a.call();
    }
}
