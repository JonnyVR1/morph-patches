package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class BeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f39546b;

    /* JADX INFO: renamed from: c */
    public Paint f39547c;

    /* JADX INFO: renamed from: d */
    public float f39548d;

    /* JADX INFO: renamed from: e */
    public float f39549e;

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f39547c = paint;
        paint.setAntiAlias(true);
        this.f39547c.setColor(Color.parseColor("#ff3a00"));
        this.f39547c.setTextSize(t100.m186892f(12));
    }

    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f39547c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f39546b = strValueOf;
        this.f39548d = this.f39547c.measureText(strValueOf);
        float fM186890d = t100.m186890d(10.0f);
        float f = fontMetrics.descent;
        this.f39549e = (fM186890d - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f39546b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f39548d / 2.0f), this.f39549e + t100.m186890d(8.0f), this.f39547c);
    }

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
