package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_ColorFilter extends VFrame {

    /* JADX INFO: renamed from: a */
    public fih0 f12718a;

    public VFrame_ColorFilter(Context context) {
        super(context);
        m11505p(context, null, 0);
    }

    /* JADX INFO: renamed from: p */
    private void m11505p(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f12718a = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f12718a.m4550b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12718a.m4551c();
    }

    public VFrame_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11505p(context, attributeSet, 0);
    }
}
