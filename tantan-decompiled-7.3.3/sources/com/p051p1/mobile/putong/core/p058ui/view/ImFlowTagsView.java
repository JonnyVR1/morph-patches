package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class ImFlowTagsView extends ImFlowView {

    /* JADX INFO: renamed from: i */
    public int f37608i;

    /* JADX INFO: renamed from: j */
    public View f37609j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.ImFlowTagsView$a */
    public interface InterfaceC9090a {
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37608i = -1;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.view.ImFlowView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int measuredWidth = 0;
        int iMax = 0;
        int iM175859d = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            if (childAt.getMeasuredWidth() + measuredWidth > size) {
                i4++;
                int i6 = this.f37608i;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m82486a(this.f37609j)) {
                        measureChild(this.f37609j, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f37609j.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f37609j.getMeasuredWidth()) - this.f37614e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f37609j.getParent();
                            if (NullChecker.m82486a(viewGroup)) {
                                viewGroup.removeView(this.f37609j);
                            }
                            addView(this.f37609j);
                        }
                    } else {
                        if (NullChecker.m82486a(null)) {
                            removeViews(i5, getChildCount() - i5);
                            throw null;
                        }
                        removeViews(i5, getChildCount() - i5);
                    }
                    iM175859d += qa00.m175859d(4.0f);
                    break;
                }
                iM175859d = iM175859d + this.f37613d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f37614e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM175859d + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC9090a interfaceC9090a) {
    }

    public void setEndView(View view) {
        this.f37609j = view;
    }

    public void setMaxLines(int i) {
        this.f37608i = i;
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImFlowTagsView(Context context) {
        this(context, null);
    }
}
