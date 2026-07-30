package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class frr0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f100472a;

    /* JADX INFO: renamed from: b */
    public final pqr0 f100473b;

    public frr0(int i, pqr0 pqr0Var) {
        this.f100472a = i;
        this.f100473b = pqr0Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f100472a, ((frr0) obj).f100472a);
    }
}
