package p153l;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class dtt0 implements fst0 {

    /* JADX INFO: renamed from: a */
    public final Context f90627a;

    /* JADX INFO: renamed from: b */
    public final grw0 f90628b = bxy0.m106933q().m120264i();

    public dtt0(Context context) {
        this.f90627a = context;
    }

    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        grw0 grw0Var = this.f90628b;
        boolean z = Boolean.parseBoolean(str);
        grw0Var.mo131897g(z);
        if (z) {
            yer0.m215444c(this.f90627a);
        }
    }
}
