package com.p051p1.mobile.putong.core.p058ui.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import p153l.umd0;
import p153l.vmd0;

/* JADX INFO: loaded from: classes12.dex */
public class RoundConstraintLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public final umd0 f36561d;

    public RoundConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vmd0 vmd0Var = new vmd0();
        this.f36561d = vmd0Var;
        vmd0Var.mo196660o(context, attributeSet, this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f36561d.mo196658m(canvas);
        super.draw(canvas);
        this.f36561d.mo196651f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f36561d.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f36561d.mo196647b(f);
    }

    public void setRadiusBottom(float f) {
        this.f36561d.mo196657l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f36561d.mo196656k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f36561d.mo196654i(f);
    }

    public void setRadiusLeft(float f) {
        this.f36561d.mo196653h(f);
    }

    public void setRadiusRight(float f) {
        this.f36561d.mo196652g(f);
    }

    public void setRadiusTop(float f) {
        this.f36561d.mo196649d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f36561d.mo196648c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f36561d.mo196659n(f);
    }

    public void setStrokeColor(int i) {
        this.f36561d.mo196650e(i);
    }

    public void setStrokeWidth(float f) {
        this.f36561d.mo196655j(f);
    }

    public RoundConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundConstraintLayout(Context context) {
        this(context, null);
    }
}
