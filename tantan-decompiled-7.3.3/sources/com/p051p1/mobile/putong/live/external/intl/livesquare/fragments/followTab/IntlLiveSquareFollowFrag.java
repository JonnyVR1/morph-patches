package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0602f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlFollowVText;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VRelative;
import p153l.bnl0;
import p153l.d3q;
import p153l.dhw;
import p153l.dtr;
import p153l.fk3;
import p153l.fm3;
import p153l.gm3;
import p153l.i5o;
import p153l.iam;
import p153l.itd0;
import p153l.jn50;
import p153l.jxd0;
import p153l.jyb;
import p153l.kcg0;
import p153l.mbs;
import p153l.mvc0;
import p153l.mvn;
import p153l.nus;
import p153l.ovn;
import p153l.psd0;
import p153l.qcj;
import p153l.qrr;
import p153l.str;
import p153l.tbs;
import p153l.twn;
import p153l.x20;
import p153l.x4o;
import p153l.xec0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public final class IntlLiveSquareFollowFrag extends LiveSquareBaseFrag implements iam<i5o>, jn50 {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f46499A;

    /* JADX INFO: renamed from: B */
    public VRelative f46500B;

    /* JADX INFO: renamed from: C */
    public VImage f46501C;

    /* JADX INFO: renamed from: D */
    public VRelative f46502D;

    /* JADX INFO: renamed from: E */
    public VImage f46503E;

    /* JADX INFO: renamed from: G */
    public i5o f46505G;

    /* JADX INFO: renamed from: J */
    public twn f46508J;

    /* JADX INFO: renamed from: K */
    public kcg0 f46509K;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f46510z;

    /* JADX INFO: renamed from: F */
    public final String f46504F = IntlLiveSquareFollowFrag.class.getSimpleName();

    /* JADX INFO: renamed from: H */
    public LiveBaseAdapter f46506H = new LiveBaseAdapter();

    /* JADX INFO: renamed from: I */
    public jxd0 f46507I = new jxd0("intl_has_live_follow_activities_recommend_shown" + mbs.m157870o0(), Boolean.FALSE);

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag$a */
    public class C12705a extends C0602f {
        public C12705a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC0618v
        public void onAddFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            if (IntlLiveSquareFollowFrag.this.f46507I.get().booleanValue()) {
                return;
            }
            View view = abstractC0569e0.itemView;
            if (view instanceof LiveActivitiesItemView) {
                IntlLiveSquareFollowFrag.this.m71271M5(((LiveActivitiesItemView) view).f47162h);
                IntlLiveSquareFollowFrag.this.f46507I.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag$b */
    public class C12706b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f46512a = false;

        public C12706b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i == 0 && this.f46512a && linearLayoutManager.findLastCompletelyVisibleItemPosition() >= IntlLiveSquareFollowFrag.this.f46506H.getItemCount() - 5) {
                IntlLiveSquareFollowFrag.this.f46505G.m138746h3();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f46512a = i2 > 0;
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m71268B5() {
        this.f46499A.setAdapter(this.f46506H);
        this.f46499A.setItemAnimator(new C12705a());
        this.f46499A.addOnScrollListener(new C12706b());
    }

    /* JADX INFO: renamed from: H5 */
    private void m71269H5(BLiveAbsData bLiveAbsData, String str, String str2) {
        if (TextUtils.isEmpty(bLiveAbsData.f45171id)) {
            return;
        }
        m71272O5(bLiveAbsData, str, str2);
    }

    /* JADX INFO: renamed from: K5 */
    private void m71270K5() {
        this.f46505G.m138745g3();
        this.f46510z.m225015n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public void m71271M5(View view) {
        ((IntlFollowVText) act().inflater().inflate(xec0.f193915v, (ViewGroup) null)).m71431w(view);
    }

    /* JADX INFO: renamed from: O5 */
    private void m71272O5(BLiveAbsData bLiveAbsData, String str, String str2) {
        startActivity(tbs.f172993f.m143704f(act(), AudienceStartData.getBuilder().m68776D(bLiveAbsData).m68787O("live-activity").m68798y(str).m68794u()));
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m71280r5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public void m71284y5() {
        if (NullChecker.m82486a(this.f46505G)) {
            this.f46505G.mo70300n();
        }
    }

    /* JADX INFO: renamed from: A5 */
    public final C22507a<qrr> m71285A5() {
        return ((gm3) tbs.m190077m(itd0.f116821c)).f104912b;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m71286C5(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity, int i, str strVar, View view) {
        m71269H5(bLiveAbsData, bLiveAbsData.getRecommendCategory(), bLiveActivity.valueType);
        ovn.m169454a(bLiveAbsData, i, strVar);
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m71287D5(BLiveEnvelope bLiveEnvelope) {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125942I("live_activities_entry");
        m71285A5().onNext(new qrr(bLiveEnvelope).m177595a());
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m71288E5(Throwable th) {
        m71285A5().onNext(new qrr(th).m177595a());
    }

    /* JADX INFO: renamed from: F5 */
    public void m71289F5(mvn mvnVar) {
        this.f46506H.m68555a0(m71297x5(mvnVar), false);
    }

    /* JADX INFO: renamed from: G5 */
    public void m71290G5(mvn mvnVar) {
        m71298z5().m193355I(mvnVar);
        this.f46506H.m68543O(m71298z5());
    }

    /* JADX INFO: renamed from: I5 */
    public void m71291I5() {
        this.f46510z.m225015n();
    }

    /* JADX INFO: renamed from: J5 */
    public void m71292J5(Throwable th) {
        this.f46500B.setVisibility(0);
        this.f46499A.setVisibility(4);
        this.f46502D.setVisibility(4);
        this.f46510z.m225021t();
    }

    /* JADX INFO: renamed from: L5 */
    public void m71293L5() {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126177e();
        ((gm3) tbs.m190077m(itd0.f116821c)).m130735j();
        psd0.m173633z(this.f46509K);
        this.f46509K = IntlLiveCounterApi.patchReddot("clearActivitySquareDetailUnread").onErrorReturn(new qcj() { // from class: l.r4o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return BLiveCounter.new_();
            }
        }).flatMap(new qcj() { // from class: l.s4o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlLiveSquareApi.getLiveActivitySummaryInSquare();
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.t4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172092a.m71287D5((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.u4o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177478a.m71288E5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public void m71294N5(@NonNull mvn mvnVar) {
        this.f46510z.m225021t();
        this.f46500B.setVisibility(4);
        boolean z = mvnVar.m160289i().isEmpty() && jyb.m147479J(mvnVar.m160288h());
        bnl0.m105525M0(this.f46502D, z);
        bnl0.m105525M0(this.f46499A, !z);
        this.f46506H.m68555a0(m71297x5(mvnVar), false);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo70113S4(boolean z, int i, long j) {
        super.mo70113S4(z, i, j);
        if (z) {
            if (!this.loaded) {
                m71270K5();
            }
            m71293L5();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        new i5o(this, new nus(m71996Z4(), this)).mo52715C(this);
        this.f46505G.m138750m3();
        this.f46505G.m138745g3();
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        if (this.f46505G != null) {
            m71270K5();
            m71998g5(true);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.p4o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareFollowFrag.m71280r5((Bundle) obj);
            }
        }, new x20() { // from class: l.q4o
            @Override // p153l.x20
            public final void call() {
                this.f155606a.m71284y5();
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46510z.mo224405O(this);
        m71268B5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71295v5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_follow";
    }

    /* JADX INFO: renamed from: v5 */
    public View m71295v5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x4o.m209346b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.jn50
    /* JADX INFO: renamed from: w2 */
    public void mo59137w2(@NonNull mvc0 mvc0Var) {
        this.f46505G.m138745g3();
        m71998g5(true);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: w5, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i5o i5oVar) {
        this.f46505G = i5oVar;
    }

    /* JADX INFO: renamed from: x5 */
    public final List<d3q<?>> m71297x5(mvn mvnVar) {
        final IntlLiveSquareFollowFrag intlLiveSquareFollowFrag;
        ArrayList arrayList = new ArrayList();
        int iM160290j = mvnVar.m160290j();
        final int i = 0;
        while (i < mvnVar.m160289i().size()) {
            final BLiveActivity bLiveActivity = mvnVar.m160289i().get(i);
            final BLiveAbsData bLiveAbsDataM160300t = mvnVar.m160300t(bLiveActivity.reference.f45267id);
            if (bLiveAbsDataM160300t == null) {
                intlLiveSquareFollowFrag = this;
            } else {
                if (i == iM160290j && !mvnVar.m160288h().isEmpty()) {
                    this.m71298z5().m193355I(mvnVar);
                    arrayList.add(this.m71298z5());
                }
                final str strVar = new str(bLiveActivity, mvnVar.m160302v(bLiveActivity.owner.f45267id), bLiveAbsDataM160300t, mvnVar.m160301u(bLiveAbsDataM160300t.room.f45267id));
                strVar.m113891z(new Runnable() { // from class: l.v4o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ovn.m169455b(bLiveAbsDataM160300t, i, strVar);
                    }
                });
                intlLiveSquareFollowFrag = this;
                strVar.mo113881A(new View.OnClickListener() { // from class: l.w4o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f187420a.m71286C5(bLiveAbsDataM160300t, bLiveActivity, i, strVar, view);
                    }
                });
                arrayList.add(strVar);
            }
            i++;
            this = intlLiveSquareFollowFrag;
        }
        IntlLiveSquareFollowFrag intlLiveSquareFollowFrag2 = this;
        if (mvnVar.m160289i().size() == iM160290j && !mvnVar.m160288h().isEmpty()) {
            intlLiveSquareFollowFrag2.m71298z5().m193355I(mvnVar);
            arrayList.add(intlLiveSquareFollowFrag2.m71298z5());
        }
        arrayList.add(new dtr(mvnVar.m160293m()));
        return arrayList;
    }

    /* JADX INFO: renamed from: z5 */
    public final twn m71298z5() {
        if (this.f46508J == null) {
            this.f46508J = new twn(this.f46505G);
        }
        return this.f46508J;
    }
}
