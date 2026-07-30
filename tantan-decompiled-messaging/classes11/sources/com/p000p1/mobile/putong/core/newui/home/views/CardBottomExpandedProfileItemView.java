package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.yg4;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomExpandedProfileItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f2245c;

    /* JADX INFO: renamed from: d */
    public VImage f2246d;

    /* JADX INFO: renamed from: e */
    public VText f2247e;

    /* JADX INFO: renamed from: f */
    public VLinear f2248f;

    /* JADX INFO: renamed from: g */
    public VImage f2249g;

    /* JADX INFO: renamed from: h */
    public VText f2250h;

    public CardBottomExpandedProfileItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2918P(View view) {
        yg4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2918P(this);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
