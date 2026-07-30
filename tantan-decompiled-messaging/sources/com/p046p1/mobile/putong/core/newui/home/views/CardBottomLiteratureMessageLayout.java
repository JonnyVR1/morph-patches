package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p147v.VLinear;
import p147v.VText;
import p149l.eol;
import p149l.lh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLiteratureMessageLayout extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public LinearLayout f23515c;

    /* JADX INFO: renamed from: d */
    public VText f23516d;

    /* JADX INFO: renamed from: e */
    public CardBottomBaseInfoView f23517e;

    /* JADX INFO: renamed from: f */
    public CardUserContentView f23518f;

    public CardBottomLiteratureMessageLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38921P(View view) {
        lh4.m149829a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f23517e;
    }

    @Override // p149l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f23518f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38921P(this);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
