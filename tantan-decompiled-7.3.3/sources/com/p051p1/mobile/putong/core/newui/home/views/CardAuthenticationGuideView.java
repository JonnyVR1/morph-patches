package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p151v.VText;
import p153l.kcg0;
import p153l.oh4;
import p153l.psd0;

/* JADX INFO: loaded from: classes11.dex */
public class CardAuthenticationGuideView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardAuthenticationGuideView f24117a;

    /* JADX INFO: renamed from: b */
    public VText f24118b;

    /* JADX INFO: renamed from: c */
    public VText f24119c;

    /* JADX INFO: renamed from: d */
    public kcg0 f24120d;

    public CardAuthenticationGuideView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39882s();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39881p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39881p(View view) {
        oh4.m167689a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39882s() {
        psd0.m173633z(this.f24120d);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
