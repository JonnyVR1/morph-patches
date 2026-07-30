package com.p046p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.w0c0;

/* JADX INFO: loaded from: classes11.dex */
public class DataIntegrityProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f26909a;

    /* JADX INFO: renamed from: b */
    public int f26910b;

    /* JADX INFO: renamed from: c */
    public RectF f26911c;

    /* JADX INFO: renamed from: d */
    public int f26912d;

    public DataIntegrityProgressView(Context context) {
        super(context);
        this.f26910b = 0;
        this.f26912d = 0;
        m43706a();
    }

    /* JADX INFO: renamed from: a */
    public final void m43706a() {
        this.f26910b = t100.f167255d;
        Paint paint = new Paint();
        this.f26909a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f26909a.setStrokeWidth(this.f26910b);
        this.f26911c = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f26909a.setColor(getResources().getColor(w0c0.f183767G));
        RectF rectF = this.f26911c;
        int i = this.f26910b;
        float f = width;
        float f2 = height;
        rectF.set(i / 2.0f, i / 2.0f, f - (i / 2.0f), f2 - (i / 2.0f));
        canvas.drawRoundRect(this.f26911c, f / 2.0f, f2 / 2.0f, this.f26909a);
        this.f26909a.setColor(getResources().getColor(w0c0.f183773I));
        canvas.drawArc(this.f26911c, 90.0f, this.f26912d, false, this.f26909a);
    }

    public void setProgress(int i) {
        this.f26912d = Math.min(360, (i * 360) / 100);
        invalidate();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26910b = 0;
        this.f26912d = 0;
        m43706a();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26910b = 0;
        this.f26912d = 0;
        m43706a();
    }
}
