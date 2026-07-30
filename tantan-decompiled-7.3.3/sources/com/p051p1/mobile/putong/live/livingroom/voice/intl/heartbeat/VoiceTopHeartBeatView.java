package com.p051p1.mobile.putong.live.livingroom.voice.intl.heartbeat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.civ;
import p153l.htd0;
import p153l.iam;
import p153l.n3d0;
import p153l.obc0;
import p153l.u3p0;
import p153l.v3p0;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceTopHeartBeatView extends VLinear implements iam<u3p0> {

    /* JADX INFO: renamed from: c */
    public VoiceTopHeartBeatView f54028c;

    /* JADX INFO: renamed from: d */
    public View f54029d;

    /* JADX INFO: renamed from: e */
    public TextView f54030e;

    public VoiceTopHeartBeatView(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: P */
    public final void m79360P(View view) {
        v3p0.m199293a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m79362R(long j) {
        this.f54030e.setText(yau.m214935c(j));
    }

    /* JADX INFO: renamed from: S */
    public void m79363S(boolean z) {
        bnl0.m105525M0(this, z);
        this.f54029d.setBackground(n3d0.m161278b(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? obc0.f146455p9 : obc0.f145987B9));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79360P(this);
        this.f54029d.setBackground(n3d0.m161278b(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? obc0.f146455p9 : obc0.f145987B9));
    }

    public VoiceTopHeartBeatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTopHeartBeatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(u3p0 u3p0Var) {
    }
}
