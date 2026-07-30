package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class b8s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f75467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f8s0 f75468b;

    public b8s0(f8s0 f8s0Var, View view) {
        this.f75467a = view;
        this.f75468b = f8s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75468b.m124556c(this.f75467a);
    }
}
