package p149l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wau0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f185510a;

    public /* synthetic */ wau0(xau0 xau0Var, vau0 vau0Var) {
        this.f185510a = new WeakReference(xau0Var);
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        xau0 xau0Var = (xau0) this.f185510a.get();
        if (xau0Var == null) {
            return;
        }
        xau0Var.f191825g.zza();
    }
}
