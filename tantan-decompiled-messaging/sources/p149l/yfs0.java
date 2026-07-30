package p149l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yfs0 implements vgs0 {
    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12863a(Object obj, Map map) {
        q9t0 q9t0Var = (q9t0) obj;
        try {
            String str = (String) map.get("enabled");
            if (!qew0.m174259c("true", str) && !qew0.m174259c("false", str)) {
                return;
            }
            fcw0.m120480j(q9t0Var.getContext()).m120485n(Boolean.parseBoolean(str));
        } catch (IOException e) {
            vny0.m199079q().m212290w(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
