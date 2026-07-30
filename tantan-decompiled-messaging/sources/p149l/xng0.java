package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class xng0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ n7g0 f193683a;

    public xng0(n7g0 n7g0Var) {
        this.f193683a = n7g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n7g0 n7g0Var = this.f193683a;
        try {
            n7g0Var.m158132f();
        } catch (IOException e) {
            n7g0Var.f137524s = e;
            int i = n7g0Var.f137515j.f165190b;
            e.toString();
        }
    }
}
