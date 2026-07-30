package p149l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class fkt0 implements zit0 {

    /* JADX INFO: renamed from: a */
    public final dru0 f98097a;

    public fkt0(dru0 dru0Var) {
        this.f98097a = dru0Var;
    }

    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f98097a.m113352n(str.equals("true"));
    }
}
