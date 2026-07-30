package p153l;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qfg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jgg0 f157301a;

    public qfg0(jgg0 jgg0Var) {
        this.f157301a = jgg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jgg0 jgg0Var = this.f157301a;
        synchronized (jgg0Var) {
            try {
                if (jgg0Var.f120722j != null) {
                    rug0 rug0Var = jgg0Var.f120722j;
                    rug0Var.f164920c = null;
                    i5d0 i5d0Var = rug0Var.f164921d;
                    if (i5d0Var != null) {
                        i5d0Var.close();
                    }
                    rug0Var.f164921d = null;
                    Objects.toString(jgg0Var.f120722j);
                    int i = jgg0Var.f120714b.f73493b;
                }
                jgg0Var.f120722j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
