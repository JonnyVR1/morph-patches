package p002l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b0t extends zqi0 {

    /* JADX INFO: renamed from: a */
    public int f7945a;

    public b0t(int i) {
        this.f7945a = i;
    }

    @Override // p002l.zqi0
    /* JADX INFO: renamed from: b */
    public evl mo10140b(Runnable runnable, xoi0 xoi0Var) {
        int i = this.f7945a;
        ixq.C0624a c0624a = i <= 10 ? new ixq.C0624a(runnable) : new ixq.C0624a(runnable, i);
        c0624a.m15501a(xoi0Var.m26044a());
        return c0624a;
    }
}
