package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dl4;

/* JADX INFO: loaded from: classes11.dex */
public class CardMomentLayoutView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardMomentLayoutView f23661c;

    /* JADX INFO: renamed from: d */
    public VFrame f23662d;

    /* JADX INFO: renamed from: e */
    public VFrame f23663e;

    /* JADX INFO: renamed from: f */
    public SimpleDraweeView f23664f;

    /* JADX INFO: renamed from: g */
    public VImage f23665g;

    /* JADX INFO: renamed from: h */
    public SimpleDraweeView f23666h;

    /* JADX INFO: renamed from: i */
    public SimpleDraweeView f23667i;

    /* JADX INFO: renamed from: j */
    public VText f23668j;

    public CardMomentLayoutView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m39045P(View view) {
        dl4.m112326a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39045P(this);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardMomentLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
