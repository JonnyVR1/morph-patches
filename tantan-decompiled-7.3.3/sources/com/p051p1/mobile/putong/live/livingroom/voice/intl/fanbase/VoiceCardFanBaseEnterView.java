package com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VMarqueeText;
import p151v.VText;
import p153l.i9n;
import p153l.l51;
import p153l.y3n0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceCardFanBaseEnterView extends VFrame {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f53986a;

    /* JADX INFO: renamed from: b */
    public ImageView f53987b;

    /* JADX INFO: renamed from: c */
    public VText f53988c;

    /* JADX INFO: renamed from: d */
    public VMarqueeText f53989d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f53990e;

    public VoiceCardFanBaseEnterView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimEffectPlayer animEffectPlayer = this.f53990e;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79325s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m79325s(View view) {
        y3n0.m214152a(this, view);
    }

    /* JADX INFO: renamed from: u */
    public final void m79326u() {
        if (i9n.m139127b()) {
            return;
        }
        this.f53990e.mo69685l("https://auto.tancdn.com/v1/raw/a17b6437-a1fc-4363-941a-797e8f0a827e14.svga", 2, null);
    }

    /* JADX INFO: renamed from: v */
    public void m79327v(BLiveFansMemberNum bLiveFansMemberNum) {
        this.f53988c.setText(String.valueOf(bLiveFansMemberNum.memberNum));
        this.f53988c.setTypeface(Typeface.DEFAULT_BOLD);
        l51.m152888H(getContext(), new Runnable() { // from class: l.x3n0
            @Override // java.lang.Runnable
            public final void run() {
                this.f192287a.m79326u();
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
