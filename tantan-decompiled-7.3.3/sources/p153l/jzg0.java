package p153l;

import android.view.View;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jzg0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bgg0 f123261a;

    public jzg0(bgg0 bgg0Var) {
        this.f123261a = bgg0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aog0 aog0Var = this.f123261a.f189794a;
        aog0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onClickTimeoutReload");
        dhg0 dhg0Var = aog0Var.f72452a;
        bgg0 bgg0Var = dhg0Var.f88516p;
        if (bgg0Var != null) {
            int i = bgg0Var.f76622d;
            if (i == 80) {
                bgg0Var.m104162a();
                aog0Var.f72452a.f88516p.m104169h();
            } else if (i > 80 && dhg0Var.f88513m != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("onClickTimeoutReload", 1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                aog0Var.f72452a.f88516p.m104163b(3, jSONObject);
                dhg0 dhg0Var2 = aog0Var.f72452a;
                dhg0Var2.f88513m.mo155928c(dhg0Var2.f88524x, dhg0Var2.f88525y);
            }
        }
        iug0 iug0Var = aog0Var.f72452a.f88523w;
        iug0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "onClickTimeoutReload");
        iug0Var.m142193e(true);
    }
}
