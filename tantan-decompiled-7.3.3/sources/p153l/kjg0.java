package p153l;

import android.content.SharedPreferences;
import java.util.HashMap;
import tech.sud.base.utils.Utils;

/* JADX INFO: loaded from: classes.dex */
public final class kjg0 {

    /* JADX INFO: renamed from: b */
    public static final HashMap f127099b = new HashMap();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f127100a;

    public kjg0(String str) {
        this.f127100a = Utils.getApp().getSharedPreferences(str, 0);
    }

    /* JADX INFO: renamed from: a */
    public static kjg0 m150043a(String str) {
        kjg0 kjg0Var;
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
        HashMap map = f127099b;
        kjg0 kjg0Var2 = (kjg0) map.get(str);
        if (kjg0Var2 != null) {
            return kjg0Var2;
        }
        synchronized (kjg0.class) {
            try {
                kjg0Var = (kjg0) map.get(str);
                if (kjg0Var == null) {
                    kjg0Var = new kjg0(str);
                    map.put(str, kjg0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kjg0Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m150044b() {
        this.f127100a.edit().clear().apply();
    }

    /* JADX INFO: renamed from: c */
    public final void m150045c(String str, String str2, boolean z) {
        SharedPreferences sharedPreferences = this.f127100a;
        if (z) {
            sharedPreferences.edit().putString(str, str2).commit();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m150046d(String str) {
        this.f127100a.edit().remove(str).apply();
    }

    /* JADX INFO: renamed from: e */
    public final void m150047e(String str) {
        this.f127100a.edit().putBoolean(str, true).apply();
    }
}
