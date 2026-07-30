package p153l;

/* JADX INFO: loaded from: classes3.dex */
public class vrf0 implements x20 {

    /* JADX INFO: renamed from: a */
    public final x20 f185462a;

    /* JADX INFO: renamed from: b */
    public final f2e0.AbstractC16877a f185463b;

    /* JADX INFO: renamed from: c */
    public final long f185464c;

    public vrf0(x20 x20Var, f2e0.AbstractC16877a abstractC16877a, long j) {
        this.f185462a = x20Var;
        this.f185463b = abstractC16877a;
        this.f185464c = j;
    }

    @Override // p153l.x20
    public void call() {
        if (this.f185463b.isUnsubscribed()) {
            return;
        }
        long jMo123610a = this.f185464c - this.f185463b.mo123610a();
        if (jMo123610a > 0) {
            try {
                Thread.sleep(jMo123610a);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                j6f.m143661c(e);
            }
        }
        if (this.f185463b.isUnsubscribed()) {
            return;
        }
        this.f185462a.call();
    }
}
