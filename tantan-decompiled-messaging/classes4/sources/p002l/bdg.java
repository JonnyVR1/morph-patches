package p002l;

import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveTask;
import com.p1.mobile.putong.live.base.util.RxTaskQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.mkd0;
import l.qib0;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bdg extends lk2<pat> {

    /* JADX INFO: renamed from: j */
    public final String f8078j;

    /* JADX INFO: renamed from: k */
    public long f8079k;

    /* JADX INFO: renamed from: l */
    public mcg f8080l;

    /* JADX INFO: renamed from: m */
    public final HashSet<String> f8081m;

    /* JADX INFO: renamed from: n */
    public final RxTaskQueue f8082n;

    /* JADX INFO: renamed from: o */
    public c4g0 f8083o;

    public bdg(bsm<ho2> bsmVar) {
        super(bsmVar);
        String simpleName = getClass().getSimpleName();
        this.f8078j = simpleName;
        this.f8079k = 0L;
        this.f8080l = null;
        this.f8081m = new HashSet<>();
        this.f8082n = new RxTaskQueue(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m10228F4(iqv iqvVar) {
        m10251J4();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m10233m4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m10235o4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m10238r4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m10240t4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m10243A4(boolean z, mcg mcgVar) {
        m10253L4(mcgVar);
        if (z && w2() != null && (w2() instanceof mag)) {
            ((mag) w2()).mo10940h4(mcgVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ Boolean m10245C4(Long l2) {
        return Boolean.valueOf(m25547E2().m17234j() != null && TEnum.equals(m25547E2().m17234j().state, "onlive"));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [l.ho2] */
    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ c m10246D4(Long l2) {
        long j = this.f8079k + 10;
        this.f8079k = j;
        m10256w4(Long.valueOf(j));
        return m14186H3(m25547E2().m14571h2(30, TimeUnit.SECONDS)).take(1);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m10247E4(Long l2) {
        m10249H4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m10248G4(iqv iqvVar) {
        m10251J4();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.ho2] */
    /* JADX INFO: renamed from: H4 */
    public final void m10249H4() {
        Iterator it = new HashSet(this.f8081m).iterator();
        while (it.hasNext()) {
            duringCreated(m25547E2().f12141B.m15718y((String) it.next(), m25547E2().mo14489A0())).subscribe(ffw.e(new e30() { // from class: l.ocg
                public final void call(Object obj) {
                    bdg.m10240t4((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.pcg
                public final void call(Object obj) {
                    bdg.m10238r4((Throwable) obj);
                }
            }));
        }
        this.f8081m.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: I4 */
    public final void m10250I4(final boolean z) {
        if (m25547E2().m14597r0().c(qib0.b0.a.userId())) {
            duringCreated(m25547E2().f12141B.m15711T()).doOnSubscribe(new d30() { // from class: l.ncg
                public final void call() {
                    this.f15945a.m10259z4(z);
                }
            }).subscribe(ffw.e(new e30() { // from class: l.scg
                public final void call(Object obj) {
                    this.f18924a.m10243A4(z, (mcg) obj);
                }
            }, new e30() { // from class: l.tcg
                public final void call(Object obj) {
                    this.f20182a.m10244B4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: J4 */
    public final void m10251J4() {
        m10252K4();
        this.f8083o = m14186H3(m25547E2().m14571h2(10, TimeUnit.SECONDS)).filter(new w9j() { // from class: l.wcg
            public final Object call(Object obj) {
                return this.f21638a.m10245C4((Long) obj);
            }
        }).flatMap(new w9j() { // from class: l.xcg
            public final Object call(Object obj) {
                return this.f22217a.m10246D4((Long) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.ycg
            public final void call(Object obj) {
                this.f22802a.m10247E4((Long) obj);
            }
        }, new e30() { // from class: l.zcg
            public final void call(Object obj) {
                bdg.m10233m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m10252K4() {
        this.f8079k = 0L;
        mkd0.z(this.f8083o);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m10253L4(mcg mcgVar) {
        this.f8080l = mcgVar;
        if (!mcgVar.m17818c()) {
            m10252K4();
        } else if (this.f8079k == 0) {
            m10251J4();
        }
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        m10250I4(true);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f8082n.d();
        m10252K4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m10255t() {
        super.t();
        duringCreated(m25547E2().m17245v()).subscribe(ffw.h(new e30() { // from class: l.ucg
            public final void call(Object obj) {
                this.f20585a.m10228F4((iqv) obj);
            }
        }));
        duringCreated(m25547E2().m17244u()).subscribe(ffw.h(new e30() { // from class: l.vcg
            public final void call(Object obj) {
                this.f21069a.m10248G4((iqv) obj);
            }
        }));
        m10250I4(false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: w4 */
    public final void m10256w4(Long l2) {
        mcg mcgVar = this.f8080l;
        if (mcgVar == null || !mcgVar.m17818c()) {
            return;
        }
        int i = 0;
        for (BLiveTask bLiveTask : this.f8080l.m17819d()) {
            if (bLiveTask.rule.duration != 0 && l2.longValue() > 0 && l2.longValue() % (bLiveTask.rule.duration * 60) == 0) {
                if (w220.m24291b()) {
                    return;
                }
                i++;
                m10257x4(bLiveTask);
            }
        }
        if (i > 0) {
            duringCreated(this.f8082n.e("refreshTask", m25547E2().f12141B.m15711T())).subscribe(ffw.h(new e30() { // from class: l.adg
                public final void call(Object obj) {
                    this.f7511a.m10253L4((mcg) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX INFO: renamed from: x4 */
    public final void m10257x4(final BLiveTask bLiveTask) {
        duringCreated(this.f8082n.e("finishTask" + bLiveTask.id, m25547E2().f12141B.m15718y(bLiveTask.id, m25547E2().mo14489A0()))).subscribe(ffw.e(new e30() { // from class: l.qcg
            public final void call(Object obj) {
                bdg.m10235o4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.rcg
            public final void call(Object obj) {
                this.f18462a.m10258y4(bLiveTask, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m10258y4(BLiveTask bLiveTask, Throwable th) {
        this.f8081m.add(bLiveTask.id);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m10259z4(boolean z) {
        if (z && w2() != null && (w2() instanceof mag)) {
            ((mag) w2()).mo10939d4();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m10244B4(Throwable th) {
    }
}
