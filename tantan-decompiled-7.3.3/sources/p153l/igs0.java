package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes6.dex */
public final class igs0 implements xjs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SharedPreferences f114812a;

    public igs0(qgs0 qgs0Var, SharedPreferences sharedPreferences) {
        this.f114812a = sharedPreferences;
    }

    @Override // p153l.xjs0
    /* JADX INFO: renamed from: a */
    public final String mo139952a(String str, String str2) {
        return this.f114812a.getString(str, str2);
    }

    @Override // p153l.xjs0
    /* JADX INFO: renamed from: b */
    public final Double mo139953b(String str, double d) {
        try {
            return Double.valueOf(this.f114812a.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(this.f114812a.getString(str, String.valueOf(d)));
        }
    }

    @Override // p153l.xjs0
    /* JADX INFO: renamed from: c */
    public final Long mo139954c(String str, long j) {
        try {
            return Long.valueOf(this.f114812a.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(this.f114812a.getInt(str, (int) j));
        }
    }

    @Override // p153l.xjs0
    /* JADX INFO: renamed from: d */
    public final Boolean mo139955d(String str, boolean z) {
        try {
            return Boolean.valueOf(this.f114812a.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(this.f114812a.getString(str, String.valueOf(z)));
        }
    }
}
