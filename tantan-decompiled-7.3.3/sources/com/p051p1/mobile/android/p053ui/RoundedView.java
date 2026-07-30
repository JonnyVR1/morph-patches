package com.p051p1.mobile.android.p053ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p153l.hhc0;

/* JADX INFO: loaded from: classes8.dex */
public class RoundedView extends View {

    /* JADX INFO: renamed from: a */
    public Path f16361a;

    /* JADX INFO: renamed from: b */
    public float f16362b;

    /* JADX INFO: renamed from: c */
    public RectF f16363c;

    public RoundedView(Context context) {
        super(context);
        m21813a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m21813a(AttributeSet attributeSet) {
        this.f16361a = new Path();
        this.f16363c = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, hhc0.f109683Y0);
            this.f16362b = typedArrayObtainStyledAttributes.getDimension(hhc0.f109689Z0, 10.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        RectF rectF = this.f16363c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f16363c.bottom = getHeight();
        Path path = this.f16361a;
        RectF rectF2 = this.f16363c;
        float f = this.f16362b;
        path.addRoundRect(rectF2, f, f, Path.Direction.CCW);
        canvas.clipPath(this.f16361a);
        super.draw(canvas);
    }

    public float getRoundedCornerRadius() {
        return this.f16362b;
    }

    public void setRoundedCornerRadius(float f) {
        this.f16362b = f;
        invalidate();
    }

    public RoundedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m21813a(attributeSet);
    }

    public RoundedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m21813a(attributeSet);
    }
}
