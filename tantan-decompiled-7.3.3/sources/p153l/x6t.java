package p153l;

import com.p051p1.mobile.putong.live.livingroom.archi.motion.MotionType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class x6t extends qct<oo2> implements c6m {

    /* JADX INFO: renamed from: i */
    public ArrayList<siv> f192632i;

    /* JADX INFO: renamed from: j */
    public riv f192633j;

    /* JADX INFO: renamed from: k */
    public dum f192634k;

    public x6t(dum dumVar) {
        super(dumVar);
        this.f192632i = new ArrayList<>();
        this.f192634k = dumVar;
    }

    /* JADX INFO: renamed from: P3 */
    public static siv m209547P3(ArrayList<siv> arrayList, final MotionType motionType) {
        return (siv) jyb.m147529r(arrayList, new qcj() { // from class: l.w6t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((siv) obj).m186038b(motionType));
            }
        });
    }

    /* JADX INFO: renamed from: L3 */
    public boolean m209548L3(MotionType motionType) {
        riv rivVar = this.f192633j;
        return rivVar != null && rivVar.m181605c() == motionType;
    }

    /* JADX INFO: renamed from: M3 */
    public MotionType m209549M3() {
        riv rivVar = this.f192633j;
        return rivVar == null ? MotionType.NULL : rivVar.m181605c();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m209550N3(t610 t610Var) {
        boolean z = t610Var.f172283a;
        MotionType motionType = t610Var.f172284b;
        if (z) {
            m209552R3(motionType, t610Var.f172286d, t610Var.f172285c);
        } else {
            m209553S3(motionType);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m209551O3() {
        boolean z = this.f192634k.f90818d;
        ArrayList<siv> arrayList = this.f192632i;
        if (z) {
            arrayList.add(new siv(MotionType.pk, new tcj() { // from class: l.q6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new gc60((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
            this.f192632i.add(new siv(MotionType.multi_connect, new tcj() { // from class: l.r6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new h04((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
            this.f192632i.add(new siv(MotionType.multi_call, new tcj() { // from class: l.s6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new g910((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
        } else {
            arrayList.add(new siv(MotionType.pk, new tcj() { // from class: l.t6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new hc60((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
            this.f192632i.add(new siv(MotionType.multi_connect, new tcj() { // from class: l.u6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new w14((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
            this.f192632i.add(new siv(MotionType.multi_call, new tcj() { // from class: l.v6t
                @Override // p153l.tcj
                /* JADX INFO: renamed from: b */
                public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                    return new va10((MotionType) obj, (x6t) obj2, (dum) obj3, (g0m) obj4);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public void m209552R3(MotionType motionType, z20<Integer, MotionType> z20Var, g0m g0mVar) {
        riv rivVar = this.f192633j;
        if (rivVar != null) {
            boolean zM181603a = rivVar.m181603a(motionType);
            riv rivVar2 = this.f192633j;
            if (!zM181603a) {
                z20Var.call(1, rivVar2.m181605c());
                return;
            }
            rivVar2.m181604b();
        }
        siv sivVarM209547P3 = m209547P3(this.f192632i, motionType);
        if (sivVarM209547P3 == null) {
            z20Var.call(2, MotionType.NULL);
            return;
        }
        riv rivVarM186037a = sivVarM209547P3.m186037a(this, this.f192634k, g0mVar);
        if (rivVarM186037a == null) {
            z20Var.call(3, MotionType.NULL);
        } else {
            this.f192633j = rivVarM186037a;
            rivVarM186037a.mo129510e();
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m209553S3(MotionType motionType) {
        riv rivVar = this.f192633j;
        if (rivVar != null && rivVar.m181605c() == motionType) {
            this.f192633j.mo129511f();
            this.f192633j = null;
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().MotionEvent.motionSwitch().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.p6t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150874a.m209550N3((t610) obj);
            }
        }));
    }

    public void init() {
        m209551O3();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        riv rivVar = this.f192633j;
        if (rivVar == null) {
            return;
        }
        rivVar.mo129511f();
        this.f192633j = null;
    }
}
