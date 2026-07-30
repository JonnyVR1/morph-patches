package com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1o0;
import p149l.hxs;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f53115a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53116b;

    /* JADX INFO: renamed from: c */
    public VText f53117c;

    public VoiceMicEmojiItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m78124a(View view) {
        a1o0.m94572a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78124a(this);
    }

    public void setImageUrl(String str) {
        hxs.m133406s("context_livingAct", this.f53116b, str);
    }

    public void setText(CharSequence charSequence) {
        this.f53117c.setText(charSequence);
    }

    public VoiceMicEmojiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicEmojiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
