package p153l;

/* JADX INFO: loaded from: classes.dex */
public final class jng0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aug0 f121852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f121853b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Exception f121854c;

    public jng0(aug0 aug0Var, int i, Exception exc) {
        this.f121852a = aug0Var;
        this.f121853b = i;
        this.f121854c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f121852a.f73507p.m181856i(this.f121852a, this.f121853b, this.f121854c);
    }
}
