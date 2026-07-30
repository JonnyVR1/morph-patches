package p149l;

import android.os.Vibrator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class weg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f185939a;

    public weg0(oqg0 oqg0Var) {
        this.f185939a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            ((Vibrator) this.f185939a.f145139b.getSystemService("vibrator")).vibrate(new JSONObject(str4).getLong("milliseconds"));
            y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
