package com.p051p1.mobile.putong.live.livingroom.voice.intl.game.gameRoot;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView;
import p151v.VLinear;
import p153l.ybo0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceNewGamePlayRootView extends VLinear {

    /* JADX INFO: renamed from: c */
    public UndercoverMainView f53992c;

    public VoiceNewGamePlayRootView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m79332P(View view) {
        ybo0.m215103a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79332P(this);
    }

    public VoiceNewGamePlayRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceNewGamePlayRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
