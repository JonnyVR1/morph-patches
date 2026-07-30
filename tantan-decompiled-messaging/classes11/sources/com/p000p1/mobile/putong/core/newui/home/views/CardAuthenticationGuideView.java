package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.c4g0;
import l.mkd0;
import l.pg4;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardAuthenticationGuideView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardAuthenticationGuideView f2153a;

    /* JADX INFO: renamed from: b */
    public VText f2154b;

    /* JADX INFO: renamed from: c */
    public VText f2155c;

    /* JADX INFO: renamed from: d */
    public c4g0 f2156d;

    public CardAuthenticationGuideView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m2886s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2885p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2885p(View view) {
        pg4.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m2886s() {
        mkd0.z(this.f2156d);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
