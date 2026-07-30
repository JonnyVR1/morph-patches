package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.view.CardLabelShowView;
import p151v.VLinear;
import p151v.VText;
import p153l.aj4;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomTagExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f24316c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f24317d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24318e;

    /* JADX INFO: renamed from: f */
    public VText f24319f;

    /* JADX INFO: renamed from: g */
    public CardLabelShowView f24320g;

    public CardBottomTagExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39955P(View view) {
        aj4.m98351a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39955P(this);
        this.f24320g.setMostLine(1);
        this.f24320g.m60681e(Color.parseColor("#FB26B8"), Color.parseColor("#F63074"));
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
