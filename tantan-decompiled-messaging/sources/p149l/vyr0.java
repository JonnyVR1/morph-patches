package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class vyr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f183546a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zyr0 f183547b;

    public vyr0(zyr0 zyr0Var, View view) {
        this.f183546a = view;
        this.f183547b = zyr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f183547b.m220939c(this.f183546a);
    }
}
