package p002l;

import com.p1.mobile.putong.data.Media;
import l.bwr;
import l.e30;
import l.ffw;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ybu extends x6s<ho2, wbu> {
    public ybu(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
        C(new wbu(this));
    }

    /* JADX INFO: renamed from: T */
    public void m26501T() {
        super.T();
        duringCreated((c) m25548F2().LiveTipEvent.showTip().g()).subscribe(ffw.d(new e30() { // from class: l.xbu
            public final void call(Object obj) {
                this.f22212a.m26502T3((ubu) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2] */
    /* JADX INFO: renamed from: T3 */
    public final void m26502T3(ubu ubuVar) {
        int i = ubuVar.f20575a;
        if (i == 0) {
            ((wbu) ((bwr) this).viewModel).m24467I(((Media) m25547E2().m14582l0().fp()).url, m25547E2().m14582l0().name, ubuVar.f20578d, ubuVar.f20579e);
        } else if (i == 1) {
            ((wbu) ((bwr) this).viewModel).m24467I(ubuVar.f20576b, ubuVar.f20577c, ubuVar.f20578d, ubuVar.f20579e);
        }
    }
}
