package com.p051p1.mobile.putong.core.p058ui.view;

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

/* JADX INFO: loaded from: classes12.dex */
public class ImFlowView extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public Context f37610a;

    /* JADX INFO: renamed from: b */
    public AttributeSet f37611b;

    /* JADX INFO: renamed from: c */
    public final int f37612c;

    /* JADX INFO: renamed from: d */
    public int f37613d;

    /* JADX INFO: renamed from: e */
    public int f37614e;

    /* JADX INFO: renamed from: f */
    public boolean f37615f;

    /* JADX INFO: renamed from: g */
    public int f37616g;

    /* JADX INFO: renamed from: h */
    public boolean f37617h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.ImFlowView$a */
    public interface InterfaceC9091a {
    }

    public ImFlowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37612c = qa00.m175859d(8.0f);
        this.f37613d = qa00.m175859d(8.0f);
        this.f37614e = qa00.m175859d(8.0f);
        this.f37615f = false;
        this.f37616g = -1;
        this.f37617h = false;
        this.f37610a = context;
        this.f37611b = attributeSet;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m57299b(List list, View view) {
        if (NullChecker.m82486a(null)) {
            list.indexOf(view);
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m57300c() {
        this.f37617h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        ArrayList arrayList = new ArrayList();
        if (this.f37617h) {
            int measuredWidth = 0;
            int iMax = 0;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (i5 < childAt.getMeasuredWidth() + paddingLeft + getPaddingRight()) {
                    arrayList.add(Integer.valueOf(((i5 - measuredWidth) - getPaddingRight()) / 2));
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f37613d + iMax;
                    iMax = 0;
                }
                measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f37614e;
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
                if (this.f37617h && i7 < arrayList.size()) {
                    paddingLeft += ((Integer) arrayList.get(i7)).intValue();
                }
                paddingTop = paddingTop + this.f37613d + iMax2;
                iMax2 = 0;
            }
            if (this.f37617h && i8 == 0) {
                paddingLeft += ((Integer) arrayList.get(i7)).intValue();
            }
            childAt2.layout(paddingLeft, paddingTop, childAt2.getMeasuredWidth() + paddingLeft, childAt2.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + childAt2.getMeasuredWidth() + this.f37614e;
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
                i3 = i3 + this.f37613d + iMax;
                iMax = 0;
                measuredWidth = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f37614e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), i3 + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setHeightLineSpace(int i) {
        this.f37613d = i;
    }

    public void setOnChildClick(InterfaceC9091a interfaceC9091a) {
    }

    public void setTags(final List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        removeAllViews();
        for (View view : list) {
            addView(view);
            if (this.f37615f) {
                bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.fgm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f98953a.m57299b(list, view2);
                    }
                });
            }
        }
        requestLayout();
    }

    public void setWidthSpace(int i) {
        this.f37614e = i;
    }

    public ImFlowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImFlowView(Context context) {
        this(context, null);
    }
}
