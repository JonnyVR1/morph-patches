package com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.util.Pair;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.C12658a;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.sina.weibo.sdk.net.NetStateManager;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.smart_refresh.header.TTMaterialRefreshHeader;
import p153l.a1u;
import p153l.cyr;
import p153l.dhw;
import p153l.eyu;
import p153l.fo0;
import p153l.ga1;
import p153l.iyu;
import p153l.jyb;
import p153l.l51;
import p153l.lwr;
import p153l.ner;
import p153l.nus;
import p153l.o1j0;
import p153l.p5u;
import p153l.q7c0;
import p153l.qcj;
import p153l.rg80;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12658a extends a1u<LiveSquareLiveVideoFrag> {

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f45858l;

    /* JADX INFO: renamed from: m */
    public LiveVideoPagerSnapLinearLayoutManger f45859m;

    /* JADX INFO: renamed from: n */
    public ArrayList<eyu> f45860n;

    /* JADX INFO: renamed from: o */
    public p5u f45861o;

    /* JADX INFO: renamed from: p */
    public boolean f45862p;

    /* JADX INFO: renamed from: q */
    public boolean f45863q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a$a */
    public class a implements LiveVideoPagerSnapLinearLayoutManger.InterfaceC12657a {
        public a() {
        }

        @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12657a
        /* JADX INFO: renamed from: a */
        public void mo70243a(boolean z, int i) {
            Pair<Long, Boolean> pairM123264V = ((eyu) C12658a.this.f45860n.get(i)).m123264V();
            iyu.m142725d(((eyu) C12658a.this.f45860n.get(i)).m123258P(), ((Long) pairM123264V.first).longValue(), ((Boolean) pairM123264V.second).booleanValue());
        }

        @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12657a
        /* JADX INFO: renamed from: b */
        public void mo70244b(int i) {
            if (C12658a.this.f45860n == null || i >= C12658a.this.f45860n.size()) {
                return;
            }
            iyu.m142724c(((eyu) C12658a.this.f45860n.get(i)).m123258P());
            ((eyu) C12658a.this.f45860n.get(i)).m123265W(rg80.m181401a().m181402b(i % 2 == 0));
        }

        @Override // com.p051p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12657a
        public void onPageSelected(int i) {
            if (C12658a.this.f45860n == null || C12658a.this.f45860n.size() <= i || !((LiveSquareLiveVideoFrag) ((cyr) C12658a.this).viewModel).m72004Q4()) {
                return;
            }
            ((eyu) C12658a.this.f45860n.get(i)).m123266X(C12658a.this.f45863q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a$b */
    public class b implements ga1 {
        public b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            super.mo40108b(audioBusinessType, str, audioBusinessType2);
            C12658a.this.f45863q = true;
            C12658a.this.m70296U3(true);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: c */
        public void mo62651c(String str, AudioBusinessType audioBusinessType, String str2, ga1 ga1Var) {
            super.mo62651c(str, audioBusinessType, str2, ga1Var);
            C12658a.this.f45863q = false;
            C12658a.this.m70296U3(false);
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            super.mo40109d(str, audioBusinessType, ga1Var, str2, audioBusinessType2);
            C12658a.this.f45863q = true;
            C12658a.this.m70296U3(true);
        }

        @Override // p153l.ga1
        public void success() {
            super.success();
            C12658a.this.f45863q = false;
            C12658a.this.m70296U3(false);
        }
    }

    public C12658a(ner nerVar, nus nusVar) {
        super(nerVar, nusVar);
    }

    /* JADX INFO: renamed from: R3 */
    private void m70245R3() {
        p5u p5uVar = this.f45861o;
        if (p5uVar == null || !p5uVar.m195327t() || this.f45862p) {
            return;
        }
        m70298W3();
        rg80.m181401a().m181405e(true);
        this.f45862p = true;
        duringCreated(LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, "square-curated", "", 15, this.f45861o.m195325r().links.next, false, "liveTabSource=live-independent-tab-suggested", false)).subscribe(dhw.m115826e(new y20() { // from class: l.h3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107688a.m70283H3((p5u) obj);
            }
        }, new y20() { // from class: l.i3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112785a.m70282G3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ ArrayList m70246U2(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                arrayList.add(bLiveSuggestLive.f45298id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m70249X2(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    private void m70254c() {
        duringCreated(LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, "square-curated", null, 15, null, false, "liveTabSource=live-independent-tab-suggested", false)).subscribe(dhw.m115826e(new y20() { // from class: l.a4u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68445a.m70285I3((p5u) obj);
            }
        }, new y20() { // from class: l.f3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97010a.m70286J3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m70269r() {
        ((LiveSquareLiveVideoFrag) this.viewModel).f45854z.mo224409S(new TTMaterialRefreshHeader(m113230C0()));
        this.f45858l = new LiveBaseAdapter();
        LiveVideoPagerSnapLinearLayoutManger liveVideoPagerSnapLinearLayoutManger = new LiveVideoPagerSnapLinearLayoutManger(getAct(), 1, false);
        this.f45859m = liveVideoPagerSnapLinearLayoutManger;
        ((LiveSquareLiveVideoFrag) this.viewModel).f45849A.setLayoutManager(liveVideoPagerSnapLinearLayoutManger);
        ((LiveSquareLiveVideoFrag) this.viewModel).f45849A.setAdapter(this.f45858l);
        this.f45859m.m70242a(new a());
        ((LiveSquareLiveVideoFrag) this.viewModel).f45849A.getRecycledViewPool().m3440m(1, 0);
        this.f45858l.m68558c0(new y20() { // from class: l.g3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102023a.m70281F3((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    private void m70276y3() {
        lwr.m156097e(new b());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m70277B3(Integer num) {
        if (num.intValue() >= this.f45860n.size() || !NetStateManager.isNetworkConnected(m113230C0())) {
            return;
        }
        m70298W3();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45849A.scrollToPosition(num.intValue());
        l51.m152888H(m113230C0(), new Runnable() { // from class: l.r3u
            @Override // java.lang.Runnable
            public final void run() {
                this.f161081a.m70302z3();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m70278C3() {
        m70296U3(this.f45863q);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m70279D3(Boolean bool) {
        if (bool.booleanValue() && ((LiveSquareLiveVideoFrag) this.viewModel).m72004Q4()) {
            o1j0.m165651y("正在使用手机流量观看直播");
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m70280E3(uxj0 uxj0Var) {
        m70298W3();
        m70254c();
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m70281F3(Integer num) {
        if (num.intValue() >= this.f45858l.getItemCount() - 5) {
            m70245R3();
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m70282G3(Throwable th) {
        this.f45862p = false;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m70283H3(p5u p5uVar) {
        this.f45862p = false;
        if (p5uVar == null || p5uVar.f178357a.isEmpty()) {
            return;
        }
        this.f45861o.m195330w(p5uVar);
        m70301x3(this.f45861o.f178357a);
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(ConnectivityReceiver.m82473m()).map(new qcj() { // from class: l.e3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82470j());
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.p3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150466a.m70279D3((Boolean) obj);
            }
        }, new y20() { // from class: l.t3u
            @Override // p153l.y20
            public final void call(Object obj) {
                C12658a.m70249X2((Throwable) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m().skip(1).filter(new qcj() { // from class: l.u3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).map(new qcj() { // from class: l.v3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).observeOn(fo0.m126432a())).subscribe(dhw.m115825d(new y20() { // from class: l.w3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187170a.m70280E3((uxj0) obj);
            }
        }));
        m70254c();
        m70269r();
        m70297V3();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m70285I3(p5u p5uVar) {
        if (p5uVar == null || p5uVar.f178357a.isEmpty()) {
            ((LiveSquareLiveVideoFrag) this.viewModel).m70241t5(false);
            return;
        }
        this.f45861o = p5uVar;
        ((LiveSquareLiveVideoFrag) this.viewModel).m70238p5();
        m70301x3(p5uVar.f178357a);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m70286J3(Throwable th) {
        ((LiveSquareLiveVideoFrag) this.viewModel).m70241t5(true);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Boolean m70287K3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((LiveSquareLiveVideoFrag) v2).m72004Q4());
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m70288L3(Long l2) {
        m70299X3();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m70289M3(Throwable th) {
        m95557T2();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22421c m70290N3(ArrayList arrayList) {
        for (int i = 0; i < this.f45861o.f178357a.size(); i++) {
            if (arrayList.contains(this.f45861o.f178357a.get(i).f45298id)) {
                return C22421c.just(Integer.valueOf(i));
            }
        }
        return C22421c.just(null);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m70291O3() {
        m70296U3(this.f45863q);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m70292P3(Integer num) {
        ArrayList<eyu> arrayList;
        if (num == null || (arrayList = this.f45860n) == null || arrayList.size() == 1 || !((LiveSquareLiveVideoFrag) this.viewModel).m72004Q4()) {
            return;
        }
        if (num.intValue() == this.f45859m.findFirstVisibleItemPosition()) {
            m70298W3();
        }
        this.f45861o.f178357a.remove(num.intValue());
        this.f45858l.m68551W(this.f45860n.remove(num.intValue()));
        l51.m152888H(m113230C0(), new Runnable() { // from class: l.s3u
            @Override // java.lang.Runnable
            public final void run() {
                this.f166037a.m70291O3();
            }
        }, 500L);
    }

    @Override // p153l.a1u
    /* JADX INFO: renamed from: R2 */
    public void mo70293R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2) {
        super.mo70293R2(bLiveSuggestLive, str, str2);
        getAct().overridePendingTransition(q7c0.f155952a, q7c0.f155953b);
        iyu.m142723b(bLiveSuggestLive);
    }

    /* JADX INFO: renamed from: S3 */
    public void m70294S3(boolean z) {
        if (!z) {
            m70298W3();
            rg80.m181401a().m181405e(true);
        } else {
            m70276y3();
            if (ConnectivityReceiver.m82470j()) {
                o1j0.m165651y("正在使用手机流量观看直播");
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m70295T3() {
        m70298W3();
        m70254c();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45854z.m225021t();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45849A.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m70296U3(boolean z) {
        if (((LiveSquareLiveVideoFrag) this.viewModel).m72004Q4()) {
            int iFindFirstVisibleItemPosition = this.f45859m.findFirstVisibleItemPosition();
            ArrayList<eyu> arrayList = this.f45860n;
            if (arrayList == null || arrayList.size() <= 0 || iFindFirstVisibleItemPosition >= this.f45860n.size() || iFindFirstVisibleItemPosition <= -1) {
                return;
            }
            this.f45860n.get(iFindFirstVisibleItemPosition).m123265W(rg80.m181401a().m181402b(iFindFirstVisibleItemPosition % 2 == 0));
            this.f45860n.get(iFindFirstVisibleItemPosition).m123266X(z);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m70297V3() {
        this.f67847f.m127299c();
        this.f67847f.m127297a(duringCreated(C22421c.interval(this.f67848g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).filter(new qcj() { // from class: l.x3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192303a.m70287K3((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.y3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197389a.m70288L3((Long) obj);
            }
        }, new y20() { // from class: l.z3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202862a.m70289M3((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m70298W3() {
        int iFindFirstVisibleItemPosition = this.f45859m.findFirstVisibleItemPosition();
        ArrayList<eyu> arrayList = this.f45860n;
        if (arrayList == null || arrayList.size() <= 0 || iFindFirstVisibleItemPosition >= this.f45860n.size() || iFindFirstVisibleItemPosition <= -1) {
            return;
        }
        Pair<Long, Boolean> pairM123264V = this.f45860n.get(iFindFirstVisibleItemPosition).m123264V();
        iyu.m142725d(this.f45860n.get(iFindFirstVisibleItemPosition).m123258P(), ((Long) pairM123264V.first).longValue(), ((Boolean) pairM123264V.second).booleanValue());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m70299X3() {
        p5u p5uVar = this.f45861o;
        if (p5uVar == null || jyb.m147479J(p5uVar.f178357a)) {
            return;
        }
        duringCreated(LiveSquareApi.queryCurrentLivesInfo(jyb.m147517k0(jyb.m147486Q(this.f45861o.f178357a, new qcj() { // from class: l.l3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f45298id;
            }
        }), 100), false)).map(new qcj() { // from class: l.m3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C12658a.m70246U2((List) obj);
            }
        }).filter(new qcj() { // from class: l.n3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((ArrayList) obj));
            }
        }).flatMap(new qcj() { // from class: l.o3u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144856a.m70290N3((ArrayList) obj);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.q3u
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155488a.m70292P3((Integer) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f67847f.m127299c();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m70301x3(List<BLiveSuggestLive> list) {
        this.f45860n = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            this.f45860n.add(new eyu(list.get(i), this, i, new y20() { // from class: l.j3u
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118218a.m70277B3((Integer) obj);
                }
            }));
        }
        this.f45858l.m68554Z(this.f45860n);
        if (((LiveSquareLiveVideoFrag) this.viewModel).m72004Q4()) {
            l51.m152887G(new Runnable() { // from class: l.k3u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123772a.m70278C3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m70302z3() {
        m70296U3(this.f45863q);
    }
}
