package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class ryr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ syr0 f161580a;

    public ryr0(syr0 syr0Var) {
        this.f161580a = syr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f161580a.f166981c) {
            syr0 syr0Var = this.f161580a;
            if (syr0Var.f166982d && syr0Var.f166983e) {
                syr0Var.f166982d = false;
                x2t0.m206864b("App went background");
                Iterator it = this.f161580a.f166984f.iterator();
                while (it.hasNext()) {
                    try {
                        ((tyr0) it.next()).mo104920a(false);
                    } catch (Exception e) {
                        x2t0.m206867e("", e);
                    }
                }
            } else {
                x2t0.m206864b("App is still foreground");
            }
        }
    }
}
