package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.vum0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCardGiftWallEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f53160c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53161d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53162e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53163f;

    public VoiceCardGiftWallEnterView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m78162P(View view) {
        vum0.m200086a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78162P(this);
    }

    public VoiceCardGiftWallEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceCardGiftWallEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
