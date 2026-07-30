package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p147v.VScroll;
import p149l.w0c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardSmartScrollBar extends View implements VScroll.InterfaceC22566a {

    /* JADX INFO: renamed from: a */
    public int f26438a;

    /* JADX INFO: renamed from: b */
    public int f26439b;

    /* JADX INFO: renamed from: c */
    public Paint f26440c;

    /* JADX INFO: renamed from: d */
    public VScroll f26441d;

    public FeedPoiCardSmartScrollBar(Context context) {
        super(context);
        this.f26438a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f26439b = -1;
        this.f26440c = new Paint();
        m43195e();
    }

    @Override // p147v.VScroll.InterfaceC22566a
    /* JADX INFO: renamed from: a */
    public void mo43191a(VScroll vScroll, int i, int i2, int i3, int i4) {
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m43192b(VScroll vScroll) {
        this.f26441d = vScroll;
        vScroll.m223193d(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m43193c(Canvas canvas) {
        this.f26440c.setColor(this.f26438a);
        int height = getHeight();
        int width = getWidth();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f = width / 2;
        canvas.drawRoundRect(rectF, f, f, this.f26440c);
    }

    /* JADX INFO: renamed from: d */
    public final void m43194d(Canvas canvas) {
        if (this.f26441d == null) {
            return;
        }
        this.f26440c.setColor(this.f26439b);
        int height = getHeight();
        int scrollY = this.f26441d.getScrollY();
        int height2 = this.f26441d.getHeight();
        int height3 = this.f26441d.getChildAt(0).getHeight();
        float f = height3 > 0 ? height2 / height3 : 1.0f;
        int i = (int) (height * (f <= 1.0f ? f : 1.0f));
        int width = getWidth();
        int i2 = width / 2;
        float f2 = (height3 > height2 ? scrollY / (height3 - height2) : 0.0f) * (height - i);
        RectF rectF = new RectF(0.0f, f2, width, i + f2);
        float f3 = i2;
        canvas.drawRoundRect(rectF, f3, f3, this.f26440c);
    }

    /* JADX INFO: renamed from: e */
    public final void m43195e() {
        this.f26438a = getResources().getColor(w0c0.f183821Y);
        this.f26440c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m43193c(canvas);
        m43194d(canvas);
    }

    public void setSliderColor(int i) {
        this.f26439b = i;
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26438a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f26439b = -1;
        this.f26440c = new Paint();
        m43195e();
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26438a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f26439b = -1;
        this.f26440c = new Paint();
        m43195e();
    }
}
