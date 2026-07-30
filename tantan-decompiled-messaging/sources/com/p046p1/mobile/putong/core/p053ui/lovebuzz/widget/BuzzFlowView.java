package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

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

/* JADX INFO: loaded from: classes3.dex */
public class BuzzFlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f30182a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f30183b;

    /* JADX INFO: renamed from: c */
    public final int f30184c;

    /* JADX INFO: renamed from: d */
    public int f30185d;

    /* JADX INFO: renamed from: e */
    public int f30186e;

    /* JADX INFO: renamed from: f */
    public boolean f30187f;

    /* JADX INFO: renamed from: g */
    public int f30188g;

    /* JADX INFO: renamed from: h */
    public boolean f30189h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzFlowView$a */
    public interface InterfaceC8428a {
    }

    public BuzzFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30184c = t100.m186890d(8.0f);
        this.f30185d = t100.m186890d(8.0f);
        this.f30186e = t100.m186890d(8.0f);
        this.f30187f = false;
        this.f30188g = -1;
        this.f30189h = false;
        this.f30182a = context;
        this.f30183b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m47139b(List list, View view) {
        if (NullChecker.m81303a(null)) {
            list.indexOf(view);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m47140c() {
        this.f30189h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f30189h) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f30185d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f30186e;
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
                if (this.f30189h && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f30185d + iMax2;
                iMax2 = 0;
            }
            if (this.f30189h && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f30186e;
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
                i3 = i3 + this.f30185d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f30186e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f30185d = i;
    }

    public void setOnChildClick(InterfaceC8428a interfaceC8428a) {
    }

    public void setTags(final List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f30187f) {
                xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.bo3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f76477a.m47139b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f30186e = i;
    }

    public BuzzFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BuzzFlowView(Context context) {
        this(context, null);
    }
}
