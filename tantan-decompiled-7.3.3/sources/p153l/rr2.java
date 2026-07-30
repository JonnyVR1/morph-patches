package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class rr2 {

    /* JADX INFO: renamed from: a */
    public static rr2 f164536a = new rr2();

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f164537b = null;

    /* JADX INFO: renamed from: b */
    public static rr2 m182682b() {
        return f164536a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m182683a(String str, boolean z) {
        return NullChecker.m82486a(f164537b) ? f164537b.getBoolean(str, z) : z;
    }

    /* JADX INFO: renamed from: c */
    public String m182684c(String str, String str2) {
        return NullChecker.m82486a(f164537b) ? f164537b.getString(str, str2) : str2;
    }

    /* JADX INFO: renamed from: d */
    public void m182685d(Context context) {
        if (f164537b == null) {
            f164537b = context.getSharedPreferences("ipc_sharedpreference", 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m182686e(String str, Object obj) {
        if (NullChecker.m82486a(f164537b)) {
            if (obj instanceof String) {
                f164537b.edit().putString(str, (String) obj).commit();
            } else if (obj instanceof Boolean) {
                f164537b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
            } else if (obj instanceof Integer) {
                f164537b.edit().putInt(str, ((Integer) obj).intValue()).commit();
            }
        }
    }
}
