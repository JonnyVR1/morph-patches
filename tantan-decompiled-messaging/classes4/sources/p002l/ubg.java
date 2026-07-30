package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import l.bwr;
import l.e30;
import l.ffw;
import l.s7m;
import l.soj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ubg extends lk2<obg> {

    /* JADX INFO: renamed from: j */
    public String f20571j;

    public ubg(bsm bsmVar) {
        super(bsmVar);
        C(new obg(bsmVar.f8332a, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public /* synthetic */ void m23419q4(soj0 soj0Var) {
        m23420m4();
    }

    /* JADX INFO: renamed from: m4 */
    public void m23420m4() {
        ((obg) ((bwr) this).viewModel).mo5216p();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m23422o4() {
        edg.m12323g(this, ((obg) ((bwr) this).viewModel).f16496m.getHeight());
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m23423p4(a5g a5gVar) {
        if (a5gVar.m9396a() != null) {
            this.f20571j = "fanbase_page";
            m23421n4(a5gVar.m9397b(), a5gVar.m9396a(), true);
        } else {
            this.f20571j = LiveMessage.LiveMessageType.OTHER;
            m23424r4(a5gVar.m9397b(), false);
        }
        edg.m12324h(this, mo21430R2(), this.f20571j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final void m23424r4(final boolean z, final boolean z2) {
        duringCreated(m25547E2().f12141B.m15711T()).subscribe(ffw.h(new e30() { // from class: l.tbg
            public final void call(Object obj) {
                this.f20166a.m23421n4(z, z2, (mcg) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m23425s4() {
        bsm<? extends T> bsmVar = this.f22036e;
        s7m s7mVar = ((bwr) this).viewModel;
        z2(new z4g(bsmVar, this, ((obg) s7mVar).f16500q, ((obg) s7mVar).f16482B, ((obg) s7mVar).f16483C));
        bsm<? extends T> bsmVar2 = this.f22036e;
        s7m s7mVar2 = ((bwr) this).viewModel;
        z2(new h5g(bsmVar2, this, ((obg) s7mVar2).f16490J, ((obg) s7mVar2).f16491K, ((obg) s7mVar2).f16493M));
        bsm<? extends T> bsmVar3 = this.f22036e;
        s7m s7mVar3 = ((bwr) this).viewModel;
        z2(new c5g(bsmVar3, ((obg) s7mVar3).f16506w, ((obg) s7mVar3).f16508y, ((obg) s7mVar3).f16509z, ((obg) s7mVar3).f16481A, true));
        bsm<? extends T> bsmVar4 = this.f22036e;
        s7m s7mVar4 = ((bwr) this).viewModel;
        z2(new j5g(bsmVar4, this, ((obg) s7mVar4).f16486F, ((obg) s7mVar4).f16487G, ((obg) s7mVar4).f16488H, ((obg) s7mVar4).f16489I, this.f20571j));
    }

    /* JADX INFO: renamed from: t */
    public void m23426t() {
        super.t();
        duringCreated((c) m25548F2().FansClubEvent.showFansClubCompanyDialog().g()).subscribe(ffw.d(new e30() { // from class: l.qbg
            public final void call(Object obj) {
                this.f17891a.m23423p4((a5g) obj);
            }
        }));
        duringCreated((c) m25548F2().FansClubEvent.hideFansClubCompanyDialog().g()).subscribe(ffw.d(new e30() { // from class: l.rbg
            public final void call(Object obj) {
                this.f18452a.m23419q4((soj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4, reason: merged with bridge method [inline-methods] */
    public final void m23421n4(boolean z, mcg mcgVar, boolean z2) {
        ((obg) ((bwr) this).viewModel).m5211E();
        ((obg) ((bwr) this).viewModel).m19387N(z, z2);
        m17291f4(mcgVar);
    }

    /* JADX INFO: renamed from: u4 */
    public void m23428u4() {
        ((obg) ((bwr) this).viewModel).f16496m.post(new Runnable() { // from class: l.sbg
            @Override // java.lang.Runnable
            public final void run() {
                this.f18911a.m23422o4();
            }
        });
    }
}
