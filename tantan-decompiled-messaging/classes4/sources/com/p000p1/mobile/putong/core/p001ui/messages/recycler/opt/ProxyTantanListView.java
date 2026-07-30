package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p002l.eqq;
import p002l.jf50;
import p002l.o000;
import p002l.utl;
import p002l.v000;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProxyTantanListView extends TantanListView implements utl {
    public ProxyTantanListView(Context context) {
        super(context);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: A */
    public void mo23A() {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(3);
        eqqVarM12661a.m12664d(300L).m12665e(true);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: B */
    public void mo24B(jf50 jf50Var) {
        m53z(jf50Var);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: C */
    public View mo25C(int i) {
        return this.f24b.m68J(i);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: d */
    public void mo26d() {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(0);
        eqqVarM12661a.m12668h(2000).m12664d(700L);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: e */
    public void mo27e() {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(3);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    public int getCountHook() {
        if (NullChecker.a(this.f23a)) {
            return this.f23a.mo11202m();
        }
        return 0;
    }

    @Override // p002l.utl
    public int getFirstVisiblePositionHook() {
        if (!NullChecker.a(this.f24b) || this.f24b.m67I() <= 0) {
            return 0;
        }
        return this.f24b.m63E().f12075f;
    }

    @Override // p002l.utl
    public int getHeaderViewsCountHook() {
        return this.f23a.m23701D();
    }

    @Override // p002l.utl
    public int getLastVisiblePositionHook() {
        if (!NullChecker.a(this.f24b) || this.f24b.m67I() <= 0) {
            return 0;
        }
        return this.f24b.m64F().f12075f;
    }

    @Override // p002l.utl
    public int getListRenderHeight() {
        return this.f24b.m25682F0();
    }

    @Override // p002l.utl
    public ViewGroup getRealView() {
        return this;
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: j */
    public void mo28j(int i, int i2) {
        m47i(i2);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: l */
    public void mo29l() {
        this.f24b.m89e0();
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: m */
    public boolean mo30m() {
        return false;
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: n */
    public void mo31n(jf50 jf50Var) {
        m45g(jf50Var);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: p */
    public void mo32p(int i) {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(1);
        eqqVarM12661a.m12668h(i).m12663c(true).m12662b(true);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: s */
    public void mo33s() {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(2);
        eqqVarM12661a.m12663c(true).m12662b(true);
        eqqVarM12661a.m12664d(300L).m12665e(true);
        eqqVarM12661a.m12667g(-400);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    public void setMessageAdapterHook(o000 o000Var) {
        v000 v000Var = new v000(o000Var);
        this.f23a = v000Var;
        this.f24b.m85a0(v000Var);
        o000Var.m19172b(this.f23a);
    }

    @Override // p002l.utl
    public void setSelectionHook(int i) {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(1);
        eqqVarM12661a.m12668h(i).m12663c(true).m12662b(true);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: u */
    public void mo34u() {
        m39D();
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: v */
    public void mo35v() {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(0);
        eqqVarM12661a.m12668h(-2000).m12664d(700L);
        this.f24b.m126z0(eqqVarM12661a);
    }

    @Override // p002l.utl
    /* JADX INFO: renamed from: x */
    public void mo36x(int i) {
        eqq eqqVarM12661a = eqq.m12661a();
        eqqVarM12661a.m12666f(1);
        eqqVarM12661a.m12668h(i).m12663c(false).m12662b(false);
        this.f24b.m126z0(eqqVarM12661a);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProxyTantanListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
