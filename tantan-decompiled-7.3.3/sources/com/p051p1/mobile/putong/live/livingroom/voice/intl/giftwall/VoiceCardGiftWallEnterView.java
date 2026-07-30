package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.z3n0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCardGiftWallEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f54008c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f54009d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f54010e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54011f;

    public VoiceCardGiftWallEnterView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m79345P(View view) {
        z3n0.m218489a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79345P(this);
    }

    public VoiceCardGiftWallEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceCardGiftWallEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
