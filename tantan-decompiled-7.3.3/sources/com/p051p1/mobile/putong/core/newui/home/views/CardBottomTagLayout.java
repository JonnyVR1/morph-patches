package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.view.CardLabelShowView;
import p151v.VLinear;
import p151v.VText;
import p153l.bj4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomTagLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24321c;

    /* JADX INFO: renamed from: d */
    public VLinear f24322d;

    /* JADX INFO: renamed from: e */
    public VLinear f24323e;

    /* JADX INFO: renamed from: f */
    public VText f24324f;

    /* JADX INFO: renamed from: g */
    public VText f24325g;

    /* JADX INFO: renamed from: h */
    public CardLabelShowView f24326h;

    public CardBottomTagLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39956P(View view) {
        bj4.m104593a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39956P(this);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
