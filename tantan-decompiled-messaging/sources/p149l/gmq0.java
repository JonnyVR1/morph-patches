package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes2.dex */
public class gmq0 {

    /* JADX INFO: renamed from: b */
    private static volatile gmq0 f103512b;

    /* JADX INFO: renamed from: a */
    private Context f103513a;

    private gmq0(Context context) {
        this.f103513a = context;
    }

    /* JADX INFO: renamed from: c */
    public static gmq0 m127046c(Context context) {
        if (f103512b == null) {
            synchronized (gmq0.class) {
                try {
                    if (f103512b == null) {
                        f103512b = new gmq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f103512b;
    }

    /* JADX INFO: renamed from: a */
    public synchronized long m127047a(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return j;
        }
        return this.f103513a.getSharedPreferences(str, 4).getLong(str2, j);
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m127048b(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.f103513a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m127049d(String str, String str2, long j) {
        SharedPreferences.Editor editorEdit = this.f103513a.getSharedPreferences(str, 4).edit();
        editorEdit.putLong(str2, j);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m127050e(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f103513a.getSharedPreferences(str, 4).edit();
        editorEdit.putString(str2, str3);
        editorEdit.commit();
    }
}
