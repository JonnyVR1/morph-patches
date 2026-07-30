package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p151v.VScroll;
import p153l.thc0;

/* JADX INFO: loaded from: classes13.dex */
public class MaximumScroll extends VScroll {

    /* JADX INFO: renamed from: e */
    public int f45638e;

    /* JADX INFO: renamed from: f */
    public int f45639f;

    public MaximumScroll(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45638e = -1;
        this.f45639f = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, thc0.f174302L);
        this.f45639f = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174304N, -1);
        this.f45638e = typedArrayObtainStyledAttributes.getDimensionPixelSize(thc0.f174303M, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f45639f;
        if (i3 > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        int i4 = this.f45638e;
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
