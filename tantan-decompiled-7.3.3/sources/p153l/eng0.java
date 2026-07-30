package p153l;

import android.os.Vibrator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class eng0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f94782a;

    public eng0(wyg0 wyg0Var) {
        this.f94782a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        try {
            ((Vibrator) this.f94782a.f191641b.getSystemService("vibrator")).vibrate(new JSONObject(str4).getLong("milliseconds"));
            gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
