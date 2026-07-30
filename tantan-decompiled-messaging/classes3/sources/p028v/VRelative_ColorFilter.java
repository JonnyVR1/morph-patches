package p028v;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VRelative_ColorFilter extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public fih0 f12951a;

    public VRelative_ColorFilter(Context context) {
        super(context);
        m11673a(context, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m11673a(Context context, AttributeSet attributeSet, int i) {
        fih0 fih0Var = new fih0(this);
        this.f12951a = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f12951a.m4550b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12951a.m4551c();
    }

    public VRelative_ColorFilter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11673a(context, attributeSet, 0);
    }
}
