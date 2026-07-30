package com.p046p1.mobile.android.p048ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p149l.b9c0;

/* JADX INFO: loaded from: classes8.dex */
public class RoundedView extends View {

    /* JADX INFO: renamed from: a */
    public Path f15642a;

    /* JADX INFO: renamed from: b */
    public float f15643b;

    /* JADX INFO: renamed from: c */
    public RectF f15644c;

    public RoundedView(Context context) {
        super(context);
        m20814a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m20814a(AttributeSet attributeSet) {
        this.f15642a = new Path();
        this.f15644c = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f74374Y0);
            this.f15643b = typedArrayObtainStyledAttributes.getDimension(b9c0.f74380Z0, 10.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        RectF rectF = this.f15644c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f15644c.bottom = getHeight();
        Path path = this.f15642a;
        RectF rectF2 = this.f15644c;
        float f = this.f15643b;
        path.addRoundRect(rectF2, f, f, Path.Direction.CCW);
        canvas.clipPath(this.f15642a);
        super.draw(canvas);
    }

    public float getRoundedCornerRadius() {
        return this.f15643b;
    }

    public void setRoundedCornerRadius(float f) {
        this.f15643b = f;
        invalidate();
    }

    public RoundedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m20814a(attributeSet);
    }

    public RoundedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m20814a(attributeSet);
    }
}
