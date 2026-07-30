package com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.ap0;
import l.e51;
import l.evm0;
import l.i7n;
import v.VFrame;
import v.VMarqueeText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardMedalWallEnterView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f6876a;

    /* JADX INFO: renamed from: b */
    public ImageView f6877b;

    /* JADX INFO: renamed from: c */
    public VText f6878c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f6879d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f6880e;

    public VoiceCardMedalWallEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m8462u() {
        if (i7n.b()) {
            return;
        }
        this.f6880e.l("https://fe-static.tancdn.com/v1/raw/3cbfb285-361b-4a68-85bb-c6dcd80cdd1b14.svga", 2, (ap0) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f6880e;
        if (animEffectPlayer != null) {
            animEffectPlayer.n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8463s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m8463s(View view) {
        evm0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m8464v(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f6878c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f6878c.setText(bLiveIntlMedalWallInUserCard.amount + "");
        e51.H(getContext(), new Runnable() { // from class: l.dvm0
            @Override // java.lang.Runnable
            public final void run() {
                this.f12011a.m8462u();
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
