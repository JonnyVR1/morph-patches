package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p149l.e9c0;

/* JADX INFO: loaded from: classes11.dex */
public class CardPhotoFrame extends VFrame {

    /* JADX INFO: renamed from: a */
    public float f22495a;

    public CardPhotoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22495a = 0.0f;
        this.f22495a = context.obtainStyledAttributes(attributeSet, e9c0.f89981O).getFloat(e9c0.f89984P, 0.0f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.f22495a;
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
