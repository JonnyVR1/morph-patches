package com.p046p1.mobile.putong.live.external.internal.live.square.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C0600f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p046p1.mobile.putong.live.external.view.widgets.FollowVText;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesItemView;
import com.p046p1.mobile.putong.live.external.view.widgets.SwipeRefreshList;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.navigationbar.VNavigationBar;
import p149l.adu;
import p149l.c6j0;
import p149l.crr;
import p149l.d1q;
import p149l.dsr;
import p149l.e30;
import p149l.epr;
import p149l.g1c0;
import p149l.h7d0;
import p149l.hpd0;
import p149l.hrr;
import p149l.hu20;
import p149l.l9s;
import p149l.qrr;
import p149l.rrr;
import p149l.s6c0;
import p149l.s7m;
import p149l.s9s;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesAct extends LiveBaseAct implements s7m<dsr> {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f44961c;

    /* JADX INFO: renamed from: d */
    public SwipeRefreshList f44962d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f44963e;

    /* JADX INFO: renamed from: f */
    public VRelative f44964f;

    /* JADX INFO: renamed from: g */
    public VImage f44965g;

    /* JADX INFO: renamed from: h */
    public VRelative f44966h;

    /* JADX INFO: renamed from: i */
    public VImage f44967i;

    /* JADX INFO: renamed from: j */
    public dsr f44968j;

    /* JADX INFO: renamed from: k */
    public LiveBaseAdapter f44969k = new LiveBaseAdapter();

    /* JADX INFO: renamed from: l */
    public hpd0 f44970l = new hpd0("has_live_activities_recommend_shown" + l9s.m149093o0(), Boolean.FALSE);

    /* JADX INFO: renamed from: m */
    public hrr f44971m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$a */
    public class C12489a extends C0600f {
        public C12489a() {
        }

        @Override // androidx.recyclerview.widget.AbstractC0616v
        public void onAddFinished(RecyclerView.AbstractC0566d0 abstractC0566d0) {
            if (LiveActivitiesAct.this.f44970l.get().booleanValue()) {
                return;
            }
            View view = abstractC0566d0.itemView;
            if (view instanceof LiveActivitiesItemView) {
                LiveActivitiesAct.this.m68971v2(((LiveActivitiesItemView) view).f46314h);
                LiveActivitiesAct.this.f44970l.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$b */
    public class C12490b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f44973a = false;

        public C12490b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i == 0 && this.f44973a && linearLayoutManager.findLastCompletelyVisibleItemPosition() >= LiveActivitiesAct.this.f44969k.getItemCount() - 5) {
                LiveActivitiesAct.this.f44968j.m113487r();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f44973a = i2 > 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct$c */
    public class C12491c extends RecyclerView.AbstractC0576n {
        public C12491c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = xdl0.m208407w(16.0f);
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public static void m68946A2(BLiveAbsData bLiveAbsData, int i, rrr rrrVar) {
        String strM105476b = c6j0.m105476b((BLive) bLiveAbsData, rrrVar.f160775d);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", rrrVar.f160774c.title);
            jSONObject.put("label_name", rrrVar.f160775d.value);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        adu.m96011g(h7d0.m129655x().m129684w(OMSTemplateModeType.page).m129673l(i + 1).m129663b(bLiveAbsData).m129681t(strM105476b).m129658A(jSONObject).m129685x(bLiveAbsData).m129662a(), "p_live_follow");
    }

    /* JADX INFO: renamed from: e2 */
    public static Intent m68954e2(Context context) {
        return m68955g2(context, null, "");
    }

    /* JADX INFO: renamed from: g2 */
    public static Intent m68955g2(Context context, BLiveSquareSummary bLiveSquareSummary, String str) {
        Intent intent = new Intent(context, (Class<?>) LiveActivitiesAct.class);
        if (bLiveSquareSummary != null) {
            intent.putExtra("extra_live_square_summary", bLiveSquareSummary);
        }
        intent.putExtra("extra_from", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public void m68956k2(Bundle bundle) {
        if (this.act.getAppTheme().mo105500p()) {
            setGradientStatusBar();
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
        m68959r();
        dsr dsrVar = new dsr(this);
        dsrVar.mo51532C(this);
        dsrVar.m113494z0();
        dsrVar.m113490t0();
    }

    /* JADX INFO: renamed from: m2 */
    private void m68957m2() {
        this.f44963e.setAdapter(this.f44969k);
        this.f44963e.setItemAnimator(new C12489a());
        this.f44963e.addOnScrollListener(new C12490b());
        this.f44963e.addItemDecoration(new C12491c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public /* synthetic */ void m68958o2() {
        this.f44968j.m113490t0();
    }

    /* JADX INFO: renamed from: r */
    private void m68959r() {
        m68957m2();
        this.f44961c.setLeftIconAsBack(this);
        this.f44962d.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.bpr
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f76670a.m68958o2();
            }
        });
        this.f44962d.setColorSchemeResources(g1c0.f100143G, g1c0.f100140D, g1c0.f100141E, g1c0.f100142F);
    }

    /* JADX INFO: renamed from: z2 */
    public static void m68960z2(BLiveAbsData bLiveAbsData, int i, rrr rrrVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_name", rrrVar.f160774c.title);
            jSONObject.put("label_name", rrrVar.f160775d.value);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
        adu.m96007c(h7d0.m129655x().m129684w(OMSTemplateModeType.page).m129673l(i + 1).m129663b(bLiveAbsData).m129681t(c6j0.m105476b((BLive) bLiveAbsData, rrrVar.f160775d)).m129658A(jSONObject).m129685x(bLiveAbsData).m129662a(), "p_live_follow");
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this;
    }

    /* JADX INFO: renamed from: d2 */
    public View m68961d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return epr.m117675b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
        hu20.m132970p("context_live_activities");
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: h2, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dsr dsrVar) {
        this.f44968j = dsrVar;
    }

    /* JADX INFO: renamed from: i2 */
    public final List<d1q<?>> m68963i2(qrr qrrVar) {
        final LiveActivitiesAct liveActivitiesAct;
        ArrayList arrayList = new ArrayList();
        int iM176116j = qrrVar.m176116j();
        final int i = 0;
        while (i < qrrVar.m176115i().size()) {
            final BLiveActivity bLiveActivity = qrrVar.m176115i().get(i);
            final BLiveAbsData bLiveAbsDataM176126t = qrrVar.m176126t(bLiveActivity.reference.f44419id);
            if (bLiveAbsDataM176126t == null) {
                liveActivitiesAct = this;
            } else {
                if (i == iM176116j && !qrrVar.m176114h().isEmpty()) {
                    this.m68964l2().m132715I(qrrVar);
                    arrayList.add(this.m68964l2());
                }
                final rrr rrrVar = new rrr(bLiveActivity, qrrVar.m176128v(bLiveActivity.owner.f44419id), bLiveAbsDataM176126t, qrrVar.m176127u(bLiveAbsDataM176126t.room.f44419id));
                rrrVar.m109673z(new Runnable() { // from class: l.cpr
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveActivitiesAct.m68946A2(bLiveAbsDataM176126t, i, rrrVar);
                    }
                });
                liveActivitiesAct = this;
                rrrVar.mo109662A(new View.OnClickListener() { // from class: l.dpr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f87311a.m68965n2(bLiveAbsDataM176126t, bLiveActivity, i, rrrVar, view);
                    }
                });
                arrayList.add(rrrVar);
            }
            i++;
            this = liveActivitiesAct;
        }
        LiveActivitiesAct liveActivitiesAct2 = this;
        if (qrrVar.m176115i().size() == iM176116j && !qrrVar.m176114h().isEmpty()) {
            liveActivitiesAct2.m68964l2().m132715I(qrrVar);
            arrayList.add(liveActivitiesAct2.m68964l2());
        }
        arrayList.add(new crr(qrrVar.m176119m()));
        return arrayList;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m68961d2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.apr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71079a.m68956k2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final hrr m68964l2() {
        if (this.f44971m == null) {
            this.f44971m = new hrr(this.f44968j);
        }
        return this.f44971m;
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m68965n2(BLiveAbsData bLiveAbsData, BLiveActivity bLiveActivity, int i, rrr rrrVar, View view) {
        m68968r2(bLiveAbsData, bLiveAbsData.getRecommendCategory(), bLiveActivity.valueType);
        m68960z2(bLiveAbsData, i, rrrVar);
    }

    /* JADX INFO: renamed from: p2 */
    public void m68966p2(qrr qrrVar) {
        this.f44969k.m67372a0(m68963i2(qrrVar), false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_live_follow";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(true);
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: q2 */
    public void m68967q2(qrr qrrVar) {
        m68964l2().m132715I(qrrVar);
        this.f44969k.m67360O(m68964l2());
    }

    /* JADX INFO: renamed from: r2 */
    public final void m68968r2(BLiveAbsData bLiveAbsData, String str, String str2) {
        if (TextUtils.isEmpty(bLiveAbsData.f44323id)) {
            return;
        }
        m68973y2(bLiveAbsData, str, str2);
    }

    /* JADX INFO: renamed from: s2 */
    public void m68969s2() {
        this.f44962d.setRefreshing(true);
    }

    /* JADX INFO: renamed from: u2 */
    public void m68970u2(Throwable th) {
        this.f44964f.setVisibility(0);
        this.f44963e.setVisibility(4);
        this.f44966h.setVisibility(4);
        this.f44962d.setRefreshing(false);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m68971v2(View view) {
        ((FollowVText) this.act.inflater().inflate(s6c0.f162739d, (ViewGroup) null)).m70845w(view);
    }

    /* JADX INFO: renamed from: w2 */
    public void m68972w2(@NonNull qrr qrrVar) {
        this.f44962d.setRefreshing(false);
        this.f44964f.setVisibility(4);
        boolean z = qrrVar.m176115i().isEmpty() && vwb.m200296J(qrrVar.m176114h());
        xdl0.m208345M0(this.f44966h, z);
        xdl0.m208345M0(this.f44963e, !z);
        this.f44969k.m67372a0(m68963i2(qrrVar), false);
    }

    /* JADX INFO: renamed from: y2 */
    public final void m68973y2(BLiveAbsData bLiveAbsData, String str, String str2) {
        startActivity(s9s.f163232f.m134373f(this, AudienceStartData.getBuilder().m67593D(bLiveAbsData).m67604O("live-activity").m67615y(str).m67611u()));
    }
}
