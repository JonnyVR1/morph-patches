package com.p046p1.mobile.putong.live.livingroom.voice.intl.chat.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import p147v.VDraweeView;
import p149l.djj;
import p149l.hxs;

/* JADX INFO: loaded from: classes5.dex */
public class IntlEmojiDynamicView extends VDraweeView {
    public IntlEmojiDynamicView(Context context, djj djjVar) {
        super(context, djjVar);
    }

    /* JADX INFO: renamed from: u */
    public void m78092u(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        if (bLiveVoiceEmojiMenuButton.icon.isEmpty()) {
            return;
        }
        hxs.m133412y(this, bLiveVoiceEmojiMenuButton.icon.get(0));
    }

    public IntlEmojiDynamicView(Context context) {
        super(context);
    }

    public IntlEmojiDynamicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlEmojiDynamicView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public IntlEmojiDynamicView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
