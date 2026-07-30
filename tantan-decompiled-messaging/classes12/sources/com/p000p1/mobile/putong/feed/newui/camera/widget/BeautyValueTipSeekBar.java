package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatSeekBar;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BeautyValueTipSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b */
    public String f1007b;

    /* JADX INFO: renamed from: c */
    public Paint f1008c;

    /* JADX INFO: renamed from: d */
    public float f1009d;

    /* JADX INFO: renamed from: e */
    public float f1010e;

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.f1008c = paint;
        paint.setAntiAlias(true);
        this.f1008c.setColor(Color.parseColor("#ff3a00"));
        this.f1008c.setTextSize(t100.f(12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getTextLocation() {
        Paint.FontMetrics fontMetrics = this.f1008c.getFontMetrics();
        String strValueOf = String.valueOf(getProgress());
        this.f1007b = strValueOf;
        this.f1009d = this.f1008c.measureText(strValueOf);
        float fD = t100.d(10.0f);
        float f = fontMetrics.descent;
        this.f1010e = (fD - f) + ((f - fontMetrics.ascent) / 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getTextLocation();
        canvas.drawText(this.f1007b, (((getProgressDrawable().getBounds().width() * getProgress()) / getMax()) + getPaddingLeft()) - (this.f1009d / 2.0f), this.f1010e + t100.d(8.0f), this.f1008c);
    }

    public BeautyValueTipSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyValueTipSeekBar(Context context) {
        this(context, null);
    }
}
