package com.p046p1.mobile.putong.core.p053ui.roundcorners.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import p149l.sed0;
import p149l.ted0;

/* JADX INFO: loaded from: classes9.dex */
public class RoundImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    public final sed0 f35715c;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ted0 ted0Var = new ted0();
        this.f35715c = ted0Var;
        ted0Var.mo183612o(context, attributeSet, this);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.f35715c.mo183610m(canvas);
        super.draw(canvas);
        this.f35715c.mo183603f(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f35715c.onSizeChanged(i, i2);
    }

    public void setRadius(float f) {
        this.f35715c.mo183599b(f);
    }

    public void setRadiusBottom(float f) {
        this.f35715c.mo183609l(f);
    }

    public void setRadiusBottomLeft(float f) {
        this.f35715c.mo183608k(f);
    }

    public void setRadiusBottomRight(float f) {
        this.f35715c.mo183606i(f);
    }

    public void setRadiusLeft(float f) {
        this.f35715c.mo183605h(f);
    }

    public void setRadiusRight(float f) {
        this.f35715c.mo183604g(f);
    }

    public void setRadiusTop(float f) {
        this.f35715c.mo183601d(f);
    }

    public void setRadiusTopLeft(float f) {
        this.f35715c.mo183600c(f);
    }

    public void setRadiusTopRight(float f) {
        this.f35715c.mo183611n(f);
    }

    public void setStrokeColor(int i) {
        this.f35715c.mo183602e(i);
    }

    public void setStrokeWidth(float f) {
        this.f35715c.mo183607j(f);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundImageView(Context context) {
        this(context, null);
    }
}
