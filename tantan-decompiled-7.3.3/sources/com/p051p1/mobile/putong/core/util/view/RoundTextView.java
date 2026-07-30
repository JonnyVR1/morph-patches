package com.p051p1.mobile.putong.core.util.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p151v.VText;
import p153l.umd0;
import p153l.vmd0;

/* JADX INFO: loaded from: classes12.dex */
public class RoundTextView extends VText {

    /* JADX INFO: renamed from: i */
    public final umd0 f39241i;

    public RoundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        vmd0 vmd0Var = new vmd0();
        this.f39241i = vmd0Var;
        vmd0Var.mo196660o(context, attributeSet, this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f39241i.mo196658m(canvas);
        super.draw(canvas);
        this.f39241i.mo196651f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f39241i.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f39241i.mo196647b(f);
    }

    public void setRadiusBottom(float f) {
        this.f39241i.mo196657l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f39241i.mo196656k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f39241i.mo196654i(f);
    }

    public void setRadiusLeft(float f) {
        this.f39241i.mo196653h(f);
    }

    public void setRadiusRight(float f) {
        this.f39241i.mo196652g(f);
    }

    public void setRadiusTop(float f) {
        this.f39241i.mo196649d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f39241i.mo196648c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f39241i.mo196659n(f);
    }

    public void setStrokeColor(int i) {
        this.f39241i.mo196650e(i);
    }

    public void setStrokeWidth(float f) {
        this.f39241i.mo196655j(f);
    }

    public RoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundTextView(Context context) {
        this(context, null);
    }
}
