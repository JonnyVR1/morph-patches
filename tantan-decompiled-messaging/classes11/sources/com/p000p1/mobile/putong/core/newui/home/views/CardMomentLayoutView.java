package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import l.dl4;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardMomentLayoutView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardMomentLayoutView f2439c;

    /* JADX INFO: renamed from: d */
    public VFrame f2440d;

    /* JADX INFO: renamed from: e */
    public VFrame f2441e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f2442f;

    /* JADX INFO: renamed from: g */
    public VImage f2443g;

    /* JADX INFO: renamed from: h */
    public SimpleDraweeView f2444h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f2445i;

    /* JADX INFO: renamed from: j */
    public VText f2446j;

    public CardMomentLayoutView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m3052P(View view) {
        dl4.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3052P(this);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
