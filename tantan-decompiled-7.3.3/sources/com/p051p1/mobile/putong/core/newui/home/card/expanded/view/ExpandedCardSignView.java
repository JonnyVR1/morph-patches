package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.dnf;
import p153l.lyh0;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardSignView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f23322c;

    /* JADX INFO: renamed from: d */
    public VText f23323d;

    public ExpandedCardSignView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39309P(View view) {
        dnf.m117062a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39309P(this);
        this.f23323d.setTypeface(lyh0.m156283c(3), 0);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
