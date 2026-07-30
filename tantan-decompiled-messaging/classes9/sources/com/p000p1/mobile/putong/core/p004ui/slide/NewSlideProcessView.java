package com.p000p1.mobile.putong.core.p004ui.slide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NewSlideProcessView extends View {

    /* JADX INFO: renamed from: a */
    public final int f6122a;

    /* JADX INFO: renamed from: b */
    public final int f6123b;

    /* JADX INFO: renamed from: c */
    public Paint f6124c;

    /* JADX INFO: renamed from: d */
    public Paint f6125d;

    /* JADX INFO: renamed from: e */
    public float f6126e;

    /* JADX INFO: renamed from: f */
    public final int f6127f;

    /* JADX INFO: renamed from: g */
    public final int f6128g;

    /* JADX INFO: renamed from: h */
    public boolean f6129h;

    public NewSlideProcessView(@NonNull Context context) {
        super(context);
        this.f6122a = Color.parseColor("#03aeff");
        this.f6123b = Color.parseColor("#4a4a4a");
        this.f6126e = -1.0f;
        this.f6127f = xdl0.y0() - t100.d(10.0f);
        this.f6128g = t100.d(10.0f);
        m9085b();
    }

    /* JADX INFO: renamed from: b */
    public final void m9085b() {
        Paint paint = new Paint();
        this.f6124c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f6124c.setColor(this.f6122a);
        this.f6124c.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f6125d = paint2;
        paint2.setStyle(style);
        this.f6125d.setColor(this.f6123b);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m9086c() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f6126e;
        if (f < 0.0f) {
            return;
        }
        if (this.f6129h || f != 0.0f) {
            this.f6124c.setStrokeWidth(t100.d(3.0f));
            this.f6125d.setStrokeWidth(t100.d(1.0f));
            canvas.drawLine(0.0f, 0.0f, xdl0.y0(), 0.0f, this.f6125d);
            canvas.drawLine(0.0f, 0.0f, (this.f6127f * this.f6126e) + this.f6128g, 0.0f, this.f6124c);
            return;
        }
        this.f6124c.setStrokeWidth(t100.d(7.0f));
        this.f6125d.setStrokeWidth(t100.d(3.0f));
        this.f6129h = true;
        canvas.drawLine(0.0f, 0.0f, xdl0.y0(), 0.0f, this.f6125d);
        canvas.drawLine(0.0f, 0.0f, (this.f6127f * this.f6126e) + this.f6128g, 0.0f, this.f6124c);
        postDelayed(new Runnable() { // from class: l.o940
            @Override // java.lang.Runnable
            public final void run() {
                this.f18077a.m9086c();
            }
        }, 3000L);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setProcess(float f) {
        if (this.f6126e == f) {
            return;
        }
        this.f6126e = f;
        invalidate();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6122a = Color.parseColor("#03aeff");
        this.f6123b = Color.parseColor("#4a4a4a");
        this.f6126e = -1.0f;
        this.f6127f = xdl0.y0() - t100.d(10.0f);
        this.f6128g = t100.d(10.0f);
        m9085b();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6122a = Color.parseColor("#03aeff");
        this.f6123b = Color.parseColor("#4a4a4a");
        this.f6126e = -1.0f;
        this.f6127f = xdl0.y0() - t100.d(10.0f);
        this.f6128g = t100.d(10.0f);
        m9085b();
    }
}
