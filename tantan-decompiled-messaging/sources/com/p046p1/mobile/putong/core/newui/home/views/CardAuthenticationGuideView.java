package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VFrame;
import p147v.VText;
import p149l.c4g0;
import p149l.mkd0;
import p149l.pg4;

/* JADX INFO: loaded from: classes11.dex */
public class CardAuthenticationGuideView extends VFrame {

    /* JADX INFO: renamed from: a */
    public CardAuthenticationGuideView f23375a;

    /* JADX INFO: renamed from: b */
    public VText f23376b;

    /* JADX INFO: renamed from: c */
    public VText f23377c;

    /* JADX INFO: renamed from: d */
    public c4g0 f23378d;

    public CardAuthenticationGuideView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m38879s();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38878p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m38878p(View view) {
        pg4.m168662a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m38879s() {
        mkd0.m154992z(this.f23378d);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardAuthenticationGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
