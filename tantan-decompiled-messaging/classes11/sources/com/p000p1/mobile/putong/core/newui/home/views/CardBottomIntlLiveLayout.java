package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import l.hh4;
import v.VFrame;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomIntlLiveLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VFrame f2263d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f2264e;

    /* JADX INFO: renamed from: f */
    public VLinear f2265f;

    /* JADX INFO: renamed from: g */
    public VText f2266g;

    /* JADX INFO: renamed from: h */
    public CardBottomBaseInfoView f2267h;

    /* JADX INFO: renamed from: i */
    public View f2268i;

    public CardBottomIntlLiveLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2924p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2924p(View view) {
        hh4.a(this, view);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
