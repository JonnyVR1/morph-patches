package com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VMarqueeText;
import p147v.VText;
import p149l.e51;
import p149l.evm0;
import p149l.i7n;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardMedalWallEnterView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f53270a;

    /* JADX INFO: renamed from: b */
    public ImageView f53271b;

    /* JADX INFO: renamed from: c */
    public VText f53272c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f53273d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53274e;

    public VoiceCardMedalWallEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m78273u() {
        if (i7n.m134916b()) {
            return;
        }
        this.f53274e.mo68502l("https://fe-static.tancdn.com/v1/raw/3cbfb285-361b-4a68-85bb-c6dcd80cdd1b14.svga", 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f53274e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78274s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m78274s(View view) {
        evm0.m118300a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public void m78275v(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f53272c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f53272c.setText(bLiveIntlMedalWallInUserCard.amount + "");
        e51.m114743H(getContext(), new Runnable() { // from class: l.dvm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f88084a.m78273u();
            }
        }, 450L);
    }

    public VoiceCardMedalWallEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceCardMedalWallEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
