package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class bjt0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w8t0 f77023a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gjt0 f77024b;

    public bjt0(gjt0 gjt0Var, w8t0 w8t0Var) {
        this.f77023a = w8t0Var;
        this.f77024b = gjt0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f77024b.zzS(view, this.f77023a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
