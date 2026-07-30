package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p147v.VText;
import p149l.c4g0;
import p149l.mkd0;
import p149l.uj4;

/* JADX INFO: loaded from: classes11.dex */
public class CardImproveTheInformationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardImproveTheInformationView f23616a;

    /* JADX INFO: renamed from: b */
    public VText f23617b;

    /* JADX INFO: renamed from: c */
    public VText f23618c;

    /* JADX INFO: renamed from: d */
    public VText f23619d;

    /* JADX INFO: renamed from: e */
    public c4g0 f23620e;

    /* JADX INFO: renamed from: f */
    public String f23621f;

    public CardImproveTheInformationView(Context context) {
        super(context);
        this.f23621f = "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m38959s();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38958p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m38958p(View view) {
        uj4.m194002a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m38959s() {
        mkd0.m154992z(this.f23620e);
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23621f = "";
    }

    public CardImproveTheInformationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23621f = "";
    }
}
