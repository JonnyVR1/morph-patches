package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class BeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f40394b;

    /* JADX INFO: renamed from: c */
    public Paint f40395c;

    /* JADX INFO: renamed from: d */
    public float f40396d;

    /* JADX INFO: renamed from: e */
    public float f40397e;

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f40395c = paint;
        paint.setAntiAlias(true);
        this.f40395c.setColor(Color.parseColor("#ff3a00"));
        this.f40395c.setTextSize(qa00.m175861f(12));
    }

    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f40395c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f40394b = strValueOf;
        this.f40396d = this.f40395c.measureText(strValueOf);
        float fM175859d = qa00.m175859d(10.0f);
        float f = fontMetrics.descent;
        this.f40397e = (fM175859d - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f40394b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f40396d / 2.0f), this.f40397e + qa00.m175859d(8.0f), this.f40395c);
    }

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
