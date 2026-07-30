package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yps0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        if (map.keySet().contains("start")) {
            wit0Var.zzN().zzl();
        } else if (map.keySet().contains("stop")) {
            wit0Var.zzN().zzm();
        } else if (map.keySet().contains("cancel")) {
            wit0Var.zzN().zzk();
        }
    }
}
