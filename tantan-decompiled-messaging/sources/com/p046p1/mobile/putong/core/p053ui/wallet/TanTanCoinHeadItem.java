package com.p046p1.mobile.putong.core.p053ui.wallet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import p147v.VOnlineIndicator;
import p147v.VRelative;
import p147v.VText;
import p149l.xdl0;
import p149l.xvh0;

/* JADX INFO: loaded from: classes9.dex */
public class TanTanCoinHeadItem extends VRelative {

    /* JADX INFO: renamed from: d */
    public ImageView f38232d;

    /* JADX INFO: renamed from: e */
    public VText f38233e;

    /* JADX INFO: renamed from: f */
    public ImageView f38234f;

    /* JADX INFO: renamed from: g */
    public VText f38235g;

    /* JADX INFO: renamed from: h */
    public VOnlineIndicator f38236h;

    public TanTanCoinHeadItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public TanTanCoinHeadItem m58095B(String str) {
        this.f38235g.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: H */
    public TanTanCoinHeadItem m58096H(int i) {
        this.f38233e.setText(i);
        return this;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58097p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m58097p(View view) {
        xvh0.m211292a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public TanTanCoinHeadItem m58098q(int i) {
        this.f38232d.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public TanTanCoinHeadItem m58099z(boolean z) {
        xdl0.m208344M(this.f38234f, z);
        return this;
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TanTanCoinHeadItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
