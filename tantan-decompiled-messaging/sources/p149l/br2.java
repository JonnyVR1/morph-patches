package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class br2 {

    /* JADX INFO: renamed from: a */
    public static br2 f76829a = new br2();

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f76830b = null;

    /* JADX INFO: renamed from: b */
    public static br2 m103433b() {
        return f76829a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m103434a(String str, boolean z) {
        return NullChecker.m81303a(f76830b) ? f76830b.getBoolean(str, z) : z;
    }

    /* JADX INFO: renamed from: c */
    public String m103435c(String str, String str2) {
        return NullChecker.m81303a(f76830b) ? f76830b.getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: d */
    public void m103436d(Context context) {
        if (f76830b == null) {
            f76830b = context.getSharedPreferences("ipc_sharedpreference", 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m103437e(String str, Object obj) {
        if (NullChecker.m81303a(f76830b)) {
            if (obj instanceof String) {
                f76830b.edit().putString(str, (String) obj).commit();
            } else if (obj instanceof Boolean) {
                f76830b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
            } else if (obj instanceof Integer) {
                f76830b.edit().putInt(str, ((Integer) obj).intValue()).commit();
            }
        }
    }
}
