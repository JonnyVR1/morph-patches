package com.p000p1.mobile.putong.core.newui.main.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.e9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LinearLayoutFixedLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float f3324a;

    public LinearLayoutFixedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.M0);
            this.f3324a = typedArrayObtainStyledAttributes.getDimension(e9c0.N0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        boolean z2 = false;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (z2) {
                    childAt.layout(0, 0, 0, 0);
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    int i9 = marginLayoutParams.leftMargin;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    i7 += i9;
                    float f = this.f3324a;
                    if (f <= 0.0f || i7 + measuredWidth <= (i5 = i3 - i) || i7 + f >= i5) {
                        int i10 = i7 + measuredWidth;
                        if (i10 > i3 - i) {
                            childAt.layout(0, 0, 0, 0);
                        } else {
                            int i11 = measuredHeight / 2;
                            childAt.layout(i7, i6 - i11, i10, i11 + i6);
                            i7 = i7 + marginLayoutParams.rightMargin + measuredWidth;
                        }
                    } else {
                        int i12 = measuredHeight / 2;
                        childAt.layout(i7, i6 - i12, (i5 - i7) + i7, i12 + i6);
                    }
                    z2 = true;
                }
            }
        }
    }

    public LinearLayoutFixedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutFixedLayout(@NonNull Context context) {
        this(context, null);
    }
}
