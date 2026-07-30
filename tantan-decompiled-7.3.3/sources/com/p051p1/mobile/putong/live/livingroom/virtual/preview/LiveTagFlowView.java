package com.p051p1.mobile.putong.live.livingroom.virtual.preview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class LiveTagFlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f53481a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f53482b;

    /* JADX INFO: renamed from: c */
    public int f53483c;

    /* JADX INFO: renamed from: d */
    public int f53484d;

    /* JADX INFO: renamed from: e */
    public boolean f53485e;

    /* JADX INFO: renamed from: f */
    public int f53486f;

    /* JADX INFO: renamed from: g */
    public int f53487g;

    /* JADX INFO: renamed from: h */
    public boolean f53488h;

    public LiveTagFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53483c = qa00.m175859d(8.0f);
        this.f53484d = qa00.m175859d(8.0f);
        this.f53485e = false;
        this.f53486f = -1;
        this.f53487g = 0;
        this.f53488h = false;
        this.f53481a = context;
        this.f53482b = attributeSet;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f53488h) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f53483c + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f53484d;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
            }
            arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
            childCount = getChildCount();
            paddingLeft = getPaddingLeft();
            paddingTop = getPaddingTop();
        }
        int i7 = 0;
        int iMax2 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt2 = getChildAt(i8);
            if (i5 < childAt2.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                i7++;
                paddingLeft = getPaddingLeft();
                if (this.f53488h && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f53483c + iMax2;
                iMax2 = 0;
            }
            if (this.f53488h && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f53484d;
            iMax2 = Math.max(iMax2, childAt2.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = 0;
        int iMax = 0;
        int measuredWidth = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            measureChild(childAt, i, i2);
            if (childAt.getMeasuredWidth() + measuredWidth > size) {
                i3 = i3 + this.f53483c + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f53484d;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public LiveTagFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagFlowView(Context context) {
        this(context, null);
    }
}
