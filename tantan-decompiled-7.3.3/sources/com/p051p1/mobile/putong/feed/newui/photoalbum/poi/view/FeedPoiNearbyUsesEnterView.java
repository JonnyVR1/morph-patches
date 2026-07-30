package com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p153l.bnl0;
import p153l.oqh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPoiNearbyUsesEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiNearbyUsesEnterView f43149c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f43150d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43151e;

    /* JADX INFO: renamed from: f */
    public TextView f43152f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f43153g;

    /* JADX INFO: renamed from: h */
    public TextView f43154h;

    /* JADX INFO: renamed from: i */
    public TextView f43155i;

    /* JADX INFO: renamed from: j */
    public TextView f43156j;

    /* JADX INFO: renamed from: k */
    public View f43157k;

    public FeedPoiNearbyUsesEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m66212P(View view) {
        oqh.m168813a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m66213Q() {
        bnl0.m105524M(this.f43150d, false);
        bnl0.m105524M(this.f43157k, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66212P(this);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
