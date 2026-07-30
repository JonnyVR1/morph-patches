package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.eqh0;
import l.xlf;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedCardSignView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VImage f1358c;

    /* JADX INFO: renamed from: d */
    public VText f1359d;

    public ExpandedCardSignView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2284P(View view) {
        xlf.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2284P(this);
        this.f1359d.setTypeface(eqh0.c(3), 0);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExpandedCardSignView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
