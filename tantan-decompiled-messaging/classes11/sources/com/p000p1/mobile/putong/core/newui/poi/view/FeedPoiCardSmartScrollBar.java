package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.w0c0;
import v.VScroll;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardSmartScrollBar extends View implements VScroll.a {

    /* JADX INFO: renamed from: a */
    public int f5216a;

    /* JADX INFO: renamed from: b */
    public int f5217b;

    /* JADX INFO: renamed from: c */
    public Paint f5218c;

    /* JADX INFO: renamed from: d */
    public VScroll f5219d;

    public FeedPoiCardSmartScrollBar(Context context) {
        super(context);
        this.f5216a = -16777216;
        this.f5217b = -1;
        this.f5218c = new Paint();
        m7411e();
    }

    /* JADX INFO: renamed from: a */
    public void m7407a(VScroll vScroll, int i, int i2, int i3, int i4) {
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m7408b(VScroll vScroll) {
        this.f5219d = vScroll;
        vScroll.d(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m7409c(Canvas canvas) {
        this.f5218c.setColor(this.f5216a);
        int height = getHeight();
        int width = getWidth();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f = width / 2;
        canvas.drawRoundRect(rectF, f, f, this.f5218c);
    }

    /* JADX INFO: renamed from: d */
    public final void m7410d(Canvas canvas) {
        if (this.f5219d == null) {
            return;
        }
        this.f5218c.setColor(this.f5217b);
        int height = getHeight();
        int scrollY = this.f5219d.getScrollY();
        int height2 = this.f5219d.getHeight();
        int height3 = this.f5219d.getChildAt(0).getHeight();
        float f = height3 > 0 ? height2 / height3 : 1.0f;
        int i = (int) (height * (f <= 1.0f ? f : 1.0f));
        int width = getWidth();
        int i2 = width / 2;
        float f2 = (height3 > height2 ? scrollY / (height3 - height2) : 0.0f) * (height - i);
        RectF rectF = new RectF(0.0f, f2, width, i + f2);
        float f3 = i2;
        canvas.drawRoundRect(rectF, f3, f3, this.f5218c);
    }

    /* JADX INFO: renamed from: e */
    public final void m7411e() {
        this.f5216a = getResources().getColor(w0c0.Y);
        this.f5218c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m7409c(canvas);
        m7410d(canvas);
    }

    public void setSliderColor(int i) {
        this.f5217b = i;
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5216a = -16777216;
        this.f5217b = -1;
        this.f5218c = new Paint();
        m7411e();
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5216a = -16777216;
        this.f5217b = -1;
        this.f5218c = new Paint();
        m7411e();
    }
}
