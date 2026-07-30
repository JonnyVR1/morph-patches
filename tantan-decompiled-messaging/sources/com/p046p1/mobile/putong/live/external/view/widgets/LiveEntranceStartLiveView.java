package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.f9s;
import p149l.h3c0;
import p149l.hxs;
import p149l.l9s;
import p149l.lqr;
import p149l.mep0;
import p149l.t100;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveEntranceStartLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f46318c;

    /* JADX INFO: renamed from: d */
    public VText f46319d;

    public LiveEntranceStartLiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m70903P(View view) {
        f9s.m120119a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m70904Q(lqr lqrVar, BLiveEntranceSummary bLiveEntranceSummary) {
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f46319d.setText(bLiveEntranceSummary.title);
        }
        hxs.m133406s("context_square", this.f46318c, bLiveEntranceSummary.icon);
        if (TextUtils.equals("p_live_recommend", lqrVar.m151074h3()) || TextUtils.equals("p_live_nearby", lqrVar.m151074h3())) {
            zvf0.m220402x("e_bubble_live_start", lqrVar.m151074h3());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70903P(this);
        if (l9s.m149078h()) {
            mep0.m154302d1(this, t100.f167260i);
            setBackgroundResource(h3c0.f105708t);
        }
    }

    public LiveEntranceStartLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEntranceStartLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
