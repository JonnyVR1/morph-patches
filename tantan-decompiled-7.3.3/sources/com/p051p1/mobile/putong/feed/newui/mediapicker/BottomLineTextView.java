package com.p051p1.mobile.putong.feed.newui.mediapicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import p151v.VText;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class BottomLineTextView extends VText {

    /* JADX INFO: renamed from: i */
    public Paint f41103i;

    /* JADX INFO: renamed from: j */
    public boolean f41104j;

    public BottomLineTextView(Context context) {
        super(context);
        this.f41104j = false;
    }

    /* JADX INFO: renamed from: l */
    public void m63369l(boolean z) {
        this.f41104j = z;
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f41104j) {
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            if (this.f41103i == null) {
                this.f41103i = new Paint();
            }
            this.f41103i.setColor(Color.parseColor("#ff450e"));
            this.f41103i.setAntiAlias(true);
            this.f41103i.setStrokeWidth(qa00.m175859d(1.0f));
            float fM175859d = (measuredWidth - qa00.m175859d(76.0f)) / 2.0f;
            float fM175859d2 = measuredHeight - qa00.m175859d(1.0f);
            canvas.drawLine(fM175859d, fM175859d2, fM175859d + qa00.m175859d(76.0f), fM175859d2, this.f41103i);
        }
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41104j = false;
    }

    public BottomLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41104j = false;
    }
}
