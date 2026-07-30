package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.hh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomIntlLiveLayout extends VRelative {

    /* JADX INFO: renamed from: d */
    public VFrame f23485d;

    /* JADX INFO: renamed from: e */
    public AnimEffectPlayer f23486e;

    /* JADX INFO: renamed from: f */
    public VLinear f23487f;

    /* JADX INFO: renamed from: g */
    public VText f23488g;

    /* JADX INFO: renamed from: h */
    public CardBottomBaseInfoView f23489h;

    /* JADX INFO: renamed from: i */
    public View f23490i;

    public CardBottomIntlLiveLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38917p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m38917p(View view) {
        hh4.m130939a(this, view);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomIntlLiveLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
