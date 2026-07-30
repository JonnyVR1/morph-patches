package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzcj;

/* JADX INFO: loaded from: classes6.dex */
public final class ent0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Boolean> f92338a = new wlt0();

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m117291a(Context context, String str, int i, vct0 vct0Var) {
        rgt0 rgt0Var = y3t0.m212856a().mo162947d(str, vct0Var, zzcj.SHARED_PREFS_TYPE).equals("") ? new rgt0() : null;
        if (rgt0Var != null) {
            return rgt0Var;
        }
        ThreadLocal<Boolean> threadLocal = f92338a;
        sf80.m183882d(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f92338a.set(Boolean.TRUE);
        }
    }
}
