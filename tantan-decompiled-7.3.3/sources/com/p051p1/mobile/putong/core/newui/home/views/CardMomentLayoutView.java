package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.cm4;

/* JADX INFO: loaded from: classes11.dex */
public class CardMomentLayoutView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardMomentLayoutView f24403c;

    /* JADX INFO: renamed from: d */
    public VFrame f24404d;

    /* JADX INFO: renamed from: e */
    public VFrame f24405e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f24406f;

    /* JADX INFO: renamed from: g */
    public VImage f24407g;

    /* JADX INFO: renamed from: h */
    public SimpleDraweeView f24408h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f24409i;

    /* JADX INFO: renamed from: j */
    public VText f24410j;

    public CardMomentLayoutView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m40048P(View view) {
        cm4.m111083a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40048P(this);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
