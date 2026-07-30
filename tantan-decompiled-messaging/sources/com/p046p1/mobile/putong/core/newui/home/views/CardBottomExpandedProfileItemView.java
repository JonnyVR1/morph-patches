package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.yg4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomExpandedProfileItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f23467c;

    /* JADX INFO: renamed from: d */
    public VImage f23468d;

    /* JADX INFO: renamed from: e */
    public VText f23469e;

    /* JADX INFO: renamed from: f */
    public VLinear f23470f;

    /* JADX INFO: renamed from: g */
    public VImage f23471g;

    /* JADX INFO: renamed from: h */
    public VText f23472h;

    public CardBottomExpandedProfileItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38911P(View view) {
        yg4.m214612a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38911P(this);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
