package com.p000p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedRestrictLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f1399a;

    public FeedRestrictLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1399a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10297O);
        this.f1399a = typedArrayObtainStyledAttributes.getDimensionPixelSize(m9c0.f10298P, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f1399a;
        if (i3 > 0) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            } else if (size > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        super.onMeasure(i, i2);
    }

    public FeedRestrictLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedRestrictLayout(Context context) {
        this(context, null);
    }

    public FeedRestrictLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i);
    }
}
