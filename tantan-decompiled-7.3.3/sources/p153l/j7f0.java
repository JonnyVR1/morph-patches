package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class j7f0 extends o2e0<zit> {
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2] */
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, gae0 gae0Var, bae0.C15954b c15954b) {
        boolean zM214494b = y6s.m214494b(gae0Var.m213810E2().mo183435j().liveMode);
        if (!gae0Var.m213810E2().m168498Z0() || zM214494b) {
            gae0Var.m213811F2().FansClubEvent.showFansClubDialog().mo199273j(Boolean.TRUE);
            return;
        }
        String strM219937g = zitVar.m219937g("id");
        if (TextUtils.isEmpty(strM219937g)) {
            return;
        }
        gae0Var.m213811F2().FansClubEvent.showVoiceFansClubDialog().mo199273j(strM219937g);
    }
}
