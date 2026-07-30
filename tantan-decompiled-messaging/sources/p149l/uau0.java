package p149l;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class uau0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f175639a;

    public /* synthetic */ uau0(xau0 xau0Var, tau0 tau0Var) {
        this.f175639a = new WeakReference(xau0Var);
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        xau0 xau0Var = (xau0) this.f175639a.get();
        if (xau0Var == null) {
            return;
        }
        xau0Var.f191826h.onAdClicked();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132323ma)).booleanValue()) {
            xau0Var.f191827i.zzs();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            xau0Var.f191827i.zzbo();
        }
    }
}
