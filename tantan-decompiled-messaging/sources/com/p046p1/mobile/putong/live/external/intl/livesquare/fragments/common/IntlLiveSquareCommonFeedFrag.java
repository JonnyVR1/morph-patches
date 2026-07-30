package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common;

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
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.square.search.LiveSearchAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.d2s;
import p149l.d30;
import p149l.df50;
import p149l.e30;
import p149l.e51;
import p149l.g0u;
import p149l.hnc0;
import p149l.ij4;
import p149l.l8o;
import p149l.mss;
import p149l.o3u;
import p149l.q1o;
import p149l.q4s;
import p149l.qyt;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.v9j;
import p149l.vwb;
import p149l.xdl0;
import p149l.y1o;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareCommonFeedFrag extends LiveSquareBaseFrag implements df50, s7m<y1o> {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f45583A;

    /* JADX INFO: renamed from: B */
    public VText f45584B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f45585C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f45586D;

    /* JADX INFO: renamed from: E */
    public VImage f45587E;

    /* JADX INFO: renamed from: F */
    public VText f45588F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f45589G;

    /* JADX INFO: renamed from: H */
    public VImage f45590H;

    /* JADX INFO: renamed from: I */
    public VText f45591I;

    /* JADX INFO: renamed from: J */
    public VText f45592J;

    /* JADX INFO: renamed from: L */
    public LiveSquareTabBean f45594L;

    /* JADX INFO: renamed from: M */
    public BLiveSettings f45595M;

    /* JADX INFO: renamed from: O */
    public y1o f45597O;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45598z;

    /* JADX INFO: renamed from: K */
    public boolean f45593K = false;

    /* JADX INFO: renamed from: N */
    public final qyt f45596N = qyt.m177065J0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.common.IntlLiveSquareCommonFeedFrag$a */
    public class C12541a extends GridLayoutManager.AbstractC0553c {
        public C12541a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return IntlLiveSquareCommonFeedFrag.this.f45596N.m67356K(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A5 */
    public /* synthetic */ void m70008A5() {
        this.f45583A.setExpanded(false);
    }

    /* JADX INFO: renamed from: B5 */
    private void m70009B5(boolean z) {
        this.f45597O.m212257i3();
        m70815g5(z);
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m70015p5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public void m70017t5() {
        if (NullChecker.m81303a(this.f45597O)) {
            this.f45597O.mo69117n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m70018w5(View view) {
        mo57954w2(this.f45598z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x5 */
    public /* synthetic */ void m70019x5(AppBarLayout appBarLayout, int i) {
        this.f45598z.m223757I(i >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public /* synthetic */ void m70020y5(View view) {
        act().startActivity(LiveSearchAct.m70828Y1(act()));
        zvf0.m220396r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z5 */
    public /* synthetic */ void m70021z5(Integer num) {
        if (num.intValue() == this.f45596N.getItemCount() - 2) {
            this.f45597O.m212258j3(this.f45594L.disableFilterRepeat);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public void m70022C5() {
        m70030K5();
        this.f45596N.m191777k0();
        this.f45596N.m177080K0();
    }

    /* JADX INFO: renamed from: D5 */
    public void m70023D5() {
        m70816h5(this.f45596N);
    }

    /* JADX INFO: renamed from: E5 */
    public void m70024E5() {
        this.f45598z.m223769n();
    }

    /* JADX INFO: renamed from: F5 */
    public void m70025F5(Throwable th) {
        m70029J5();
    }

    /* JADX INFO: renamed from: G5 */
    public void m70026G5() {
        if (this.f45596N.getItemCount() > 0) {
            this.f45585C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public void m70027H5(o3u o3uVar) {
        if (m70033u5() == null) {
            m70025F5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        ArrayList<q4s> arrayListM148945c = l8o.m148945c(o3uVar, this.f45594L);
        ij4 ij4Var = new ij4(act());
        ij4Var.m136506c(1);
        arrayList.addAll(d2s.m109829b(ij4Var, arrayListM148945c));
        m70028I5(!vwb.m200296J(arrayList), !vwb.m200296J(arrayList));
        if (!vwb.m200296J(arrayList)) {
            arrayList.add(m70034v5(o3uVar, true));
        }
        this.f45596N.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: I5 */
    public void m70028I5(boolean z, boolean z2) {
        xdl0.m208345M0(this.f45585C, z);
        xdl0.m208345M0(this.f45586D, !z2);
        this.f45589G.setVisibility(4);
    }

    /* JADX INFO: renamed from: J5 */
    public void m70029J5() {
        this.f45589G.setVisibility(0);
        this.f45585C.setVisibility(4);
        this.f45586D.setVisibility(4);
    }

    /* JADX INFO: renamed from: K5 */
    public void m70030K5() {
        this.f45598z.m223775t();
        if (this.f45593K || !isAdded() || isRemoving()) {
            return;
        }
        this.f45593K = true;
        e51.m114744I(this, new Runnable() { // from class: l.p1o
            @Override // java.lang.Runnable
            public final void run() {
                this.f146749a.m70008A5();
            }
        }, 200L);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (!z) {
            this.f45596N.m177081L0();
            return;
        }
        boolean z2 = this.loaded;
        y1o y1oVar = this.f45597O;
        if (!z2) {
            y1oVar.m212257i3();
            return;
        }
        if (j > ((long) y1oVar.m220946P2()) * 1000) {
            m70009B5(false);
        }
        this.f45596N.m177080K0();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        new y1o(this, new mss(m70813Z4(), this)).mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        if (this.f45597O != null) {
            m70009B5(true);
            m70026G5();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        if (this.f45594L == null && getArguments() != null) {
            this.f45594L = (LiveSquareTabBean) getArguments().getSerializable("TAB_INFO_BEAN");
        }
        if (this.f45594L == null) {
            this.f45594L = new LiveSquareTabBean();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.i1o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareCommonFeedFrag.m70015p5((Bundle) obj);
            }
        }, new d30() { // from class: l.j1o
            @Override // p149l.d30
            public final void call() {
                this.f115824a.m70017t5();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45592J.setOnClickListener(new View.OnClickListener() { // from class: l.k1o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120635a.m70018w5(view);
            }
        });
        this.f45598z.mo223159O(this);
        this.f45583A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.l1o
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f125673a.m70019x5(appBarLayout, i);
            }
        });
        String strM195888m5 = s9s.f163228b.m195888m5();
        if (!TextUtils.isEmpty(strM195888m5)) {
            this.f45584B.setHint(strM195888m5);
        }
        xdl0.m208329E0(this.f45584B, new View.OnClickListener() { // from class: l.m1o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130842a.m70020y5(view);
            }
        });
        ((FrameLayout.LayoutParams) this.f45598z.getLayoutParams()).topMargin = t100.f167254c;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 6);
        gridLayoutManager.m3326v(new C12541a());
        this.f45585C.setLayoutManager(gridLayoutManager);
        this.f45585C.setItemAnimator(null);
        this.f45596N.m67369X(false);
        this.f45596N.m191781o0(this, new v9j() { // from class: l.n1o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f136677a.m70821Q4());
            }
        }, LiveTeenDialogAct.f46216g);
        this.f45596N.m177075E0(this, true);
        this.f45596N.m67375c0(new e30() { // from class: l.o1o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141466a.m70021z5((Integer) obj);
            }
        });
        this.f45585C.setAdapter(this.f45596N);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70031r5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        if (this.tabInfo == null && getArguments() != null) {
            this.tabInfo = (BLiveSquareTab) getArguments().getSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        return (bLiveSquareTab == null || TextUtils.isEmpty(bLiveSquareTab.pageId)) ? "p_live_recommend" : this.tabInfo.pageId;
    }

    /* JADX INFO: renamed from: r5 */
    public View m70031r5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q1o.m172400b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(y1o y1oVar) {
        this.f45597O = y1oVar;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        y1oVar.m220948S2(this.tabInfo);
        y1oVar.mo69101I2();
        if (this.f45594L.disableReplaceStopped) {
            return;
        }
        y1oVar.m212259k3();
    }

    /* JADX INFO: renamed from: u5 */
    public BLiveSettings m70033u5() {
        if (this.f45595M == null) {
            this.f45595M = s9s.f163228b.m195583A3();
        }
        return this.f45595M;
    }

    /* JADX INFO: renamed from: v5 */
    public g0u m70034v5(o3u o3uVar, boolean z) {
        return new g0u(6, o3uVar.m187673t(), z);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m70009B5(true);
    }
}
