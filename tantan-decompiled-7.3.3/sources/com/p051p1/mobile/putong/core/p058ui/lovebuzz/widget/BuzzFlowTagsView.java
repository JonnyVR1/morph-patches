package com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class BuzzFlowTagsView extends BuzzFlowView {

    /* JADX INFO: renamed from: i */
    public int f31028i;

    /* JADX INFO: renamed from: j */
    public View f31029j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzFlowTagsView$a */
    public interface InterfaceC8590a {
    }

    public BuzzFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31028i = -1;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.BuzzFlowView, android.view.View
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
                int i6 = this.f31028i;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m82486a(this.f31029j)) {
                        measureChild(this.f31029j, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f31029j.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f31029j.getMeasuredWidth()) - this.f31034e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f31029j.getParent();
                            if (NullChecker.m82486a(viewGroup)) {
                                viewGroup.removeView(this.f31029j);
                            }
                            addView(this.f31029j);
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
                iM175859d = iM175859d + this.f31033d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f31034e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM175859d + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC8590a interfaceC8590a) {
    }

    public void setEndView(View view) {
        this.f31029j = view;
    }

    public void setMaxLines(int i) {
        this.f31028i = i;
    }

    public BuzzFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BuzzFlowTagsView(Context context) {
        this(context, null);
    }
}
