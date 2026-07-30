package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class AccountBeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f16753b;

    /* JADX INFO: renamed from: c */
    public Paint f16754c;

    /* JADX INFO: renamed from: d */
    public float f16755d;

    /* JADX INFO: renamed from: e */
    public float f16756e;

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f16754c = paint;
        paint.setAntiAlias(true);
        this.f16754c.setColor(Color.parseColor("#ff3a00"));
        this.f16754c.setTextSize(t100.m186892f(12));
    }

    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f16754c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f16753b = strValueOf;
        this.f16755d = this.f16754c.measureText(strValueOf);
        float fM186890d = t100.m186890d(10.0f);
        float f = fontMetrics.descent;
        this.f16756e = (fM186890d - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f16753b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f16755d / 2.0f), this.f16756e + t100.m186890d(8.0f), this.f16754c);
    }

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
