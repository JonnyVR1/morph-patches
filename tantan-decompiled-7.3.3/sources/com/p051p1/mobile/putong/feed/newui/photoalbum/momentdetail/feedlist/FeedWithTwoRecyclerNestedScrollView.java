package com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.api.Api;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedWithTwoRecyclerNestedScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: F */
    public int f42948F;

    /* JADX INFO: renamed from: G */
    public int f42949G;

    /* JADX INFO: renamed from: H */
    public FeedMaxHeightRecyclerView f42950H;

    /* JADX INFO: renamed from: I */
    public FeedMaxHeightRecyclerView f42951I;

    /* JADX INFO: renamed from: J */
    public boolean f42952J;

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context) {
        super(context);
        this.f42948F = -1;
        this.f42949G = -1;
        this.f42952J = true;
    }

    /* JADX INFO: renamed from: T */
    public void m66056T(ViewGroup viewGroup) {
        if (this.f42950H == null || this.f42951I == null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    if ("FIRST_RECYCLER_TAG".equals(childAt.getTag())) {
                        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = (FeedMaxHeightRecyclerView) childAt;
                        this.f42950H = feedMaxHeightRecyclerView;
                        feedMaxHeightRecyclerView.setMaxHeight(this.f42952J ? Api.BaseClientBuilder.API_PRIORITY_OTHER : this.f42949G);
                    } else if ("SECOND_RECYCLER_TAG".equals(childAt.getTag())) {
                        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView2 = (FeedMaxHeightRecyclerView) childAt;
                        this.f42951I = feedMaxHeightRecyclerView2;
                        bnl0.m105505C0(feedMaxHeightRecyclerView2, this.f42949G);
                    } else {
                        m66056T((ViewGroup) childAt);
                    }
                }
            }
        }
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f42949G = getMeasuredHeight();
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(@NonNull @NotNull View view, float f, float f2, boolean z) {
        return super.onNestedFling(view, f, f2, z);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(@NonNull @NotNull View view, float f, float f2) {
        return super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.ci20
    public void onNestedPreScroll(@NonNull @NotNull View view, int i, int i2, @NonNull @NotNull int[] iArr, int i3) {
        if (this.f42950H == null || this.f42951I == null) {
            m66056T(this);
        }
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView = this.f42950H;
        if (feedMaxHeightRecyclerView == null || this.f42951I == null) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        this.f42948F = feedMaxHeightRecyclerView.getHeight();
        FeedMaxHeightRecyclerView feedMaxHeightRecyclerView2 = this.f42950H;
        if (view == feedMaxHeightRecyclerView2) {
            boolean z = i2 > 0 && !feedMaxHeightRecyclerView2.canScrollVertically(1) && getScrollY() < this.f42948F;
            boolean z2 = i2 < 0 && getScrollY() > 0;
            if (z || z2) {
                scrollBy(0, i2);
                iArr[1] = i2;
            } else if (i2 > 0 && !this.f42950H.canScrollVertically(1)) {
                this.f42951I.scrollBy(0, i2);
                iArr[1] = i2;
            }
        } else {
            boolean z3 = i2 > 0 && getScrollY() < this.f42948F;
            boolean z4 = i2 < 0 && getScrollY() > 0 && !view.canScrollVertically(-1);
            if (z3 || z4) {
                scrollBy(0, i2);
                iArr[1] = i2;
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                this.f42950H.scrollBy(0, i2);
                iArr[1] = i2;
            }
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.di20
    public void onNestedScroll(@NonNull @NotNull View view, int i, int i2, int i3, int i4, int i5, @NonNull @NotNull int[] iArr) {
        super.onNestedScroll(view, i, i2, i3, i4, i5, iArr);
    }

    public void setFirstRecyclerUserIntegerMaxHeight(boolean z) {
        this.f42952J = z;
    }

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42948F = -1;
        this.f42949G = -1;
        this.f42952J = true;
    }

    public FeedWithTwoRecyclerNestedScrollView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42948F = -1;
        this.f42949G = -1;
        this.f42952J = true;
    }
}
