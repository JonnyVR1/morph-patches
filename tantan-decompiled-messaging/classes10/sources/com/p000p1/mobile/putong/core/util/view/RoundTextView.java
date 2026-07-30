package com.p000p1.mobile.putong.core.util.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import l.sed0;
import l.ted0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class RoundTextView extends VText {

    /* JADX INFO: renamed from: i */
    public final sed0 f2335i;

    /* JADX WARN: Multi-variable type inference failed */
    public RoundTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ted0 ted0Var = new ted0();
        this.f2335i = ted0Var;
        ted0Var.o(context, attributeSet, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        this.f2335i.m(canvas);
        super/*android.view.View*/.draw(canvas);
        this.f2335i.f(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onSizeChanged(i, i2, i3, i4);
        this.f2335i.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f2335i.b(f);
    }

    public void setRadiusBottom(float f) {
        this.f2335i.l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f2335i.k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f2335i.i(f);
    }

    public void setRadiusLeft(float f) {
        this.f2335i.h(f);
    }

    public void setRadiusRight(float f) {
        this.f2335i.g(f);
    }

    public void setRadiusTop(float f) {
        this.f2335i.d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f2335i.c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f2335i.n(f);
    }

    public void setStrokeColor(int i) {
        this.f2335i.e(i);
    }

    public void setStrokeWidth(float f) {
        this.f2335i.j(f);
    }

    public RoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundTextView(Context context) {
        this(context, null);
    }
}
