package com.p051p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.c9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class DataIntegrityProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f27757a;

    /* JADX INFO: renamed from: b */
    public int f27758b;

    /* JADX INFO: renamed from: c */
    public RectF f27759c;

    /* JADX INFO: renamed from: d */
    public int f27760d;

    public DataIntegrityProgressView(Context context) {
        super(context);
        this.f27758b = 0;
        this.f27760d = 0;
        m44892a();
    }

    /* JADX INFO: renamed from: a */
    public final void m44892a() {
        this.f27758b = qa00.f156317d;
        Paint paint = new Paint();
        this.f27757a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f27757a.setStrokeWidth(this.f27758b);
        this.f27759c = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f27757a.setColor(getResources().getColor(c9c0.f80336G));
        RectF rectF = this.f27759c;
        int i = this.f27758b;
        float f = width;
        float f2 = height;
        rectF.set(i / 2.0f, i / 2.0f, f - (i / 2.0f), f2 - (i / 2.0f));
        canvas.drawRoundRect(this.f27759c, f / 2.0f, f2 / 2.0f, this.f27757a);
        this.f27757a.setColor(getResources().getColor(c9c0.f80342I));
        canvas.drawArc(this.f27759c, 90.0f, this.f27760d, false, this.f27757a);
    }

    public void setProgress(int i) {
        this.f27760d = Math.min(360, (i * 360) / 100);
        invalidate();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27758b = 0;
        this.f27760d = 0;
        m44892a();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27758b = 0;
        this.f27760d = 0;
        m44892a();
    }
}
