package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class FlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f34960k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8905a f34961l;

    /* JADX INFO: renamed from: m */
    public View f34962m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowTagsView$a */
    public interface InterfaceC8905a {
        /* JADX INFO: renamed from: a */
        void mo54097a();
    }

    public FlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34960k = -1;
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
                int i6 = this.f34960k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m82486a(this.f34962m)) {
                        measureChild(this.f34962m, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f34962m.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f34962m.getMeasuredWidth()) - this.f34967e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f34962m.getParent();
                            if (NullChecker.m82486a(viewGroup)) {
                                viewGroup.removeView(this.f34962m);
                            }
                            addView(this.f34962m);
                        }
                    } else if (NullChecker.m82486a(this.f34961l)) {
                        removeViews(i5, getChildCount() - i5);
                        this.f34961l.mo54097a();
                    } else {
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

    public void setCallBack(InterfaceC8905a interfaceC8905a) {
        this.f34961l = interfaceC8905a;
    }

    public void setEndView(View view) {
        this.f34962m = view;
    }

    public void setMaxLines(int i) {
        this.f34960k = i;
    }

    public FlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowTagsView(Context context) {
        this(context, null);
    }
}
