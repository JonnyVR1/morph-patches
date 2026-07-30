package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class RoundedCornerView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f26033a;

    /* JADX INFO: renamed from: b */
    public RectF f26034b;

    /* JADX INFO: renamed from: c */
    public float f26035c;

    public RoundedCornerView(Context context) {
        super(context);
        m42816a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m42816a(AttributeSet attributeSet) {
        this.f26033a = new Paint(1);
        this.f26034b = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, khc0.f126726F1);
            this.f26035c = typedArrayObtainStyledAttributes.getDimension(khc0.f126732H1, 0.0f);
            this.f26033a.setColor(typedArrayObtainStyledAttributes.getColor(khc0.f126729G1, -16776961));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRoundedCornerRadius() {
        return this.f26035c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f26034b.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.f26034b;
        float f = this.f26035c;
        canvas.drawRoundRect(rectF, f, f, this.f26033a);
    }

    public void setRoundedColor(int i) {
        this.f26033a.setColor(i);
        invalidate();
    }

    public void setRoundedCornerRadius(float f) {
        this.f26035c = f;
        invalidate();
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m42816a(attributeSet);
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m42816a(attributeSet);
    }
}
