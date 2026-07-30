package com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.e51;
import p149l.i7n;
import p149l.uum0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCardFanBaseEnterView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f53138a;

    /* JADX INFO: renamed from: b */
    public ImageView f53139b;

    /* JADX INFO: renamed from: c */
    public VText f53140c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f53141d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53142e;

    public VoiceCardFanBaseEnterView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f53142e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78142s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m78142s(View view) {
        uum0.m195383a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final void m78143u() {
        if (i7n.m134916b()) {
            return;
        }
        this.f53142e.mo68502l("https://auto.tancdn.com/v1/raw/a17b6437-a1fc-4363-941a-797e8f0a827e14.svga", 2, null);
    }

    /* JADX INFO: renamed from: v */
    public void m78144v(BLiveFansMemberNum bLiveFansMemberNum) {
        this.f53140c.setText(String.valueOf(bLiveFansMemberNum.memberNum));
        this.f53140c.setTypeface(Typeface.DEFAULT_BOLD);
        e51.m114743H(getContext(), new Runnable() { // from class: l.tum0
            @Override // java.lang.Runnable
            public final void run() {
                this.f172200a.m78143u();
            }
        }, 450L);
    }

    public VoiceCardFanBaseEnterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public VoiceCardFanBaseEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
