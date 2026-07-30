package com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo;

import android.util.Pair;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveSuggestLive;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.C12495a;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.sina.weibo.sdk.net.NetStateManager;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.smart_refresh.header.TTMaterialRefreshHeader;
import p149l.bwr;
import p149l.dwu;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.hwu;
import p149l.jo0;
import p149l.kur;
import p149l.l880;
import p149l.lsi0;
import p149l.mcr;
import p149l.mss;
import p149l.o3u;
import p149l.roj0;
import p149l.vwb;
import p149l.w9j;
import p149l.wzb0;
import p149l.z91;
import p149l.zyt;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12495a extends zyt<LiveSquareLiveVideoFrag> {

    /* JADX INFO: renamed from: l */
    public LiveBaseAdapter f45010l;

    /* JADX INFO: renamed from: m */
    public LiveVideoPagerSnapLinearLayoutManger f45011m;

    /* JADX INFO: renamed from: n */
    public ArrayList<dwu> f45012n;

    /* JADX INFO: renamed from: o */
    public o3u f45013o;

    /* JADX INFO: renamed from: p */
    public boolean f45014p;

    /* JADX INFO: renamed from: q */
    public boolean f45015q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a$a */
    public class a implements LiveVideoPagerSnapLinearLayoutManger.InterfaceC12494a {
        public a() {
        }

        @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12494a
        /* JADX INFO: renamed from: a */
        public void mo69060a(boolean z, int i) {
            Pair<Long, Boolean> pairM113957V = ((dwu) C12495a.this.f45012n.get(i)).m113957V();
            hwu.m133268d(((dwu) C12495a.this.f45012n.get(i)).m113951P(), ((Long) pairM113957V.first).longValue(), ((Boolean) pairM113957V.second).booleanValue());
        }

        @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12494a
        /* JADX INFO: renamed from: b */
        public void mo69061b(int i) {
            if (C12495a.this.f45012n == null || i >= C12495a.this.f45012n.size()) {
                return;
            }
            hwu.m133267c(((dwu) C12495a.this.f45012n.get(i)).m113951P());
            ((dwu) C12495a.this.f45012n.get(i)).m113958W(l880.m148846a().m148847b(i % 2 == 0));
        }

        @Override // com.p046p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.LiveVideoPagerSnapLinearLayoutManger.InterfaceC12494a
        public void onPageSelected(int i) {
            if (C12495a.this.f45012n == null || C12495a.this.f45012n.size() <= i || !((LiveSquareLiveVideoFrag) ((bwr) C12495a.this).viewModel).m70821Q4()) {
                return;
            }
            ((dwu) C12495a.this.f45012n.get(i)).m113959X(C12495a.this.f45015q);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.live.square.fragments.livevideo.a$b */
    public class b implements z91 {
        public b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            super.mo39105b(audioBusinessType, str, audioBusinessType2);
            C12495a.this.f45015q = true;
            C12495a.this.m69113U3(true);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: c */
        public void mo61467c(String str, AudioBusinessType audioBusinessType, String str2, z91 z91Var) {
            super.mo61467c(str, audioBusinessType, str2, z91Var);
            C12495a.this.f45015q = false;
            C12495a.this.m69113U3(false);
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            super.mo39106d(str, audioBusinessType, z91Var, str2, audioBusinessType2);
            C12495a.this.f45015q = true;
            C12495a.this.m69113U3(true);
        }

        @Override // p149l.z91
        public void success() {
            super.success();
            C12495a.this.f45015q = false;
            C12495a.this.m69113U3(false);
        }
    }

    public C12495a(mcr mcrVar, mss mssVar) {
        super(mcrVar, mssVar);
    }

    /* JADX INFO: renamed from: R3 */
    private void m69062R3() {
        o3u o3uVar = this.f45013o;
        if (o3uVar == null || !o3uVar.m187673t() || this.f45014p) {
            return;
        }
        m69115W3();
        l880.m148846a().m148850e(true);
        this.f45014p = true;
        duringCreated(LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, "square-curated", "", 15, this.f45013o.m187671r().links.next, false, "liveTabSource=live-independent-tab-suggested", false)).subscribe(ffw.m121194e(new e30() { // from class: l.g1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100206a.m69100H3((o3u) obj);
            }
        }, new e30() { // from class: l.h1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105464a.m69099G3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ ArrayList m69063U2(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BLiveSuggestLive bLiveSuggestLive = (BLiveSuggestLive) it.next();
            if (!bLiveSuggestLive.isOnLive()) {
                arrayList.add(bLiveSuggestLive.f44450id);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X2 */
    public static /* synthetic */ void m69066X2(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    private void m69071c() {
        duringCreated(LiveSquareApi.getLiveListV2(RelationshipStatus.suggested, "square-curated", null, 15, null, false, "liveTabSource=live-independent-tab-suggested", false)).subscribe(ffw.m121194e(new e30() { // from class: l.z1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201106a.m69102I3((o3u) obj);
            }
        }, new e30() { // from class: l.e1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88852a.m69103J3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    private void m69086r() {
        ((LiveSquareLiveVideoFrag) this.viewModel).f45006z.mo223163S(new TTMaterialRefreshHeader(m104249C0()));
        this.f45010l = new LiveBaseAdapter();
        LiveVideoPagerSnapLinearLayoutManger liveVideoPagerSnapLinearLayoutManger = new LiveVideoPagerSnapLinearLayoutManger(getAct(), 1, false);
        this.f45011m = liveVideoPagerSnapLinearLayoutManger;
        ((LiveSquareLiveVideoFrag) this.viewModel).f45001A.setLayoutManager(liveVideoPagerSnapLinearLayoutManger);
        ((LiveSquareLiveVideoFrag) this.viewModel).f45001A.setAdapter(this.f45010l);
        this.f45011m.m69059a(new a());
        ((LiveSquareLiveVideoFrag) this.viewModel).f45001A.getRecycledViewPool().m3431m(1, 0);
        this.f45010l.m67375c0(new e30() { // from class: l.f1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f94115a.m69098F3((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    private void m69093y3() {
        kur.m147300e(new b());
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m69094B3(Integer num) {
        if (num.intValue() >= this.f45012n.size() || !NetStateManager.isNetworkConnected(m104249C0())) {
            return;
        }
        m69115W3();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45001A.scrollToPosition(num.intValue());
        e51.m114743H(m104249C0(), new Runnable() { // from class: l.q1u
            @Override // java.lang.Runnable
            public final void run() {
                this.f152169a.m69119z3();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m69095C3() {
        m69113U3(this.f45015q);
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m69096D3(Boolean bool) {
        if (bool.booleanValue() && ((LiveSquareLiveVideoFrag) this.viewModel).m70821Q4()) {
            lsi0.m151595y("正在使用手机流量观看直播");
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m69097E3(roj0 roj0Var) {
        m69115W3();
        m69071c();
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m69098F3(Integer num) {
        if (num.intValue() >= this.f45010l.getItemCount() - 5) {
            m69062R3();
        }
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m69099G3(Throwable th) {
        this.f45014p = false;
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m69100H3(o3u o3uVar) {
        this.f45014p = false;
        if (o3uVar == null || o3uVar.f169071a.isEmpty()) {
            return;
        }
        this.f45013o.m187676w(o3uVar);
        m69118x3(this.f45013o.f169071a);
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(ConnectivityReceiver.m81290m()).map(new w9j() { // from class: l.d1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81287j());
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.o1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141477a.m69096D3((Boolean) obj);
            }
        }, new e30() { // from class: l.s1u
            @Override // p149l.e30
            public final void call(Object obj) {
                C12495a.m69066X2((Throwable) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m().skip(1).filter(new w9j() { // from class: l.t1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).map(new w9j() { // from class: l.u1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).observeOn(jo0.m142408a())).subscribe(ffw.m121193d(new e30() { // from class: l.v1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f179282a.m69097E3((roj0) obj);
            }
        }));
        m69071c();
        m69086r();
        m69114V3();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m69102I3(o3u o3uVar) {
        if (o3uVar == null || o3uVar.f169071a.isEmpty()) {
            ((LiveSquareLiveVideoFrag) this.viewModel).m69058t5(false);
            return;
        }
        this.f45013o = o3uVar;
        ((LiveSquareLiveVideoFrag) this.viewModel).m69055p5();
        m69118x3(o3uVar.f169071a);
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m69103J3(Throwable th) {
        ((LiveSquareLiveVideoFrag) this.viewModel).m69058t5(true);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ Boolean m69104K3(Long l2) {
        V v2 = this.viewModel;
        return Boolean.valueOf(v2 != 0 && ((LiveSquareLiveVideoFrag) v2).m70821Q4());
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m69105L3(Long l2) {
        m69116X3();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m69106M3(Throwable th) {
        m220949T2();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ C22306c m69107N3(ArrayList arrayList) {
        for (int i = 0; i < this.f45013o.f169071a.size(); i++) {
            if (arrayList.contains(this.f45013o.f169071a.get(i).f44450id)) {
                return C22306c.just(Integer.valueOf(i));
            }
        }
        return C22306c.just(null);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m69108O3() {
        m69113U3(this.f45015q);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m69109P3(Integer num) {
        ArrayList<dwu> arrayList;
        if (num == null || (arrayList = this.f45012n) == null || arrayList.size() == 1 || !((LiveSquareLiveVideoFrag) this.viewModel).m70821Q4()) {
            return;
        }
        if (num.intValue() == this.f45011m.findFirstVisibleItemPosition()) {
            m69115W3();
        }
        this.f45013o.f169071a.remove(num.intValue());
        this.f45010l.m67368W(this.f45012n.remove(num.intValue()));
        e51.m114743H(m104249C0(), new Runnable() { // from class: l.r1u
            @Override // java.lang.Runnable
            public final void run() {
                this.f157341a.m69108O3();
            }
        }, 500L);
    }

    @Override // p149l.zyt
    /* JADX INFO: renamed from: R2 */
    public void mo69110R2(BLiveSuggestLive bLiveSuggestLive, String str, String str2) {
        super.mo69110R2(bLiveSuggestLive, str, str2);
        getAct().overridePendingTransition(wzb0.f188718a, wzb0.f188719b);
        hwu.m133266b(bLiveSuggestLive);
    }

    /* JADX INFO: renamed from: S3 */
    public void m69111S3(boolean z) {
        if (!z) {
            m69115W3();
            l880.m148846a().m148850e(true);
        } else {
            m69093y3();
            if (ConnectivityReceiver.m81287j()) {
                lsi0.m151595y("正在使用手机流量观看直播");
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m69112T3() {
        m69115W3();
        m69071c();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45006z.m223775t();
        ((LiveSquareLiveVideoFrag) this.viewModel).f45001A.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: U3 */
    public final void m69113U3(boolean z) {
        if (((LiveSquareLiveVideoFrag) this.viewModel).m70821Q4()) {
            int iFindFirstVisibleItemPosition = this.f45011m.findFirstVisibleItemPosition();
            ArrayList<dwu> arrayList = this.f45012n;
            if (arrayList == null || arrayList.size() <= 0 || iFindFirstVisibleItemPosition >= this.f45012n.size() || iFindFirstVisibleItemPosition <= -1) {
                return;
            }
            this.f45012n.get(iFindFirstVisibleItemPosition).m113958W(l880.m148846a().m148847b(iFindFirstVisibleItemPosition % 2 == 0));
            this.f45012n.get(iFindFirstVisibleItemPosition).m113959X(z);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public void m69114V3() {
        this.f205725f.m103657c();
        this.f205725f.m103655a(duringCreated(C22306c.interval(this.f205726g, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).filter(new w9j() { // from class: l.w1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184060a.m69104K3((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.x1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189103a.m69105L3((Long) obj);
            }
        }, new e30() { // from class: l.y1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195462a.m69106M3((Throwable) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: W3 */
    public final void m69115W3() {
        int iFindFirstVisibleItemPosition = this.f45011m.findFirstVisibleItemPosition();
        ArrayList<dwu> arrayList = this.f45012n;
        if (arrayList == null || arrayList.size() <= 0 || iFindFirstVisibleItemPosition >= this.f45012n.size() || iFindFirstVisibleItemPosition <= -1) {
            return;
        }
        Pair<Long, Boolean> pairM113957V = this.f45012n.get(iFindFirstVisibleItemPosition).m113957V();
        hwu.m133268d(this.f45012n.get(iFindFirstVisibleItemPosition).m113951P(), ((Long) pairM113957V.first).longValue(), ((Boolean) pairM113957V.second).booleanValue());
    }

    /* JADX INFO: renamed from: X3 */
    public final void m69116X3() {
        o3u o3uVar = this.f45013o;
        if (o3uVar == null || vwb.m200296J(o3uVar.f169071a)) {
            return;
        }
        duringCreated(LiveSquareApi.queryCurrentLivesInfo(vwb.m200334k0(vwb.m200303Q(this.f45013o.f169071a, new w9j() { // from class: l.k1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSuggestLive) obj).f44450id;
            }
        }), 100), false)).map(new w9j() { // from class: l.l1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C12495a.m69063U2((List) obj);
            }
        }).filter(new w9j() { // from class: l.m1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((ArrayList) obj));
            }
        }).flatMap(new w9j() { // from class: l.n1u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f136725a.m69107N3((ArrayList) obj);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.p1u
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146772a.m69109P3((Integer) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f205725f.m103657c();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m69118x3(List<BLiveSuggestLive> list) {
        this.f45012n = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            this.f45012n.add(new dwu(list.get(i), this, i, new e30() { // from class: l.i1u
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110499a.m69094B3((Integer) obj);
                }
            }));
        }
        this.f45010l.m67371Z(this.f45012n);
        if (((LiveSquareLiveVideoFrag) this.viewModel).m70821Q4()) {
            e51.m114742G(new Runnable() { // from class: l.j1u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115845a.m69095C3();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m69119z3() {
        m69113U3(this.f45015q);
    }
}
