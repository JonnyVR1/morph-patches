package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.w0c0;

/* JADX INFO: loaded from: classes11.dex */
public class RoundedRectangleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f26975a;

    /* JADX INFO: renamed from: b */
    public int f26976b;

    /* JADX INFO: renamed from: c */
    public float f26977c;

    /* JADX INFO: renamed from: d */
    public int f26978d;

    /* JADX INFO: renamed from: e */
    public float f26979e;

    /* JADX INFO: renamed from: f */
    public Path f26980f;

    /* JADX INFO: renamed from: g */
    public RectF f26981g;

    /* JADX INFO: renamed from: h */
    public int f26982h;

    public RoundedRectangleProgressView(Context context) {
        super(context);
        this.f26976b = t100.m186890d(8.0f);
        this.f26977c = 0.0f;
        this.f26978d = 0;
        this.f26979e = 0.0f;
        this.f26982h = -7829368;
        m43744a();
    }

    /* JADX INFO: renamed from: a */
    public final void m43744a() {
        this.f26978d = t100.f167256e;
        this.f26977c = (this.f26976b * 3.1415927f) / 2.0f;
        this.f26982h = getResources().getColor(w0c0.f183773I);
        Paint paint = new Paint();
        this.f26975a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f26980f = new Path();
        this.f26981g = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public float m43745b(float f) {
        return (f * 90.0f) / this.f26977c;
    }

    /* JADX INFO: renamed from: c */
    public void m43746c(float f, int i, int i2, int i3) {
        this.f26979e = f;
        this.f26982h = i;
        this.f26976b = i2;
        this.f26978d = i3;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f26975a.setColor(-65536);
        float width = getWidth();
        float height = getHeight();
        this.f26980f.reset();
        this.f26975a.setStrokeWidth(this.f26978d);
        int i = this.f26976b;
        this.f26977c = (i * 3.1415927f) / 2.0f;
        int i2 = this.f26978d;
        float f = (width - i2) - (i * 2);
        float f2 = (height - i2) - (i * 2);
        float f3 = ((float) (((double) this.f26979e) * (((((double) i) * 6.283185307179586d) + ((double) (f * 2.0f))) + ((double) (f2 * 2.0f))))) / 100.0f;
        if (f3 < 0.0f) {
            return;
        }
        this.f26975a.setColor(this.f26982h);
        float f4 = width / 2.0f;
        this.f26980f.moveTo(f4, height - (this.f26978d / 2.0f));
        float f5 = f / 2.0f;
        Path path = this.f26980f;
        if (f3 < f5) {
            path.lineTo(f4 - f3, height - (this.f26978d / 2.0f));
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        path.lineTo(this.f26976b, height - (this.f26978d / 2.0f));
        float f6 = f3 - f5;
        RectF rectF = this.f26981g;
        int i3 = this.f26978d;
        int i4 = this.f26976b;
        rectF.set(i3 / 2.0f, (height - (i4 * 2)) - (i3 / 2.0f), (i3 / 2.0f) + (i4 * 2), height - (i3 / 2.0f));
        float f7 = this.f26977c;
        Path path2 = this.f26980f;
        if (f6 < f7) {
            path2.arcTo(this.f26981g, 90.0f, m43745b(f6));
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        path2.arcTo(this.f26981g, 90.0f, 90.0f);
        float f8 = f6 - this.f26977c;
        Path path3 = this.f26980f;
        if (f8 < f2) {
            int i5 = this.f26978d;
            path3.lineTo(i5 / 2.0f, ((height - (i5 / 2.0f)) - this.f26976b) - f8);
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        int i6 = this.f26978d;
        path3.lineTo(i6 / 2.0f, (i6 / 2.0f) + this.f26976b);
        float f9 = f8 - f2;
        RectF rectF2 = this.f26981g;
        int i7 = this.f26978d;
        int i8 = this.f26976b;
        rectF2.set(i7 / 2.0f, i7 / 2.0f, (i7 / 2.0f) + (i8 * 2), (i8 * 2) + (i7 / 2.0f));
        float f10 = this.f26977c;
        Path path4 = this.f26980f;
        if (f9 < f10) {
            path4.arcTo(this.f26981g, 180.0f, m43745b(f9));
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        path4.arcTo(this.f26981g, 180.0f, 90.0f);
        float f11 = f9 - this.f26977c;
        Path path5 = this.f26980f;
        if (f11 < f) {
            int i9 = this.f26978d;
            path5.lineTo((i9 / 2.0f) + this.f26976b + f11, i9 / 2.0f);
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        int i10 = this.f26978d;
        path5.lineTo((width - (i10 / 2.0f)) - this.f26976b, i10 / 2.0f);
        float f12 = f11 - f;
        RectF rectF3 = this.f26981g;
        int i11 = this.f26976b;
        int i12 = this.f26978d;
        rectF3.set((width - (i11 * 2)) - (i12 / 2.0f), i12 / 2.0f, width - (i12 / 2.0f), (i11 * 2) + (i12 / 2.0f));
        float f13 = this.f26977c;
        Path path6 = this.f26980f;
        if (f12 < f13) {
            path6.arcTo(this.f26981g, 270.0f, m43745b(f12));
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        path6.arcTo(this.f26981g, 270.0f, 90.0f);
        float f14 = f12 - this.f26977c;
        Path path7 = this.f26980f;
        if (f14 < f2) {
            int i13 = this.f26978d;
            path7.lineTo(width - (i13 / 2.0f), (i13 / 2.0f) + this.f26976b + f14);
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        int i14 = this.f26978d;
        path7.lineTo(width - (i14 / 2.0f), (height - (i14 / 2.0f)) - this.f26976b);
        float f15 = f14 - f2;
        RectF rectF4 = this.f26981g;
        int i15 = this.f26976b;
        int i16 = this.f26978d;
        rectF4.set((width - (i15 * 2)) - (i16 / 2.0f), (height - (i16 / 2.0f)) - (i15 * 2), width - (i16 / 2.0f), height - (i16 / 2.0f));
        float f16 = this.f26977c;
        Path path8 = this.f26980f;
        if (f15 < f16) {
            path8.arcTo(this.f26981g, 360.0f, m43745b(f15));
            canvas.drawPath(this.f26980f, this.f26975a);
            return;
        }
        path8.arcTo(this.f26981g, 360.0f, 90.0f);
        float f17 = f15 - this.f26977c;
        Path path9 = this.f26980f;
        if (f17 >= f5) {
            path9.lineTo(f4, height - (this.f26978d / 2.0f));
            canvas.drawPath(this.f26980f, this.f26975a);
        } else {
            int i17 = this.f26978d;
            path9.lineTo(((width - (i17 / 2.0f)) - this.f26976b) - f17, height - (i17 / 2.0f));
            canvas.drawPath(this.f26980f, this.f26975a);
        }
    }

    public void setData(int i) {
        this.f26979e = i;
        invalidate();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26976b = t100.m186890d(8.0f);
        this.f26977c = 0.0f;
        this.f26978d = 0;
        this.f26979e = 0.0f;
        this.f26982h = -7829368;
        m43744a();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26976b = t100.m186890d(8.0f);
        this.f26977c = 0.0f;
        this.f26978d = 0;
        this.f26979e = 0.0f;
        this.f26982h = -7829368;
        m43744a();
    }
}
