package com.idv.identity.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.ghc0;

/* JADX INFO: loaded from: classes7.dex */
public class IndicatorView extends View {

    /* JADX INFO: renamed from: a */
    private int f13478a;

    /* JADX INFO: renamed from: b */
    private int f13479b;

    /* JADX INFO: renamed from: c */
    private int f13480c;

    /* JADX INFO: renamed from: d */
    private int f13481d;

    /* JADX INFO: renamed from: e */
    private int f13482e;

    /* JADX INFO: renamed from: f */
    private int f13483f;

    /* JADX INFO: renamed from: g */
    private int f13484g;

    /* JADX INFO: renamed from: h */
    private Paint f13485h;

    /* JADX INFO: renamed from: i */
    private Paint f13486i;

    /* JADX INFO: renamed from: j */
    private int f13487j;

    /* JADX INFO: renamed from: k */
    private int f13488k;

    /* JADX INFO: renamed from: l */
    private int f13489l;

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13478a = 0;
        this.f13479b = 0;
        this.f13480c = 0;
        this.f13481d = 0;
        this.f13482e = 0;
        this.f13483f = 0;
        this.f13484g = 0;
        this.f13487j = 0;
        this.f13488k = -1;
        this.f13489l = -7829368;
        m19208b(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: a */
    private void m19207a() {
        int i = this.f13487j;
        int i2 = this.f13483f;
        if (i >= i2) {
            this.f13487j = i2 - 1;
        }
        setVisibility(i2 <= 1 ? 8 : 0);
    }

    /* JADX INFO: renamed from: b */
    private void m19208b(Context context, AttributeSet attributeSet, int i) {
        this.f13485h = new Paint();
        this.f13486i = new Paint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ghc0.f104111t);
        if (typedArrayObtainStyledAttributes != null) {
            this.f13488k = typedArrayObtainStyledAttributes.getColor(ghc0.f104112u, -1);
            this.f13489l = typedArrayObtainStyledAttributes.getColor(ghc0.f104113v, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f13485h.setColor(this.f13488k);
        Paint paint = this.f13485h;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f13485h.setAntiAlias(true);
        this.f13486i.setColor(this.f13489l);
        this.f13486i.setStyle(style);
        this.f13486i.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f13479b / 2.0f;
        float f2 = this.f13481d / 2.0f;
        int i = 0;
        while (i < this.f13483f) {
            int i2 = this.f13481d;
            this.f13482e = i2;
            canvas.drawCircle(this.f13484g + (i * i2) + (i2 * i) + f2, f, f2, i == this.f13487j ? this.f13485h : this.f13486i);
            i++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f13478a = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f13479b = size;
        int i3 = this.f13478a;
        int i4 = this.f13483f;
        int i5 = i3 / ((i4 + i4) - 1);
        this.f13480c = i5;
        int iMin = Math.min(i5, size);
        this.f13481d = iMin;
        float f = this.f13478a / 2.0f;
        int i6 = this.f13483f;
        this.f13484g = (int) (f - ((((i6 + i6) - 1) * iMin) / 2.0f));
    }

    public void setColorSelector(int i) {
        this.f13488k = i;
        this.f13485h.setColor(i);
        postInvalidate();
    }

    public void setColorUnSelector(int i) {
        this.f13489l = i;
        this.f13486i.setColor(i);
        postInvalidate();
    }

    public void setCurrentSelectedPosition(int i) {
        this.f13487j = i;
        postInvalidate();
    }

    public void setIndicatorItemCount(int i) {
        this.f13483f = i;
        m19207a();
    }

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndicatorView(Context context) {
        this(context, null);
    }
}
