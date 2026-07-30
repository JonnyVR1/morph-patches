package com.p000p1.mobile.putong.core.p004ui.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p006l.sed0;
import p006l.ted0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class RoundTextView extends VText {

    /* JADX INFO: renamed from: i */
    public final sed0 f5499i;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ted0 ted0Var = new ted0();
        this.f5499i = ted0Var;
        ted0Var.mo23721o(context, attributeSet, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        this.f5499i.mo23719m(canvas);
        super/*android.view.View*/.draw(canvas);
        this.f5499i.mo23712f(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f5499i.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f5499i.mo23708b(f);
    }

    public void setRadiusBottom(float f) {
        this.f5499i.mo23718l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f5499i.mo23717k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f5499i.mo23715i(f);
    }

    public void setRadiusLeft(float f) {
        this.f5499i.mo23714h(f);
    }

    public void setRadiusRight(float f) {
        this.f5499i.mo23713g(f);
    }

    public void setRadiusTop(float f) {
        this.f5499i.mo23710d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f5499i.mo23709c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f5499i.mo23720n(f);
    }

    public void setStrokeColor(int i) {
        this.f5499i.mo23711e(i);
    }

    public void setStrokeWidth(float f) {
        this.f5499i.mo23716j(f);
    }

    public RoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundTextView(Context context) {
        this(context, null);
    }
}
