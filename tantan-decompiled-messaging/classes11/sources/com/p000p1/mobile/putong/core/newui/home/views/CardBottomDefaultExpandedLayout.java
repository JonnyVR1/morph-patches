package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.vg4;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomDefaultExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f2227c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f2228d;

    /* JADX INFO: renamed from: e */
    public VLinear f2229e;

    /* JADX INFO: renamed from: f */
    public VLinear f2230f;

    /* JADX INFO: renamed from: g */
    public VText f2231g;

    /* JADX INFO: renamed from: h */
    public VText f2232h;

    /* JADX INFO: renamed from: i */
    public VFrame f2233i;

    /* JADX INFO: renamed from: j */
    public IconTextView f2234j;

    /* JADX INFO: renamed from: k */
    public CardBottomExpandedProfileItemView f2235k;

    public CardBottomDefaultExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2908P(View view) {
        vg4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2908P(this);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
