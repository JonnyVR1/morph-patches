package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSuggestLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public List<List<View>> f22317a;

    /* JADX INFO: renamed from: b */
    public List<Integer> f22318b;

    public GroupSuggestLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22317a = new ArrayList();
        this.f22318b = new ArrayList();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f22317a.clear();
        this.f22318b.clear();
        int width = getWidth();
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int iMax = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredWidth + i5 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin > width) {
                this.f22318b.add(Integer.valueOf(iMax));
                this.f22317a.add(arrayList);
                iMax = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin + measuredHeight;
                arrayList = new ArrayList();
                i5 = 0;
            }
            i5 += measuredWidth + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            iMax = Math.max(iMax, measuredHeight + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            arrayList.add(childAt);
        }
        this.f22318b.add(Integer.valueOf(iMax));
        this.f22317a.add(arrayList);
        int size = this.f22317a.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            List<View> list = this.f22317a.get(i8);
            int iIntValue = this.f22318b.get(i8).intValue();
            int measuredWidth2 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                View view = list.get(i9);
                if (view.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i10 = marginLayoutParams2.leftMargin + measuredWidth2;
                    int i11 = marginLayoutParams2.topMargin + i7;
                    view.layout(i10, i11, view.getMeasuredWidth() + i10, view.getMeasuredHeight() + i11);
                    measuredWidth2 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                }
            }
            i7 += iIntValue;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int iMax = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            measureChild(childAt, i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i7 = size2;
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            int i8 = i4 + measuredWidth;
            if (i8 > size) {
                iMax = Math.max(iMax, i4);
                i6 += i5;
                i4 = measuredWidth;
            } else {
                measuredHeight = Math.max(i5, measuredHeight);
                i4 = i8;
            }
            i5 = measuredHeight;
            if (i3 == childCount - 1) {
                i6 += i5;
                iMax = Math.max(iMax, i4);
            }
            i3++;
            size2 = i7;
        }
        int i9 = size2;
        if (mode != 1073741824) {
            size = iMax;
        }
        setMeasuredDimension(size, mode2 == 1073741824 ? i9 : i6);
    }

    public GroupSuggestLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupSuggestLayout(Context context) {
        this(context, null);
    }
}
