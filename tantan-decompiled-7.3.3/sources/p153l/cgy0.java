package p153l;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes6.dex */
public final class cgy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ComponentName f81749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ xfy0 f81750b;

    public cgy0(xfy0 xfy0Var, ComponentName componentName) {
        this.f81749a = componentName;
        this.f81750b = xfy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hcy0.m134524M(this.f81750b.f194121c, this.f81749a);
    }
}
