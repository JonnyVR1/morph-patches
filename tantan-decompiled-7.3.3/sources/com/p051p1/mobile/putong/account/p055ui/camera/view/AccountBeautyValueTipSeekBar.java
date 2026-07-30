package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f17472b;

    /* JADX INFO: renamed from: c */
    public Paint f17473c;

    /* JADX INFO: renamed from: d */
    public float f17474d;

    /* JADX INFO: renamed from: e */
    public float f17475e;

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f17473c = paint;
        paint.setAntiAlias(true);
        this.f17473c.setColor(Color.parseColor("#ff3a00"));
        this.f17473c.setTextSize(qa00.m175861f(12));
    }

    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f17473c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f17472b = strValueOf;
        this.f17474d = this.f17473c.measureText(strValueOf);
        float fM175859d = qa00.m175859d(10.0f);
        float f = fontMetrics.descent;
        this.f17475e = (fM175859d - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f17472b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f17474d / 2.0f), this.f17475e + qa00.m175859d(8.0f), this.f17473c);
    }

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
