package com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p153l.cao0;
import p153l.izs;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiDynamicItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53959a;

    public VoiceMicEmojiDynamicItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79303a(View view) {
        cao0.m108506a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79303a(this);
    }

    public void setImageUrl(String str) {
        izs.m142868s("context_livingAct", this.f53959a, str);
    }

    public VoiceMicEmojiDynamicItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicEmojiDynamicItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
