package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class cze0 extends kud0<ygt> {
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2] */
    @Override // p149l.kud0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, c2e0 c2e0Var, x1e0.C21019b c21019b) {
        boolean zM207012b = x4s.m207012b(c2e0Var.m206027E2().mo149813j().liveMode);
        if (!c2e0Var.m206027E2().m132112Z0() || zM207012b) {
            c2e0Var.m206028F2().FansClubEvent.showFansClubDialog().mo172463j(Boolean.TRUE);
            return;
        }
        String strM214763g = ygtVar.m214763g("id");
        if (TextUtils.isEmpty(strM214763g)) {
            return;
        }
        c2e0Var.m206028F2().FansClubEvent.showVoiceFansClubDialog().mo172463j(strM214763g);
    }
}
