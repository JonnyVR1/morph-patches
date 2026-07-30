package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.gi4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlLiveLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VFrame f24227d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f24228e;

    /* JADX INFO: renamed from: f */
    public VLinear f24229f;

    /* JADX INFO: renamed from: g */
    public VText f24230g;

    /* JADX INFO: renamed from: h */
    public CardBottomBaseInfoView f24231h;

    /* JADX INFO: renamed from: i */
    public View f24232i;

    public CardBottomIntlLiveLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39920p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39920p(View view) {
        gi4.m130284a(this, view);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
