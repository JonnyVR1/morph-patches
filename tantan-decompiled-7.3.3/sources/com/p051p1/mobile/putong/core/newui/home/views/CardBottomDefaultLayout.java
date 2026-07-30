package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VLinear;
import p153l.pql;
import p153l.vh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomDefaultLayout extends VLinear implements pql {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24200c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f24201d;

    public CardBottomDefaultLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39905P(View view) {
        vh4.m201256a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f24200c;
    }

    @Override // p153l.pql
    public CardUserContentView getUserContentLayout() {
        return this.f24201d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39905P(this);
        if (IntlCountryCodeController.m29125v()) {
            this.f24201d.m40135g0();
        }
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
