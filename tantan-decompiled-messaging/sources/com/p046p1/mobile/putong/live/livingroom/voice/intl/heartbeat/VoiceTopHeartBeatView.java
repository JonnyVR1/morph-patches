package com.p046p1.mobile.putong.live.livingroom.voice.intl.heartbeat;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VLinear;
import p149l.bgv;
import p149l.fld0;
import p149l.i3c0;
import p149l.kvc0;
import p149l.quo0;
import p149l.ruo0;
import p149l.s7m;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceTopHeartBeatView extends VLinear implements s7m<quo0> {

    /* JADX INFO: renamed from: c */
    public VoiceTopHeartBeatView f53180c;

    /* JADX INFO: renamed from: d */
    public View f53181d;

    /* JADX INFO: renamed from: e */
    public TextView f53182e;

    public VoiceTopHeartBeatView(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context mo21062C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: P */
    public final void m78177P(View view) {
        ruo0.m180883a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m78179R(long j) {
        this.f53182e.setText(x8u.m207433c(j));
    }

    /* JADX INFO: renamed from: S */
    public void m78180S(boolean z) {
        xdl0.m208345M0(this, z);
        this.f53181d.setBackground(kvc0.m147353b(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? i3c0.f111127p9 : i3c0.f110659B9));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78177P(this);
        this.f53181d.setBackground(kvc0.m147353b(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? i3c0.f111127p9 : i3c0.f110659B9));
    }

    public VoiceTopHeartBeatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceTopHeartBeatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(quo0 quo0Var) {
    }
}
