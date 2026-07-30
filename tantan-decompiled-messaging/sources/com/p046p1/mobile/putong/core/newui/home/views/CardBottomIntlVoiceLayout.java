package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p149l.ih4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlVoiceLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public CardBottomBaseInfoView f23491d;

    /* JADX INFO: renamed from: e */
    public RoundFrameLayout f23492e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f23493f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f23494g;

    /* JADX INFO: renamed from: h */
    public VLinear f23495h;

    /* JADX INFO: renamed from: i */
    public VFrame f23496i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f23497j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f23498k;

    /* JADX INFO: renamed from: l */
    public View f23499l;

    public CardBottomIntlVoiceLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38918p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m38918p(View view) {
        ih4.m136185a(this, view);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
