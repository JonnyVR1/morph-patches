package p149l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class eqg0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f92800a;

    public eqg0(h8g0 h8g0Var) {
        this.f92800a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        try {
            if (!new JSONObject(str).optString("state").equals("running") || this.f92800a.f106417h == null) {
                return;
            }
            LogUtils.file("SUDRealSudFSTAPPImpl", "onStartRender");
            SudLogger.m221565d(erg0.f92914k, "onStartRender");
        } catch (JSONException e) {
            qkg0.m175377c("WXGame", "OnState:" + e.getMessage());
        }
    }
}
