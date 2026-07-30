package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p151v.VScroll;
import p153l.c9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardSmartScrollBar extends View implements VScroll.InterfaceC22681a {

    /* JADX INFO: renamed from: a */
    public int f27180a;

    /* JADX INFO: renamed from: b */
    public int f27181b;

    /* JADX INFO: renamed from: c */
    public Paint f27182c;

    /* JADX INFO: renamed from: d */
    public VScroll f27183d;

    public FeedPoiCardSmartScrollBar(Context context) {
        super(context);
        this.f27180a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f27181b = -1;
        this.f27182c = new Paint();
        m44206e();
    }

    @Override // p151v.VScroll.InterfaceC22681a
    /* JADX INFO: renamed from: a */
    public void mo44202a(VScroll vScroll, int i, int i2, int i3, int i4) {
        postInvalidate();
    }

    /* JADX INFO: renamed from: b */
    public void m44203b(VScroll vScroll) {
        this.f27183d = vScroll;
        vScroll.m224439d(this);
    }

    /* JADX INFO: renamed from: c */
    public final void m44204c(Canvas canvas) {
        this.f27182c.setColor(this.f27180a);
        int height = getHeight();
        int width = getWidth();
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        float f = width / 2;
        canvas.drawRoundRect(rectF, f, f, this.f27182c);
    }

    /* JADX INFO: renamed from: d */
    public final void m44205d(Canvas canvas) {
        if (this.f27183d == null) {
            return;
        }
        this.f27182c.setColor(this.f27181b);
        int height = getHeight();
        int scrollY = this.f27183d.getScrollY();
        int height2 = this.f27183d.getHeight();
        int height3 = this.f27183d.getChildAt(0).getHeight();
        float f = height3 > 0 ? height2 / height3 : 1.0f;
        int i = (int) (height * (f <= 1.0f ? f : 1.0f));
        int width = getWidth();
        int i2 = width / 2;
        float f2 = (height3 > height2 ? scrollY / (height3 - height2) : 0.0f) * (height - i);
        RectF rectF = new RectF(0.0f, f2, width, i + f2);
        float f3 = i2;
        canvas.drawRoundRect(rectF, f3, f3, this.f27182c);
    }

    /* JADX INFO: renamed from: e */
    public final void m44206e() {
        this.f27180a = getResources().getColor(c9c0.f80393Z);
        this.f27182c.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m44204c(canvas);
        m44205d(canvas);
    }

    public void setSliderColor(int i) {
        this.f27181b = i;
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27180a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f27181b = -1;
        this.f27182c = new Paint();
        m44206e();
    }

    public FeedPoiCardSmartScrollBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27180a = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f27181b = -1;
        this.f27182c = new Paint();
        m44206e();
    }
}
