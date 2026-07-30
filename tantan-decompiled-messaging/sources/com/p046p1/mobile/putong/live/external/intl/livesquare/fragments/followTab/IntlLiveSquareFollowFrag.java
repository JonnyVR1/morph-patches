package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0600f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveCounterApi;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlFollowVText;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VRelative;
import p149l.c4g0;
import p149l.crr;
import p149l.d1q;
import p149l.d30;
import p149l.df50;
import p149l.e30;
import p149l.ffw;
import p149l.gl3;
import p149l.gld0;
import p149l.hl3;
import p149l.hnc0;
import p149l.hpd0;
import p149l.i3o;
import p149l.l9s;
import p149l.mkd0;
import p149l.mss;
import p149l.mtn;
import p149l.nj3;
import p149l.otn;
import p149l.ppr;
import p149l.rrr;
import p149l.s6c0;
import p149l.s7m;
import p149l.s9s;
import p149l.tun;
import p149l.vwb;
import p149l.w9j;
import p149l.x2o;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public final class IntlLiveSquareFollowFrag extends LiveSquareBaseFrag implements s7m<i3o>, df50 {

    /* JADX INFO: renamed from: A */
    public VRecyclerView f45651A;

    /* JADX INFO: renamed from: B */
    public VRelative f45652B;

    /* JADX INFO: renamed from: C */
    public VImage f45653C;

    /* JADX INFO: renamed from: D */
    public VRelative f45654D;

    /* JADX INFO: renamed from: E */
    public VImage f45655E;

    /* JADX INFO: renamed from: G */
    public i3o f45657G;

    /* JADX INFO: renamed from: J */
    public tun f45660J;

    /* JADX INFO: renamed from: K */
    public c4g0 f45661K;

    /* JADX INFO: renamed from: z */
    public VPullDownRefreshLayout f45662z;

    /* JADX INFO: renamed from: F */
    public final String f45656F = IntlLiveSquareFollowFrag.class.getSimpleName();

    /* JADX INFO: renamed from: H */
    public LiveBaseAdapter f45658H = new LiveBaseAdapter();

    /* JADX INFO: renamed from: I */
    public hpd0 f45659I = new hpd0("intl_has_live_follow_activities_recommend_shown" + l9s.m149093o0(), Boolean.FALSE);

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag$a */
    public class C12542a extends C0600f {
        public C12542a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC0616v
        public void onAddFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            if (IntlLiveSquareFollowFrag.this.f45659I.get().booleanValue()) {
                return;
            }
            View view = abstractC0566d0.itemView;
            if (view instanceof LiveActivitiesItemView) {
                IntlLiveSquareFollowFrag.this.m70088M5(((LiveActivitiesItemView) view).f46314h);
                IntlLiveSquareFollowFrag.this.f45659I.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.followTab.IntlLiveSquareFollowFrag$b */
    public class C12543b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f45664a = false;

        public C12543b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i == 0 && this.f45664a && linearLayoutManager.findLastCompletelyVisibleItemPosition() >= IntlLiveSquareFollowFrag.this.f45658H.getItemCount() - 5) {
                IntlLiveSquareFollowFrag.this.f45657G.m134294h3();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f45664a = i2 > 0;
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m70085B5() {
        this.f45651A.setAdapter(this.f45658H);
        this.f45651A.setItemAnimator(new C12542a());
        this.f45651A.addOnScrollListener(new C12543b());
    }

    /* JADX INFO: renamed from: H5 */
    private void m70086H5(BLiveAbsData bLiveAbsData, String str, String str2) {
        if (TextUtils.isEmpty(bLiveAbsData.f44323id)) {
            return;
        }
        m70089O5(bLiveAbsData, str, str2);
    }

    /* JADX INFO: renamed from: K5 */
    private void m70087K5() {
        this.f45657G.m134293g3();
        this.f45662z.m223769n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public void m70088M5(View view) {
        ((IntlFollowVText) act().inflater().inflate(s6c0.f162801v, (ViewGroup) null)).m70248w(view);
    }

    /* JADX INFO: renamed from: O5 */
    private void m70089O5(BLiveAbsData bLiveAbsData, String str, String str2) {
        startActivity(s9s.f163232f.m134373f(act(), AudienceStartData.getBuilder().m67593D(bLiveAbsData).m67604O("live-activity").m67615y(str).m67611u()));
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m70097r5(Bundle bundle) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y5 */
    public void m70101y5() {
        if (NullChecker.m81303a(this.f45657G)) {
            this.f45657G.mo69117n();
        }
    }

    /* JADX INFO: renamed from: A5 */
    public final C22392a<ppr> m70102A5() {
        return ((hl3) s9s.m182763m(gld0.f103313c)).f108309b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getActivity();
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m70103C5(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity, int i, rrr rrrVar, View view) {
        m70086H5(bLiveAbsData, bLiveAbsData.getRecommendCategory(), bLiveActivity.valueType);
        otn.m165947a(bLiveAbsData, i, rrrVar);
    }

    /* JADX INFO: renamed from: D5 */
    public final /* synthetic */ void m70104D5(BLiveEnvelope bLiveEnvelope) {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159611I("live_activities_entry");
        m70102A5().onNext(new ppr(bLiveEnvelope).m170759a());
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m70105E5(Throwable th) {
        m70102A5().onNext(new ppr(th).m170759a());
    }

    /* JADX INFO: renamed from: F5 */
    public void m70106F5(mtn mtnVar) {
        this.f45658H.m67372a0(m70114x5(mtnVar), false);
    }

    /* JADX INFO: renamed from: G5 */
    public void m70107G5(mtn mtnVar) {
        m70115z5().m190714I(mtnVar);
        this.f45658H.m67360O(m70115z5());
    }

    /* JADX INFO: renamed from: I5 */
    public void m70108I5() {
        this.f45662z.m223769n();
    }

    /* JADX INFO: renamed from: J5 */
    public void m70109J5(Throwable th) {
        this.f45652B.setVisibility(0);
        this.f45651A.setVisibility(4);
        this.f45654D.setVisibility(4);
        this.f45662z.m223775t();
    }

    /* JADX INFO: renamed from: L5 */
    public void m70110L5() {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126742e();
        ((hl3) s9s.m182763m(gld0.f103313c)).m131636j();
        mkd0.m154992z(this.f45661K);
        this.f45661K = IntlLiveCounterApi.patchReddot("clearActivitySquareDetailUnread").onErrorReturn(new w9j() { // from class: l.r2o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BLiveCounter.new_();
            }
        }).flatMap(new w9j() { // from class: l.s2o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return IntlLiveSquareApi.getLiveActivitySummaryInSquare();
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.t2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167522a.m70104D5((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.u2o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f173507a.m70105E5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N5 */
    public void m70111N5(@NonNull mtn mtnVar) {
        this.f45662z.m223775t();
        this.f45652B.setVisibility(4);
        boolean z = mtnVar.m156317i().isEmpty() && vwb.m200296J(mtnVar.m156316h());
        xdl0.m208345M0(this.f45654D, z);
        xdl0.m208345M0(this.f45651A, !z);
        this.f45658H.m67372a0(m70114x5(mtnVar), false);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: S4 */
    public void mo68930S4(boolean z, int i, long j) {
        super.mo68930S4(z, i, j);
        if (z) {
            if (!this.loaded) {
                m70087K5();
            }
            m70110L5();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        new i3o(this, new mss(m70813Z4(), this)).mo51532C(this);
        this.f45657G.m134298m3();
        this.f45657G.m134293g3();
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        if (this.f45657G != null) {
            m70087K5();
            m70815g5(true);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.p2o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareFollowFrag.m70097r5((Bundle) obj);
            }
        }, new d30() { // from class: l.q2o
            @Override // p149l.d30
            public final void call() {
                this.f152283a.m70101y5();
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45662z.mo223159O(this);
        m70085B5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70112v5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_follow";
    }

    /* JADX INFO: renamed from: v5 */
    public View m70112v5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return x2o.m206855b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.df50
    /* JADX INFO: renamed from: w2 */
    public void mo57954w2(@NonNull hnc0 hnc0Var) {
        this.f45657G.m134293g3();
        m70815g5(true);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: w5, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i3o i3oVar) {
        this.f45657G = i3oVar;
    }

    /* JADX INFO: renamed from: x5 */
    public final List<d1q<?>> m70114x5(mtn mtnVar) {
        final IntlLiveSquareFollowFrag intlLiveSquareFollowFrag;
        ArrayList arrayList = new ArrayList();
        int iM156318j = mtnVar.m156318j();
        final int i = 0;
        while (i < mtnVar.m156317i().size()) {
            final BLiveActivity bLiveActivity = mtnVar.m156317i().get(i);
            final BLiveAbsData bLiveAbsDataM156328t = mtnVar.m156328t(bLiveActivity.reference.f44419id);
            if (bLiveAbsDataM156328t == null) {
                intlLiveSquareFollowFrag = this;
            } else {
                if (i == iM156318j && !mtnVar.m156316h().isEmpty()) {
                    this.m70115z5().m190714I(mtnVar);
                    arrayList.add(this.m70115z5());
                }
                final rrr rrrVar = new rrr(bLiveActivity, mtnVar.m156330v(bLiveActivity.owner.f44419id), bLiveAbsDataM156328t, mtnVar.m156329u(bLiveAbsDataM156328t.room.f44419id));
                rrrVar.m109673z(new Runnable() { // from class: l.v2o
                    @Override // java.lang.Runnable
                    public final void run() {
                        otn.m165948b(bLiveAbsDataM156328t, i, rrrVar);
                    }
                });
                intlLiveSquareFollowFrag = this;
                rrrVar.mo109662A(new View.OnClickListener() { // from class: l.w2o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f184260a.m70103C5(bLiveAbsDataM156328t, bLiveActivity, i, rrrVar, view);
                    }
                });
                arrayList.add(rrrVar);
            }
            i++;
            this = intlLiveSquareFollowFrag;
        }
        IntlLiveSquareFollowFrag intlLiveSquareFollowFrag2 = this;
        if (mtnVar.m156317i().size() == iM156318j && !mtnVar.m156316h().isEmpty()) {
            intlLiveSquareFollowFrag2.m70115z5().m190714I(mtnVar);
            arrayList.add(intlLiveSquareFollowFrag2.m70115z5());
        }
        arrayList.add(new crr(mtnVar.m156321m()));
        return arrayList;
    }

    /* JADX INFO: renamed from: z5 */
    public final tun m70115z5() {
        if (this.f45660J == null) {
            this.f45660J = new tun(this.f45657G);
        }
        return this.f45660J;
    }
}
