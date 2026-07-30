package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.view.CardLabelShowView;
import p147v.VLinear;
import p147v.VText;
import p149l.bi4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomTagExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f23574c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f23575d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f23576e;

    /* JADX INFO: renamed from: f */
    public VText f23577f;

    /* JADX INFO: renamed from: g */
    public CardLabelShowView f23578g;

    public CardBottomTagExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m38952P(View view) {
        bi4.m101970a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38952P(this);
        this.f23578g.setMostLine(1);
        this.f23578g.m59497e(Color.parseColor("#FB26B8"), Color.parseColor("#F63074"));
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
