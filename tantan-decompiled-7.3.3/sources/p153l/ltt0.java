package p153l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ltt0 implements fst0 {

    /* JADX INFO: renamed from: a */
    public final j0v0 f133565a;

    public ltt0(j0v0 j0v0Var) {
        this.f133565a = j0v0Var;
    }

    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f133565a.m143049n(str.equals("true"));
    }
}
