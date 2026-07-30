package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.jyb;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class FlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f34963a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f34964b;

    /* JADX INFO: renamed from: c */
    public final int f34965c;

    /* JADX INFO: renamed from: d */
    public int f34966d;

    /* JADX INFO: renamed from: e */
    public int f34967e;

    /* JADX INFO: renamed from: f */
    public boolean f34968f;

    /* JADX INFO: renamed from: g */
    public int f34969g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8906a f34970h;

    /* JADX INFO: renamed from: i */
    public int f34971i;

    /* JADX INFO: renamed from: j */
    public boolean f34972j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowView$a */
    public interface InterfaceC8906a {
        /* JADX INFO: renamed from: a */
        void mo51078a(View view, int i);
    }

    public FlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34965c = qa00.m175859d(8.0f);
        this.f34966d = qa00.m175859d(8.0f);
        this.f34967e = qa00.m175859d(8.0f);
        this.f34968f = false;
        this.f34969g = -1;
        this.f34971i = 0;
        this.f34972j = false;
        this.f34963a = context;
        this.f34964b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m54099b(List list, View view) {
        if (NullChecker.m82486a(this.f34970h)) {
            this.f34970h.mo51078a(view, list.indexOf(view));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f34972j) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f34966d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f34967e;
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
                if (this.f34972j && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f34966d + iMax2;
                iMax2 = 0;
            }
            if (this.f34972j && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f34967e;
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
                i3 = i3 + this.f34966d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f34967e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f34966d = i;
    }

    public void setOnChildClick(InterfaceC8906a interfaceC8906a) {
        this.f34970h = interfaceC8906a;
    }

    public void setTags(final List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f34968f) {
                bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.wvi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f190969a.m54099b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f34967e = i;
    }

    public FlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowView(Context context) {
        this(context, null);
    }
}
