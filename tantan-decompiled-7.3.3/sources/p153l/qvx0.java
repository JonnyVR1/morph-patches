package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class qvx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f159842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f159843b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f159844c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f159845d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ iux0 f159846e;

    public qvx0(iux0 iux0Var, String str, String str2, String str3, long j) {
        this.f159842a = str;
        this.f159843b = str2;
        this.f159844c = str3;
        this.f159845d = j;
        this.f159846e = iux0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f159842a;
        if (str == null) {
            this.f159846e.f116991a.m15311B(this.f159843b, null);
        } else {
            this.f159846e.f116991a.m15311B(this.f159843b, new way0(this.f159844c, str, this.f159845d));
        }
    }
}
