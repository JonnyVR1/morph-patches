package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t4k0 implements swl {
    /* JADX INFO: renamed from: e */
    public abstract void mo175432e(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var);

    /* JADX INFO: renamed from: f */
    public abstract Intent mo175434f(SchemeKey schemeKey, abe0 abe0Var, z20<String, String> z20Var);

    /* JADX INFO: renamed from: g */
    public boolean m189292g(Act act) {
        return act == null || act.isFinishing();
    }

    /* JADX INFO: renamed from: h */
    public boolean m189293h(Act act) {
        if (act != null) {
            return tbs.f172993f.m143711m(act);
        }
        return false;
    }
}
