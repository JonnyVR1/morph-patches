package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class RoundedRectangleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f27823a;

    /* JADX INFO: renamed from: b */
    public int f27824b;

    /* JADX INFO: renamed from: c */
    public float f27825c;

    /* JADX INFO: renamed from: d */
    public int f27826d;

    /* JADX INFO: renamed from: e */
    public float f27827e;

    /* JADX INFO: renamed from: f */
    public Path f27828f;

    /* JADX INFO: renamed from: g */
    public RectF f27829g;

    /* JADX INFO: renamed from: h */
    public int f27830h;

    public RoundedRectangleProgressView(Context context) {
        super(context);
        this.f27824b = qa00.m175859d(8.0f);
        this.f27825c = 0.0f;
        this.f27826d = 0;
        this.f27827e = 0.0f;
        this.f27830h = -7829368;
        m44930a();
    }

    /* JADX INFO: renamed from: a */
    public final void m44930a() {
        this.f27826d = qa00.f156318e;
        this.f27825c = (this.f27824b * 3.1415927f) / 2.0f;
        this.f27830h = getResources().getColor(c9c0.f80342I);
        Paint paint = new Paint();
        this.f27823a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f27828f = new Path();
        this.f27829g = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public float m44931b(float f) {
        return (f * 90.0f) / this.f27825c;
    }

    /* JADX INFO: renamed from: c */
    public void m44932c(float f, int i, int i2, int i3) {
        this.f27827e = f;
        this.f27830h = i;
        this.f27824b = i2;
        this.f27826d = i3;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f27823a.setColor(-65536);
        float width = getWidth();
        float height = getHeight();
        this.f27828f.reset();
        this.f27823a.setStrokeWidth(this.f27826d);
        int i = this.f27824b;
        this.f27825c = (i * 3.1415927f) / 2.0f;
        int i2 = this.f27826d;
        float f = (width - i2) - (i * 2);
        float f2 = (height - i2) - (i * 2);
        float f3 = ((float) (((double) this.f27827e) * (((((double) i) * 6.283185307179586d) + ((double) (f * 2.0f))) + ((double) (f2 * 2.0f))))) / 100.0f;
        if (f3 < 0.0f) {
            return;
        }
        this.f27823a.setColor(this.f27830h);
        float f4 = width / 2.0f;
        this.f27828f.moveTo(f4, height - (this.f27826d / 2.0f));
        float f5 = f / 2.0f;
        Path path = this.f27828f;
        if (f3 < f5) {
            path.lineTo(f4 - f3, height - (this.f27826d / 2.0f));
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        path.lineTo(this.f27824b, height - (this.f27826d / 2.0f));
        float f6 = f3 - f5;
        RectF rectF = this.f27829g;
        int i3 = this.f27826d;
        int i4 = this.f27824b;
        rectF.set(i3 / 2.0f, (height - (i4 * 2)) - (i3 / 2.0f), (i3 / 2.0f) + (i4 * 2), height - (i3 / 2.0f));
        float f7 = this.f27825c;
        Path path2 = this.f27828f;
        if (f6 < f7) {
            path2.arcTo(this.f27829g, 90.0f, m44931b(f6));
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        path2.arcTo(this.f27829g, 90.0f, 90.0f);
        float f8 = f6 - this.f27825c;
        Path path3 = this.f27828f;
        if (f8 < f2) {
            int i5 = this.f27826d;
            path3.lineTo(i5 / 2.0f, ((height - (i5 / 2.0f)) - this.f27824b) - f8);
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        int i6 = this.f27826d;
        path3.lineTo(i6 / 2.0f, (i6 / 2.0f) + this.f27824b);
        float f9 = f8 - f2;
        RectF rectF2 = this.f27829g;
        int i7 = this.f27826d;
        int i8 = this.f27824b;
        rectF2.set(i7 / 2.0f, i7 / 2.0f, (i7 / 2.0f) + (i8 * 2), (i8 * 2) + (i7 / 2.0f));
        float f10 = this.f27825c;
        Path path4 = this.f27828f;
        if (f9 < f10) {
            path4.arcTo(this.f27829g, 180.0f, m44931b(f9));
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        path4.arcTo(this.f27829g, 180.0f, 90.0f);
        float f11 = f9 - this.f27825c;
        Path path5 = this.f27828f;
        if (f11 < f) {
            int i9 = this.f27826d;
            path5.lineTo((i9 / 2.0f) + this.f27824b + f11, i9 / 2.0f);
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        int i10 = this.f27826d;
        path5.lineTo((width - (i10 / 2.0f)) - this.f27824b, i10 / 2.0f);
        float f12 = f11 - f;
        RectF rectF3 = this.f27829g;
        int i11 = this.f27824b;
        int i12 = this.f27826d;
        rectF3.set((width - (i11 * 2)) - (i12 / 2.0f), i12 / 2.0f, width - (i12 / 2.0f), (i11 * 2) + (i12 / 2.0f));
        float f13 = this.f27825c;
        Path path6 = this.f27828f;
        if (f12 < f13) {
            path6.arcTo(this.f27829g, 270.0f, m44931b(f12));
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        path6.arcTo(this.f27829g, 270.0f, 90.0f);
        float f14 = f12 - this.f27825c;
        Path path7 = this.f27828f;
        if (f14 < f2) {
            int i13 = this.f27826d;
            path7.lineTo(width - (i13 / 2.0f), (i13 / 2.0f) + this.f27824b + f14);
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        int i14 = this.f27826d;
        path7.lineTo(width - (i14 / 2.0f), (height - (i14 / 2.0f)) - this.f27824b);
        float f15 = f14 - f2;
        RectF rectF4 = this.f27829g;
        int i15 = this.f27824b;
        int i16 = this.f27826d;
        rectF4.set((width - (i15 * 2)) - (i16 / 2.0f), (height - (i16 / 2.0f)) - (i15 * 2), width - (i16 / 2.0f), height - (i16 / 2.0f));
        float f16 = this.f27825c;
        Path path8 = this.f27828f;
        if (f15 < f16) {
            path8.arcTo(this.f27829g, 360.0f, m44931b(f15));
            canvas.drawPath(this.f27828f, this.f27823a);
            return;
        }
        path8.arcTo(this.f27829g, 360.0f, 90.0f);
        float f17 = f15 - this.f27825c;
        Path path9 = this.f27828f;
        if (f17 >= f5) {
            path9.lineTo(f4, height - (this.f27826d / 2.0f));
            canvas.drawPath(this.f27828f, this.f27823a);
        } else {
            int i17 = this.f27826d;
            path9.lineTo(((width - (i17 / 2.0f)) - this.f27824b) - f17, height - (i17 / 2.0f));
            canvas.drawPath(this.f27828f, this.f27823a);
        }
    }

    public void setData(int i) {
        this.f27827e = i;
        invalidate();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27824b = qa00.m175859d(8.0f);
        this.f27825c = 0.0f;
        this.f27826d = 0;
        this.f27827e = 0.0f;
        this.f27830h = -7829368;
        m44930a();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27824b = qa00.m175859d(8.0f);
        this.f27825c = 0.0f;
        this.f27826d = 0;
        this.f27827e = 0.0f;
        this.f27830h = -7829368;
        m44930a();
    }
}
