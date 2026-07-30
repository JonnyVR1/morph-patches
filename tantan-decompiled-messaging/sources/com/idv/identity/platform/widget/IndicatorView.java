package com.idv.identity.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.z8c0;

/* JADX INFO: loaded from: classes7.dex */
public class IndicatorView extends View {

    /* JADX INFO: renamed from: a */
    private int f12737a;

    /* JADX INFO: renamed from: b */
    private int f12738b;

    /* JADX INFO: renamed from: c */
    private int f12739c;

    /* JADX INFO: renamed from: d */
    private int f12740d;

    /* JADX INFO: renamed from: e */
    private int f12741e;

    /* JADX INFO: renamed from: f */
    private int f12742f;

    /* JADX INFO: renamed from: g */
    private int f12743g;

    /* JADX INFO: renamed from: h */
    private Paint f12744h;

    /* JADX INFO: renamed from: i */
    private Paint f12745i;

    /* JADX INFO: renamed from: j */
    private int f12746j;

    /* JADX INFO: renamed from: k */
    private int f12747k;

    /* JADX INFO: renamed from: l */
    private int f12748l;

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12737a = 0;
        this.f12738b = 0;
        this.f12739c = 0;
        this.f12740d = 0;
        this.f12741e = 0;
        this.f12742f = 0;
        this.f12743g = 0;
        this.f12746j = 0;
        this.f12747k = -1;
        this.f12748l = -7829368;
        m18131b(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m18130a() {
        int i = this.f12746j;
        int i2 = this.f12742f;
        if (i >= i2) {
            this.f12746j = i2 - 1;
        }
        setVisibility(i2 <= 1 ? 8 : 0);
    }

    /* JADX INFO: renamed from: b */
    private void m18131b(Context context, AttributeSet attributeSet, int i) {
        this.f12744h = new Paint();
        this.f12745i = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z8c0.f202144t);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12747k = typedArrayObtainStyledAttributes.getColor(z8c0.f202145u, -1);
            this.f12748l = typedArrayObtainStyledAttributes.getColor(z8c0.f202146v, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f12744h.setColor(this.f12747k);
        Paint paint = this.f12744h;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f12744h.setAntiAlias(true);
        this.f12745i.setColor(this.f12748l);
        this.f12745i.setStyle(style);
        this.f12745i.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f12738b / 2.0f;
        float f2 = this.f12740d / 2.0f;
        int i = 0;
        while (i < this.f12742f) {
            int i2 = this.f12740d;
            this.f12741e = i2;
            canvas.drawCircle(this.f12743g + (i * i2) + (i2 * i) + f2, f, f2, i == this.f12746j ? this.f12744h : this.f12745i);
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f12737a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f12738b = size;
        int i3 = this.f12737a;
        int i4 = this.f12742f;
        int i5 = i3 / ((i4 + i4) - 1);
        this.f12739c = i5;
        int iMin = Math.min(i5, size);
        this.f12740d = iMin;
        float f = this.f12737a / 2.0f;
        int i6 = this.f12742f;
        this.f12743g = (int) (f - ((((i6 + i6) - 1) * iMin) / 2.0f));
    }

    public void setColorSelector(int i) {
        this.f12747k = i;
        this.f12744h.setColor(i);
        postInvalidate();
    }

    public void setColorUnSelector(int i) {
        this.f12748l = i;
        this.f12745i.setColor(i);
        postInvalidate();
    }

    public void setCurrentSelectedPosition(int i) {
        this.f12746j = i;
        postInvalidate();
    }

    public void setIndicatorItemCount(int i) {
        this.f12742f = i;
        m18130a();
    }

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndicatorView(Context context) {
        this(context, null);
    }
}
