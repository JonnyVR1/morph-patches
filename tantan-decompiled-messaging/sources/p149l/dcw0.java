package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class dcw0 {

    /* JADX INFO: renamed from: c */
    public static dcw0 f85513c;

    /* JADX INFO: renamed from: a */
    public final String f85514a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f85515b;

    public dcw0(Context context) {
        this.f85514a = context.getPackageName();
        this.f85515b = context.getSharedPreferences("paid_storage_sp", 0);
    }

    /* JADX INFO: renamed from: b */
    public static dcw0 m110879b(Context context) {
        if (f85513c == null) {
            f85513c = new dcw0(context);
        }
        return f85513c;
    }

    /* JADX INFO: renamed from: a */
    public final long m110880a(String str, long j) {
        return this.f85515b.getLong(str, -1L);
    }

    /* JADX INFO: renamed from: c */
    public final String m110881c(String str, String str2) {
        return this.f85515b.getString(str, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m110882d(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f85515b.edit().putString(str, (String) obj).commit();
        } else {
            if (!(obj instanceof Long)) {
                if (obj instanceof Boolean) {
                    zCommit = this.f85515b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
                } else {
                    Log.e("PaidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f85514a);
                }
                ccw0.m106203a("Failed to store ", str, " for app ", this.f85514a);
            }
            zCommit = this.f85515b.edit().putLong(str, ((Long) obj).longValue()).commit();
        }
        if (zCommit) {
            return;
        }
        ccw0.m106203a("Failed to store ", str, " for app ", this.f85514a);
    }

    /* JADX INFO: renamed from: e */
    public final void m110883e(String str) throws IOException {
        if (this.f85515b.edit().remove(str).commit()) {
            return;
        }
        ccw0.m106203a("Failed to remove ", str, " for app ", this.f85514a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m110884f(String str, boolean z) {
        return this.f85515b.getBoolean(str, true);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m110885g(String str) {
        return this.f85515b.contains(str);
    }
}
