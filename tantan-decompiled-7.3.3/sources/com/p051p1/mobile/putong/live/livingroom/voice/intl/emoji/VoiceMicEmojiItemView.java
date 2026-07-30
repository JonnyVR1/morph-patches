package com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import p151v.VDraweeView;
import p151v.VText;
import p153l.eao0;
import p153l.izs;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f53963a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f53964b;

    /* JADX INFO: renamed from: c */
    public VText f53965c;

    public VoiceMicEmojiItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79307a(View view) {
        eao0.m120099a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79307a(this);
    }

    public void setImageUrl(String str) {
        izs.m142868s("context_livingAct", this.f53964b, str);
    }

    public void setText(CharSequence charSequence) {
        this.f53965c.setText(charSequence);
    }

    public VoiceMicEmojiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMicEmojiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
