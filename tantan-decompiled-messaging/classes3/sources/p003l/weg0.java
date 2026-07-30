package p003l;

import android.os.Vibrator;
import l.njg0;
import l.y6g0;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class weg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f8536a;

    public weg0(oqg0 oqg0Var) {
        this.f8536a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8554a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            ((Vibrator) this.f8536a.f6205b.getSystemService("vibrator")).vibrate(new JSONObject(str4).getLong("milliseconds"));
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
