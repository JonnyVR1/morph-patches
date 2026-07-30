package p003l;

import java.util.ArrayList;
import l.f9g0;
import l.njg0;
import l.t6g0;
import l.v8g0;
import l.y6g0;
import l.zqg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class y8g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f8937a;

    public y8g0(oqg0 oqg0Var) {
        this.f8937a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8933a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f8937a.f6216m;
        if (t6g0Var != null) {
            zqg0 zqg0Var = new zqg0(t6g0Var);
            v8g0 v8g0Var = t6g0Var.b;
            if (v8g0Var.z == null) {
                v8g0Var.z = new ArrayList();
            }
            v8g0Var.z.add(zqg0Var);
            f9g0.c(str4, zqg0Var);
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
