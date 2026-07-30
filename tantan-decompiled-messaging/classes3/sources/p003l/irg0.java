package p003l;

import android.widget.TextView;
import java.util.Locale;
import l.amg0;
import l.njg0;
import l.t6g0;
import l.t7g0;
import l.v8g0;
import l.y6g0;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class irg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f4483a;

    public irg0(oqg0 oqg0Var) {
        this.f4483a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5245a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f4483a.f6216m;
        if (t6g0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                int i = jSONObject.getInt("percent");
                t7g0 t7g0Var = t6g0Var.b.p;
                if (t7g0Var != null) {
                    TextView textView = t7g0Var.k;
                    Locale locale = Locale.US;
                    textView.setText(i + "/100");
                    t7g0Var.c = 85;
                    t7g0Var.d((long) i, 100L, 15, 100);
                    v8g0 v8g0Var = t6g0Var.b;
                    v8g0Var.l = true;
                    amg0 amg0Var = v8g0Var.w;
                    amg0Var.getClass();
                    LogUtils.file("LoadGameStatsManager", "onGameLoadPercent");
                    amg0Var.q = true;
                    amg0Var.r = true;
                    amg0Var.g = false;
                    amg0Var.e(true);
                }
                int i2 = (int) ((((long) i) * 15) / 100);
                int i3 = (i2 >= 0 ? i2 : 0) + 85;
                v8g0 v8g0Var2 = t6g0Var.b;
                if (i == 0) {
                    v8g0Var2.w.c("loadGameRuntime", i3, jSONObject);
                } else {
                    v8g0Var2.w.c("loadGamePercent", i3, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
