package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p149l.e9c0;

/* JADX INFO: loaded from: classes11.dex */
public class RoundedCornerView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f25291a;

    /* JADX INFO: renamed from: b */
    public RectF f25292b;

    /* JADX INFO: renamed from: c */
    public float f25293c;

    public RoundedCornerView(Context context) {
        super(context);
        m41805a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m41805a(AttributeSet attributeSet) {
        this.f25291a = new Paint(1);
        this.f25292b = new RectF();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89956F1);
            this.f25293c = typedArrayObtainStyledAttributes.getDimension(e9c0.f89962H1, 0.0f);
            this.f25291a.setColor(typedArrayObtainStyledAttributes.getColor(e9c0.f89959G1, -16776961));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public float getRoundedCornerRadius() {
        return this.f25293c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25292b.set(0.0f, 0.0f, getWidth(), getHeight());
        RectF rectF = this.f25292b;
        float f = this.f25293c;
        canvas.drawRoundRect(rectF, f, f, this.f25291a);
    }

    public void setRoundedColor(int i) {
        this.f25291a.setColor(i);
        invalidate();
    }

    public void setRoundedCornerRadius(float f) {
        this.f25293c = f;
        invalidate();
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m41805a(attributeSet);
    }

    public RoundedCornerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m41805a(attributeSet);
    }
}
