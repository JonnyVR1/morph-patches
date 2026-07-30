package p149l;

import android.content.SharedPreferences;
import java.util.HashMap;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class cbg0 {

    /* JADX INFO: renamed from: b */
    public static final HashMap f80139b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f80140a;

    public cbg0(String str) {
        this.f80140a = Utils.getApp().getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public static cbg0 m105995a(String str) {
        cbg0 cbg0Var;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                str = "spUtils";
                break;
            }
            if (!Character.isWhitespace(str.charAt(i))) {
                break;
            }
            i++;
        }
        HashMap map = f80139b;
        cbg0 cbg0Var2 = (cbg0) map.get(str);
        if (cbg0Var2 != null) {
            return cbg0Var2;
        }
        synchronized (cbg0.class) {
            try {
                cbg0Var = (cbg0) map.get(str);
                if (cbg0Var == null) {
                    cbg0Var = new cbg0(str);
                    map.put(str, cbg0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cbg0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m105996b() {
        this.f80140a.edit().clear().apply();
    }

    /* JADX INFO: renamed from: c */
    public final void m105997c(String str, String str2, boolean z) {
        SharedPreferences sharedPreferences = this.f80140a;
        if (z) {
            sharedPreferences.edit().putString(str, str2).commit();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m105998d(String str) {
        this.f80140a.edit().remove(str).apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m105999e(String str) {
        this.f80140a.edit().putBoolean(str, true).apply();
    }
}
