package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p151v.VLinear;
import p151v.VText;
import p153l.ki4;
import p153l.pql;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLiteratureMessageLayout extends VLinear implements pql {

    /* JADX INFO: renamed from: c */
    public LinearLayout f24257c;

    /* JADX INFO: renamed from: d */
    public VText f24258d;

    /* JADX INFO: renamed from: e */
    public CardBottomBaseInfoView f24259e;

    /* JADX INFO: renamed from: f */
    public CardUserContentView f24260f;

    public CardBottomLiteratureMessageLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39924P(View view) {
        ki4.m149858a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f24259e;
    }

    @Override // p153l.pql
    public CardUserContentView getUserContentLayout() {
        return this.f24260f;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39924P(this);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
