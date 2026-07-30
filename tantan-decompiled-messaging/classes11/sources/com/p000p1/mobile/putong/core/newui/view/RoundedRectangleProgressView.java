package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class RoundedRectangleProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5753a;

    /* JADX INFO: renamed from: b */
    public int f5754b;

    /* JADX INFO: renamed from: c */
    public float f5755c;

    /* JADX INFO: renamed from: d */
    public int f5756d;

    /* JADX INFO: renamed from: e */
    public float f5757e;

    /* JADX INFO: renamed from: f */
    public Path f5758f;

    /* JADX INFO: renamed from: g */
    public RectF f5759g;

    /* JADX INFO: renamed from: h */
    public int f5760h;

    public RoundedRectangleProgressView(Context context) {
        super(context);
        this.f5754b = t100.d(8.0f);
        this.f5755c = 0.0f;
        this.f5756d = 0;
        this.f5757e = 0.0f;
        this.f5760h = -7829368;
        m8008a();
    }

    /* JADX INFO: renamed from: a */
    public final void m8008a() {
        this.f5756d = t100.e;
        this.f5755c = (this.f5754b * 3.1415927f) / 2.0f;
        this.f5760h = getResources().getColor(w0c0.I);
        Paint paint = new Paint();
        this.f5753a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f5758f = new Path();
        this.f5759g = new RectF();
    }

    /* JADX INFO: renamed from: b */
    public float m8009b(float f) {
        return (f * 90.0f) / this.f5755c;
    }

    /* JADX INFO: renamed from: c */
    public void m8010c(float f, int i, int i2, int i3) {
        this.f5757e = f;
        this.f5760h = i;
        this.f5754b = i2;
        this.f5756d = i3;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5753a.setColor(-65536);
        float width = getWidth();
        float height = getHeight();
        this.f5758f.reset();
        this.f5753a.setStrokeWidth(this.f5756d);
        int i = this.f5754b;
        this.f5755c = (i * 3.1415927f) / 2.0f;
        int i2 = this.f5756d;
        float f = (width - i2) - (i * 2);
        float f2 = (height - i2) - (i * 2);
        float f3 = ((float) (((double) this.f5757e) * (((((double) i) * 6.283185307179586d) + ((double) (f * 2.0f))) + ((double) (f2 * 2.0f))))) / 100.0f;
        if (f3 < 0.0f) {
            return;
        }
        this.f5753a.setColor(this.f5760h);
        float f4 = width / 2.0f;
        this.f5758f.moveTo(f4, height - (this.f5756d / 2.0f));
        float f5 = f / 2.0f;
        Path path = this.f5758f;
        if (f3 < f5) {
            path.lineTo(f4 - f3, height - (this.f5756d / 2.0f));
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        path.lineTo(this.f5754b, height - (this.f5756d / 2.0f));
        float f6 = f3 - f5;
        RectF rectF = this.f5759g;
        int i3 = this.f5756d;
        int i4 = this.f5754b;
        rectF.set(i3 / 2.0f, (height - (i4 * 2)) - (i3 / 2.0f), (i3 / 2.0f) + (i4 * 2), height - (i3 / 2.0f));
        float f7 = this.f5755c;
        Path path2 = this.f5758f;
        if (f6 < f7) {
            path2.arcTo(this.f5759g, 90.0f, m8009b(f6));
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        path2.arcTo(this.f5759g, 90.0f, 90.0f);
        float f8 = f6 - this.f5755c;
        Path path3 = this.f5758f;
        if (f8 < f2) {
            int i5 = this.f5756d;
            path3.lineTo(i5 / 2.0f, ((height - (i5 / 2.0f)) - this.f5754b) - f8);
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        int i6 = this.f5756d;
        path3.lineTo(i6 / 2.0f, (i6 / 2.0f) + this.f5754b);
        float f9 = f8 - f2;
        RectF rectF2 = this.f5759g;
        int i7 = this.f5756d;
        int i8 = this.f5754b;
        rectF2.set(i7 / 2.0f, i7 / 2.0f, (i7 / 2.0f) + (i8 * 2), (i8 * 2) + (i7 / 2.0f));
        float f10 = this.f5755c;
        Path path4 = this.f5758f;
        if (f9 < f10) {
            path4.arcTo(this.f5759g, 180.0f, m8009b(f9));
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        path4.arcTo(this.f5759g, 180.0f, 90.0f);
        float f11 = f9 - this.f5755c;
        Path path5 = this.f5758f;
        if (f11 < f) {
            int i9 = this.f5756d;
            path5.lineTo((i9 / 2.0f) + this.f5754b + f11, i9 / 2.0f);
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        int i10 = this.f5756d;
        path5.lineTo((width - (i10 / 2.0f)) - this.f5754b, i10 / 2.0f);
        float f12 = f11 - f;
        RectF rectF3 = this.f5759g;
        int i11 = this.f5754b;
        int i12 = this.f5756d;
        rectF3.set((width - (i11 * 2)) - (i12 / 2.0f), i12 / 2.0f, width - (i12 / 2.0f), (i11 * 2) + (i12 / 2.0f));
        float f13 = this.f5755c;
        Path path6 = this.f5758f;
        if (f12 < f13) {
            path6.arcTo(this.f5759g, 270.0f, m8009b(f12));
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        path6.arcTo(this.f5759g, 270.0f, 90.0f);
        float f14 = f12 - this.f5755c;
        Path path7 = this.f5758f;
        if (f14 < f2) {
            int i13 = this.f5756d;
            path7.lineTo(width - (i13 / 2.0f), (i13 / 2.0f) + this.f5754b + f14);
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        int i14 = this.f5756d;
        path7.lineTo(width - (i14 / 2.0f), (height - (i14 / 2.0f)) - this.f5754b);
        float f15 = f14 - f2;
        RectF rectF4 = this.f5759g;
        int i15 = this.f5754b;
        int i16 = this.f5756d;
        rectF4.set((width - (i15 * 2)) - (i16 / 2.0f), (height - (i16 / 2.0f)) - (i15 * 2), width - (i16 / 2.0f), height - (i16 / 2.0f));
        float f16 = this.f5755c;
        Path path8 = this.f5758f;
        if (f15 < f16) {
            path8.arcTo(this.f5759g, 360.0f, m8009b(f15));
            canvas.drawPath(this.f5758f, this.f5753a);
            return;
        }
        path8.arcTo(this.f5759g, 360.0f, 90.0f);
        float f17 = f15 - this.f5755c;
        Path path9 = this.f5758f;
        if (f17 >= f5) {
            path9.lineTo(f4, height - (this.f5756d / 2.0f));
            canvas.drawPath(this.f5758f, this.f5753a);
        } else {
            int i17 = this.f5756d;
            path9.lineTo(((width - (i17 / 2.0f)) - this.f5754b) - f17, height - (i17 / 2.0f));
            canvas.drawPath(this.f5758f, this.f5753a);
        }
    }

    public void setData(int i) {
        this.f5757e = i;
        invalidate();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5754b = t100.d(8.0f);
        this.f5755c = 0.0f;
        this.f5756d = 0;
        this.f5757e = 0.0f;
        this.f5760h = -7829368;
        m8008a();
    }

    public RoundedRectangleProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5754b = t100.d(8.0f);
        this.f5755c = 0.0f;
        this.f5756d = 0;
        this.f5757e = 0.0f;
        this.f5760h = -7829368;
        m8008a();
    }
}
