package p002l;

import l.e30;
import l.ffw;
import l.vpv;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class c8g extends nk2 {
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ho2, l.lh20] */
    @Override // p002l.nk2
    /* JADX INFO: renamed from: f */
    public void mo10899f(kbg kbgVar, final e30<Boolean> e30Var) {
        if (kbgVar.m25547E2().m14524R0()) {
            e30Var.call(Boolean.TRUE);
            return;
        }
        edg.m12325i(kbgVar);
        vpv vpvVar = ypv.a;
        vpvVar.d(vpvVar.D0(), kbgVar.m25547E2().m14582l0(), true, "liveRoom", kbgVar.m25547E2().m17235k(), kbgVar.m25547E2().m17239o(), "p_user_live_room", "fanbase_accompany").subscribe(ffw.e(new e30() { // from class: l.a8g
            public final void call(Object obj) {
                e30Var.call(Boolean.TRUE);
            }
        }, new e30() { // from class: l.b8g
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p002l.nk2
    /* JADX INFO: renamed from: k */
    public void mo10900k(kbg kbgVar) {
        if (kbgVar.m25547E2().m14524R0()) {
            return;
        }
        edg.m12326j(kbgVar);
    }
}
