package p149l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class r2t extends pat<ho2> {
    public r2t(bsm<? extends ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m177612J3(Long l2) {
        qib0.f154691G.m184721j();
        hu20.m132972s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129299H3(m206027E2().m132135h2(3, TimeUnit.MINUTES)).subscribe(ffw.m121193d(new e30() { // from class: l.q2t
            @Override // p149l.e30
            public final void call(Object obj) {
                r2t.m177612J3((Long) obj);
            }
        }));
    }
}
