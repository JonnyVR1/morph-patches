package p149l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tes0 implements vgs0 {

    /* JADX INFO: renamed from: a */
    public final ues0 f169911a;

    public tes0(ues0 ues0Var) {
        this.f169911a = ues0Var;
    }

    @Override // p149l.vgs0
    /* JADX INFO: renamed from: a */
    public final void mo12863a(Object obj, Map map) {
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            x2t0.m206869g("App event with no name parameter.");
        } else {
            this.f169911a.mo109944b(str, (String) map.get(BaseSei.INFO));
        }
    }
}
