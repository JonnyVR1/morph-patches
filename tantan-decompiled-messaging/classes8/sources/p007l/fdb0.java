package p007l;

import l.d30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public abstract class fdb0 implements Comparable<fdb0> {

    /* JADX INFO: renamed from: a */
    public d30 f2672a;

    /* JADX INFO: renamed from: b */
    public d30 f2673b;

    /* JADX INFO: renamed from: c */
    public int f2674c;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(fdb0 fdb0Var) {
        return this.f2674c - fdb0Var.f2674c;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo1410j();

    /* JADX INFO: renamed from: o */
    public abstract String mo1412o();

    /* JADX INFO: renamed from: p */
    public abstract String mo1413p();

    /* JADX INFO: renamed from: q */
    public void m9088q(d30 d30Var) {
        this.f2673b = d30Var;
    }

    /* JADX INFO: renamed from: r */
    public void m9089r(int i) {
        this.f2674c = i;
    }

    /* JADX INFO: renamed from: s */
    public void m9090s(d30 d30Var) {
        this.f2672a = d30Var;
    }
}
