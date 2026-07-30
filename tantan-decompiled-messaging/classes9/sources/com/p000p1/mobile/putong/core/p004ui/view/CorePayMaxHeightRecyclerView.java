package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CorePayMaxHeightRecyclerView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public int f6513c;

    /* JADX INFO: renamed from: d */
    public boolean f6514d;

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context) {
        super(context);
        this.f6513c = -1;
        this.f6514d = true;
    }

    private int getAvailableMaxHeight() {
        int i = this.f6513c;
        return i > 0 ? i : xdl0.w0();
    }

    public int getMaxHeight() {
        return this.f6513c;
    }

    public void onMeasure(int i, int i2) {
        if (this.f6513c == -1 || !this.f6514d) {
            super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, i2);
        } else {
            super/*androidx.recyclerview.widget.RecyclerView*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getAvailableMaxHeight(), Integer.MIN_VALUE));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setMaxHeight(int i) {
        this.f6513c = i;
        requestLayout();
        invalidate();
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6513c = -1;
        this.f6514d = true;
    }

    public CorePayMaxHeightRecyclerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6513c = -1;
        this.f6514d = true;
    }
}
