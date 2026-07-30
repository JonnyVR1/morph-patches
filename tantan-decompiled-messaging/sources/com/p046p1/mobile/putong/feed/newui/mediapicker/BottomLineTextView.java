package com.p046p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import p147v.VText;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class BottomLineTextView extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f40255i;

    /* JADX INFO: renamed from: j */
    public boolean f40256j;

    public BottomLineTextView(Context context) {
        super(context);
        this.f40256j = false;
    }

    /* JADX INFO: renamed from: l */
    public void m62186l(boolean z) {
        this.f40256j = z;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f40256j) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f40255i == null) {
                this.f40255i = new Paint();
            }
            this.f40255i.setColor(Color.parseColor("#ff450e"));
            this.f40255i.setAntiAlias(true);
            this.f40255i.setStrokeWidth(t100.m186890d(1.0f));
            float fM186890d = (measuredWidth - t100.m186890d(76.0f)) / 2.0f;
            float fM186890d2 = measuredHeight - t100.m186890d(1.0f);
            canvas.drawLine(fM186890d, fM186890d2, fM186890d + t100.m186890d(76.0f), fM186890d2, this.f40255i);
        }
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40256j = false;
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40256j = false;
    }
}
