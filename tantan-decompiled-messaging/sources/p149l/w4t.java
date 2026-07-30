package p149l;

import com.p046p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class w4t extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public ArrayList<rgv> f184599i;

    /* JADX INFO: renamed from: j */
    public qgv f184600j;

    /* JADX INFO: renamed from: k */
    public bsm f184601k;

    public w4t(bsm bsmVar) {
        super(bsmVar);
        this.f184599i = new ArrayList<>();
        this.f184601k = bsmVar;
    }

    /* JADX INFO: renamed from: P3 */
    public static rgv m201576P3(ArrayList<rgv> arrayList, final MotionType motionType) {
        return (rgv) vwb.m200346r(arrayList, new w9j() { // from class: l.v4t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((rgv) obj).m179264b(motionType));
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m201577L3(MotionType motionType) {
        qgv qgvVar = this.f184600j;
        return qgvVar != null && qgvVar.m174459c() == motionType;
    }

    /* JADX INFO: renamed from: M3 */
    public MotionType m201578M3() {
        qgv qgvVar = this.f184600j;
        return qgvVar == null ? MotionType.NULL : qgvVar.m174459c();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m201579N3(jy00 jy00Var) {
        boolean z = jy00Var.f120274a;
        MotionType motionType = jy00Var.f120275b;
        if (z) {
            m201581R3(motionType, jy00Var.f120277d, jy00Var.f120276c);
        } else {
            m201582S3(motionType);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m201580O3() {
        boolean z = this.f184601k.f77098d;
        ArrayList<rgv> arrayList = this.f184599i;
        if (z) {
            arrayList.add(new rgv(MotionType.pk, new z9j() { // from class: l.p4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new b460((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f184599i.add(new rgv(MotionType.multi_connect, new z9j() { // from class: l.q4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new iz3((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f184599i.add(new rgv(MotionType.multi_call, new z9j() { // from class: l.r4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new w010((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
        } else {
            arrayList.add(new rgv(MotionType.pk, new z9j() { // from class: l.s4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new c460((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f184599i.add(new rgv(MotionType.multi_connect, new z9j() { // from class: l.t4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new x04((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f184599i.add(new rgv(MotionType.multi_call, new z9j() { // from class: l.u4t
                @Override // p149l.z9j
                /* JADX INFO: renamed from: b */
                public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new l210((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m201581R3(MotionType motionType, f30<Integer, MotionType> f30Var, nxl nxlVar) {
        qgv qgvVar = this.f184600j;
        if (qgvVar != null) {
            boolean zM174457a = qgvVar.m174457a(motionType);
            qgv qgvVar2 = this.f184600j;
            if (!zM174457a) {
                f30Var.call(1, qgvVar2.m174459c());
                return;
            }
            qgvVar2.m174458b();
        }
        rgv rgvVarM201576P3 = m201576P3(this.f184599i, motionType);
        if (rgvVarM201576P3 == null) {
            f30Var.call(2, MotionType.NULL);
            return;
        }
        qgv qgvVarM179263a = rgvVarM201576P3.m179263a(this, this.f184601k, nxlVar);
        if (qgvVarM179263a == null) {
            f30Var.call(3, MotionType.NULL);
        } else {
            this.f184600j = qgvVarM179263a;
            qgvVarM179263a.mo100214e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m201582S3(MotionType motionType) {
        qgv qgvVar = this.f184600j;
        if (qgvVar != null && qgvVar.m174459c() == motionType) {
            this.f184600j.mo100215f();
            this.f184600j = null;
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().MotionEvent.motionSwitch().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.o4t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141811a.m201579N3((jy00) obj);
            }
        }));
    }

    public void init() {
        m201580O3();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        qgv qgvVar = this.f184600j;
        if (qgvVar == null) {
            return;
        }
        qgvVar.mo100215f();
        this.f184600j = null;
    }
}
