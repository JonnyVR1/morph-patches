package com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p147v.VRecyclerView;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f46554c;

    /* JADX INFO: renamed from: d */
    public boolean f46555d;

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f46554c = -1;
        this.f46555d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f46554c;
        return i > 0 ? i : xdl0.m208408w0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f46554c == -1 || !this.f46555d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46554c = -1;
        this.f46555d = true;
    }

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46554c = -1;
        this.f46555d = true;
    }
}
