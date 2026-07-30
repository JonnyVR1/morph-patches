package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.VLinear;
import p149l.ai4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomProfileExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f23570c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f23571d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f23572e;

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedProfileItemView f23573f;

    public CardBottomProfileExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38951P(View view) {
        ai4.m96785a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38951P(this);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
