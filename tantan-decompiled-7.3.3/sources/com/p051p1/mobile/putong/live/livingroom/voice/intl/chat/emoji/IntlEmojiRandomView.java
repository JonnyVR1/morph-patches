package com.p051p1.mobile.putong.live.livingroom.voice.intl.chat.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEmojiMenuButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.izs;
import p153l.mdc0;

/* JADX INFO: loaded from: classes5.dex */
public class IntlEmojiRandomView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f53940c;

    /* JADX INFO: renamed from: d */
    public TextView f53941d;

    public IntlEmojiRandomView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public void m79276P(BLiveVoiceEmojiMenuButton bLiveVoiceEmojiMenuButton) {
        if (!bLiveVoiceEmojiMenuButton.icon.isEmpty()) {
            izs.m142874y(this.f53940c, bLiveVoiceEmojiMenuButton.icon.get(0));
        }
        this.f53941d.setText(bLiveVoiceEmojiMenuButton.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53940c = (VDraweeView) findViewById(mdc0.f135904C2);
        this.f53941d = (TextView) findViewById(mdc0.f135944G6);
    }

    public IntlEmojiRandomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlEmojiRandomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
