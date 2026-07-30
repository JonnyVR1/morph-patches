package com.p046p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.pow;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureListItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f52061c;

    /* JADX INFO: renamed from: d */
    public VText f52062d;

    public MagicGestureListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m76601P(View view) {
        pow.m170642a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76601P(this);
    }

    public MagicGestureListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
