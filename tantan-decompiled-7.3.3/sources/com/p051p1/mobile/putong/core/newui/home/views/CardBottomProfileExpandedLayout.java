package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p151v.VLinear;
import p153l.zi4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomProfileExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24312c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f24313d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24314e;

    /* JADX INFO: renamed from: f */
    public CardBottomExpandedProfileItemView f24315f;

    public CardBottomProfileExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39954P(View view) {
        zi4.m219723a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39954P(this);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomProfileExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
