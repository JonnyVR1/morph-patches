package p153l;

import com.p074ss.bytertc.engine.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class rvg0 implements vrg0 {
    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        try {
            nkg0.f142458a = new JSONObject(str4).getBoolean(BuildConfig.BUILD_TYPE);
            gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
