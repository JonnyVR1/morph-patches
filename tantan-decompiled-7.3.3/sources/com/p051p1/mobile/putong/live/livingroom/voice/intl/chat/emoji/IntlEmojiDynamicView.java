package com.p051p1.mobile.putong.live.livingroom.voice.intl.chat.emoji;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import p151v.VDraweeView;
import p153l.izs;
import p153l.wlj;

/* JADX INFO: loaded from: classes5.dex */
public class IntlEmojiDynamicView extends VDraweeView {
    public IntlEmojiDynamicView(Context context, wlj wljVar) {
        super(context, wljVar);
    }

    /* JADX INFO: renamed from: u */
    public void m79275u(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        if (bLiveVoiceEmojiMenuButton.icon.isEmpty()) {
            return;
        }
        izs.m142874y(this, bLiveVoiceEmojiMenuButton.icon.get(0));
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
