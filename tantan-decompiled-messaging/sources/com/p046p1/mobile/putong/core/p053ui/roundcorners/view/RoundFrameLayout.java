package com.p046p1.mobile.putong.core.p053ui.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p149l.sed0;
import p149l.ted0;

/* JADX INFO: loaded from: classes9.dex */
public class RoundFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final sed0 f35714a;

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ted0 ted0Var = new ted0();
        this.f35714a = ted0Var;
        ted0Var.mo183612o(context, attributeSet, this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f35714a.mo183610m(canvas);
        super.draw(canvas);
        this.f35714a.mo183603f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f35714a.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f35714a.mo183599b(f);
    }

    public void setRadiusBottom(float f) {
        this.f35714a.mo183609l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f35714a.mo183608k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f35714a.mo183606i(f);
    }

    public void setRadiusLeft(float f) {
        this.f35714a.mo183605h(f);
    }

    public void setRadiusRight(float f) {
        this.f35714a.mo183604g(f);
    }

    public void setRadiusTop(float f) {
        this.f35714a.mo183601d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f35714a.mo183600c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f35714a.mo183611n(f);
    }

    public void setStrokeColor(int i) {
        this.f35714a.mo183602e(i);
    }

    public void setStrokeWidth(float f) {
        this.f35714a.mo183607j(f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundFrameLayout(Context context) {
        this(context, null);
    }
}
