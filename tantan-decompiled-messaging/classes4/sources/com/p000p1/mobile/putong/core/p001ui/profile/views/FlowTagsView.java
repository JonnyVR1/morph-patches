package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f1934k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0167a f1935l;

    /* JADX INFO: renamed from: m */
    public View f1936m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowTagsView$a */
    public interface InterfaceC0167a {
        /* JADX INFO: renamed from: a */
        void mo3469a();
    }

    public FlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1934k = -1;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView, android.view.View
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
                int i6 = this.f1934k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.a(this.f1936m)) {
                        measureChild(this.f1936m, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f1936m.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f1936m.getMeasuredWidth()) - this.f1941e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f1936m.getParent();
                            if (NullChecker.a(viewGroup)) {
                                viewGroup.removeView(this.f1936m);
                            }
                            addView(this.f1936m);
                        }
                    } else if (NullChecker.a(this.f1935l)) {
                        removeViews(i5, getChildCount() - i5);
                        this.f1935l.mo3469a();
                    } else {
                        removeViews(i5, getChildCount() - i5);
                    }
                    iD += t100.d(4.0f);
                    break;
                }
                iD = iD + this.f1940d + iMax;
                measuredWidth = 0;
                iMax = 0;
            }
            measuredWidth = measuredWidth + childAt.getMeasuredWidth() + this.f1941e;
            iMax = Math.max(childAt.getMeasuredHeight(), iMax);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), iD + iMax + getPaddingTop() + getPaddingBottom());
    }

    public void setCallBack(InterfaceC0167a interfaceC0167a) {
        this.f1935l = interfaceC0167a;
    }

    public void setEndView(View view) {
        this.f1936m = view;
    }

    public void setMaxLines(int i) {
        this.f1934k = i;
    }

    public FlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowTagsView(Context context) {
        this(context, null);
    }
}
