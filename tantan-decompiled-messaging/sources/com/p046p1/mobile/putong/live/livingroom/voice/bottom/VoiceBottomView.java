package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatBottomView;
import p149l.g5c0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceBottomView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceChatBottomView f52912a;

    /* JADX INFO: renamed from: b */
    public BottomMenuView f52913b;

    public VoiceBottomView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52912a = (VoiceChatBottomView) findViewById(g5c0.f101010o0);
        this.f52913b = (BottomMenuView) findViewById(g5c0.f100800S);
    }

    public VoiceBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
