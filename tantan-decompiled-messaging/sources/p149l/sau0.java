package p149l;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class sau0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f163454a;

    public /* synthetic */ sau0(xau0 xau0Var, rau0 rau0Var) {
        this.f163454a = new WeakReference(xau0Var);
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        xau0 xau0Var = (xau0) this.f163454a.get();
        if (xau0Var != null && "_ac".equals((String) map.get("eventName"))) {
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
}
