package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.lh4;
import p009l.eol;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomLiteratureMessageLayout extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public LinearLayout f2293c;

    /* JADX INFO: renamed from: d */
    public VText f2294d;

    /* JADX INFO: renamed from: e */
    public CardBottomBaseInfoView f2295e;

    /* JADX INFO: renamed from: f */
    public CardUserContentView f2296f;

    public CardBottomLiteratureMessageLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2928P(View view) {
        lh4.a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f2295e;
    }

    @Override // p009l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f2296f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2928P(this);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLiteratureMessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
