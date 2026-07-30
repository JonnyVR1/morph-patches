package com.p000p1.mobile.putong.core.p001ui.profile.views;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f1937a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f1938b;

    /* JADX INFO: renamed from: c */
    public final int f1939c;

    /* JADX INFO: renamed from: d */
    public int f1940d;

    /* JADX INFO: renamed from: e */
    public int f1941e;

    /* JADX INFO: renamed from: f */
    public boolean f1942f;

    /* JADX INFO: renamed from: g */
    public int f1943g;

    /* JADX INFO: renamed from: h */
    public InterfaceC0168a f1944h;

    /* JADX INFO: renamed from: i */
    public int f1945i;

    /* JADX INFO: renamed from: j */
    public boolean f1946j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowView$a */
    public interface InterfaceC0168a {
        /* JADX INFO: renamed from: a */
        void mo317a(View view, int i);
    }

    public FlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1939c = t100.d(8.0f);
        this.f1940d = t100.d(8.0f);
        this.f1941e = t100.d(8.0f);
        this.f1942f = false;
        this.f1943g = -1;
        this.f1945i = 0;
        this.f1946j = false;
        this.f1937a = context;
        this.f1938b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m3471b(List list, View view) {
        if (NullChecker.a(this.f1944h)) {
            this.f1944h.mo317a(view, list.indexOf(view));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f1946j) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f1940d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f1941e;
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
                if (this.f1946j && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f1940d + iMax2;
                iMax2 = 0;
            }
            if (this.f1946j && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f1941e;
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
                i3 = i3 + this.f1940d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f1941e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f1940d = i;
    }

    public void setOnChildClick(InterfaceC0168a interfaceC0168a) {
        this.f1944h = interfaceC0168a;
    }

    public void setTags(final List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f1942f) {
                xdl0.E0(view, new View.OnClickListener() { // from class: l.ati
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f7880a.m3471b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f1941e = i;
    }

    public FlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowView(Context context) {
        this(context, null);
    }
}
