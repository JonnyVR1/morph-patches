package com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.i4n0;
import p153l.i9n;
import p153l.l51;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardMedalWallEnterView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f54118a;

    /* JADX INFO: renamed from: b */
    public ImageView f54119b;

    /* JADX INFO: renamed from: c */
    public VText f54120c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f54121d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f54122e;

    public VoiceCardMedalWallEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public void m79456u() {
        if (i9n.m139127b()) {
            return;
        }
        this.f54122e.mo69685l("https://fe-static.tancdn.com/v1/raw/3cbfb285-361b-4a68-85bb-c6dcd80cdd1b14.svga", 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f54122e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79457s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m79457s(View view) {
        i4n0.m138572a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public void m79458v(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        this.f54120c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f54120c.setText(bLiveIntlMedalWallInUserCard.amount + "");
        l51.m152888H(getContext(), new Runnable() { // from class: l.h4n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107818a.m79456u();
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
