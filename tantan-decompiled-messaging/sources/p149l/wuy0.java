package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class wuy0 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final boolean f188173a;

    /* JADX INFO: renamed from: b */
    public final boolean f188174b;

    public wuy0(mhr0 mhr0Var, int i) {
        this.f188173a = 1 == (mhr0Var.f133884d & 1);
        this.f188174b = fwy0.m123585t(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wuy0 wuy0Var) {
        return ahw0.m96742j().mo96747e(this.f188174b, wuy0Var.f188174b).mo96747e(this.f188173a, wuy0Var.f188173a).mo96743a();
    }
}
