package p147v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p149l.fih0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_ColorFilter extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final fih0 f209136a;

    public VLinear_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fih0 fih0Var = new fih0(this);
        this.f209136a = fih0Var;
        fih0Var.m121515g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f209136a.m126290b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f209136a.m126291c();
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
