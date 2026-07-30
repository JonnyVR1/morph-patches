package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class x7s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y7s0 f192745a;

    public x7s0(y7s0 y7s0Var) {
        this.f192745a = y7s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f192745a.f197822c) {
            y7s0 y7s0Var = this.f192745a;
            if (y7s0Var.f197823d && y7s0Var.f197824e) {
                y7s0Var.f197823d = false;
                dct0.m115293b("App went background");
                Iterator it = this.f192745a.f197825f.iterator();
                while (it.hasNext()) {
                    try {
                        ((z7s0) it.next()).mo120216a(false);
                    } catch (Exception e) {
                        dct0.m115296e("", e);
                    }
                }
            } else {
                dct0.m115293b("App is still foreground");
            }
        }
    }
}
