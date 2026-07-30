package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class CardPhotoFrame extends VFrame {

    /* JADX INFO: renamed from: a */
    public float f23237a;

    public CardPhotoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23237a = 0.0f;
        this.f23237a = context.obtainStyledAttributes(attributeSet, khc0.f126751O).getFloat(khc0.f126754P, 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.f23237a;
        if (f == 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = (int) (size / f);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    public CardPhotoFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CardPhotoFrame(Context context) {
        this(context, null);
    }
}
