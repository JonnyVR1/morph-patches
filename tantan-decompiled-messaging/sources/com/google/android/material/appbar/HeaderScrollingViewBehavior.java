package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;
import p149l.gbl0;
import p149l.kex;
import p149l.u6k;
import p149l.y6q0;

/* JADX INFO: loaded from: classes7.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public HeaderScrollingViewBehavior() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    private static int resolveGravity(int i) {
        return i == 0 ? BadgeDrawable.TOP_START : i;
    }

    @Nullable
    public abstract View findFirstDependency(List<View> list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return kex.m145807b((int) (overlapRatioForOffset * i), 0, i);
    }

    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public int getScrollRange(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (viewFindFirstDependency == null) {
            super.layoutChild(coordinatorLayout, view, i);
            this.verticalLayoutGap = 0;
            return;
        }
        CoordinatorLayout.C0229f c0229f = (CoordinatorLayout.C0229f) view.getLayoutParams();
        Rect rect = this.tempRect1;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0229f).leftMargin, viewFindFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) c0229f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0229f).rightMargin, ((coordinatorLayout.getHeight() + viewFindFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0229f).bottomMargin);
        y6q0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && gbl0.m125222u(coordinatorLayout) && !gbl0.m125222u(view)) {
            rect.left += lastWindowInsets.m213183j();
            rect.right -= lastWindowInsets.m213184k();
        }
        Rect rect2 = this.tempRect2;
        u6k.m191980a(resolveGravity(c0229f.f1375c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int overlapPixelsForOffset = getOverlapPixelsForOffset(viewFindFirstDependency);
        view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
        this.verticalLayoutGap = rect2.top - viewFindFirstDependency.getBottom();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0226c
    public boolean onMeasureChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3, int i4) {
        View viewFindFirstDependency;
        y6q0 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewFindFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (gbl0.m125222u(viewFindFirstDependency) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.m213185l() + lastWindowInsets.m213182i();
        }
        int scrollRange = size + getScrollRange(viewFindFirstDependency);
        int measuredHeight = viewFindFirstDependency.getMeasuredHeight();
        if (shouldHeaderOverlapScrollingChild()) {
            view.setTranslationY(-measuredHeight);
        } else {
            scrollRange -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i, i2, View.MeasureSpec.makeMeasureSpec(scrollRange, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
