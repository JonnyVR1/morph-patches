package p149l;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveTask;
import com.p046p1.mobile.putong.live.base.util.RxTaskQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class bdg extends lk2<pat> {

    /* JADX INFO: renamed from: j */
    public final String f75030j;

    /* JADX INFO: renamed from: k */
    public long f75031k;

    /* JADX INFO: renamed from: l */
    public mcg f75032l;

    /* JADX INFO: renamed from: m */
    public final HashSet<String> f75033m;

    /* JADX INFO: renamed from: n */
    public final RxTaskQueue f75034n;

    /* JADX INFO: renamed from: o */
    public c4g0 f75035o;

    public bdg(bsm<ho2> bsmVar) {
        super(bsmVar);
        String simpleName = getClass().getSimpleName();
        this.f75030j = simpleName;
        this.f75031k = 0L;
        this.f75032l = null;
        this.f75033m = new HashSet<>();
        this.f75034n = new RxTaskQueue(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m101146F4(iqv iqvVar) {
        m101169J4();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m101151m4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m101153o4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m101156r4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m101158t4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m101161A4(boolean z, mcg mcgVar) {
        m101171L4(mcgVar);
        if (z && m144510w2() != null && (m144510w2() instanceof mag)) {
            ((mag) m144510w2()).mo106222h4(mcgVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ Boolean m101163C4(Long l2) {
        return Boolean.valueOf(m206027E2().mo149813j() != null && TEnum.equals(m206027E2().mo149813j().state, "onlive"));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [l.ho2] */
    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ C22306c m101164D4(Long l2) {
        long j = this.f75031k + 10;
        this.f75031k = j;
        m101172w4(Long.valueOf(j));
        return m129299H3(m206027E2().m132135h2(30, TimeUnit.SECONDS)).take(1);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m101165E4(Long l2) {
        m101167H4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m101166G4(iqv iqvVar) {
        m101169J4();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m101167H4() {
        Iterator it = new HashSet(this.f75033m).iterator();
        while (it.hasNext()) {
            duringCreated(m206027E2().f108741B.m140027y((String) it.next(), m206027E2().mo132054A0())).subscribe(ffw.m121194e(new e30() { // from class: l.ocg
                @Override // p149l.e30
                public final void call(Object obj) {
                    bdg.m101158t4((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.pcg
                @Override // p149l.e30
                public final void call(Object obj) {
                    bdg.m101156r4((Throwable) obj);
                }
            }));
        }
        this.f75033m.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: I4 */
    public final void m101168I4(final boolean z) {
        if (m206027E2().m132161r0().m129238c(qib0.f154713b0.f139230a.userId())) {
            duringCreated(m206027E2().f108741B.m140020T()).doOnSubscribe(new d30() { // from class: l.ncg
                @Override // p149l.d30
                public final void call() {
                    this.f138167a.m101175z4(z);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.scg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f163728a.m101161A4(z, (mcg) obj);
                }
            }, new e30() { // from class: l.tcg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f169445a.m101162B4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: J4 */
    public final void m101169J4() {
        m101170K4();
        this.f75035o = m129299H3(m206027E2().m132135h2(10, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.wcg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f185690a.m101163C4((Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.xcg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f192231a.m101164D4((Long) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.ycg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f197448a.m101165E4((Long) obj);
            }
        }, new e30() { // from class: l.zcg
            @Override // p149l.e30
            public final void call(Object obj) {
                bdg.m101151m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m101170K4() {
        this.f75031k = 0L;
        mkd0.m154992z(this.f75035o);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m101171L4(mcg mcgVar) {
        this.f75032l = mcgVar;
        if (!mcgVar.m153997c()) {
            m101170K4();
        } else if (this.f75031k == 0) {
            m101169J4();
        }
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m101168I4(true);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f75034n.m68615d();
        m101170K4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m149824v()).subscribe(ffw.m121197h(new e30() { // from class: l.ucg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f175823a.m101146F4((iqv) obj);
            }
        }));
        duringCreated(m206027E2().mo149823u()).subscribe(ffw.m121197h(new e30() { // from class: l.vcg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180925a.m101166G4((iqv) obj);
            }
        }));
        m101168I4(false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: w4 */
    public final void m101172w4(Long l2) {
        mcg mcgVar = this.f75032l;
        if (mcgVar == null || !mcgVar.m153997c()) {
            return;
        }
        int i = 0;
        for (BLiveTask bLiveTask : this.f75032l.m153998d()) {
            if (bLiveTask.rule.duration != 0 && l2.longValue() > 0 && l2.longValue() % (bLiveTask.rule.duration * 60) == 0) {
                if (w220.m201015b()) {
                    return;
                }
                i++;
                m101173x4(bLiveTask);
            }
        }
        if (i > 0) {
            duringCreated(this.f75034n.m68616e("refreshTask", m206027E2().f108741B.m140020T())).subscribe(ffw.m121197h(new e30() { // from class: l.adg
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68933a.m101171L4((mcg) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX INFO: renamed from: x4 */
    public final void m101173x4(final BLiveTask bLiveTask) {
        duringCreated(this.f75034n.m68616e("finishTask" + bLiveTask.f44453id, m206027E2().f108741B.m140027y(bLiveTask.f44453id, m206027E2().mo132054A0()))).subscribe(ffw.m121194e(new e30() { // from class: l.qcg
            @Override // p149l.e30
            public final void call(Object obj) {
                bdg.m101153o4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rcg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158769a.m101174y4(bLiveTask, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m101174y4(BLiveTask bLiveTask, Throwable th) {
        this.f75033m.add(bLiveTask.f44453id);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m101175z4(boolean z) {
        if (z && m144510w2() != null && (m144510w2() instanceof mag)) {
            ((mag) m144510w2()).mo106221d4();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m101162B4(Throwable th) {
    }
}
