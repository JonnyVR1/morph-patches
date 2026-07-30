package p149l;

import android.view.View;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class brg0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t7g0 f76901a;

    public brg0(t7g0 t7g0Var) {
        this.f76901a = t7g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sfg0 sfg0Var = this.f76901a.f143311a;
        sfg0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onClickTimeoutReload");
        v8g0 v8g0Var = sfg0Var.f164291a;
        t7g0 t7g0Var = v8g0Var.f180514p;
        if (t7g0Var != null) {
            int i = t7g0Var.f168718d;
            if (i == 80) {
                t7g0Var.m187456a();
                sfg0Var.f164291a.f180514p.m187463h();
            } else if (i > 80 && v8g0Var.f180511m != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("onClickTimeoutReload", 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sfg0Var.f164291a.f180514p.m187457b(3, jSONObject);
                v8g0 v8g0Var2 = sfg0Var.f164291a;
                v8g0Var2.f180511m.mo112476c(v8g0Var2.f180522x, v8g0Var2.f180523y);
            }
        }
        amg0 amg0Var = sfg0Var.f164291a.f180521w;
        amg0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "onClickTimeoutReload");
        amg0Var.m97558e(true);
    }
}
