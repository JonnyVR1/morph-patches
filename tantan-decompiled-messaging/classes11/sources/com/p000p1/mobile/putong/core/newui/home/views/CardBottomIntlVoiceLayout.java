package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.ih4;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomIntlVoiceLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public CardBottomBaseInfoView f2269d;

    /* JADX INFO: renamed from: e */
    public RoundFrameLayout f2270e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2271f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f2272g;

    /* JADX INFO: renamed from: h */
    public VLinear f2273h;

    /* JADX INFO: renamed from: i */
    public VFrame f2274i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f2275j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f2276k;

    /* JADX INFO: renamed from: l */
    public View f2277l;

    public CardBottomIntlVoiceLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2925p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2925p(View view) {
        ih4.a(this, view);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
