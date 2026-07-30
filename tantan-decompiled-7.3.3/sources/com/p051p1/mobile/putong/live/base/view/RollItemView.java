package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.nsv;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RollItemView<T> extends FrameLayout {
    public RollItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo70019a(nsv<T> nsvVar);

    public RollItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
