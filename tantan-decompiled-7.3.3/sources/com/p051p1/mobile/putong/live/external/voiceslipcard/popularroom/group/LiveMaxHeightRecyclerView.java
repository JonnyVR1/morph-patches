package com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.jetbrains.annotations.NotNull;
import p151v.VRecyclerView;
import p153l.bnl0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f47402c;

    /* JADX INFO: renamed from: d */
    public boolean f47403d;

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f47402c = -1;
        this.f47403d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f47402c;
        return i > 0 ? i : bnl0.m105588w0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f47402c == -1 || !this.f47403d) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47402c = -1;
        this.f47403d = true;
    }

    public LiveMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47402c = -1;
        this.f47403d = true;
    }
}
