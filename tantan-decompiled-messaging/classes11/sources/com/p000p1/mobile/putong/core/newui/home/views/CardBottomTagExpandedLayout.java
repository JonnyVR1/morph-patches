package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.view.CardLabelShowView;
import l.bi4;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomTagExpandedLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f2352c;

    /* JADX INFO: renamed from: d */
    public CardBottomExpandedBasicInfoView f2353d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2354e;

    /* JADX INFO: renamed from: f */
    public VText f2355f;

    /* JADX INFO: renamed from: g */
    public CardLabelShowView f2356g;

    public CardBottomTagExpandedLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m2959P(View view) {
        bi4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2959P(this);
        this.f2356g.setMostLine(1);
        this.f2356g.e(Color.parseColor("#FB26B8"), Color.parseColor("#F63074"));
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardBottomTagExpandedLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
