package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sgs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        if (map.keySet().contains("start")) {
            q9t0Var.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            q9t0Var.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            q9t0Var.zzN().zzk();
        }
    }
}
