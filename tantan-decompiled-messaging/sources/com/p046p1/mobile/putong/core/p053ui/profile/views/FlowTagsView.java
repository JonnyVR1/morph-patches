package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class FlowTagsView extends FlowView {

    /* JADX INFO: renamed from: k */
    public int f34112k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8742a f34113l;

    /* JADX INFO: renamed from: m */
    public View f34114m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.views.FlowTagsView$a */
    public interface InterfaceC8742a {
        /* JADX INFO: renamed from: a */
        void mo52914a();
    }

    public FlowTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34112k = -1;
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
                int i6 = this.f34112k;
                if (i6 > 0 && i4 > i6) {
                    if (NullChecker.m81303a(this.f34114m)) {
                        measureChild(this.f34114m, i, i2);
                        int i7 = i5 - 1;
                        if (i7 >= 0 && i7 < getChildCount()) {
                            if ((measuredWidth - getChildAt(i7).getMeasuredWidth()) + this.f34114m.getMeasuredWidth() > size && (i3 = i5 - 2) >= 0 && i3 < getChildCount()) {
                                View childAt2 = getChildAt(i3);
                                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                                layoutParams.width = (size - this.f34114m.getMeasuredWidth()) - this.f34119e;
                                childAt2.setLayoutParams(layoutParams);
                            }
                            removeViews(i7, (getChildCount() - i5) + 1);
                            ViewGroup viewGroup = (ViewGroup) this.f34114m.getParent();
                            if (NullChecker.m81303a(viewGroup)) {
                                viewGroup.removeView(this.f34114m);
                            }
                            addView(this.f34114m);
                        }
                    } else if (NullChecker.m81303a(this.f34113l)) {
                        removeViews(i5, getChildCount() - i5);
                        this.f34113l.mo52914a();
                    } else {
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

    public void setCallBack(InterfaceC8742a interfaceC8742a) {
        this.f34113l = interfaceC8742a;
    }

    public void setEndView(View view) {
        this.f34114m = view;
    }

    public void setMaxLines(int i) {
        this.f34112k = i;
    }

    public FlowTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowTagsView(Context context) {
        this(context, null);
    }
}
