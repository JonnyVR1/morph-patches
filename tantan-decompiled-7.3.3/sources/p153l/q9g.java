package p153l;

/* JADX INFO: loaded from: classes4.dex */
public class q9g extends vk2 {
    /* JADX WARN: Type inference failed for: r9v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r9v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r9v5, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.oo2, l.vp20] */
    @Override // p153l.vk2
    /* JADX INFO: renamed from: f */
    public void mo162170f(ycg ycgVar, final y20<Boolean> y20Var) {
        if (ycgVar.m213810E2().m168474R0()) {
            y20Var.call(Boolean.TRUE);
            return;
        }
        seg.m185541i(ycgVar);
        wrv wrvVar = zrv.f205799a;
        wrvVar.m207662d(wrvVar.m207631D0(), ycgVar.m213810E2().m168532l0(), true, "liveRoom", ycgVar.m213810E2().m202191k(), ycgVar.m213810E2().m202194o(), "p_user_live_room", "fanbase_accompany").subscribe(dhw.m115826e(new y20() { // from class: l.o9g
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.TRUE);
            }
        }, new y20() { // from class: l.p9g
            @Override // p153l.y20
            public final void call(Object obj) {
                y20Var.call(Boolean.FALSE);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    @Override // p153l.vk2
    /* JADX INFO: renamed from: k */
    public void mo175840k(ycg ycgVar) {
        if (ycgVar.m213810E2().m168474R0()) {
            return;
        }
        seg.m185542j(ycgVar);
    }
}
