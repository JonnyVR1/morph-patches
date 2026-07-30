package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.zwr;

/* JADX INFO: loaded from: classes4.dex */
public class LiveBigEventItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f49065a;

    /* JADX INFO: renamed from: b */
    public VText f49066b;

    /* JADX INFO: renamed from: c */
    public VText f49067c;

    public LiveBigEventItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72899a(View view) {
        zwr.m220686a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72899a(this);
    }

    public LiveBigEventItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveBigEventItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
