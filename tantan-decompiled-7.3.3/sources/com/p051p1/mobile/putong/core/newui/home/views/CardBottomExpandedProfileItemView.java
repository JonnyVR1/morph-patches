package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.xh4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomExpandedProfileItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f24209c;

    /* JADX INFO: renamed from: d */
    public VImage f24210d;

    /* JADX INFO: renamed from: e */
    public VText f24211e;

    /* JADX INFO: renamed from: f */
    public VLinear f24212f;

    /* JADX INFO: renamed from: g */
    public VImage f24213g;

    /* JADX INFO: renamed from: h */
    public VText f24214h;

    public CardBottomExpandedProfileItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39914P(View view) {
        xh4.m210982a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39914P(this);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomExpandedProfileItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
