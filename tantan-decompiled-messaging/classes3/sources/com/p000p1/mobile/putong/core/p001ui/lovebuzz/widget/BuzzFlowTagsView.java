package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BuzzFlowTagsView extends BuzzFlowView {

    /* JADX INFO: renamed from: i */
    public int f71i;

    /* JADX INFO: renamed from: j */
    public View f72j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzFlowTagsView$a */
    public interface InterfaceC0010a {
    }

    public BuzzFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f71i = -1;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.BuzzFlowView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int measuredWidth = 0;
        int iMax = 0;
        int iD = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            if (childAt.getMeasuredWidth() + measuredWidth > size) {
                i4++;
                int i6 = this.f71i;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.a(this.f72j)) {
                        measureChild(this.f72j, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f72j.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f72j.getMeasuredWidth()) - this.f77e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f72j.getParent();
                            if (NullChecker.a(viewGroup)) {
                                viewGroup.removeView(this.f72j);
                            }
                            addView(this.f72j);
                        }
                    } else {
                        if (NullChecker.a((Object) null)) {
                            removeViews(i5, getChildCount() - i5);
                            throw null;
                        }
                        removeViews(i5, getChildCount() - i5);
                    }
                    iD += t100.d(4.0f);
                    break;
                }
                iD = iD + this.f76d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f77e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iD + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC0010a interfaceC0010a) {
    }

    public void setEndView(View view) {
        this.f72j = view;
    }

    public void setMaxLines(int i) {
        this.f71i = i;
    }

    public BuzzFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BuzzFlowTagsView(Context context) {
        this(context, null);
    }
}
