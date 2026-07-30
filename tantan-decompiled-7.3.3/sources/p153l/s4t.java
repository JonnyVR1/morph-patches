package p153l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class s4t extends qct<oo2> {
    public s4t(dum<? extends oo2> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m184587J3(Long l2) {
        uqb0.f180374G.m98794j();
        r230.m179477s();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138858H3(m213810E2().m168521h2(3, TimeUnit.MINUTES)).subscribe(dhw.m115825d(new y20() { // from class: l.r4t
            @Override // p153l.y20
            public final void call(Object obj) {
                s4t.m184587J3((Long) obj);
            }
        }));
    }
}
