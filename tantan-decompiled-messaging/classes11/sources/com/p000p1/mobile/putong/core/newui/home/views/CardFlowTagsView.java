package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.views.FlowView;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardFlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f2370k;

    /* JADX INFO: renamed from: l */
    public View f2371l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardFlowTagsView$a */
    public interface InterfaceC0206a {
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2370k = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
                int i6 = this.f2370k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.a(this.f2371l)) {
                        measureChild(this.f2371l, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f2371l.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f2371l.getMeasuredWidth()) - ((FlowView) this).e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f2371l.getParent();
                            if (NullChecker.a(viewGroup)) {
                                viewGroup.removeView(this.f2371l);
                            }
                            addView(this.f2371l);
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
                iD = iD + ((FlowView) this).d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + ((FlowView) this).e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iD + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC0206a interfaceC0206a) {
    }

    public void setEndView(View view) {
        this.f2371l = view;
    }

    public void setMaxLines(int i) {
        this.f2370k = i;
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFlowTagsView(Context context) {
        this(context, null);
    }
}
