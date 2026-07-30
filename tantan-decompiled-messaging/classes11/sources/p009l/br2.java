package p009l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class br2 {

    /* JADX INFO: renamed from: a */
    public static br2 f10240a = new br2();

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f10241b = null;

    /* JADX INFO: renamed from: b */
    public static br2 m12192b() {
        return f10240a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m12193a(String str, boolean z) {
        return NullChecker.a(f10241b) ? f10241b.getBoolean(str, z) : z;
    }

    /* JADX INFO: renamed from: c */
    public String m12194c(String str, String str2) {
        return NullChecker.a(f10241b) ? f10241b.getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: d */
    public void m12195d(Context context) {
        if (f10241b == null) {
            f10241b = context.getSharedPreferences("ipc_sharedpreference", 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12196e(String str, Object obj) {
        if (NullChecker.a(f10241b)) {
            if (obj instanceof String) {
                f10241b.edit().putString(str, (String) obj).commit();
            } else if (obj instanceof Boolean) {
                f10241b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
            } else if (obj instanceof Integer) {
                f10241b.edit().putInt(str, ((Integer) obj).intValue()).commit();
            }
        }
    }
}
