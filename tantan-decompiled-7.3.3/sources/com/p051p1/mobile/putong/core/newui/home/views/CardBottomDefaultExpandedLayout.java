package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.uh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomDefaultExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24191c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f24192d;

    /* JADX INFO: renamed from: e */
    public VLinear f24193e;

    /* JADX INFO: renamed from: f */
    public VLinear f24194f;

    /* JADX INFO: renamed from: g */
    public VText f24195g;

    /* JADX INFO: renamed from: h */
    public VText f24196h;

    /* JADX INFO: renamed from: i */
    public VFrame f24197i;

    /* JADX INFO: renamed from: j */
    public IconTextView f24198j;

    /* JADX INFO: renamed from: k */
    public CardBottomExpandedProfileItemView f24199k;

    public CardBottomDefaultExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39904P(View view) {
        uh4.m196025a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39904P(this);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
