package com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.xdl0;
import p007l.zoh;
import v.VDraweeView;
import v.VLinear;
import v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPoiNearbyUsesEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiNearbyUsesEnterView f3762c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f3763d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f3764e;

    /* JADX INFO: renamed from: f */
    public TextView f3765f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f3766g;

    /* JADX INFO: renamed from: h */
    public TextView f3767h;

    /* JADX INFO: renamed from: i */
    public TextView f3768i;

    /* JADX INFO: renamed from: j */
    public TextView f3769j;

    /* JADX INFO: renamed from: k */
    public View f3770k;

    public FeedPoiNearbyUsesEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m6130P(View view) {
        zoh.m17514a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m6131Q() {
        xdl0.M(this.f3763d, false);
        xdl0.M(this.f3770k, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6130P(this);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
