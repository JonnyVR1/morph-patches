package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class y8g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f196828a;

    public y8g0(oqg0 oqg0Var) {
        this.f196828a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f196828a.f145150m;
        if (t6g0Var != null) {
            zqg0 zqg0Var = new zqg0(t6g0Var);
            v8g0 v8g0Var = t6g0Var.f168615b;
            if (v8g0Var.f180524z == null) {
                v8g0Var.f180524z = new ArrayList();
            }
            v8g0Var.f180524z.add(zqg0Var);
            f9g0.m120082c(str4, zqg0Var);
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
