package p153l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class pog0 {

    /* JADX INFO: renamed from: a */
    public rg50.C19837b f153401a;

    /* JADX INFO: renamed from: b */
    public volatile rg50 f153402b;

    /* JADX INFO: renamed from: a */
    public final rug0 m173106a(String str) {
        if (this.f153402b == null) {
            synchronized (pog0.class) {
                try {
                    if (this.f153402b == null) {
                        m173107b();
                        zug0 zug0Var = new zug0();
                        zug0Var.f206126c = 3;
                        zug0Var.f206125b.f82998a = "DownloadHttpLoggingInterceptor";
                        this.f153401a.m181363a(zug0Var);
                        wlg0 wlg0Var = new wlg0();
                        wlg0Var.f189692a = "DownloadLoggingEventListener";
                        this.f153401a.m181374l(wlg0Var);
                        this.f153402b = this.f153401a.m181365c();
                        this.f153401a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new rug0(this.f153402b, str);
    }

    /* JADX INFO: renamed from: b */
    public final void m173107b() {
        if (this.f153401a == null) {
            rg50.C19837b c19837b = new rg50.C19837b();
            this.f153401a = c19837b;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c19837b.m181368f(30L, timeUnit);
            this.f153401a.m181383u(30L, timeUnit);
            this.f153401a.m181387y(30L, timeUnit);
            this.f153401a.m181372j(new h0h0("DownloadIpv4PreferredDns"));
        }
    }
}
