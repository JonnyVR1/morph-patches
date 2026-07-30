package p153l;

import java.util.ArrayList;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class dug0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bfg0 f90795a;

    public dug0(bfg0 bfg0Var) {
        this.f90795a = bfg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        long j;
        dhg0 dhg0Var = this.f90795a.f76491b;
        LogUtils.file("ProxySudFSTAPPImpl", "游戏窗口被移除之后又重新添加了执行：exeGameViewAttachedToWindowReload");
        if (dhg0Var.f88511k) {
            return;
        }
        lug0 lug0Var = dhg0Var.f88513m;
        mzg0 mzg0Var = lug0Var instanceof mzg0 ? (mzg0) lug0Var : null;
        if (mzg0Var == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("onGameViewAttachedToWindowReload", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        bgg0 bgg0Var = dhg0Var.f88516p;
        if (bgg0Var == null) {
            dhg0Var.f88523w.m142191c("checkoutGamePackage", 80, jSONObject);
        } else {
            bgg0Var.m104163b(3, jSONObject);
        }
        iug0 iug0Var = dhg0Var.f88523w;
        if (iug0Var.f116930a != null && iug0Var.f116931b != null) {
            iug0Var.m142193e(true);
            if (iug0Var.f116930a != null && (arrayList = iug0Var.f116931b) != null) {
                int size = arrayList.size();
                int i = 0;
                long j2 = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    tkg0 tkg0Var = (tkg0) obj;
                    int i2 = tkg0Var.f174709b;
                    if (i2 > 80) {
                        j = tkg0Var.f174711d;
                    } else if (i2 == 80 && j2 > 0) {
                        j = tkg0Var.f174711d;
                    }
                    j2 += j;
                }
                iug0Var.f116930a.f179412u = Long.valueOf(j2);
            }
        }
        mzg0Var.mo155928c(dhg0Var.f88524x, dhg0Var.f88525y);
    }
}
