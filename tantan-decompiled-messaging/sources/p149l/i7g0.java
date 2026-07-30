package p149l;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i7g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ b8g0 f111883a;

    public i7g0(b8g0 b8g0Var) {
        this.f111883a = b8g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b8g0 b8g0Var = this.f111883a;
        synchronized (b8g0Var) {
            try {
                if (b8g0Var.f74120j != null) {
                    jmg0 jmg0Var = b8g0Var.f74120j;
                    jmg0Var.f118634c = null;
                    exc0 exc0Var = jmg0Var.f118635d;
                    if (exc0Var != null) {
                        exc0Var.close();
                    }
                    jmg0Var.f118635d = null;
                    Objects.toString(b8g0Var.f74120j);
                    int i = b8g0Var.f74112b.f165190b;
                }
                b8g0Var.f74120j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
