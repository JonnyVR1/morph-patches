package p153l;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveTask;
import com.p051p1.mobile.putong.live.base.util.RxTaskQueue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class peg extends tk2<qct> {

    /* JADX INFO: renamed from: j */
    public final String f152067j;

    /* JADX INFO: renamed from: k */
    public long f152068k;

    /* JADX INFO: renamed from: l */
    public aeg f152069l;

    /* JADX INFO: renamed from: m */
    public final HashSet<String> f152070m;

    /* JADX INFO: renamed from: n */
    public final RxTaskQueue f152071n;

    /* JADX INFO: renamed from: o */
    public kcg0 f152072o;

    public peg(dum<oo2> dumVar) {
        super(dumVar);
        String simpleName = getClass().getSimpleName();
        this.f152067j = simpleName;
        this.f152068k = 0L;
        this.f152069l = null;
        this.f152070m = new HashSet<>();
        this.f152071n = new RxTaskQueue(simpleName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m171966F4(jsv jsvVar) {
        m171989J4();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m171971m4(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m171973o4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: r4 */
    public static /* synthetic */ void m171976r4(Throwable th) {
    }

    /* JADX INFO: renamed from: t4 */
    public static /* synthetic */ void m171978t4(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m171981A4(boolean z, aeg aegVar) {
        m171991L4(aegVar);
        if (z && m153101w2() != null && (m153101w2() instanceof acg)) {
            ((acg) m153101w2()).mo176238h4(aegVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: C4 */
    public final /* synthetic */ Boolean m171983C4(Long l2) {
        return Boolean.valueOf(m213810E2().mo183435j() != null && TEnum.equals(m213810E2().mo183435j().state, "onlive"));
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [l.oo2] */
    /* JADX INFO: renamed from: D4 */
    public final /* synthetic */ C22421c m171984D4(Long l2) {
        long j = this.f152068k + 10;
        this.f152068k = j;
        m171992w4(Long.valueOf(j));
        return m138858H3(m213810E2().m168521h2(30, TimeUnit.SECONDS)).take(1);
    }

    /* JADX INFO: renamed from: E4 */
    public final /* synthetic */ void m171985E4(Long l2) {
        m171987H4();
    }

    /* JADX INFO: renamed from: G4 */
    public final /* synthetic */ void m171986G4(jsv jsvVar) {
        m171989J4();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v0, types: [l.oo2] */
    /* JADX INFO: renamed from: H4 */
    public final void m171987H4() {
        Iterator it = new HashSet(this.f152070m).iterator();
        while (it.hasNext()) {
            duringCreated(m213810E2().f148254B.m209632y((String) it.next(), m213810E2().mo118362A0())).subscribe(dhw.m115826e(new y20() { // from class: l.ceg
                @Override // p153l.y20
                public final void call(Object obj) {
                    peg.m171978t4((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.deg
                @Override // p153l.y20
                public final void call(Object obj) {
                    peg.m171976r4((Throwable) obj);
                }
            }));
        }
        this.f152070m.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: I4 */
    public final void m171988I4(final boolean z) {
        if (m213810E2().m168546r0().m199847c(uqb0.f180396b0.f170324a.userId())) {
            duringCreated(m213810E2().f148254B.m209625T()).doOnSubscribe(new x20() { // from class: l.beg
                @Override // p153l.x20
                public final void call() {
                    this.f76374a.m171995z4(z);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.geg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f103832a.m171981A4(z, (aeg) obj);
                }
            }, new y20() { // from class: l.heg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f109149a.m171982B4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: J4 */
    public final void m171989J4() {
        m171990K4();
        this.f152072o = m138858H3(m213810E2().m168521h2(10, TimeUnit.SECONDS)).filter(new qcj() { // from class: l.keg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126183a.m171983C4((Long) obj);
            }
        }).flatMap(new qcj() { // from class: l.leg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f131746a.m171984D4((Long) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.meg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136496a.m171985E4((Long) obj);
            }
        }, new y20() { // from class: l.neg
            @Override // p153l.y20
            public final void call(Object obj) {
                peg.m171971m4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K4 */
    public final void m171990K4() {
        this.f152068k = 0L;
        psd0.m173633z(this.f152072o);
    }

    /* JADX INFO: renamed from: L4 */
    public final void m171991L4(aeg aegVar) {
        this.f152069l = aegVar;
        if (!aegVar.m97238c()) {
            m171990K4();
        } else if (this.f152068k == 0) {
            m171989J4();
        }
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m171988I4(true);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f152071n.m69798d();
        m171990K4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m202198v()).subscribe(dhw.m115829h(new y20() { // from class: l.ieg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114577a.m171966F4((jsv) obj);
            }
        }));
        duringCreated(m213810E2().mo183449u()).subscribe(dhw.m115829h(new y20() { // from class: l.jeg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120485a.m171986G4((jsv) obj);
            }
        }));
        m171988I4(false);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: w4 */
    public final void m171992w4(Long l2) {
        aeg aegVar = this.f152069l;
        if (aegVar == null || !aegVar.m97238c()) {
            return;
        }
        int i = 0;
        for (BLiveTask bLiveTask : this.f152069l.m97239d()) {
            if (bLiveTask.rule.duration != 0 && l2.longValue() > 0 && l2.longValue() % (bLiveTask.rule.duration * 60) == 0) {
                if (eb20.m120149b()) {
                    return;
                }
                i++;
                m171993x4(bLiveTask);
            }
        }
        if (i > 0) {
            duringCreated(this.f152071n.m69799e("refreshTask", m213810E2().f148254B.m209625T())).subscribe(dhw.m115829h(new y20() { // from class: l.oeg
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f146990a.m171991L4((aeg) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.oo2] */
    /* JADX INFO: renamed from: x4 */
    public final void m171993x4(final BLiveTask bLiveTask) {
        duringCreated(this.f152071n.m69799e("finishTask" + bLiveTask.f45301id, m213810E2().f148254B.m209632y(bLiveTask.f45301id, m213810E2().mo118362A0()))).subscribe(dhw.m115826e(new y20() { // from class: l.eeg
            @Override // p153l.y20
            public final void call(Object obj) {
                peg.m171973o4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.feg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98663a.m171994y4(bLiveTask, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m171994y4(BLiveTask bLiveTask, Throwable th) {
        this.f152070m.add(bLiveTask.f45301id);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m171995z4(boolean z) {
        if (z && m153101w2() != null && (m153101w2() instanceof acg)) {
            ((acg) m153101w2()).mo176237d4();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m171982B4(Throwable th) {
    }
}
