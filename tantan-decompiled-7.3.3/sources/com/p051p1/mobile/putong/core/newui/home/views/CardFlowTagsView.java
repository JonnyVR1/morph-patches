package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class CardFlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f24334k;

    /* JADX INFO: renamed from: l */
    public View f24335l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardFlowTagsView$a */
    public interface InterfaceC8193a {
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24334k = -1;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView, android.view.View
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
                int i6 = this.f24334k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m82486a(this.f24335l)) {
                        measureChild(this.f24335l, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f24335l.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f24335l.getMeasuredWidth()) - this.f34967e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f24335l.getParent();
                            if (NullChecker.m82486a(viewGroup)) {
                                viewGroup.removeView(this.f24335l);
                            }
                            addView(this.f24335l);
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
                iM175859d = iM175859d + this.f34966d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f34967e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iM175859d + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC8193a interfaceC8193a) {
    }

    public void setEndView(View view) {
        this.f24335l = view;
    }

    public void setMaxLines(int i) {
        this.f24334k = i;
    }

    public CardFlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardFlowTagsView(Context context) {
        this(context, null);
    }
}
