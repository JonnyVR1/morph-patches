package p149l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class v7g0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f180386a;

    public v7g0(oqg0 oqg0Var) {
        this.f180386a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f180386a.f145150m;
        if (t6g0Var != null) {
            fog0 fog0Var = new fog0(t6g0Var);
            v8g0 v8g0Var = t6g0Var.f168615b;
            if (v8g0Var.f180524z == null) {
                v8g0Var.f180524z = new ArrayList();
            }
            v8g0Var.f180524z.add(fog0Var);
            f9g0.m120081b(str4, fog0Var);
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
