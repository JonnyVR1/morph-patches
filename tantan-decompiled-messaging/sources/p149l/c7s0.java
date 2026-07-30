package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class c7s0 implements ras0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f79645a;

    public c7s0(k7s0 k7s0Var, SharedPreferences sharedPreferences) {
        this.f79645a = sharedPreferences;
    }

    @Override // p149l.ras0
    /* JADX INFO: renamed from: a */
    public final String mo105631a(String str, String str2) {
        return this.f79645a.getString(str, str2);
    }

    @Override // p149l.ras0
    /* JADX INFO: renamed from: b */
    public final Double mo105632b(String str, double d) {
        try {
            return Double.valueOf(this.f79645a.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f79645a.getString(str, String.valueOf(d)));
        }
    }

    @Override // p149l.ras0
    /* JADX INFO: renamed from: c */
    public final Long mo105633c(String str, long j) {
        try {
            return Long.valueOf(this.f79645a.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f79645a.getInt(str, (int) j));
        }
    }

    @Override // p149l.ras0
    /* JADX INFO: renamed from: d */
    public final Boolean mo105634d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.f79645a.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f79645a.getString(str, String.valueOf(z)));
        }
    }
}
