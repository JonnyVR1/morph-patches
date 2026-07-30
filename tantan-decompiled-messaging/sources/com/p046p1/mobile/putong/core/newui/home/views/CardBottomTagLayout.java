package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.view.CardLabelShowView;
import p147v.VLinear;
import p147v.VText;
import p149l.ci4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomTagLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23579c;

    /* JADX INFO: renamed from: d */
    public VLinear f23580d;

    /* JADX INFO: renamed from: e */
    public VLinear f23581e;

    /* JADX INFO: renamed from: f */
    public VText f23582f;

    /* JADX INFO: renamed from: g */
    public VText f23583g;

    /* JADX INFO: renamed from: h */
    public CardLabelShowView f23584h;

    public CardBottomTagLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38953P(View view) {
        ci4.m107038a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38953P(this);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
