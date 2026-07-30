package p149l;

import com.p069ss.bytertc.engine.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class jng0 implements njg0 {
    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            fcg0.f96796a = new JSONObject(str4).getBoolean(BuildConfig.BUILD_TYPE);
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
