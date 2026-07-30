package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import l.wg4;
import p009l.eol;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomDefaultLayout extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2236c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f2237d;

    public CardBottomDefaultLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2909P(View view) {
        wg4.a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f2236c;
    }

    @Override // p009l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f2237d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2909P(this);
        if (IntlCountryCodeController.v()) {
            this.f2237d.m3147g0();
        }
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
