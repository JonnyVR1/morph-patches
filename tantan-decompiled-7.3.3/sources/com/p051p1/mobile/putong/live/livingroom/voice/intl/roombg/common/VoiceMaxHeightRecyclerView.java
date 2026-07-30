package com.p051p1.mobile.putong.live.livingroom.voice.intl.roombg.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p153l.bnl0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceMaxHeightRecyclerView extends RecyclerView {
    public VoiceMaxHeightRecyclerView(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((((((int) ((bnl0.m105592y0() - qa00.m175859d(54.0f)) / 3.0f)) * 140.0f) / 107.0f) * 2.5f) + qa00.m175859d(17.5f)), Integer.MIN_VALUE));
    }

    public VoiceMaxHeightRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMaxHeightRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
