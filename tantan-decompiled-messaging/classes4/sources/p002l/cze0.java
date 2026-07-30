package p002l;

import android.text.TextUtils;
import l.x4s;
import l.ygt;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class cze0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    @Override // p002l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, c2e0 c2e0Var, x1e0.C0892b c0892b) {
        boolean zB = x4s.b(c2e0Var.m25547E2().m17234j().liveMode);
        if (!c2e0Var.m25547E2().m14548Z0() || zB) {
            c2e0Var.m25548F2().FansClubEvent.showFansClubDialog().j(Boolean.TRUE);
            return;
        }
        String strG = ygtVar.g("id");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        c2e0Var.m25548F2().FansClubEvent.showVoiceFansClubDialog().j(strG);
    }
}
