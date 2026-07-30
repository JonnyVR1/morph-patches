package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p147v.VScroll;
import p149l.n9c0;

/* JADX INFO: loaded from: classes13.dex */
public class MaximumScroll extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f44790e;

    /* JADX INFO: renamed from: f */
    public int f44791f;

    public MaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44790e = -1;
        this.f44791f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n9c0.f137744L);
        this.f44791f = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137746N, -1);
        this.f44790e = typedArrayObtainStyledAttributes.getDimensionPixelSize(n9c0.f137745M, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f44791f;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f44790e;
        if (i4 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public MaximumScroll(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaximumScroll(Context context) {
        this(context, null);
    }
}
