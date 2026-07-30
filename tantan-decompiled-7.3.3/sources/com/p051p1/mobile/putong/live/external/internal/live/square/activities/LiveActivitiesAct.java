package com.p051p1.mobile.putong.live.external.internal.live.square.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0602f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p051p1.mobile.putong.live.external.view.widgets.FollowVText;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import com.p051p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.navigationbar.VNavigationBar;
import p153l.bfu;
import p153l.bnl0;
import p153l.d3q;
import p153l.dtr;
import p153l.eur;
import p153l.frr;
import p153l.gfj0;
import p153l.iam;
import p153l.itr;
import p153l.jxd0;
import p153l.jyb;
import p153l.kfd0;
import p153l.m9c0;
import p153l.mbs;
import p153l.r230;
import p153l.rtr;
import p153l.str;
import p153l.tbs;
import p153l.xec0;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesAct extends LiveBaseAct implements iam<eur> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f45809c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshList f45810d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f45811e;

    /* JADX INFO: renamed from: f */
    public VRelative f45812f;

    /* JADX INFO: renamed from: g */
    public VImage f45813g;

    /* JADX INFO: renamed from: h */
    public VRelative f45814h;

    /* JADX INFO: renamed from: i */
    public VImage f45815i;

    /* JADX INFO: renamed from: j */
    public eur f45816j;

    /* JADX INFO: renamed from: k */
    public LiveBaseAdapter f45817k = new LiveBaseAdapter();

    /* JADX INFO: renamed from: l */
    public jxd0 f45818l = new jxd0("has_live_activities_recommend_shown" + mbs.m157870o0(), Boolean.FALSE);

    /* JADX INFO: renamed from: m */
    public itr f45819m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$a */
    public class C12652a extends C0602f {
        public C12652a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC0618v
        public void onAddFinished(RecyclerView.AbstractC0569e0 abstractC0569e0) {
            if (LiveActivitiesAct.this.f45818l.get().booleanValue()) {
                return;
            }
            View view = abstractC0569e0.itemView;
            if (view instanceof LiveActivitiesItemView) {
                LiveActivitiesAct.this.m70154w2(((LiveActivitiesItemView) view).f47162h);
                LiveActivitiesAct.this.f45818l.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$b */
    public class C12653b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f45821a = false;

        public C12653b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i == 0 && this.f45821a && linearLayoutManager.findLastCompletelyVisibleItemPosition() >= LiveActivitiesAct.this.f45817k.getItemCount() - 5) {
                LiveActivitiesAct.this.f45816j.m122749r();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f45821a = i2 > 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$c */
    public class C12654c extends RecyclerView.AbstractC0578n {
        public C12654c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = bnl0.m105587w(16.0f);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static void m70129A2(BLiveAbsData bLiveAbsData, int i, str strVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", strVar.f170601c.title);
            jSONObject.put("label_name", strVar.f170602d.value);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        bfu.m104071c(kfd0.m149385x().m149414w(OMSTemplateModeType.page).m149403l(i + 1).m149393b(bLiveAbsData).m149411t(gfj0.m130074b((BLive) bLiveAbsData, strVar.f170602d)).m149388A(jSONObject).m149415x(bLiveAbsData).m149392a(), "p_live_follow");
    }

    /* JADX INFO: renamed from: B2 */
    public static void m70130B2(BLiveAbsData bLiveAbsData, int i, str strVar) {
        String strM130074b = gfj0.m130074b((BLive) bLiveAbsData, strVar.f170602d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", strVar.f170601c.title);
            jSONObject.put("label_name", strVar.f170602d.value);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
        bfu.m104075g(kfd0.m149385x().m149414w(OMSTemplateModeType.page).m149403l(i + 1).m149393b(bLiveAbsData).m149411t(strM130074b).m149388A(jSONObject).m149415x(bLiveAbsData).m149392a(), "p_live_follow");
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m70138g2(Context context) {
        return m70139h2(context, null, "");
    }

    /* JADX INFO: renamed from: h2 */
    public static Intent m70139h2(Context context, BLiveSquareSummary bLiveSquareSummary, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveActivitiesAct.class);
        if (bLiveSquareSummary != null) {
            intent.putExtra("extra_live_square_summary", bLiveSquareSummary);
        }
        intent.putExtra("extra_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public void m70140l2(Bundle bundle) {
        if (this.act.getAppTheme().mo134836p()) {
            setGradientStatusBar();
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        m70143r();
        eur eurVar = new eur(this);
        eurVar.mo52715C(this);
        eurVar.m122756z0();
        eurVar.m122752t0();
    }

    /* JADX INFO: renamed from: n2 */
    private void m70141n2() {
        this.f45811e.setAdapter(this.f45817k);
        this.f45811e.setItemAnimator(new C12652a());
        this.f45811e.addOnScrollListener(new C12653b());
        this.f45811e.addItemDecoration(new C12654c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public /* synthetic */ void m70142p2() {
        this.f45816j.m122752t0();
    }

    /* JADX INFO: renamed from: r */
    private void m70143r() {
        m70141n2();
        this.f45809c.setLeftIconAsBack(this);
        this.f45810d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.crr
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f83359a.m70142p2();
            }
        });
        this.f45810d.setColorSchemeResources(m9c0.f135373G, m9c0.f135370D, m9c0.f135371E, m9c0.f135372F);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    @Override // p153l.iam
    public void destroy() {
        r230.m179475p("context_live_activities");
    }

    /* JADX INFO: renamed from: e2 */
    public View m70144e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return frr.m126979b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eur eurVar) {
        this.f45816j = eurVar;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70144e2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.brr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78050a.m70140l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final List<d3q<?>> m70146k2(rtr rtrVar) {
        final LiveActivitiesAct liveActivitiesAct;
        ArrayList arrayList = new ArrayList();
        int iM183150j = rtrVar.m183150j();
        final int i = 0;
        while (i < rtrVar.m183149i().size()) {
            final BLiveActivity bLiveActivity = rtrVar.m183149i().get(i);
            final BLiveAbsData bLiveAbsDataM183160t = rtrVar.m183160t(bLiveActivity.reference.f45267id);
            if (bLiveAbsDataM183160t == null) {
                liveActivitiesAct = this;
            } else {
                if (i == iM183150j && !rtrVar.m183148h().isEmpty()) {
                    this.m70147m2().m142076I(rtrVar);
                    arrayList.add(this.m70147m2());
                }
                final str strVar = new str(bLiveActivity, rtrVar.m183162v(bLiveActivity.owner.f45267id), bLiveAbsDataM183160t, rtrVar.m183161u(bLiveAbsDataM183160t.room.f45267id));
                strVar.m113891z(new Runnable() { // from class: l.drr
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveActivitiesAct.m70130B2(bLiveAbsDataM183160t, i, strVar);
                    }
                });
                liveActivitiesAct = this;
                strVar.mo113881A(new View.OnClickListener() { // from class: l.err
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f95530a.m70148o2(bLiveAbsDataM183160t, bLiveActivity, i, strVar, view);
                    }
                });
                arrayList.add(strVar);
            }
            i++;
            this = liveActivitiesAct;
        }
        LiveActivitiesAct liveActivitiesAct2 = this;
        if (rtrVar.m183149i().size() == iM183150j && !rtrVar.m183148h().isEmpty()) {
            liveActivitiesAct2.m70147m2().m142076I(rtrVar);
            arrayList.add(liveActivitiesAct2.m70147m2());
        }
        arrayList.add(new dtr(rtrVar.m183153m()));
        return arrayList;
    }

    /* JADX INFO: renamed from: m2 */
    public final itr m70147m2() {
        if (this.f45819m == null) {
            this.f45819m = new itr(this.f45816j);
        }
        return this.f45819m;
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m70148o2(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity, int i, str strVar, View view) {
        m70151s2(bLiveAbsData, bLiveAbsData.getRecommendCategory(), bLiveActivity.valueType);
        m70129A2(bLiveAbsData, i, strVar);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_live_follow";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(true);
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: q2 */
    public void m70149q2(rtr rtrVar) {
        this.f45817k.m68555a0(m70146k2(rtrVar), false);
    }

    /* JADX INFO: renamed from: r2 */
    public void m70150r2(rtr rtrVar) {
        m70147m2().m142076I(rtrVar);
        this.f45817k.m68543O(m70147m2());
    }

    /* JADX INFO: renamed from: s2 */
    public final void m70151s2(BLiveAbsData bLiveAbsData, String str, String str2) {
        if (TextUtils.isEmpty(bLiveAbsData.f45171id)) {
            return;
        }
        m70156z2(bLiveAbsData, str, str2);
    }

    /* JADX INFO: renamed from: u2 */
    public void m70152u2() {
        this.f45810d.setRefreshing(true);
    }

    /* JADX INFO: renamed from: v2 */
    public void m70153v2(Throwable th) {
        this.f45812f.setVisibility(0);
        this.f45811e.setVisibility(4);
        this.f45814h.setVisibility(4);
        this.f45810d.setRefreshing(false);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m70154w2(View view) {
        ((FollowVText) this.act.inflater().inflate(xec0.f193853d, (ViewGroup) null)).m72028w(view);
    }

    /* JADX INFO: renamed from: y2 */
    public void m70155y2(@NonNull rtr rtrVar) {
        this.f45810d.setRefreshing(false);
        this.f45812f.setVisibility(4);
        boolean z = rtrVar.m183149i().isEmpty() && jyb.m147479J(rtrVar.m183148h());
        bnl0.m105525M0(this.f45814h, z);
        bnl0.m105525M0(this.f45811e, !z);
        this.f45817k.m68555a0(m70146k2(rtrVar), false);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m70156z2(BLiveAbsData bLiveAbsData, String str, String str2) {
        startActivity(tbs.f172993f.m143704f(this, AudienceStartData.getBuilder().m68776D(bLiveAbsData).m68787O("live-activity").m68798y(str).m68794u()));
    }
}
