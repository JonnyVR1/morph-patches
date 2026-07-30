package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import com.tantanapp.common.utils.NullChecker;
import p149l.eqq;
import p149l.jf50;
import p149l.o000;
import p149l.utl;
import p149l.v000;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyTantanListView extends TantanListView implements utl {
    public ProxyTantanListView(Context context) {
        super(context);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: A */
    public void mo49609A() {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(3);
        eqqVarM117753a.m117756d(300L).m117757e(true);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: B */
    public void mo49610B(jf50 jf50Var) {
        m49639z(jf50Var);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: C */
    public View mo49611C(int i) {
        return this.f32202b.m49654J(i);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: d */
    public void mo49612d() {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(0);
        eqqVarM117753a.m117760h(2000).m117756d(700L);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: e */
    public void mo49613e() {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(3);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    public int getCountHook() {
        if (NullChecker.m81303a(this.f32201a)) {
            return this.f32201a.mo108013m();
        }
        return 0;
    }

    @Override // p149l.utl
    public int getFirstVisiblePositionHook() {
        if (!NullChecker.m81303a(this.f32202b) || this.f32202b.m49653I() <= 0) {
            return 0;
        }
        return this.f32202b.m49649E().f108065f;
    }

    @Override // p149l.utl
    public int getHeaderViewsCountHook() {
        return this.f32201a.m196461D();
    }

    @Override // p149l.utl
    public int getLastVisiblePositionHook() {
        if (!NullChecker.m81303a(this.f32202b) || this.f32202b.m49653I() <= 0) {
            return 0;
        }
        return this.f32202b.m49650F().f108065f;
    }

    @Override // p149l.utl
    public int getListRenderHeight() {
        return this.f32202b.m206984F0();
    }

    @Override // p149l.utl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: j */
    public void mo49614j(int i, int i2) {
        m49633i(i2);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: l */
    public void mo49615l() {
        this.f32202b.m49675e0();
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: m */
    public boolean mo49616m() {
        return false;
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: n */
    public void mo49617n(jf50 jf50Var) {
        m49631g(jf50Var);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: p */
    public void mo49618p(int i) {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(1);
        eqqVarM117753a.m117760h(i).m117755c(true).m117754b(true);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: s */
    public void mo49619s() {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(2);
        eqqVarM117753a.m117755c(true).m117754b(true);
        eqqVarM117753a.m117756d(300L).m117757e(true);
        eqqVarM117753a.m117759g(WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_INIT_IS_NOT_NULL);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    public void setMessageAdapterHook(o000 o000Var) {
        v000 v000Var = new v000(o000Var);
        this.f32201a = v000Var;
        this.f32202b.m49671a0(v000Var);
        o000Var.m162102b(this.f32201a);
    }

    @Override // p149l.utl
    public void setSelectionHook(int i) {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(1);
        eqqVarM117753a.m117760h(i).m117755c(true).m117754b(true);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: u */
    public void mo49620u() {
        m49625D();
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: v */
    public void mo49621v() {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(0);
        eqqVarM117753a.m117760h(-2000).m117756d(700L);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    @Override // p149l.utl
    /* JADX INFO: renamed from: x */
    public void mo49622x(int i) {
        eqq eqqVarM117753a = eqq.m117753a();
        eqqVarM117753a.m117758f(1);
        eqqVarM117753a.m117760h(i).m117755c(false).m117754b(false);
        this.f32202b.m49712z0(eqqVarM117753a);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
