package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class CorePayMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f36732c;

    /* JADX INFO: renamed from: d */
    public boolean f36733d;

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f36732c = -1;
        this.f36733d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f36732c;
        return i > 0 ? i : xdl0.m208408w0();
    }

    public int getMaxHeight() {
        return this.f36732c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f36732c == -1 || !this.f36733d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public void setMaxHeight(int i) {
        this.f36732c = i;
        requestLayout();
        invalidate();
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36732c = -1;
        this.f36733d = true;
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36732c = -1;
        this.f36733d = true;
    }
}
