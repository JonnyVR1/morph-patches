package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class jlw0 {

    /* JADX INFO: renamed from: c */
    public static jlw0 f121621c;

    /* JADX INFO: renamed from: a */
    public final String f121622a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f121623b;

    public jlw0(Context context) {
        this.f121622a = context.getPackageName();
        this.f121623b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* JADX INFO: renamed from: b */
    public static jlw0 m146124b(Context context) {
        if (f121621c == null) {
            f121621c = new jlw0(context);
        }
        return f121621c;
    }

    /* JADX INFO: renamed from: a */
    public final long m146125a(String str, long j) {
        return this.f121623b.getLong(str, -1L);
    }

    /* JADX INFO: renamed from: c */
    public final String m146126c(String str, String str2) {
        return this.f121623b.getString(str, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m146127d(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f121623b.edit().putString(str, (String) obj).commit();
        } else {
            if (!(obj instanceof Long)) {
                if (obj instanceof Boolean) {
                    zCommit = this.f121623b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
                } else {
                    Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f121622a);
                }
                ilw0.m140722a("Failed to store ", str, " for app ", this.f121622a);
            }
            zCommit = this.f121623b.edit().putLong(str, ((Long) obj).longValue()).commit();
        }
        if (zCommit) {
            return;
        }
        ilw0.m140722a("Failed to store ", str, " for app ", this.f121622a);
    }

    /* JADX INFO: renamed from: e */
    public final void m146128e(String str) throws IOException {
        if (this.f121623b.edit().remove(str).commit()) {
            return;
        }
        ilw0.m140722a("Failed to remove ", str, " for app ", this.f121622a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m146129f(String str, boolean z) {
        return this.f121623b.getBoolean(str, true);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m146130g(String str) {
        return this.f121623b.contains(str);
    }
}
