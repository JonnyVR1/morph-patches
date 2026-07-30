package com.p046p1.mobile.putong.live.livingroom.voice.intl.chat.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.g5c0;
import p149l.hxs;

/* JADX INFO: loaded from: classes5.dex */
public class IntlEmojiRandomView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f53092c;

    /* JADX INFO: renamed from: d */
    public TextView f53093d;

    public IntlEmojiRandomView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public void m78093P(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        if (!bLiveVoiceEmojiMenuButton.icon.isEmpty()) {
            hxs.m133412y(this.f53092c, bLiveVoiceEmojiMenuButton.icon.get(0));
        }
        this.f53093d.setText(bLiveVoiceEmojiMenuButton.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53092c = (VDraweeView) findViewById(g5c0.f100659C2);
        this.f53093d = (TextView) findViewById(g5c0.f100699G6);
    }

    public IntlEmojiRandomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlEmojiRandomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
