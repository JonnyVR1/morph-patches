package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public abstract class pvj0 implements eul {
    /* JADX INFO: renamed from: e */
    public abstract void mo156716e(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var);

    /* JADX INFO: renamed from: f */
    public abstract Intent mo156718f(SchemeKey schemeKey, w2e0 w2e0Var, f30<String, String> f30Var);

    /* JADX INFO: renamed from: g */
    public boolean m171659g(Act act) {
        return act == null || act.isFinishing();
    }

    /* JADX INFO: renamed from: h */
    public boolean m171660h(Act act) {
        if (act != null) {
            return s9s.f163232f.m134380m(act);
        }
        return false;
    }
}
