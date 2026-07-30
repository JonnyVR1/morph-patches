package p153l;

import com.facebook.AuthenticationTokenClaims;
import com.immomo.momomediaext.sei.BaseSei;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zns0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final aos0 f205249a;

    public zns0(aos0 aos0Var) {
        this.f205249a = aos0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        String str = (String) map.get(AuthenticationTokenClaims.JSON_KEY_NAME);
        if (str == null) {
            dct0.m115298g("App event with no name parameter.");
        } else {
            this.f205249a.mo99223b(str, (String) map.get(BaseSei.INFO));
        }
    }
}
