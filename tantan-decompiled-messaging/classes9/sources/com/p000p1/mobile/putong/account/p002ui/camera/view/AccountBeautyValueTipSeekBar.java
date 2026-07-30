package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountBeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f742b;

    /* JADX INFO: renamed from: c */
    public Paint f743c;

    /* JADX INFO: renamed from: d */
    public float f744d;

    /* JADX INFO: renamed from: e */
    public float f745e;

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f743c = paint;
        paint.setAntiAlias(true);
        this.f743c.setColor(Color.parseColor("#ff3a00"));
        this.f743c.setTextSize(t100.f(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f743c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f742b = strValueOf;
        this.f744d = this.f743c.measureText(strValueOf);
        float fD = t100.d(10.0f);
        float f = fontMetrics.descent;
        this.f745e = (fD - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f742b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f744d / 2.0f), this.f745e + t100.d(8.0f), this.f743c);
    }

    public AccountBeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountBeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
