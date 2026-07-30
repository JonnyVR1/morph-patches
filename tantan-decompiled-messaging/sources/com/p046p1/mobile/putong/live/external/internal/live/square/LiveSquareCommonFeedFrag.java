package com.p046p1.mobile.putong.live.external.internal.live.square;

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
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveSquareTabBean;
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
import p149l.h3c0;
import p149l.hnc0;
import p149l.ij4;
import p149l.izt;
import p149l.mss;
import p149l.o3u;
import p149l.pgi0;
import p149l.q4s;
import p149l.qyt;
import p149l.qzt;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.v9j;
import p149l.vwb;
import p149l.w9u;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareCommonFeedFrag extends LiveSquareBaseFrag implements df50, s7m<qzt> {

    /* JADX INFO: renamed from: A */
    public AppBarLayout f44941A;

    /* JADX INFO: renamed from: B */
    public VText f44942B;

    /* JADX INFO: renamed from: C */
    public VRecyclerView f44943C;

    /* JADX INFO: renamed from: D */
    public NestedScrollView f44944D;

    /* JADX INFO: renamed from: E */
    public VImage f44945E;

    /* JADX INFO: renamed from: F */
    public VText f44946F;

    /* JADX INFO: renamed from: G */
    public NestedScrollView f44947G;

    /* JADX INFO: renamed from: H */
    public VImage f44948H;

    /* JADX INFO: renamed from: I */
    public VText f44949I;

    /* JADX INFO: renamed from: J */
    public VText f44950J;

    /* JADX INFO: renamed from: L */
    public LiveSquareTabBean f44952L;

    /* JADX INFO: renamed from: M */
    public BLiveSettings f44953M;

    /* JADX INFO: renamed from: O */
    public qzt f44955O;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f44956z;

    /* JADX INFO: renamed from: K */
    public boolean f44951K = false;

    /* JADX INFO: renamed from: N */
    public final qyt f44954N = qyt.m177065J0();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.LiveSquareCommonFeedFrag$a */
    public class C12488a extends GridLayoutManager.AbstractC0553c {
        public C12488a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return LiveSquareCommonFeedFrag.this.f44954N.m67356K(i);
        }
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m68912m5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w5 */
    public /* synthetic */ void m68917w5(View view) {
        mo57954w2(this.f44956z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public /* synthetic */ void m68918y5(View view) {
        act().startActivity(LiveSearchAct.m70828Y1(act()));
        zvf0.m220396r("e_anchor_search", "p_audio_explore_recommend");
    }

    /* JADX INFO: renamed from: A5 */
    public final /* synthetic */ void m68919A5() {
        this.f44941A.setExpanded(false);
    }

    /* JADX INFO: renamed from: B5 */
    public final void m68920B5(boolean z) {
        this.f44955O.m177293i3();
        m70815g5(z);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: C5 */
    public void m68921C5() {
        m68929K5();
        this.f44954N.m191777k0();
        this.f44954N.m177080K0();
    }

    /* JADX INFO: renamed from: D5 */
    public void m68922D5() {
        m70816h5(this.f44954N);
    }

    /* JADX INFO: renamed from: E5 */
    public void m68923E5() {
        this.f44956z.m223769n();
    }

    /* JADX INFO: renamed from: F5 */
    public void m68924F5(Throwable th) {
        m68928J5();
    }

    /* JADX INFO: renamed from: G5 */
    public void m68925G5() {
        if (this.f44954N.getItemCount() > 0) {
            this.f44943C.scrollToPosition(0);
        }
    }

    /* JADX INFO: renamed from: H5 */
    public void m68926H5(o3u o3uVar) {
        if (m68936u5() == null) {
            m68924F5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        ArrayList<q4s> arrayListM202353c = w9u.m202353c(o3uVar, this.f44952L);
        ij4 ij4Var = new ij4(this);
        ij4Var.m136506c(1);
        arrayList.addAll(d2s.m109829b(ij4Var, arrayListM202353c));
        m68927I5(!vwb.m200296J(arrayList), !vwb.m200296J(arrayList));
        if (!vwb.m200296J(arrayList)) {
            arrayList.add(m68937v5(o3uVar, true));
        }
        this.f44954N.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: I5 */
    public void m68927I5(boolean z, boolean z2) {
        xdl0.m208345M0(this.f44943C, z);
        xdl0.m208345M0(this.f44944D, !z2);
        if (pgi0.m168730l().m168751x()) {
            this.f44946F.setText(s9s.f163227a.getString(R$string.f44933w));
            this.f44945E.setImageResource(h3c0.f105626N0);
        }
        this.f44947G.setVisibility(4);
    }

    /* JADX INFO: renamed from: J5 */
    public void m68928J5() {
        this.f44947G.setVisibility(0);
        this.f44943C.setVisibility(4);
        this.f44944D.setVisibility(4);
    }

    /* JADX INFO: renamed from: K5 */
    public void m68929K5() {
        this.f44956z.m223775t();
        if (this.f44951K || !isAdded() || isRemoving()) {
            return;
        }
        this.f44951K = true;
        e51.m114744I(this, new Runnable() { // from class: l.hzt
            @Override // java.lang.Runnable
            public final void run() {
                this.f110225a.m68919A5();
            }
        }, 200L);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (!z) {
            this.f44954N.m177081L0();
            return;
        }
        boolean z2 = this.loaded;
        qzt qztVar = this.f44955O;
        if (z2) {
            if (j > ((long) qztVar.m220946P2()) * 1000) {
                m68920B5(false);
            }
            this.f44954N.m177080K0();
        } else {
            qztVar.m177293i3();
        }
        if (this.tabInfo.name.contains("voice")) {
            return;
        }
        pgi0.m168730l().m168734f();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        new qzt(this, new mss(m70813Z4(), this)).mo51532C(this);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        if (this.f44955O != null) {
            m68920B5(true);
            m68925G5();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        if (this.f44952L == null && getArguments() != null) {
            this.f44952L = (LiveSquareTabBean) getArguments().getSerializable("TAB_INFO_BEAN");
        }
        if (this.f44952L == null) {
            this.f44952L = new LiveSquareTabBean();
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.azt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveSquareCommonFeedFrag.m68912m5((Bundle) obj);
            }
        }, new d30() { // from class: l.bzt
            @Override // p149l.d30
            public final void call() {
                this.f78059a.m68935t5();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f44950J.setOnClickListener(new View.OnClickListener() { // from class: l.czt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83108a.m68917w5(view);
            }
        });
        this.f44956z.mo223159O(this);
        this.f44941A.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: l.dzt
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                this.f88508a.m68938x5(appBarLayout, i);
            }
        });
        String strM195888m5 = s9s.f163228b.m195888m5();
        if (!TextUtils.isEmpty(strM195888m5)) {
            this.f44942B.setHint(strM195888m5);
        }
        xdl0.m208329E0(this.f44942B, new View.OnClickListener() { // from class: l.ezt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93942a.m68918y5(view);
            }
        });
        ((FrameLayout.LayoutParams) this.f44956z.getLayoutParams()).topMargin = t100.f167254c;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 6);
        gridLayoutManager.m3326v(new C12488a());
        this.f44943C.setLayoutManager(gridLayoutManager);
        this.f44943C.setItemAnimator(null);
        this.f44954N.m67369X(false);
        this.f44954N.m191781o0(this, new v9j() { // from class: l.fzt
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.f99998a.m70821Q4());
            }
        }, LiveTeenDialogAct.f46216g);
        this.f44954N.m177075E0(this, true);
        this.f44954N.m67375c0(new e30() { // from class: l.gzt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105174a.m68939z5((Integer) obj);
            }
        });
        this.f44943C.setAdapter(this.f44954N);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m68933r5(layoutInflater, viewGroup);
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
    public View m68933r5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return izt.m139074b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: s5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qzt qztVar) {
        this.f44955O = qztVar;
        if (this.tabInfo == null) {
            this.tabInfo = new BLiveSquareTab();
        }
        qztVar.m220948S2(this.tabInfo);
        qztVar.mo69101I2();
        if (this.f44952L.disableReplaceStopped) {
            return;
        }
        qztVar.m177295k3();
    }

    /* JADX INFO: renamed from: t5 */
    public final void m68935t5() {
        if (NullChecker.m81303a(this.f44955O)) {
            this.f44955O.mo69117n();
        }
    }

    /* JADX INFO: renamed from: u5 */
    public BLiveSettings m68936u5() {
        if (this.f44953M == null) {
            this.f44953M = s9s.f163228b.m195583A3();
        }
        return this.f44953M;
    }

    /* JADX INFO: renamed from: v5 */
    public g0u m68937v5(o3u o3uVar, boolean z) {
        return new g0u(6, o3uVar.m187673t(), z);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        m68920B5(true);
    }

    /* JADX INFO: renamed from: x5 */
    public final /* synthetic */ void m68938x5(AppBarLayout appBarLayout, int i) {
        this.f44956z.m223757I(i >= 0);
    }

    /* JADX INFO: renamed from: z5 */
    public final /* synthetic */ void m68939z5(Integer num) {
        if (num.intValue() >= this.f44954N.getItemCount() - 2) {
            this.f44955O.m177294j3(this.f44952L.disableFilterRepeat);
        }
    }
}
