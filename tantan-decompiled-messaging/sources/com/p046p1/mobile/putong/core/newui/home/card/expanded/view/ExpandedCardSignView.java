package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.eqh0;
import p149l.xlf;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedCardSignView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f22580c;

    /* JADX INFO: renamed from: d */
    public VText f22581d;

    public ExpandedCardSignView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38306P(View view) {
        xlf.m209887a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38306P(this);
        this.f22581d.setTypeface(eqh0.m117752c(3), 0);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
