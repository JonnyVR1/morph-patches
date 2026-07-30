package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class rug0 implements csg0, vkg0 {

    /* JADX INFO: renamed from: a */
    public final rg50 f164918a;

    /* JADX INFO: renamed from: b */
    public final x1d0.C21228a f164919b;

    /* JADX INFO: renamed from: c */
    public x1d0 f164920c;

    /* JADX INFO: renamed from: d */
    public i5d0 f164921d;

    public rug0(rg50 rg50Var, String str) {
        x1d0.C21228a c21228aM209043q = new x1d0.C21228a().m209043q(str);
        this.f164918a = rg50Var;
        this.f164919b = c21228aM209043q;
    }

    /* JADX INFO: renamed from: a */
    public final String m183191a(String str) {
        i5d0 i5d0Var = this.f164921d;
        if (i5d0Var == null) {
            return null;
        }
        return i5d0Var.m138675u(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m183192b(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Class cls : map.keySet()) {
            this.f164919b.m209041o(cls, map.get(cls));
        }
    }
}
