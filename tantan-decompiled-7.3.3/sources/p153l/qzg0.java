package p153l;

import android.widget.TextView;
import java.util.Locale;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class qzg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f160262a;

    public qzg0(wyg0 wyg0Var) {
        this.f160262a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        bfg0 bfg0Var = this.f160262a.f191652m;
        if (bfg0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                int i = jSONObject.getInt("percent");
                bgg0 bgg0Var = bfg0Var.f76491b.f88516p;
                if (bgg0Var != null) {
                    TextView textView = bgg0Var.f76629k;
                    Locale locale = Locale.US;
                    textView.setText(i + "/100");
                    bgg0Var.f76621c = 85;
                    bgg0Var.m104165d((long) i, 100L, 15, 100);
                    dhg0 dhg0Var = bfg0Var.f76491b;
                    dhg0Var.f88512l = true;
                    iug0 iug0Var = dhg0Var.f88523w;
                    iug0Var.getClass();
                    LogUtils.file("LoadGameStatsManager", "onGameLoadPercent");
                    iug0Var.f116946q = true;
                    iug0Var.f116947r = true;
                    iug0Var.f116936g = false;
                    iug0Var.m142193e(true);
                }
                int i2 = (int) ((((long) i) * 15) / 100);
                int i3 = (i2 >= 0 ? i2 : 0) + 85;
                dhg0 dhg0Var2 = bfg0Var.f76491b;
                if (i == 0) {
                    dhg0Var2.f88523w.m142191c("loadGameRuntime", i3, jSONObject);
                } else {
                    dhg0Var2.f88523w.m142191c("loadGamePercent", i3, jSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
