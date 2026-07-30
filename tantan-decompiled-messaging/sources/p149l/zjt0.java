package p149l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class zjt0 implements zit0 {

    /* JADX INFO: renamed from: a */
    public final jxv0 f203479a;

    public zjt0(jxv0 jxv0Var) {
        this.f203479a = jxv0Var;
    }

    @Override // p149l.zit0
    /* JADX INFO: renamed from: a */
    public final void mo102229a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f203479a.m143827b(Boolean.parseBoolean(str));
        } catch (Exception e) {
            byv.m104511a("Invalid render_in_browser state", e);
        }
    }
}
