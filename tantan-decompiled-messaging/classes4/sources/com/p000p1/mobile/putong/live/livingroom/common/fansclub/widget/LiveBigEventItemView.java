package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p002l.zwr;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveBigEventItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f5107a;

    /* JADX INFO: renamed from: b */
    public VText f5108b;

    /* JADX INFO: renamed from: c */
    public VText f5109c;

    public LiveBigEventItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m6418a(View view) {
        zwr.m27676a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6418a(this);
    }

    public LiveBigEventItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveBigEventItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
