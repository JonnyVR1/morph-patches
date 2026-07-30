package p149l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class wgs0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final xgs0 f186216a;

    public wgs0(xgs0 xgs0Var) {
        this.f186216a = xgs0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        boolean zEquals = "1".equals(map.get("transparentBackground"));
        boolean zEquals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            x2t0.m206867e("Fail to parse float", e);
        }
        this.f186216a.m208695c(zEquals);
        this.f186216a.m208694b(zEquals2, f);
        q9t0Var.mo13652C(zEquals);
    }
}
