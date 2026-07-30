package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import java.util.ArrayList;
import l.e30;
import l.f30;
import l.ffw;
import l.l3m;
import l.vwb;
import l.w9j;
import l.z9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class w4t extends pat<ho2> implements l3m {

    /* JADX INFO: renamed from: i */
    public ArrayList<rgv> f21456i;

    /* JADX INFO: renamed from: j */
    public qgv f21457j;

    /* JADX INFO: renamed from: k */
    public bsm f21458k;

    public w4t(bsm bsmVar) {
        super(bsmVar);
        this.f21456i = new ArrayList<>();
        this.f21458k = bsmVar;
    }

    /* JADX INFO: renamed from: P3 */
    public static rgv m24318P3(ArrayList<rgv> arrayList, final MotionType motionType) {
        return (rgv) vwb.r(arrayList, new w9j() { // from class: l.v4t
            public final Object call(Object obj) {
                return Boolean.valueOf(((rgv) obj).m21937b(motionType));
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m24319L3(MotionType motionType) {
        qgv qgvVar = this.f21457j;
        return qgvVar != null && qgvVar.m21270c() == motionType;
    }

    /* JADX INFO: renamed from: M3 */
    public MotionType m24320M3() {
        qgv qgvVar = this.f21457j;
        return qgvVar == null ? MotionType.NULL : qgvVar.m21270c();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m24321N3(jy00 jy00Var) {
        boolean z = jy00Var.f14128a;
        MotionType motionType = jy00Var.f14129b;
        if (z) {
            m24323R3(motionType, jy00Var.f14131d, jy00Var.f14130c);
        } else {
            m24324S3(motionType);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m24322O3() {
        boolean z = this.f21458k.f8335d;
        ArrayList<rgv> arrayList = this.f21456i;
        if (z) {
            arrayList.add(new rgv(MotionType.pk, new z9j() { // from class: l.p4t
                /* JADX INFO: renamed from: b */
                public final Object m20026b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new b460((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f21456i.add(new rgv(MotionType.multi_connect, new z9j() { // from class: l.q4t
                /* JADX INFO: renamed from: b */
                public final Object m21022b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new iz3((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f21456i.add(new rgv(MotionType.multi_call, new z9j() { // from class: l.r4t
                /* JADX INFO: renamed from: b */
                public final Object m21777b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new w010((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
        } else {
            arrayList.add(new rgv(MotionType.pk, new z9j() { // from class: l.s4t
                /* JADX INFO: renamed from: b */
                public final Object m22206b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new c460((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f21456i.add(new rgv(MotionType.multi_connect, new z9j() { // from class: l.t4t
                /* JADX INFO: renamed from: b */
                public final Object m22792b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new x04((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
            this.f21456i.add(new rgv(MotionType.multi_call, new z9j() { // from class: l.u4t
                /* JADX INFO: renamed from: b */
                public final Object m23287b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new l210((MotionType) obj, (w4t) obj2, (bsm) obj3, (nxl) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m24323R3(MotionType motionType, f30<Integer, MotionType> f30Var, nxl nxlVar) {
        qgv qgvVar = this.f21457j;
        if (qgvVar != null) {
            boolean zM21268a = qgvVar.m21268a(motionType);
            qgv qgvVar2 = this.f21457j;
            if (!zM21268a) {
                f30Var.call(1, qgvVar2.m21270c());
                return;
            }
            qgvVar2.m21269b();
        }
        rgv rgvVarM24318P3 = m24318P3(this.f21456i, motionType);
        if (rgvVarM24318P3 == null) {
            f30Var.call(2, MotionType.NULL);
            return;
        }
        qgv qgvVarM21936a = rgvVarM24318P3.m21936a(this, this.f21458k, nxlVar);
        if (qgvVarM21936a == null) {
            f30Var.call(3, MotionType.NULL);
        } else {
            this.f21457j = qgvVarM21936a;
            qgvVarM21936a.mo10160e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m24324S3(MotionType motionType) {
        qgv qgvVar = this.f21457j;
        if (qgvVar != null && qgvVar.m21270c() == motionType) {
            this.f21457j.mo10161f();
            this.f21457j = null;
        }
    }

    /* JADX INFO: renamed from: T */
    public void m24325T() {
        super.T();
        duringCreated((c) m25548F2().MotionEvent.motionSwitch().g()).subscribe(ffw.d(new e30() { // from class: l.o4t
            public final void call(Object obj) {
                this.f16365a.m24321N3((jy00) obj);
            }
        }));
    }

    public void init() {
        m24322O3();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        qgv qgvVar = this.f21457j;
        if (qgvVar == null) {
            return;
        }
        qgvVar.mo10161f();
        this.f21457j = null;
    }
}
