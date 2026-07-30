package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class CardFlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f23592k;

    /* JADX INFO: renamed from: l */
    public View f23593l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardFlowTagsView$a */
    public interface InterfaceC8042a {
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23592k = -1;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView, android.view.View
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
                int i6 = this.f23592k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m81303a(this.f23593l)) {
                        measureChild(this.f23593l, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f23593l.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f23593l.getMeasuredWidth()) - this.f34119e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f23593l.getParent();
                            if (NullChecker.m81303a(viewGroup)) {
                                viewGroup.removeView(this.f23593l);
                            }
                            addView(this.f23593l);
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
                iM186890d = iM186890d + this.f34118d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f34119e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM186890d + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC8042a interfaceC8042a) {
    }

    public void setEndView(View view) {
        this.f23593l = view;
    }

    public void setMaxLines(int i) {
        this.f23592k = i;
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFlowTagsView(Context context) {
        this(context, null);
    }
}
