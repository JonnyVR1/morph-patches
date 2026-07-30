package p149l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hgg0 {

    /* JADX INFO: renamed from: a */
    public k850.C17954b f107599a;

    /* JADX INFO: renamed from: b */
    public volatile k850 f107600b;

    /* JADX INFO: renamed from: a */
    public final jmg0 m130828a(String str) {
        if (this.f107600b == null) {
            synchronized (hgg0.class) {
                try {
                    if (this.f107600b == null) {
                        m130829b();
                        rmg0 rmg0Var = new rmg0();
                        rmg0Var.f160096c = 3;
                        rmg0Var.f160095b.f176392a = "DownloadHttpLoggingInterceptor";
                        this.f107599a.m144880a(rmg0Var);
                        odg0 odg0Var = new odg0();
                        odg0Var.f143204a = "DownloadLoggingEventListener";
                        this.f107599a.m144891l(odg0Var);
                        this.f107600b = this.f107599a.m144882c();
                        this.f107599a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new jmg0(this.f107600b, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m130829b() {
        if (this.f107599a == null) {
            k850.C17954b c17954b = new k850.C17954b();
            this.f107599a = c17954b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c17954b.m144885f(30L, timeUnit);
            this.f107599a.m144899t(30L, timeUnit);
            this.f107599a.m144903x(30L, timeUnit);
            this.f107599a.m144889j(new zrg0("DownloadIpv4PreferredDns"));
        }
    }
}
