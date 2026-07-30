package com.p051p1.mobile.putong.feed.newui.photoalbum.attitude.participant;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p153l.zh20;

/* JADX INFO: loaded from: classes13.dex */
public class BottomSheetNestedProxyView extends FrameLayout implements zh20 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f42279a;

    public BottomSheetNestedProxyView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.canScrollVertically(i) : recyclerView.canScrollVertically(i);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.dispatchNestedFling(f, f2, z) : recyclerView.dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.dispatchNestedPreFling(f, f2) : recyclerView.dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, @Nullable int[] iArr, @Nullable int[] iArr2) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.dispatchNestedPreScroll(i, i2, iArr, iArr2) : recyclerView.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @Nullable int[] iArr) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.dispatchNestedScroll(i, i2, i3, i4, iArr) : recyclerView.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.hasNestedScrollingParent() : recyclerView.hasNestedScrollingParent();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return true;
    }

    public void setRealNestedScrollView(RecyclerView recyclerView) {
        this.f42279a = recyclerView;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        RecyclerView recyclerView = this.f42279a;
        return recyclerView == null ? super.startNestedScroll(i) : recyclerView.startNestedScroll(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        RecyclerView recyclerView = this.f42279a;
        if (recyclerView == null) {
            super.stopNestedScroll();
        } else {
            recyclerView.stopNestedScroll();
        }
    }

    public BottomSheetNestedProxyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomSheetNestedProxyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomSheetNestedProxyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // p153l.zh20
    public void stopNestedScroll(int i) {
        RecyclerView recyclerView = this.f42279a;
        if (recyclerView == null) {
            return;
        }
        recyclerView.stopNestedScroll(i);
    }
}
