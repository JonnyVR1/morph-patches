package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.ai4;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomProfileExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f2348c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f2349d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2350e;

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedProfileItemView f2351f;

    public CardBottomProfileExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2958P(View view) {
        ai4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2958P(this);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
