package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ImFlowTagsView extends ImFlowView {

    /* JADX INFO: renamed from: i */
    public int f6541i;

    /* JADX INFO: renamed from: j */
    public View f6542j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.ImFlowTagsView$a */
    public interface InterfaceC0363a {
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6541i = -1;
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.view.ImFlowView, android.view.View
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
                int i6 = this.f6541i;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.a(this.f6542j)) {
                        measureChild(this.f6542j, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f6542j.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f6542j.getMeasuredWidth()) - this.f6547e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f6542j.getParent();
                            if (NullChecker.a(viewGroup)) {
                                viewGroup.removeView(this.f6542j);
                            }
                            addView(this.f6542j);
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
                iD = iD + this.f6546d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f6547e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iD + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC0363a interfaceC0363a) {
    }

    public void setEndView(View view) {
        this.f6542j = view;
    }

    public void setMaxLines(int i) {
        this.f6541i = i;
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImFlowTagsView(Context context) {
        this(context, null);
    }
}
