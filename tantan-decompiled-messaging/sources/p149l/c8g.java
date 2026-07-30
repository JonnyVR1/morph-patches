package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class c8g extends nk2 {
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.ho2, l.lh20] */
    @Override // p149l.nk2
    /* JADX INFO: renamed from: f */
    public void mo105792f(kbg kbgVar, final e30<Boolean> e30Var) {
        if (kbgVar.m206027E2().m132088R0()) {
            e30Var.call(Boolean.TRUE);
            return;
        }
        edg.m115804i(kbgVar);
        vpv vpvVar = ypv.f199493a;
        vpvVar.m199340d(vpvVar.m199309D0(), kbgVar.m206027E2().m132146l0(), true, "liveRoom", kbgVar.m206027E2().m149814k(), kbgVar.m206027E2().m149818o(), "p_user_live_room", "fanbase_accompany").subscribe(ffw.m121194e(new e30() { // from class: l.a8g
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.TRUE);
            }
        }, new e30() { // from class: l.b8g
            @Override // p149l.e30
            public final void call(Object obj) {
                e30Var.call(Boolean.FALSE);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    @Override // p149l.nk2
    /* JADX INFO: renamed from: k */
    public void mo105793k(kbg kbgVar) {
        if (kbgVar.m206027E2().m132088R0()) {
            return;
        }
        edg.m115805j(kbgVar);
    }
}
