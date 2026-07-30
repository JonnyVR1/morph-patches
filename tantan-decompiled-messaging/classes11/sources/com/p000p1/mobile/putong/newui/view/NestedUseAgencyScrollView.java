package com.p000p1.mobile.putong.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import p009l.p920;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NestedUseAgencyScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: F */
    public p920 f7769F;

    public NestedUseAgencyScrollView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    public void m9477T(p920 p920Var) {
        this.f7769F = p920Var;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        p920 p920Var = this.f7769F;
        return p920Var != null ? p920Var.onNestedFling(view, f, f2, z) : super.onNestedFling(view, f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        p920 p920Var = this.f7769F;
        return p920Var != null ? p920Var.onNestedPreFling(view, f, f2) : super.onNestedPreFling(view, f, f2);
    }

    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        p920 p920Var = this.f7769F;
        if (p920Var != null) {
            p920Var.onNestedPreScroll(view, i, i2, iArr, i3);
        }
        super.onNestedPreScroll(view, i, i2, iArr, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        p920 p920Var = this.f7769F;
        if (p920Var != null) {
            p920Var.onNestedScroll(view, i, i2, i3, i4);
        } else {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        p920 p920Var = this.f7769F;
        return p920Var != null ? p920Var.onStartNestedScroll(view, view2, i, i2) : super.onStartNestedScroll(view, view2, i, i2);
    }

    public NestedUseAgencyScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedUseAgencyScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
