package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class ScaleLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    private float f12476a;

    /* JADX INFO: renamed from: b */
    private float f12477b;

    public ScaleLayout(View view) {
        super(view.getContext());
        this.f12476a = 1.0f;
        this.f12477b = 1.0f;
        addView(view);
    }

    /* JADX INFO: renamed from: b */
    private float m18366b(int i, float f) {
        if (i == 0) {
            return f;
        }
        float f2 = i;
        return (((int) ((f * f2) + 0.5f)) * 1.0f) / f2;
    }

    /* JADX INFO: renamed from: a */
    public void m18367a(float f, float f2) {
        this.f12476a = f;
        this.f12477b = f2;
        if (isInLayout()) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            float fM18366b = m18366b(childAt.getMeasuredWidth(), this.f12476a);
            float fM18366b2 = m18366b(childAt.getMeasuredHeight(), this.f12477b);
            childAt.setPivotX(0.0f);
            childAt.setPivotY(0.0f);
            childAt.setScaleX(fM18366b);
            childAt.setScaleY(fM18366b2);
            childAt.layout(0, 0, (int) (childAt.getMeasuredWidth() * fM18366b), (int) (childAt.getMeasuredHeight() * fM18366b2));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            iMax = Math.max(iMax, (int) (childAt.getMeasuredWidth() * m18366b(childAt.getMeasuredWidth(), this.f12476a)));
            iMax2 = Math.max(iMax2, (int) (childAt.getMeasuredHeight() * m18366b(childAt.getMeasuredHeight(), this.f12477b)));
        }
        setMeasuredDimension(iMax, iMax2);
    }

    public ScaleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12476a = 1.0f;
        this.f12477b = 1.0f;
    }

    public ScaleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12476a = 1.0f;
        this.f12477b = 1.0f;
    }

    public ScaleLayout(Context context) {
        super(context);
        this.f12476a = 1.0f;
        this.f12477b = 1.0f;
    }
}
