package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.view.CountdownGiftProgressView;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.gaj0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TreasureBoxView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public TreasureBoxView f4592a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4593b;

    /* JADX INFO: renamed from: c */
    public CountdownGiftProgressView f4594c;

    /* JADX INFO: renamed from: d */
    public VText f4595d;

    /* JADX INFO: renamed from: e */
    public View f4596e;

    public TreasureBoxView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5668a(View view) {
        gaj0.m13672a(this, view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4596e, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5668a(this);
    }

    public void setIcon(String str) {
        hxs.u("context_livingAct", this.f4593b, str, t100.d(44.0f), t100.d(38.0f));
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TreasureBoxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
