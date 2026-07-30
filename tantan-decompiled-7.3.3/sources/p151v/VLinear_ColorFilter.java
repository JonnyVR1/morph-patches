package p151v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p153l.mqh0;

/* JADX INFO: loaded from: classes3.dex */
public class VLinear_ColorFilter extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final mqh0 f210058a;

    public VLinear_ColorFilter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mqh0 mqh0Var = new mqh0(this);
        this.f210058a = mqh0Var;
        mqh0Var.m159510g(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void childDrawableStateChanged(View view) {
        super.childDrawableStateChanged(view);
        this.f210058a.m164309b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f210058a.m164310c();
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
