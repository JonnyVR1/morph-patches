package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class zhr0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f203227a;

    /* JADX INFO: renamed from: b */
    public final jhr0 f203228b;

    public zhr0(int i, jhr0 jhr0Var) {
        this.f203227a = i;
        this.f203228b = jhr0Var;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.f203227a, ((zhr0) obj).f203227a);
    }
}
