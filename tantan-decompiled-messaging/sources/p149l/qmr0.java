package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class qmr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f155334a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f155335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dnr0 f155336c;

    public qmr0(dnr0 dnr0Var, String str, long j) {
        this.f155334a = str;
        this.f155335b = j;
        this.f155336c = dnr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f155336c.f87091a.m150710a(this.f155334a, this.f155335b);
        dnr0 dnr0Var = this.f155336c;
        dnr0Var.f87091a.m150711b(dnr0Var.toString());
    }
}
