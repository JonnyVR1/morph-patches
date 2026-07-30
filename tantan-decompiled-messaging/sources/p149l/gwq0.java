package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.EnumC14726v;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class gwq0 {

    /* JADX INFO: renamed from: c */
    private static volatile gwq0 f104766c;

    /* JADX INFO: renamed from: a */
    private Context f104767a;

    /* JADX INFO: renamed from: b */
    private List<zvq0> f104768b = new ArrayList();

    private gwq0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f104767a = applicationContext;
        if (applicationContext == null) {
            this.f104767a = context;
        }
    }

    /* JADX INFO: renamed from: c */
    public static gwq0 m128497c(Context context) {
        if (f104766c == null) {
            synchronized (gwq0.class) {
                try {
                    if (f104766c == null) {
                        f104766c = new gwq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f104766c;
    }

    /* JADX INFO: renamed from: a */
    public int m128498a(String str) {
        synchronized (this.f104768b) {
            try {
                zvq0 zvq0Var = new zvq0();
                zvq0Var.f205057b = str;
                if (this.f104768b.contains(zvq0Var)) {
                    for (zvq0 zvq0Var2 : this.f104768b) {
                        if (zvq0Var2.equals(zvq0Var)) {
                            return zvq0Var2.f205056a;
                        }
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m128499b(EnumC14726v enumC14726v) {
        return this.f104767a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getString(enumC14726v.name(), "");
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m128500d(EnumC14726v enumC14726v, String str) {
        SharedPreferences sharedPreferences = this.f104767a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        sharedPreferences.edit().putString(enumC14726v.name(), str).apply();
    }

    /* JADX INFO: renamed from: e */
    public void m128501e(String str) {
        synchronized (this.f104768b) {
            try {
                zvq0 zvq0Var = new zvq0();
                zvq0Var.f205056a = 0;
                zvq0Var.f205057b = str;
                if (this.f104768b.contains(zvq0Var)) {
                    this.f104768b.remove(zvq0Var);
                }
                this.f104768b.add(zvq0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m128502f(String str) {
        synchronized (this.f104768b) {
            try {
                zvq0 zvq0Var = new zvq0();
                zvq0Var.f205057b = str;
                return this.f104768b.contains(zvq0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m128503g(String str) {
        synchronized (this.f104768b) {
            try {
                zvq0 zvq0Var = new zvq0();
                zvq0Var.f205057b = str;
                if (this.f104768b.contains(zvq0Var)) {
                    for (zvq0 zvq0Var2 : this.f104768b) {
                        if (zvq0Var.equals(zvq0Var2)) {
                            zvq0Var = zvq0Var2;
                            break;
                        }
                    }
                }
                zvq0Var.f205056a++;
                this.f104768b.remove(zvq0Var);
                this.f104768b.add(zvq0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m128504h(String str) {
        synchronized (this.f104768b) {
            try {
                zvq0 zvq0Var = new zvq0();
                zvq0Var.f205057b = str;
                if (this.f104768b.contains(zvq0Var)) {
                    this.f104768b.remove(zvq0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
