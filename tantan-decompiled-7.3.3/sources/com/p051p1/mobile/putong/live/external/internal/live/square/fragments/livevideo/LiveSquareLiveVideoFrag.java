package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.c3u;
import p153l.cmp0;
import p153l.iam;
import p153l.jn50;
import p153l.l51;
import p153l.mvc0;
import p153l.nbc0;
import p153l.nus;
import p153l.o1j0;
import p153l.pzm;
import p153l.rg80;
import p153l.tm50;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareLiveVideoFrag extends LiveSquareBaseFrag implements iam<C12658a> {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f45849A;

    /* JADX INFO: renamed from: B */
    public VLinear f45850B;

    /* JADX INFO: renamed from: C */
    public VImage f45851C;

    /* JADX INFO: renamed from: D */
    public VText f45852D;

    /* JADX INFO: renamed from: E */
    public C12658a f45853E;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45854z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public /* synthetic */ void m70232q5(mvc0 mvc0Var) {
        this.f45853E.m70295T3();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (z) {
            l51.m152888H(getContext(), new Runnable() { // from class: l.b3u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74820a.m70240s5();
                }
            }, 500L);
        } else {
            this.f45853E.m70294S3(false);
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        C12658a c12658a = new C12658a(this, new nus(m71996Z4(), this));
        c12658a.m95556S2(this.tabInfo);
        c12658a.mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        super.mo70115Y4();
        C12658a c12658a = this.f45853E;
        if (c12658a != null) {
            c12658a.m70295T3();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: b5 */
    public boolean mo70233b5() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: c5 */
    public boolean mo70234c5() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: d5 */
    public boolean mo70235d5() {
        return true;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f45854z.mo224405O(new jn50() { // from class: l.z2u
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f202737a.m70232q5(mvc0Var);
            }
        });
        this.f45854z.m225001G(true);
        this.f45854z.mo224404M(new tm50() { // from class: l.a3u
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f68319a.m70239r5(mvc0Var);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70236n5(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n5 */
    public View m70236n5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c3u.m107812b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: o5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C12658a c12658a) {
        this.f45853E = c12658a;
        c12658a.mo70284I2();
    }

    /* JADX INFO: renamed from: p5 */
    public void m70238p5() {
        this.f45850B.setVisibility(8);
        this.f45849A.setVisibility(0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_featured";
    }

    /* JADX INFO: renamed from: r5 */
    public final /* synthetic */ void m70239r5(mvc0 mvc0Var) {
        o1j0.m165651y("我是有底线的");
        this.f45854z.m225016o();
    }

    /* JADX INFO: renamed from: s5 */
    public final /* synthetic */ void m70240s5() {
        pzm.m174537c().m174538a(true);
        if (!cmp0.m111299d().m111306h()) {
            cmp0.m111299d().m111301a();
        }
        this.f45853E.m70294S3(true);
    }

    /* JADX INFO: renamed from: t5 */
    public void m70241t5(boolean z) {
        rg80.m181401a().m181405e(true);
        this.f45850B.setVisibility(0);
        this.f45849A.setVisibility(8);
        this.f45852D.setText(z ? "当前网络不可用" : "暂时没有新的内容");
        this.f45851C.setImageResource(z ? nbc0.f141101F0 : nbc0.f141098E0);
    }
}
