package com.p051p1.mobile.putong.core.p058ui.slide;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class NewSlideProcessView extends View {

    /* JADX INFO: renamed from: a */
    public final int f37189a;

    /* JADX INFO: renamed from: b */
    public final int f37190b;

    /* JADX INFO: renamed from: c */
    public Paint f37191c;

    /* JADX INFO: renamed from: d */
    public Paint f37192d;

    /* JADX INFO: renamed from: e */
    public float f37193e;

    /* JADX INFO: renamed from: f */
    public final int f37194f;

    /* JADX INFO: renamed from: g */
    public final int f37195g;

    /* JADX INFO: renamed from: h */
    public boolean f37196h;

    public NewSlideProcessView(@NonNull Context context) {
        super(context);
        this.f37189a = Color.parseColor("#03aeff");
        this.f37190b = Color.parseColor("#4a4a4a");
        this.f37193e = -1.0f;
        this.f37194f = bnl0.m105592y0() - qa00.m175859d(10.0f);
        this.f37195g = qa00.m175859d(10.0f);
        m56871b();
    }

    /* JADX INFO: renamed from: b */
    public final void m56871b() {
        Paint paint = new Paint();
        this.f37191c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f37191c.setColor(this.f37189a);
        this.f37191c.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f37192d = paint2;
        paint2.setStyle(style);
        this.f37192d.setColor(this.f37190b);
        invalidate();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m56872c() {
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f37193e;
        if (f < 0.0f) {
            return;
        }
        if (this.f37196h || f != 0.0f) {
            this.f37191c.setStrokeWidth(qa00.m175859d(3.0f));
            this.f37192d.setStrokeWidth(qa00.m175859d(1.0f));
            canvas.drawLine(0.0f, 0.0f, bnl0.m105592y0(), 0.0f, this.f37192d);
            canvas.drawLine(0.0f, 0.0f, (this.f37194f * this.f37193e) + this.f37195g, 0.0f, this.f37191c);
            return;
        }
        this.f37191c.setStrokeWidth(qa00.m175859d(7.0f));
        this.f37192d.setStrokeWidth(qa00.m175859d(3.0f));
        this.f37196h = true;
        canvas.drawLine(0.0f, 0.0f, bnl0.m105592y0(), 0.0f, this.f37192d);
        canvas.drawLine(0.0f, 0.0f, (this.f37194f * this.f37193e) + this.f37195g, 0.0f, this.f37191c);
        postDelayed(new Runnable() { // from class: l.ci40
            @Override // java.lang.Runnable
            public final void run() {
                this.f81893a.m56872c();
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
        if (this.f37193e == f) {
            return;
        }
        this.f37193e = f;
        invalidate();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37189a = Color.parseColor("#03aeff");
        this.f37190b = Color.parseColor("#4a4a4a");
        this.f37193e = -1.0f;
        this.f37194f = bnl0.m105592y0() - qa00.m175859d(10.0f);
        this.f37195g = qa00.m175859d(10.0f);
        m56871b();
    }

    public NewSlideProcessView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37189a = Color.parseColor("#03aeff");
        this.f37190b = Color.parseColor("#4a4a4a");
        this.f37193e = -1.0f;
        this.f37194f = bnl0.m105592y0() - qa00.m175859d(10.0f);
        this.f37195g = qa00.m175859d(10.0f);
        m56871b();
    }
}
