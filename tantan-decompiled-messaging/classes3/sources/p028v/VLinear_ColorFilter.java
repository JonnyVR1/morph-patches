package p028v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p003l.fih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VLinear_ColorFilter extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final fih0 f12761a;

    public VLinear_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fih0 fih0Var = new fih0(this);
        this.f12761a = fih0Var;
        fih0Var.m4380g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f12761a.m4550b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f12761a.m4551c();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public VLinear_ColorFilter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VLinear_ColorFilter(Context context) {
        this(context, null);
    }
}
