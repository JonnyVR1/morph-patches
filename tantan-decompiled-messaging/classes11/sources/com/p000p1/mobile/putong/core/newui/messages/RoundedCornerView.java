package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import l.e9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RoundedCornerView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f4069a;

    /* JADX INFO: renamed from: b */
    public RectF f4070b;

    /* JADX INFO: renamed from: c */
    public float f4071c;

    public RoundedCornerView(Context context) {
        super(context);
        m5929a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m5929a(AttributeSet attributeSet) {
        this.f4069a = new Paint(1);
        this.f4070b = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.F1);
            this.f4071c = typedArrayObtainStyledAttributes.getDimension(e9c0.H1, 0.0f);
            this.f4069a.setColor(typedArrayObtainStyledAttributes.getColor(e9c0.G1, -16776961));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRoundedCornerRadius() {
        return this.f4071c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f4070b.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.f4070b;
        float f = this.f4071c;
        canvas.drawRoundRect(rectF, f, f, this.f4069a);
    }

    public void setRoundedColor(int i) {
        this.f4069a.setColor(i);
        invalidate();
    }

    public void setRoundedCornerRadius(float f) {
        this.f4071c = f;
        invalidate();
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5929a(attributeSet);
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5929a(attributeSet);
    }
}
