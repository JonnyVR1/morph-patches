package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p153l.hi4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlVoiceLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public CardBottomBaseInfoView f24233d;

    /* JADX INFO: renamed from: e */
    public RoundFrameLayout f24234e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f24235f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f24236g;

    /* JADX INFO: renamed from: h */
    public VLinear f24237h;

    /* JADX INFO: renamed from: i */
    public VFrame f24238i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f24239j;

    /* JADX INFO: renamed from: k */
    public AnimEffectPlayer f24240k;

    /* JADX INFO: renamed from: l */
    public View f24241l;

    public CardBottomIntlVoiceLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39921p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39921p(View view) {
        hi4.m135106a(this, view);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlVoiceLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
