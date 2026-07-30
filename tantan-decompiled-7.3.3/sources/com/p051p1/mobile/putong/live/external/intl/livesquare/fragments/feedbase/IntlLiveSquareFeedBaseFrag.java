package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12709a;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p051p1.mobile.putong.live.external.square.api.LiveBannerTabBean;
import com.tantanapp.common.utils.NullChecker;
import p153l.iam;
import p153l.j0u;
import p153l.j5o;
import p153l.k4o;
import p153l.m4o;
import p153l.mbs;
import p153l.mjj;
import p153l.mqr;
import p153l.mvc0;
import p153l.p1o;
import p153l.ppi0;
import p153l.qa00;
import p153l.qcj;
import p153l.t4u;
import p153l.tbs;
import p153l.x20;
import p153l.y20;
import p153l.z8o;

/* JADX INFO: loaded from: classes9.dex */
public abstract class IntlLiveSquareFeedBaseFrag<P extends k4o> extends IntlLiveSquareBaseListFrag implements C12709a.a, iam<P> {

    /* JADX INFO: renamed from: M */
    public BLiveSettings f46475M;

    /* JADX INFO: renamed from: O */
    public P f46477O;

    /* JADX INFO: renamed from: P */
    public boolean f46478P;

    /* JADX INFO: renamed from: L */
    public m4o f46474L = new m4o(this);

    /* JADX INFO: renamed from: N */
    public final j0u f46476N = j0u.m143007H0();

    /* JADX INFO: renamed from: Q */
    public boolean f46479Q = false;

    /* JADX INFO: renamed from: R */
    public boolean f46480R = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public void m71236C5() {
        if (NullChecker.m82486a(this.f46477O)) {
            this.f46477O.mo70300n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F5 */
    public /* synthetic */ void m71237F5(Integer num) {
        if (num.intValue() >= this.f46476N.getItemCount() - (this.layoutColumnNum * 5)) {
            this.f46477O.m148284h3(this.f46480R);
        }
    }

    /* JADX INFO: renamed from: H5 */
    private void m71238H5(boolean z) {
        this.f46477O.m148283g3();
        m71998g5(z);
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m71239w5(Bundle bundle) {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: B5 */
    public void mo22064i1(P p) {
        this.f46477O = p;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        p.m147984T2(this.tabInfo);
        p.mo70284I2();
        if (this.f46479Q) {
            return;
        }
        p.m148285i3();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: D5 */
    public BLiveSettings m71244D5() {
        if (this.f46475M == null) {
            this.f46475M = tbs.f172989b.m203370A3();
        }
        return this.f46475M;
    }

    /* JADX INFO: renamed from: E5 */
    public j5o m71245E5(z8o z8oVar, boolean z) {
        return new j5o(this.layoutColumnNum, z8oVar.m195327t(), z);
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m71246G5(Object obj) {
        mbs.m157834T(act(), Uri.parse((String) obj));
    }

    /* JADX INFO: renamed from: I5 */
    public void m71247I5() {
        if (this.f46476N.getItemCount() > 0) {
            this.f46421C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: J5 */
    public void m71248J5() {
        m71190v5();
        this.f46476N.m200145k0();
        this.f46476N.m143023I0();
    }

    /* JADX INFO: renamed from: K5 */
    public void m71249K5() {
        p1o.m170253d(this.f46476N);
    }

    /* JADX INFO: renamed from: L5 */
    public void m71250L5() {
        this.f46430z.m225015n();
    }

    /* JADX INFO: renamed from: M5 */
    public void m71251M5(Throwable th) {
        m71189u5();
    }

    /* JADX INFO: renamed from: N5 */
    public final void m71252N5() {
        if (this.f46476N.getItemCount() <= 0) {
            return;
        }
        j0u j0uVar = this.f46476N;
        j0uVar.notifyItemRangeChanged(0, j0uVar.getItemCount());
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (z) {
            if (i == 8 && this.f46478P) {
                this.f46478P = false;
                m71998g5(false);
            }
            boolean z2 = this.loaded;
            P p = this.f46477O;
            if (z2) {
                if (j > ((long) p.m147980P2()) * 1000) {
                    m71238H5(false);
                }
                this.f46476N.m143023I0();
                m71252N5();
            } else {
                p.m148283g3();
            }
            if (mqr.m159588h()) {
                mjj.m158583l();
            }
            ppi0.m173207l().m173211f();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        if (this.f46477O != null) {
            m71238H5(true);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.b4o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareFeedBaseFrag.m71239w5((Bundle) obj);
            }
        }, new x20() { // from class: l.c4o
            @Override // p153l.x20
            public final void call() {
                this.f79716a.m71236C5();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: f5 */
    public void mo71253f5() {
        super.mo71253f5();
        this.f46476N.m143025K0();
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((FrameLayout.LayoutParams) this.f46430z.getLayoutParams()).topMargin = qa00.f156316c;
        if (this.layoutColumnNum < 1) {
            this.layoutColumnNum = 2;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        this.f46421C.setLayoutManager(staggeredGridLayoutManager);
        staggeredGridLayoutManager.m3514U(2);
        this.f46421C.setItemAnimator(null);
        this.f46476N.m68552X(false);
        this.f46476N.m200148n0(this, LiveTeenDialogAct.f47064g);
        this.f46476N.m143018C0(this, true);
        this.f46476N.m68558c0(new y20() { // from class: l.d4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85058a.m71237F5((Integer) obj);
            }
        });
        if (mqr.m159592l()) {
            this.f46476N.m143016A0(t4u.m189320i().asObservable().map(new qcj() { // from class: l.e4o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((Boolean) obj).booleanValue());
                }
            }), this, "LiveSquareHomeFrag");
        }
        this.f46421C.setAdapter(this.f46476N);
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab.C12709a.a
    /* JADX INFO: renamed from: t3 */
    public void mo71254t3(LiveBannerTabBean liveBannerTabBean) {
        String str = liveBannerTabBean.jumpUrl;
        if (TextUtils.isEmpty(str) || !str.contains("tantanapp://liveBannerCustom")) {
            mbs.m157834T(act(), Uri.parse(str));
        } else {
            this.f46477O.m148276Z2(str, new y20() { // from class: l.f4o
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97122a.m71246G5(obj);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m71238H5(true);
    }
}
