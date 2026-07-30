package com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.y0o0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiDynamicItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53111a;

    public VoiceMicEmojiDynamicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78120a(View view) {
        y0o0.m212124a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78120a(this);
    }

    public void setImageUrl(String str) {
        hxs.m133406s("context_livingAct", this.f53111a, str);
    }

    public VoiceMicEmojiDynamicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicEmojiDynamicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
