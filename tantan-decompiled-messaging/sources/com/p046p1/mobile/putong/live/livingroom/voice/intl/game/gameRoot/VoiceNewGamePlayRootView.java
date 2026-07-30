package com.p046p1.mobile.putong.live.livingroom.voice.intl.game.gameRoot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView;
import p147v.VLinear;
import p149l.u2o0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceNewGamePlayRootView extends VLinear {

    /* JADX INFO: renamed from: c */
    public UndercoverMainView f53144c;

    public VoiceNewGamePlayRootView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m78149P(View view) {
        u2o0.m191544a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78149P(this);
    }

    public VoiceNewGamePlayRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceNewGamePlayRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
