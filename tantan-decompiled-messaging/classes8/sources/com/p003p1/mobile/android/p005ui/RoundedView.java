package com.p003p1.mobile.android.p005ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p007l.b9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class RoundedView extends View {

    /* JADX INFO: renamed from: a */
    public Path f1341a;

    /* JADX INFO: renamed from: b */
    public float f1342b;

    /* JADX INFO: renamed from: c */
    public RectF f1343c;

    public RoundedView(Context context) {
        super(context);
        m1085a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1085a(AttributeSet attributeSet) {
        this.f1341a = new Path();
        this.f1343c = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b9c0.f2097Y0);
            this.f1342b = typedArrayObtainStyledAttributes.getDimension(b9c0.f2103Z0, 10.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        RectF rectF = this.f1343c;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f1343c.bottom = getHeight();
        Path path = this.f1341a;
        RectF rectF2 = this.f1343c;
        float f = this.f1342b;
        path.addRoundRect(rectF2, f, f, Path.Direction.CCW);
        canvas.clipPath(this.f1341a);
        super.draw(canvas);
    }

    public float getRoundedCornerRadius() {
        return this.f1342b;
    }

    public void setRoundedCornerRadius(float f) {
        this.f1342b = f;
        invalidate();
    }

    public RoundedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1085a(attributeSet);
    }

    public RoundedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1085a(attributeSet);
    }
}
