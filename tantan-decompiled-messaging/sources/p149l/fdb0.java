package p149l;

/* JADX INFO: loaded from: classes8.dex */
public abstract class fdb0 implements Comparable<fdb0> {

    /* JADX INFO: renamed from: a */
    public d30 f97024a;

    /* JADX INFO: renamed from: b */
    public d30 f97025b;

    /* JADX INFO: renamed from: c */
    public int f97026c;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(fdb0 fdb0Var) {
        return this.f97026c - fdb0Var.f97026c;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo21138j();

    /* JADX INFO: renamed from: o */
    public abstract String mo21140o();

    /* JADX INFO: renamed from: p */
    public abstract String mo21141p();

    /* JADX INFO: renamed from: q */
    public void m120963q(d30 d30Var) {
        this.f97025b = d30Var;
    }

    /* JADX INFO: renamed from: r */
    public void m120964r(int i) {
        this.f97026c = i;
    }

    /* JADX INFO: renamed from: s */
    public void m120965s(d30 d30Var) {
        this.f97024a = d30Var;
    }
}
