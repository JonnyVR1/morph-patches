package com.p051p1.mobile.putong.live.livingroom.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.orw;

/* JADX INFO: loaded from: classes5.dex */
public class MagicGestureListItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f52909c;

    /* JADX INFO: renamed from: d */
    public VText f52910d;

    public MagicGestureListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m77784P(View view) {
        orw.m168942a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77784P(this);
    }

    public MagicGestureListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MagicGestureListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
