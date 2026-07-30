package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.view.CardLabelShowView;
import l.ci4;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomTagLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2357c;

    /* JADX INFO: renamed from: d */
    public VLinear f2358d;

    /* JADX INFO: renamed from: e */
    public VLinear f2359e;

    /* JADX INFO: renamed from: f */
    public VText f2360f;

    /* JADX INFO: renamed from: g */
    public VText f2361g;

    /* JADX INFO: renamed from: h */
    public CardLabelShowView f2362h;

    public CardBottomTagLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2960P(View view) {
        ci4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2960P(this);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
