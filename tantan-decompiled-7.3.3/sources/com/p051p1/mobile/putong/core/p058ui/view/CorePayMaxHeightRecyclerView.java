package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p153l.bnl0;

/* JADX INFO: loaded from: classes12.dex */
public class CorePayMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f37580c;

    /* JADX INFO: renamed from: d */
    public boolean f37581d;

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f37580c = -1;
        this.f37581d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f37580c;
        return i > 0 ? i : bnl0.m105588w0();
    }

    public int getMaxHeight() {
        return this.f37580c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f37580c == -1 || !this.f37581d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public void setMaxHeight(int i) {
        this.f37580c = i;
        requestLayout();
        invalidate();
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37580c = -1;
        this.f37581d = true;
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37580c = -1;
        this.f37581d = true;
    }
}
