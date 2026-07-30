package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p147v.VLinear;
import p147v.VText;
import p149l.kh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLetterLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23510c;

    /* JADX INFO: renamed from: d */
    public VLinear f23511d;

    /* JADX INFO: renamed from: e */
    public VLinear f23512e;

    /* JADX INFO: renamed from: f */
    public VText f23513f;

    /* JADX INFO: renamed from: g */
    public VText f23514g;

    public CardBottomLetterLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38920P(View view) {
        kh4.m145952a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38920P(this);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
