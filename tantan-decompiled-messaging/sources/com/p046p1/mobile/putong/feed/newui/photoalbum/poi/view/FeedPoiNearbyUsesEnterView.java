package com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p149l.xdl0;
import p149l.zoh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPoiNearbyUsesEnterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedPoiNearbyUsesEnterView f42301c;

    /* JADX INFO: renamed from: d */
    public RelativeLayout f42302d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f42303e;

    /* JADX INFO: renamed from: f */
    public TextView f42304f;

    /* JADX INFO: renamed from: g */
    public VLinear_FillerMeasure f42305g;

    /* JADX INFO: renamed from: h */
    public TextView f42306h;

    /* JADX INFO: renamed from: i */
    public TextView f42307i;

    /* JADX INFO: renamed from: j */
    public TextView f42308j;

    /* JADX INFO: renamed from: k */
    public View f42309k;

    public FeedPoiNearbyUsesEnterView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m65029P(View view) {
        zoh.m219559a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m65030Q() {
        xdl0.m208344M(this.f42302d, false);
        xdl0.m208344M(this.f42309k, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65029P(this);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiNearbyUsesEnterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
