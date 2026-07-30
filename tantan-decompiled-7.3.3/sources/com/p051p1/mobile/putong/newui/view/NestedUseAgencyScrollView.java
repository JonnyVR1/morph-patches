package com.p051p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import p153l.xh20;

/* JADX INFO: loaded from: classes10.dex */
public class NestedUseAgencyScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: F */
    public xh20 f55011F;

    public NestedUseAgencyScrollView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public void m80341T(xh20 xh20Var) {
        this.f55011F = xh20Var;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        xh20 xh20Var = this.f55011F;
        return xh20Var != null ? xh20Var.onNestedFling(view, f, f2, z) : super.onNestedFling(view, f, f2, z);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public boolean onNestedPreFling(View view, float f, float f2) {
        xh20 xh20Var = this.f55011F;
        return xh20Var != null ? xh20Var.onNestedPreFling(view, f, f2) : super.onNestedPreFling(view, f, f2);
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.ci20
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        xh20 xh20Var = this.f55011F;
        if (xh20Var != null) {
            xh20Var.onNestedPreScroll(view, i, i2, iArr, i3);
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, p153l.ei20
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        xh20 xh20Var = this.f55011F;
        if (xh20Var != null) {
            xh20Var.onNestedScroll(view, i, i2, i3, i4);
        } else {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.core.widget.NestedScrollView, p153l.ci20
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        xh20 xh20Var = this.f55011F;
        return xh20Var != null ? xh20Var.onStartNestedScroll(view, view2, i, i2) : super.onStartNestedScroll(view, view2, i, i2);
    }

    public NestedUseAgencyScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedUseAgencyScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
