package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzcj;

/* JADX INFO: loaded from: classes6.dex */
public final class kwt0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Boolean> f129093a = new cvt0();

    /* JADX INFO: renamed from: a */
    public static SharedPreferences m151738a(Context context, String str, int i, bmt0 bmt0Var) {
        xpt0 xpt0Var = edt0.m120520a().mo115815d(str, bmt0Var, zzcj.SHARED_PREFS_TYPE).equals("") ? new xpt0() : null;
        if (xpt0Var != null) {
            return xpt0Var;
        }
        ThreadLocal<Boolean> threadLocal = f129093a;
        xn80.m212099d(threadLocal.get().booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f129093a.set(Boolean.TRUE);
        }
    }
}
