package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class mvq0 {

    /* JADX INFO: renamed from: b */
    private static volatile mvq0 f138939b;

    /* JADX INFO: renamed from: a */
    private Context f138940a;

    private mvq0(Context context) {
        this.f138940a = context;
    }

    /* JADX INFO: renamed from: c */
    public static mvq0 m160316c(Context context) {
        if (f138939b == null) {
            synchronized (mvq0.class) {
                try {
                    if (f138939b == null) {
                        f138939b = new mvq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138939b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m160317a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f138940a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m160318b(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f138940a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m160319d(String str, String str2, long j) {
        SharedPreferences.Editor editorEdit = this.f138940a.getSharedPreferences(str, 4).edit();
        editorEdit.putLong(str2, j);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m160320e(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f138940a.getSharedPreferences(str, 4).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }
}
