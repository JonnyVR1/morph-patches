package com.p051p1.mobile.putong.live.external.internal.live.square;

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
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
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
import p153l.j1u;
import p153l.jn50;
import p153l.jyb;
import p153l.l51;
import p153l.mvc0;
import p153l.nbc0;
import p153l.nus;
import p153l.p5u;
import p153l.pcj;
import p153l.ppi0;
import p153l.qa00;
import p153l.r0u;
import p153l.r1u;
import p153l.r6s;
import p153l.tbs;
import p153l.x20;
import p153l.xbu;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSquareCommonFeedFrag extends LiveSquareBaseFrag implements jn50, iam<r1u> {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f45789A;

    /* JADX INFO: renamed from: B */
    public VText f45790B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f45791C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f45792D;

    /* JADX INFO: renamed from: E */
    public VImage f45793E;

    /* JADX INFO: renamed from: F */
    public VText f45794F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f45795G;

    /* JADX INFO: renamed from: H */
    public VImage f45796H;

    /* JADX INFO: renamed from: I */
    public VText f45797I;

    /* JADX INFO: renamed from: J */
    public VText f45798J;

    /* JADX INFO: renamed from: L */
    public LiveSquareTabBean f45800L;

    /* JADX INFO: renamed from: M */
    public BLiveSettings f45801M;

    /* JADX INFO: renamed from: O */
    public r1u f45803O;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45804z;

    /* JADX INFO: renamed from: K */
    public boolean f45799K = false;

    /* JADX INFO: renamed from: N */
    public final r0u f45802N = r0u.m179247J0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag$a */
    public class C12651a extends GridLayoutManager.AbstractC0554c {
        public C12651a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return LiveSquareCommonFeedFrag.this.f45802N.m68539K(i);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m70095m5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m70100w5(View view) {
        mo59137w2(this.f45804z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public /* synthetic */ void m70101y5(View view) {
        act().startActivity(LiveSearchAct.m72011Z1(act()));
        i4g0.m138520r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m70102A5() {
        this.f45789A.setExpanded(false);
    }

    /* JADX INFO: renamed from: B5 */
    public final void m70103B5(boolean z) {
        this.f45803O.m179451i3();
        m71998g5(z);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public void m70104C5() {
        m70112K5();
        this.f45802N.m200145k0();
        this.f45802N.m179262K0();
    }

    /* JADX INFO: renamed from: D5 */
    public void m70105D5() {
        m71999h5(this.f45802N);
    }

    /* JADX INFO: renamed from: E5 */
    public void m70106E5() {
        this.f45804z.m225015n();
    }

    /* JADX INFO: renamed from: F5 */
    public void m70107F5(Throwable th) {
        m70111J5();
    }

    /* JADX INFO: renamed from: G5 */
    public void m70108G5() {
        if (this.f45802N.getItemCount() > 0) {
            this.f45791C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public void m70109H5(p5u p5uVar) {
        if (m70119u5() == null) {
            m70107F5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        ArrayList<r6s> arrayListM210005c = xbu.m210005c(p5uVar, this.f45800L);
        hk4 hk4Var = new hk4(this);
        hk4Var.m135617c(1);
        arrayList.addAll(e4s.m119474b(hk4Var, arrayListM210005c));
        m70110I5(!jyb.m147479J(arrayList), !jyb.m147479J(arrayList));
        if (!jyb.m147479J(arrayList)) {
            arrayList.add(m70120v5(p5uVar, true));
        }
        this.f45802N.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: I5 */
    public void m70110I5(boolean z, boolean z2) {
        bnl0.m105525M0(this.f45791C, z);
        bnl0.m105525M0(this.f45792D, !z2);
        if (ppi0.m173207l().m173228x()) {
            this.f45794F.setText(tbs.f172988a.getString(R$string.f45781w));
            this.f45793E.setImageResource(nbc0.f141117N0);
        }
        this.f45795G.setVisibility(4);
    }

    /* JADX INFO: renamed from: J5 */
    public void m70111J5() {
        this.f45795G.setVisibility(0);
        this.f45791C.setVisibility(4);
        this.f45792D.setVisibility(4);
    }

    /* JADX INFO: renamed from: K5 */
    public void m70112K5() {
        this.f45804z.m225021t();
        if (this.f45799K || !isAdded() || isRemoving()) {
            return;
        }
        this.f45799K = true;
        l51.m152889I(this, new Runnable() { // from class: l.i1u
            @Override // java.lang.Runnable
            public final void run() {
                this.f112550a.m70102A5();
            }
        }, 200L);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (!z) {
            this.f45802N.m179263L0();
            return;
        }
        boolean z2 = this.loaded;
        r1u r1uVar = this.f45803O;
        if (z2) {
            if (j > ((long) r1uVar.m95554P2()) * 1000) {
                m70103B5(false);
            }
            this.f45802N.m179262K0();
        } else {
            r1uVar.m179451i3();
        }
        if (this.tabInfo.name.contains("voice")) {
            return;
        }
        ppi0.m173207l().m173211f();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        new r1u(this, new nus(m71996Z4(), this)).mo52715C(this);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        if (this.f45803O != null) {
            m70103B5(true);
            m70108G5();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        if (this.f45800L == null && getArguments() != null) {
            this.f45800L = (LiveSquareTabBean) getArguments().getSerializable("TAB_INFO_BEAN");
        }
        if (this.f45800L == null) {
            this.f45800L = new LiveSquareTabBean();
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.b1u
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveSquareCommonFeedFrag.m70095m5((Bundle) obj);
            }
        }, new x20() { // from class: l.c1u
            @Override // p153l.x20
            public final void call() {
                this.f79434a.m70118t5();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f45798J.setOnClickListener(new View.OnClickListener() { // from class: l.d1u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84721a.m70100w5(view);
            }
        });
        this.f45804z.mo224405O(this);
        this.f45789A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.e1u
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f91673a.m70121x5(appBarLayout, i);
            }
        });
        String strM203675m5 = tbs.f172989b.m203675m5();
        if (!TextUtils.isEmpty(strM203675m5)) {
            this.f45790B.setHint(strM203675m5);
        }
        bnl0.m105509E0(this.f45790B, new View.OnClickListener() { // from class: l.f1u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96830a.m70101y5(view);
            }
        });
        ((FrameLayout.LayoutParams) this.f45804z.getLayoutParams()).topMargin = qa00.f156316c;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 6);
        gridLayoutManager.m3327v(new C12651a());
        this.f45791C.setLayoutManager(gridLayoutManager);
        this.f45791C.setItemAnimator(null);
        this.f45802N.m68552X(false);
        this.f45802N.m200149o0(this, new pcj() { // from class: l.g1u
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f101779a.m72004Q4());
            }
        }, LiveTeenDialogAct.f47064g);
        this.f45802N.m179257E0(this, true);
        this.f45802N.m68558c0(new y20() { // from class: l.h1u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107481a.m70122z5((Integer) obj);
            }
        });
        this.f45791C.setAdapter(this.f45802N);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70116r5(layoutInflater, viewGroup);
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
    public View m70116r5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return j1u.m143153b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: s5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(r1u r1uVar) {
        this.f45803O = r1uVar;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        r1uVar.m95556S2(this.tabInfo);
        r1uVar.mo70284I2();
        if (this.f45800L.disableReplaceStopped) {
            return;
        }
        r1uVar.m179453k3();
    }

    /* JADX INFO: renamed from: t5 */
    public final void m70118t5() {
        if (NullChecker.m82486a(this.f45803O)) {
            this.f45803O.mo70300n();
        }
    }

    /* JADX INFO: renamed from: u5 */
    public BLiveSettings m70119u5() {
        if (this.f45801M == null) {
            this.f45801M = tbs.f172989b.m203370A3();
        }
        return this.f45801M;
    }

    /* JADX INFO: renamed from: v5 */
    public h2u m70120v5(p5u p5uVar, boolean z) {
        return new h2u(6, p5uVar.m195327t(), z);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        m70103B5(true);
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m70121x5(AppBarLayout appBarLayout, int i) {
        this.f45804z.m225003I(i >= 0);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m70122z5(Integer num) {
        if (num.intValue() >= this.f45802N.getItemCount() - 2) {
            this.f45803O.m179452j3(this.f45800L.disableFilterRepeat);
        }
    }
}
