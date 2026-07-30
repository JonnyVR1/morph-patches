package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VFrame;
import p151v.VText;
import p153l.kcg0;
import p153l.psd0;
import p153l.tk4;

/* JADX INFO: loaded from: classes11.dex */
public class CardImproveTheInformationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardImproveTheInformationView f24358a;

    /* JADX INFO: renamed from: b */
    public VText f24359b;

    /* JADX INFO: renamed from: c */
    public VText f24360c;

    /* JADX INFO: renamed from: d */
    public VText f24361d;

    /* JADX INFO: renamed from: e */
    public kcg0 f24362e;

    /* JADX INFO: renamed from: f */
    public String f24363f;

    public CardImproveTheInformationView(Context context) {
        super(context);
        this.f24363f = "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m39962s();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39961p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39961p(View view) {
        tk4.m191503a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m39962s() {
        psd0.m173633z(this.f24362e);
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24363f = "";
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24363f = "";
    }
}
