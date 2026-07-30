package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.vg4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomDefaultExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f23449c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f23450d;

    /* JADX INFO: renamed from: e */
    public VLinear f23451e;

    /* JADX INFO: renamed from: f */
    public VLinear f23452f;

    /* JADX INFO: renamed from: g */
    public VText f23453g;

    /* JADX INFO: renamed from: h */
    public VText f23454h;

    /* JADX INFO: renamed from: i */
    public VFrame f23455i;

    /* JADX INFO: renamed from: j */
    public IconTextView f23456j;

    /* JADX INFO: renamed from: k */
    public CardBottomExpandedProfileItemView f23457k;

    public CardBottomDefaultExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38901P(View view) {
        vg4.m198315a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38901P(this);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomDefaultExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
