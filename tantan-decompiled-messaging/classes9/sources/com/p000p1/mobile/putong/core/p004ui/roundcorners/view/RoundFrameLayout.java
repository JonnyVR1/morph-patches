package com.p000p1.mobile.putong.core.p004ui.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p006l.sed0;
import p006l.ted0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final sed0 f5495a;

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ted0 ted0Var = new ted0();
        this.f5495a = ted0Var;
        ted0Var.mo23721o(context, attributeSet, this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f5495a.mo23719m(canvas);
        super.draw(canvas);
        this.f5495a.mo23712f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5495a.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f5495a.mo23708b(f);
    }

    public void setRadiusBottom(float f) {
        this.f5495a.mo23718l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f5495a.mo23717k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f5495a.mo23715i(f);
    }

    public void setRadiusLeft(float f) {
        this.f5495a.mo23714h(f);
    }

    public void setRadiusRight(float f) {
        this.f5495a.mo23713g(f);
    }

    public void setRadiusTop(float f) {
        this.f5495a.mo23710d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f5495a.mo23709c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f5495a.mo23720n(f);
    }

    public void setStrokeColor(int i) {
        this.f5495a.mo23711e(i);
    }

    public void setStrokeWidth(float f) {
        this.f5495a.mo23716j(f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundFrameLayout(Context context) {
        this(context, null);
    }
}
