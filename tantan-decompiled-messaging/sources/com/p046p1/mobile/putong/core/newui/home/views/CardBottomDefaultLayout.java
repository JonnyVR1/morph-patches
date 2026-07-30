package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VLinear;
import p149l.eol;
import p149l.wg4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomDefaultLayout extends VLinear implements eol {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23458c;

    /* JADX INFO: renamed from: d */
    public CardUserContentView f23459d;

    public CardBottomDefaultLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38902P(View view) {
        wg4.m203000a(this, view);
    }

    public CardBottomBaseInfoView getBaseInfoLayout() {
        return this.f23458c;
    }

    @Override // p149l.eol
    public CardUserContentView getUserContentLayout() {
        return this.f23459d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38902P(this);
        if (IntlCountryCodeController.m28126v()) {
            this.f23459d.m39132g0();
        }
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
