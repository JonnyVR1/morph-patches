package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class FlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f34115a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f34116b;

    /* JADX INFO: renamed from: c */
    public final int f34117c;

    /* JADX INFO: renamed from: d */
    public int f34118d;

    /* JADX INFO: renamed from: e */
    public int f34119e;

    /* JADX INFO: renamed from: f */
    public boolean f34120f;

    /* JADX INFO: renamed from: g */
    public int f34121g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8743a f34122h;

    /* JADX INFO: renamed from: i */
    public int f34123i;

    /* JADX INFO: renamed from: j */
    public boolean f34124j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowView$a */
    public interface InterfaceC8743a {
        /* JADX INFO: renamed from: a */
        void mo49895a(View view, int i);
    }

    public FlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34117c = t100.m186890d(8.0f);
        this.f34118d = t100.m186890d(8.0f);
        this.f34119e = t100.m186890d(8.0f);
        this.f34120f = false;
        this.f34121g = -1;
        this.f34123i = 0;
        this.f34124j = false;
        this.f34115a = context;
        this.f34116b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m52916b(List list, View view) {
        if (NullChecker.m81303a(this.f34122h)) {
            this.f34122h.mo49895a(view, list.indexOf(view));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f34124j) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f34118d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f34119e;
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
                if (this.f34124j && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f34118d + iMax2;
                iMax2 = 0;
            }
            if (this.f34124j && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f34119e;
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
                i3 = i3 + this.f34118d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f34119e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f34118d = i;
    }

    public void setOnChildClick(InterfaceC8743a interfaceC8743a) {
        this.f34122h = interfaceC8743a;
    }

    public void setTags(final List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f34120f) {
                xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ati
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f71614a.m52916b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f34119e = i;
    }

    public FlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowView(Context context) {
        this(context, null);
    }
}
