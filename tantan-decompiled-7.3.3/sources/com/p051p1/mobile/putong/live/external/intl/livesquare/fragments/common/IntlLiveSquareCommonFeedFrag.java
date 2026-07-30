package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.e4s;
import p153l.h2u;
import p153l.hk4;
import p153l.i4g0;
import p153l.iam;
import p153l.jn50;
import p153l.jyb;
import p153l.l51;
import p153l.lao;
import p153l.mvc0;
import p153l.nus;
import p153l.p5u;
import p153l.pcj;
import p153l.q3o;
import p153l.qa00;
import p153l.r0u;
import p153l.r6s;
import p153l.tbs;
import p153l.x20;
import p153l.y20;
import p153l.y3o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareCommonFeedFrag extends LiveSquareBaseFrag implements jn50, iam<y3o> {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f46431A;

    /* JADX INFO: renamed from: B */
    public VText f46432B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f46433C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f46434D;

    /* JADX INFO: renamed from: E */
    public VImage f46435E;

    /* JADX INFO: renamed from: F */
    public VText f46436F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f46437G;

    /* JADX INFO: renamed from: H */
    public VImage f46438H;

    /* JADX INFO: renamed from: I */
    public VText f46439I;

    /* JADX INFO: renamed from: J */
    public VText f46440J;

    /* JADX INFO: renamed from: L */
    public LiveSquareTabBean f46442L;

    /* JADX INFO: renamed from: M */
    public BLiveSettings f46443M;

    /* JADX INFO: renamed from: O */
    public y3o f46445O;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f46446z;

    /* JADX INFO: renamed from: K */
    public boolean f46441K = false;

    /* JADX INFO: renamed from: N */
    public final r0u f46444N = r0u.m179247J0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag$a */
    public class C12704a extends GridLayoutManager.AbstractC0554c {
        public C12704a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return IntlLiveSquareCommonFeedFrag.this.f46444N.m68539K(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A5 */
    public /* synthetic */ void m71191A5() {
        this.f46431A.setExpanded(false);
    }

    /* JADX INFO: renamed from: B5 */
    private void m71192B5(boolean z) {
        this.f46445O.m214167i3();
        m71998g5(z);
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m71198p5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public void m71200t5() {
        if (NullChecker.m82486a(this.f46445O)) {
            this.f46445O.mo70300n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m71201w5(View view) {
        mo59137w2(this.f46446z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x5 */
    public /* synthetic */ void m71202x5(AppBarLayout appBarLayout, int i) {
        this.f46446z.m225003I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public /* synthetic */ void m71203y5(View view) {
        act().startActivity(LiveSearchAct.m72011Z1(act()));
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m71204z5(Integer num) {
        if (num.intValue() == this.f46444N.getItemCount() - 2) {
            this.f46445O.m214168j3(this.f46442L.disableFilterRepeat);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public void m71205C5() {
        m71213K5();
        this.f46444N.m200145k0();
        this.f46444N.m179262K0();
    }

    /* JADX INFO: renamed from: D5 */
    public void m71206D5() {
        m71999h5(this.f46444N);
    }

    /* JADX INFO: renamed from: E5 */
    public void m71207E5() {
        this.f46446z.m225015n();
    }

    /* JADX INFO: renamed from: F5 */
    public void m71208F5(Throwable th) {
        m71212J5();
    }

    /* JADX INFO: renamed from: G5 */
    public void m71209G5() {
        if (this.f46444N.getItemCount() > 0) {
            this.f46433C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public void m71210H5(p5u p5uVar) {
        if (m71216u5() == null) {
            m71208F5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        ArrayList<r6s> arrayListM153519c = lao.m153519c(p5uVar, this.f46442L);
        hk4 hk4Var = new hk4(act());
        hk4Var.m135617c(1);
        arrayList.addAll(e4s.m119474b(hk4Var, arrayListM153519c));
        m71211I5(!jyb.m147479J(arrayList), !jyb.m147479J(arrayList));
        if (!jyb.m147479J(arrayList)) {
            arrayList.add(m71217v5(p5uVar, true));
        }
        this.f46444N.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: I5 */
    public void m71211I5(boolean z, boolean z2) {
        bnl0.m105525M0(this.f46433C, z);
        bnl0.m105525M0(this.f46434D, !z2);
        this.f46437G.setVisibility(4);
    }

    /* JADX INFO: renamed from: J5 */
    public void m71212J5() {
        this.f46437G.setVisibility(0);
        this.f46433C.setVisibility(4);
        this.f46434D.setVisibility(4);
    }

    /* JADX INFO: renamed from: K5 */
    public void m71213K5() {
        this.f46446z.m225021t();
        if (this.f46441K || !isAdded() || isRemoving()) {
            return;
        }
        this.f46441K = true;
        l51.m152889I(this, new Runnable() { // from class: l.p3o
            @Override // java.lang.Runnable
            public final void run() {
                this.f150456a.m71191A5();
            }
        }, 200L);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (!z) {
            this.f46444N.m179263L0();
            return;
        }
        boolean z2 = this.loaded;
        y3o y3oVar = this.f46445O;
        if (!z2) {
            y3oVar.m214167i3();
            return;
        }
        if (j > ((long) y3oVar.m95554P2()) * 1000) {
            m71192B5(false);
        }
        this.f46444N.m179262K0();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        new y3o(this, new nus(m71996Z4(), this)).mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        if (this.f46445O != null) {
            m71192B5(true);
            m71209G5();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        if (this.f46442L == null && getArguments() != null) {
            this.f46442L = (LiveSquareTabBean) getArguments().getSerializable("TAB_INFO_BEAN");
        }
        if (this.f46442L == null) {
            this.f46442L = new LiveSquareTabBean();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.i3o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareCommonFeedFrag.m71198p5((Bundle) obj);
            }
        }, new x20() { // from class: l.j3o
            @Override // p153l.x20
            public final void call() {
                this.f118202a.m71200t5();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46440J.setOnClickListener(new View.OnClickListener() { // from class: l.k3o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123729a.m71201w5(view);
            }
        });
        this.f46446z.mo224405O(this);
        this.f46431A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.l3o
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f129899a.m71202x5(appBarLayout, i);
            }
        });
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            this.f46432B.setHint(strM203675m5);
        }
        bnl0.m105509E0(this.f46432B, new View.OnClickListener() { // from class: l.m3o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134681a.m71203y5(view);
            }
        });
        ((FrameLayout.LayoutParams) this.f46446z.getLayoutParams()).topMargin = qa00.f156316c;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 6);
        gridLayoutManager.m3327v(new C12704a());
        this.f46433C.setLayoutManager(gridLayoutManager);
        this.f46433C.setItemAnimator(null);
        this.f46444N.m68552X(false);
        this.f46444N.m200149o0(this, new pcj() { // from class: l.n3o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f140022a.m72004Q4());
            }
        }, LiveTeenDialogAct.f47064g);
        this.f46444N.m179257E0(this, true);
        this.f46444N.m68558c0(new y20() { // from class: l.o3o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144846a.m71204z5((Integer) obj);
            }
        });
        this.f46433C.setAdapter(this.f46444N);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71214r5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        if (this.tabInfo == null && getArguments() != null) {
            this.tabInfo = (BLiveSquareTab) getArguments().getSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        return (bLiveSquareTab == null || TextUtils.isEmpty(bLiveSquareTab.pageId)) ? "p_live_recommend" : this.tabInfo.pageId;
    }

    /* JADX INFO: renamed from: r5 */
    public View m71214r5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q3o.m175147b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(y3o y3oVar) {
        this.f46445O = y3oVar;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        y3oVar.m95556S2(this.tabInfo);
        y3oVar.mo70284I2();
        if (this.f46442L.disableReplaceStopped) {
            return;
        }
        y3oVar.m214169k3();
    }

    /* JADX INFO: renamed from: u5 */
    public BLiveSettings m71216u5() {
        if (this.f46443M == null) {
            this.f46443M = tbs.f172989b.m203370A3();
        }
        return this.f46443M;
    }

    /* JADX INFO: renamed from: v5 */
    public h2u m71217v5(p5u p5uVar, boolean z) {
        return new h2u(6, p5uVar.m195327t(), z);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m71192B5(true);
    }
}
