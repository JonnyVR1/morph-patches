package p153l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class myg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f139414a;

    public myg0(pgg0 pgg0Var) {
        this.f139414a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        try {
            if (!new JSONObject(str).optString("state").equals("running") || this.f139414a.f152271h == null) {
                return;
            }
            LogUtils.file("SUDRealSudFSTAPPImpl", "onStartRender");
            SudLogger.m222811d(mzg0.f139506k, "onStartRender");
        } catch (JSONException e) {
            ysg0.m217257c("WXGame", "OnState:" + e.getMessage());
        }
    }
}
