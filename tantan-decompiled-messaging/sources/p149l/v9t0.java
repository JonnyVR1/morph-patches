package p149l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class v9t0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qzs0 f180676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aat0 f180677b;

    public v9t0(aat0 aat0Var, qzs0 qzs0Var) {
        this.f180676a = qzs0Var;
        this.f180677b = aat0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f180677b.zzS(view, this.f180676a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
