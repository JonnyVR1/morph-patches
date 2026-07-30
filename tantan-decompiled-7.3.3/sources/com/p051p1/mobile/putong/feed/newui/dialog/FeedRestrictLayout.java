package com.p051p1.mobile.putong.feed.newui.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedRestrictLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public int f40786a;

    public FeedRestrictLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40786a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168628O);
        this.f40786a = typedArrayObtainStyledAttributes.getDimensionPixelSize(shc0.f168629P, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f40786a;
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
