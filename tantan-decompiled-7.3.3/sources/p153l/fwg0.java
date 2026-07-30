package p153l;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class fwg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vfg0 f101163a;

    public fwg0(vfg0 vfg0Var) {
        this.f101163a = vfg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vfg0 vfg0Var = this.f101163a;
        try {
            vfg0Var.m201122f();
        } catch (IOException e) {
            vfg0Var.f183919s = e;
            int i = vfg0Var.f183910j.f73493b;
            e.toString();
        }
    }
}
