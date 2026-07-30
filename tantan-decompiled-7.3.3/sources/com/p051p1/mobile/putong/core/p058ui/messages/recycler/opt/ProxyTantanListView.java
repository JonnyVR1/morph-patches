package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.common.utils.NullChecker;
import p153l.fsq;
import p153l.iwl;
import p153l.l900;
import p153l.pn50;
import p153l.s900;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyTantanListView extends TantanListView implements iwl {
    public ProxyTantanListView(Context context) {
        super(context);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: A */
    public void mo50792A() {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(3);
        fsqVarM127226a.m127229d(300L).m127230e(true);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: B */
    public void mo50793B(pn50 pn50Var) {
        m50822z(pn50Var);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: C */
    public View mo50794C(int i) {
        return this.f33050b.m50837J(i);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: d */
    public void mo50795d() {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(0);
        fsqVarM127226a.m127233h(2000).m127229d(700L);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: e */
    public void mo50796e() {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(3);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    public int getCountHook() {
        if (NullChecker.m82486a(this.f33049a)) {
            return this.f33049a.mo118497m();
        }
        return 0;
    }

    @Override // p153l.iwl
    public int getFirstVisiblePositionHook() {
        if (!NullChecker.m82486a(this.f33050b) || this.f33050b.m50836I() <= 0) {
            return 0;
        }
        return this.f33050b.m50832E().f148693f;
    }

    @Override // p153l.iwl
    public int getHeaderViewsCountHook() {
        return this.f33049a.m185120D();
    }

    @Override // p153l.iwl
    public int getLastVisiblePositionHook() {
        if (!NullChecker.m82486a(this.f33050b) || this.f33050b.m50836I() <= 0) {
            return 0;
        }
        return this.f33050b.m50833F().f148693f;
    }

    @Override // p153l.iwl
    public int getListRenderHeight() {
        return this.f33050b.m139536F0();
    }

    @Override // p153l.iwl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: j */
    public void mo50797j(int i, int i2) {
        m50816i(i2);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: l */
    public void mo50798l() {
        this.f33050b.m50858e0();
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: m */
    public boolean mo50799m() {
        return false;
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: n */
    public void mo50800n(pn50 pn50Var) {
        m50814g(pn50Var);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: p */
    public void mo50801p(int i) {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(1);
        fsqVarM127226a.m127233h(i).m127228c(true).m127227b(true);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: s */
    public void mo50802s() {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(2);
        fsqVarM127226a.m127228c(true).m127227b(true);
        fsqVarM127226a.m127229d(300L).m127230e(true);
        fsqVarM127226a.m127232g(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    public void setMessageAdapterHook(l900 l900Var) {
        s900 s900Var = new s900(l900Var);
        this.f33049a = s900Var;
        this.f33050b.m50854a0(s900Var);
        l900Var.m153305b(this.f33049a);
    }

    @Override // p153l.iwl
    public void setSelectionHook(int i) {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(1);
        fsqVarM127226a.m127233h(i).m127228c(true).m127227b(true);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: u */
    public void mo50803u() {
        m50808D();
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: v */
    public void mo50804v() {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(0);
        fsqVarM127226a.m127233h(-2000).m127229d(700L);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    @Override // p153l.iwl
    /* JADX INFO: renamed from: x */
    public void mo50805x(int i) {
        fsq fsqVarM127226a = fsq.m127226a();
        fsqVarM127226a.m127231f(1);
        fsqVarM127226a.m127233h(i).m127228c(false).m127227b(false);
        this.f33050b.m50895z0(fsqVarM127226a);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
