package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VLinear;
import p151v.VText;
import p153l.ji4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLetterLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24252c;

    /* JADX INFO: renamed from: d */
    public VLinear f24253d;

    /* JADX INFO: renamed from: e */
    public VLinear f24254e;

    /* JADX INFO: renamed from: f */
    public VText f24255f;

    /* JADX INFO: renamed from: g */
    public VText f24256g;

    public CardBottomLetterLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39923P(View view) {
        ji4.m144972a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39923P(this);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomLetterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
