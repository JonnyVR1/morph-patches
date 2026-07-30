package p149l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xjt0 implements zit0 {

    /* JADX INFO: renamed from: a */
    public final Context f193244a;

    /* JADX INFO: renamed from: b */
    public final aiw0 f193245b = vny0.m199079q().m212279i();

    public xjt0(Context context) {
        this.f193244a = context;
    }

    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        aiw0 aiw0Var = this.f193245b;
        boolean z = Boolean.parseBoolean(str);
        aiw0Var.mo96948g(z);
        if (z) {
            s5r0.m182373c(this.f193244a);
        }
    }
}
