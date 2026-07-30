package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.mqv;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RollItemView<T> extends FrameLayout {
    public RollItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo68836a(mqv<T> mqvVar);

    public RollItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
