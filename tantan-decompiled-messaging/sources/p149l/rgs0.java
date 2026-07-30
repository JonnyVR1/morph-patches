package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class rgs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            q9t0Var.mo13682d0();
        } else if ("resume".equals(str)) {
            q9t0Var.mo13702o0();
        }
    }
}
