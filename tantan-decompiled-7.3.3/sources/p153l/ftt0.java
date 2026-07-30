package p153l;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ftt0 implements fst0 {

    /* JADX INFO: renamed from: a */
    public final p6w0 f100807a;

    public ftt0(p6w0 p6w0Var) {
        this.f100807a = p6w0Var;
    }

    @Override // p153l.fst0
    /* JADX INFO: renamed from: a */
    public final void mo100273a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f100807a.m171081b(Boolean.parseBoolean(str));
        } catch (Exception e) {
            yzv.m218057a("Invalid render_in_browser state", e);
        }
    }
}
