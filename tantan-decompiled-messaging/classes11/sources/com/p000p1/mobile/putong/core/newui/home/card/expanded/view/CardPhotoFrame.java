package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.e9c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardPhotoFrame extends VFrame {

    /* JADX INFO: renamed from: a */
    public float f1273a;

    public CardPhotoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1273a = 0.0f;
        this.f1273a = context.obtainStyledAttributes(attributeSet, e9c0.O).getFloat(e9c0.P, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.f1273a;
        if (f == 0.0f) {
            super/*android.view.View*/.onMeasure(i, i2);
            return;
        }
        int i3 = (int) (size / f);
        super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
    }

    public CardPhotoFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CardPhotoFrame(Context context) {
        this(context, null);
    }
}
