package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.t100;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BuzzFlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f73a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f74b;

    /* JADX INFO: renamed from: c */
    public final int f75c;

    /* JADX INFO: renamed from: d */
    public int f76d;

    /* JADX INFO: renamed from: e */
    public int f77e;

    /* JADX INFO: renamed from: f */
    public boolean f78f;

    /* JADX INFO: renamed from: g */
    public int f79g;

    /* JADX INFO: renamed from: h */
    public boolean f80h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzFlowView$a */
    public interface InterfaceC0011a {
    }

    public BuzzFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f75c = t100.d(8.0f);
        this.f76d = t100.d(8.0f);
        this.f77e = t100.d(8.0f);
        this.f78f = false;
        this.f79g = -1;
        this.f80h = false;
        this.f73a = context;
        this.f74b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m164b(List list, View view) {
        if (NullChecker.a((Object) null)) {
            list.indexOf(view);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m165c() {
        this.f80h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f80h) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f76d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f77e;
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
                if (this.f80h && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f76d + iMax2;
                iMax2 = 0;
            }
            if (this.f80h && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f77e;
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
                i3 = i3 + this.f76d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f77e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f76d = i;
    }

    public void setOnChildClick(InterfaceC0011a interfaceC0011a) {
    }

    public void setTags(final List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f78f) {
                xdl0.E0(view, new View.OnClickListener() { // from class: l.bo3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f2413a.m164b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f77e = i;
    }

    public BuzzFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BuzzFlowView(Context context) {
        this(context, null);
    }
}
