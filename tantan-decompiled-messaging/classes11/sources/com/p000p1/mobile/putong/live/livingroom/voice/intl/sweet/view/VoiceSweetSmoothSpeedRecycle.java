package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetSmoothSpeedRecycle extends RecyclerView {
    public VoiceSweetSmoothSpeedRecycle(Context context) {
        super(context);
    }

    public boolean fling(int i, int i2) {
        return super.fling((int) (i * 0.5f), i2);
    }

    public VoiceSweetSmoothSpeedRecycle(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetSmoothSpeedRecycle(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
