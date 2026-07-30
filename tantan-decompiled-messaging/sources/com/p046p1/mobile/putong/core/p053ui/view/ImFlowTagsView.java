package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class ImFlowTagsView extends ImFlowView {

    /* JADX INFO: renamed from: i */
    public int f36760i;

    /* JADX INFO: renamed from: j */
    public View f36761j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.view.ImFlowTagsView$a */
    public interface InterfaceC8927a {
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36760i = -1;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.view.ImFlowView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int childCount = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int measuredWidth = 0;
        int iMax = 0;
        int iM186890d = 0;
        int i4 = 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            if (childAt.getMeasuredWidth() + measuredWidth > size) {
                i4++;
                int i6 = this.f36760i;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m81303a(this.f36761j)) {
                        measureChild(this.f36761j, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f36761j.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f36761j.getMeasuredWidth()) - this.f36766e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f36761j.getParent();
                            if (NullChecker.m81303a(viewGroup)) {
                                viewGroup.removeView(this.f36761j);
                            }
                            addView(this.f36761j);
                        }
                    } else {
                        if (NullChecker.m81303a(null)) {
                            removeViews(i5, getChildCount() - i5);
                            throw null;
                        }
                        removeViews(i5, getChildCount() - i5);
                    }
                    iM186890d += t100.m186890d(4.0f);
                    break;
                }
                iM186890d = iM186890d + this.f36765d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f36766e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM186890d + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC8927a interfaceC8927a) {
    }

    public void setEndView(View view) {
        this.f36761j = view;
    }

    public void setMaxLines(int i) {
        this.f36760i = i;
    }

    public ImFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImFlowTagsView(Context context) {
        this(context, null);
    }
}
