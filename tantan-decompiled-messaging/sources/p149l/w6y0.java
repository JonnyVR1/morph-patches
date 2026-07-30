package p149l;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes6.dex */
public final class w6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComponentName f185011a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6y0 f185012b;

    public w6y0(r6y0 r6y0Var, ComponentName componentName) {
        this.f185011a = componentName;
        this.f185012b = r6y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b3y0.m100124M(this.f185012b.f157992c, this.f185011a);
    }
}
