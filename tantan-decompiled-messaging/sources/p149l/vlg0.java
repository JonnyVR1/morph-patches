package p149l;

import java.util.ArrayList;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class vlg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t6g0 f181949a;

    public vlg0(t6g0 t6g0Var) {
        this.f181949a = t6g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j;
        v8g0 v8g0Var = this.f181949a.f168615b;
        LogUtils.file("ProxySudFSTAPPImpl", "游戏窗口被移除之后又重新添加了执行：exeGameViewAttachedToWindowReload");
        if (v8g0Var.f180509k) {
            return;
        }
        dmg0 dmg0Var = v8g0Var.f180511m;
        erg0 erg0Var = dmg0Var instanceof erg0 ? (erg0) dmg0Var : null;
        if (erg0Var == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("onGameViewAttachedToWindowReload", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t7g0 t7g0Var = v8g0Var.f180514p;
        if (t7g0Var == null) {
            v8g0Var.f180521w.m97556c("checkoutGamePackage", 80, jSONObject);
        } else {
            t7g0Var.m187457b(3, jSONObject);
        }
        amg0 amg0Var = v8g0Var.f180521w;
        if (amg0Var.f70600a != null && amg0Var.f70601b != null) {
            amg0Var.m97558e(true);
            if (amg0Var.f70600a != null && (arrayList = amg0Var.f70601b) != null) {
                int size = arrayList.size();
                int i = 0;
                long j2 = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    lcg0 lcg0Var = (lcg0) obj;
                    int i2 = lcg0Var.f127409b;
                    if (i2 > 80) {
                        j = lcg0Var.f127411d;
                    } else if (i2 == 80 && j2 > 0) {
                        j = lcg0Var.f127411d;
                    }
                    j2 += j;
                }
                amg0Var.f70600a.f133131u = Long.valueOf(j2);
            }
        }
        erg0Var.mo112476c(v8g0Var.f180522x, v8g0Var.f180523y);
    }
}
