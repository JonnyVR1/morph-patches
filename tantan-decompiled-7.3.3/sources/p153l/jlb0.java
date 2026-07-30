package p153l;

/* JADX INFO: loaded from: classes8.dex */
public abstract class jlb0 implements Comparable<jlb0> {

    /* JADX INFO: renamed from: a */
    public x20 f121542a;

    /* JADX INFO: renamed from: b */
    public x20 f121543b;

    /* JADX INFO: renamed from: c */
    public int f121544c;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(jlb0 jlb0Var) {
        return this.f121544c - jlb0Var.f121544c;
    }

    /* JADX INFO: renamed from: j */
    public abstract int mo22137j();

    /* JADX INFO: renamed from: o */
    public abstract String mo22139o();

    /* JADX INFO: renamed from: p */
    public abstract String mo22140p();

    /* JADX INFO: renamed from: q */
    public void m146058q(x20 x20Var) {
        this.f121543b = x20Var;
    }

    /* JADX INFO: renamed from: r */
    public void m146059r(int i) {
        this.f121544c = i;
    }

    /* JADX INFO: renamed from: s */
    public void m146060s(x20 x20Var) {
        this.f121542a = x20Var;
    }
}
