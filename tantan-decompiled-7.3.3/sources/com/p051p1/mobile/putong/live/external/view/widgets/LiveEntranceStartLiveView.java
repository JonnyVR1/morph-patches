package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.gbs;
import p153l.i4g0;
import p153l.izs;
import p153l.mbs;
import p153l.msr;
import p153l.nbc0;
import p153l.qa00;
import p153l.qnp0;

/* JADX INFO: loaded from: classes9.dex */
public class LiveEntranceStartLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VDraweeView f47166c;

    /* JADX INFO: renamed from: d */
    public VText f47167d;

    public LiveEntranceStartLiveView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m72086P(View view) {
        gbs.m129803a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m72087Q(msr msrVar, BLiveEntranceSummary bLiveEntranceSummary) {
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f47167d.setText(bLiveEntranceSummary.title);
        }
        izs.m142868s("context_square", this.f47166c, bLiveEntranceSummary.icon);
        if (TextUtils.equals("p_live_recommend", msrVar.m159916h3()) || TextUtils.equals("p_live_nearby", msrVar.m159916h3())) {
            i4g0.m138526x("e_bubble_live_start", msrVar.m159916h3());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72086P(this);
        if (mbs.m157855h()) {
            qnp0.m177261d1(this, qa00.f156322i);
            setBackgroundResource(nbc0.f141199t);
        }
    }

    public LiveEntranceStartLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveEntranceStartLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
