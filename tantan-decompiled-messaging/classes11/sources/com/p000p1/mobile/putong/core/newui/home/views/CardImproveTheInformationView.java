package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.c4g0;
import l.mkd0;
import l.uj4;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardImproveTheInformationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardImproveTheInformationView f2394a;

    /* JADX INFO: renamed from: b */
    public VText f2395b;

    /* JADX INFO: renamed from: c */
    public VText f2396c;

    /* JADX INFO: renamed from: d */
    public VText f2397d;

    /* JADX INFO: renamed from: e */
    public c4g0 f2398e;

    /* JADX INFO: renamed from: f */
    public String f2399f;

    public CardImproveTheInformationView(Context context) {
        super(context);
        this.f2399f = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m2966s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2965p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2965p(View view) {
        uj4.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m2966s() {
        mkd0.z(this.f2398e);
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2399f = "";
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2399f = "";
    }
}
