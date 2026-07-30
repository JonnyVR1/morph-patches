package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import l.kh4;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomLetterLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2288c;

    /* JADX INFO: renamed from: d */
    public VLinear f2289d;

    /* JADX INFO: renamed from: e */
    public VLinear f2290e;

    /* JADX INFO: renamed from: f */
    public VText f2291f;

    /* JADX INFO: renamed from: g */
    public VText f2292g;

    public CardBottomLetterLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2927P(View view) {
        kh4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2927P(this);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
