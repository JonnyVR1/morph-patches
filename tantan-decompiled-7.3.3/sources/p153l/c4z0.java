package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class c4z0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final boolean f79746a;

    /* JADX INFO: renamed from: b */
    public final boolean f79747b;

    public c4z0(sqr0 sqr0Var, int i) {
        this.f79746a = 1 == (sqr0Var.f170243d & 1);
        this.f79747b = l5z0.m153034t(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(c4z0 c4z0Var) {
        return gqw0.m131503j().mo117581e(this.f79747b, c4z0Var.f79747b).mo117581e(this.f79746a, c4z0Var.f79746a).mo117577a();
    }
}
