package com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedWithTwoRecyclerNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: F */
    public int f3561F;

    /* JADX INFO: renamed from: G */
    public int f3562G;

    /* JADX INFO: renamed from: H */
    public FeedMaxHeightRecyclerView f3563H;

    /* JADX INFO: renamed from: I */
    public FeedMaxHeightRecyclerView f3564I;

    /* JADX INFO: renamed from: J */
    public boolean f3565J;

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context) {
        super(context);
        this.f3561F = -1;
        this.f3562G = -1;
        this.f3565J = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView] */
    /* JADX INFO: renamed from: T */
    public void m5972T(ViewGroup viewGroup) {
        if (this.f3563H == null || this.f3564I == null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    if ("FIRST_RECYCLER_TAG".equals(childAt.getTag())) {
                        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = (FeedMaxHeightRecyclerView) childAt;
                        this.f3563H = feedMaxHeightRecyclerView;
                        feedMaxHeightRecyclerView.setMaxHeight(this.f3565J ? Integer.MAX_VALUE : this.f3562G);
                    } else if ("SECOND_RECYCLER_TAG".equals(childAt.getTag())) {
                        ?? r1 = (FeedMaxHeightRecyclerView) childAt;
                        this.f3564I = r1;
                        xdl0.C0((View) r1, this.f3562G);
                    } else {
                        m5972T((ViewGroup) childAt);
                    }
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f3562G = getMeasuredHeight();
    }

    public boolean onNestedFling(@NonNull @NotNull View view, float f, float f2, boolean z) {
        return super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(@NonNull @NotNull View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNestedPreScroll(@NonNull @NotNull View view, int i, int i2, @NonNull @NotNull int[] iArr, int i3) {
        if (this.f3563H == null || this.f3564I == null) {
            m5972T(this);
        }
        VRecyclerView vRecyclerView = this.f3563H;
        if (vRecyclerView == null || this.f3564I == null) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        this.f3561F = vRecyclerView.getHeight();
        VRecyclerView vRecyclerView2 = this.f3563H;
        if (view == vRecyclerView2) {
            boolean z = i2 > 0 && !vRecyclerView2.canScrollVertically(1) && getScrollY() < this.f3561F;
            boolean z2 = i2 < 0 && getScrollY() > 0;
            if (z || z2) {
                scrollBy(0, i2);
                iArr[1] = i2;
            } else if (i2 > 0 && !this.f3563H.canScrollVertically(1)) {
                this.f3564I.scrollBy(0, i2);
                iArr[1] = i2;
            }
        } else {
            boolean z3 = i2 > 0 && getScrollY() < this.f3561F;
            boolean z4 = i2 < 0 && getScrollY() > 0 && !view.canScrollVertically(-1);
            if (z3 || z4) {
                scrollBy(0, i2);
                iArr[1] = i2;
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                this.f3563H.scrollBy(0, i2);
                iArr[1] = i2;
            }
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    public void onNestedScroll(@NonNull @NotNull View view, int i, int i2, int i3, int i4, int i5, @NonNull @NotNull int[] iArr) {
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }

    public void setFirstRecyclerUserIntegerMaxHeight(boolean z) {
        this.f3565J = z;
    }

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3561F = -1;
        this.f3562G = -1;
        this.f3565J = true;
    }

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3561F = -1;
        this.f3562G = -1;
        this.f3565J = true;
    }
}
