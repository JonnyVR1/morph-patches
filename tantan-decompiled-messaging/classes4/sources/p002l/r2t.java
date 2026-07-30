package p002l;

import java.util.concurrent.TimeUnit;
import l.e30;
import l.ffw;
import l.hu20;
import l.qib0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r2t extends pat<ho2> {
    public r2t(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m21752J3(Long l2) {
        qib0.G.j();
        hu20.s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m21753T() {
        super.T();
        m14186H3(m25547E2().m14571h2(3, TimeUnit.MINUTES)).subscribe(ffw.d(new e30() { // from class: l.q2t
            public final void call(Object obj) {
                r2t.m21752J3((Long) obj);
            }
        }));
    }
}
