package com.p000p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import l.t100;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BottomLineTextView extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f1716i;

    /* JADX INFO: renamed from: j */
    public boolean f1717j;

    public BottomLineTextView(Context context) {
        super(context);
        this.f1717j = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m3168l(boolean z) {
        this.f1717j = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        if (this.f1717j) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f1716i == null) {
                this.f1716i = new Paint();
            }
            this.f1716i.setColor(Color.parseColor("#ff450e"));
            this.f1716i.setAntiAlias(true);
            this.f1716i.setStrokeWidth(t100.d(1.0f));
            float fD = (measuredWidth - t100.d(76.0f)) / 2.0f;
            float fD2 = measuredHeight - t100.d(1.0f);
            canvas.drawLine(fD, fD2, fD + t100.d(76.0f), fD2, this.f1716i);
        }
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1717j = false;
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1717j = false;
    }
}
