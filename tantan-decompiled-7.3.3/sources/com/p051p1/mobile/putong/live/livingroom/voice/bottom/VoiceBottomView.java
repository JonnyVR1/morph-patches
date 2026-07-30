package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p153l.mdc0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceBottomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceChatBottomView f53760a;

    /* JADX INFO: renamed from: b */
    public BottomMenuView f53761b;

    public VoiceBottomView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53760a = (VoiceChatBottomView) findViewById(mdc0.f136255o0);
        this.f53761b = (BottomMenuView) findViewById(mdc0.f136045S);
    }

    public VoiceBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
