package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DataIntegrityProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f5687a;

    /* JADX INFO: renamed from: b */
    public int f5688b;

    /* JADX INFO: renamed from: c */
    public RectF f5689c;

    /* JADX INFO: renamed from: d */
    public int f5690d;

    public DataIntegrityProgressView(Context context) {
        super(context);
        this.f5688b = 0;
        this.f5690d = 0;
        m7970a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7970a() {
        this.f5688b = t100.d;
        Paint paint = new Paint();
        this.f5687a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f5687a.setStrokeWidth(this.f5688b);
        this.f5689c = new RectF();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        this.f5687a.setColor(getResources().getColor(w0c0.G));
        RectF rectF = this.f5689c;
        int i = this.f5688b;
        float f = width;
        float f2 = height;
        rectF.set(i / 2.0f, i / 2.0f, f - (i / 2.0f), f2 - (i / 2.0f));
        canvas.drawRoundRect(this.f5689c, f / 2.0f, f2 / 2.0f, this.f5687a);
        this.f5687a.setColor(getResources().getColor(w0c0.I));
        canvas.drawArc(this.f5689c, 90.0f, this.f5690d, false, this.f5687a);
    }

    public void setProgress(int i) {
        this.f5690d = Math.min(360, (i * 360) / 100);
        invalidate();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5688b = 0;
        this.f5690d = 0;
        m7970a();
    }

    public DataIntegrityProgressView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5688b = 0;
        this.f5690d = 0;
        m7970a();
    }
}
