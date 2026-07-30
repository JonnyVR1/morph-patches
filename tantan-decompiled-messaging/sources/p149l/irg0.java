package p149l;

import android.widget.TextView;
import java.util.Locale;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class irg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f114638a;

    public irg0(oqg0 oqg0Var) {
        this.f114638a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        t6g0 t6g0Var = this.f114638a.f145150m;
        if (t6g0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                int i = jSONObject.getInt("percent");
                t7g0 t7g0Var = t6g0Var.f168615b.f180514p;
                if (t7g0Var != null) {
                    TextView textView = t7g0Var.f168725k;
                    Locale locale = Locale.US;
                    textView.setText(i + "/100");
                    t7g0Var.f168717c = 85;
                    t7g0Var.m187459d((long) i, 100L, 15, 100);
                    v8g0 v8g0Var = t6g0Var.f168615b;
                    v8g0Var.f180510l = true;
                    amg0 amg0Var = v8g0Var.f180521w;
                    amg0Var.getClass();
                    LogUtils.file("LoadGameStatsManager", "onGameLoadPercent");
                    amg0Var.f70616q = true;
                    amg0Var.f70617r = true;
                    amg0Var.f70606g = false;
                    amg0Var.m97558e(true);
                }
                int i2 = (int) ((((long) i) * 15) / 100);
                int i3 = (i2 >= 0 ? i2 : 0) + 85;
                v8g0 v8g0Var2 = t6g0Var.f168615b;
                if (i == 0) {
                    v8g0Var2.f180521w.m97556c("loadGameRuntime", i3, jSONObject);
                } else {
                    v8g0Var2.f180521w.m97556c("loadGamePercent", i3, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        y6g0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
