package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class kmx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f123842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f123843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f123844c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f123845d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ clx0 f123846e;

    public kmx0(clx0 clx0Var, String str, String str2, String str3, long j) {
        this.f123842a = str;
        this.f123843b = str2;
        this.f123844c = str3;
        this.f123845d = j;
        this.f123846e = clx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f123842a;
        if (str == null) {
            this.f123846e.f81477a.m15257B(this.f123843b, null);
        } else {
            this.f123846e.f81477a.m15257B(this.f123843b, new q1y0(this.f123844c, str, this.f123845d));
        }
    }
}
