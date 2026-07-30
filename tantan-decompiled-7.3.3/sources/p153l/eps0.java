package p153l;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class eps0 implements bqs0 {
    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12917a(Object obj, Map map) {
        wit0 wit0Var = (wit0) obj;
        try {
            String str = (String) map.get("enabled");
            if (!wnw0.m207230c("true", str) && !wnw0.m207230c("false", str)) {
                return;
            }
            llw0.m154791j(wit0Var.getContext()).m154796n(Boolean.parseBoolean(str));
        } catch (IOException e) {
            bxy0.m106933q().m120275w(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
