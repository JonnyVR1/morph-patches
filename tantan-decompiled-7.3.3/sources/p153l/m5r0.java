package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.EnumC14874v;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m5r0 {

    /* JADX INFO: renamed from: c */
    private static volatile m5r0 f134925c;

    /* JADX INFO: renamed from: a */
    private Context f134926a;

    /* JADX INFO: renamed from: b */
    private List<f5r0> f134927b = new ArrayList();

    private m5r0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f134926a = applicationContext;
        if (applicationContext == null) {
            this.f134926a = context;
        }
    }

    /* JADX INFO: renamed from: c */
    public static m5r0 m157115c(Context context) {
        if (f134925c == null) {
            synchronized (m5r0.class) {
                try {
                    if (f134925c == null) {
                        f134925c = new m5r0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f134925c;
    }

    /* JADX INFO: renamed from: a */
    public int m157116a(String str) {
        synchronized (this.f134927b) {
            try {
                f5r0 f5r0Var = new f5r0();
                f5r0Var.f97336b = str;
                if (this.f134927b.contains(f5r0Var)) {
                    for (f5r0 f5r0Var2 : this.f134927b) {
                        if (f5r0Var2.equals(f5r0Var)) {
                            return f5r0Var2.f97335a;
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
    public synchronized String m157117b(EnumC14874v enumC14874v) {
        return this.f134926a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0).getString(enumC14874v.name(), "");
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m157118d(EnumC14874v enumC14874v, String str) {
        SharedPreferences sharedPreferences = this.f134926a.getSharedPreferences(MiPushClient.PREF_EXTRA, 0);
        sharedPreferences.edit().putString(enumC14874v.name(), str).apply();
    }

    /* JADX INFO: renamed from: e */
    public void m157119e(String str) {
        synchronized (this.f134927b) {
            try {
                f5r0 f5r0Var = new f5r0();
                f5r0Var.f97335a = 0;
                f5r0Var.f97336b = str;
                if (this.f134927b.contains(f5r0Var)) {
                    this.f134927b.remove(f5r0Var);
                }
                this.f134927b.add(f5r0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m157120f(String str) {
        synchronized (this.f134927b) {
            try {
                f5r0 f5r0Var = new f5r0();
                f5r0Var.f97336b = str;
                return this.f134927b.contains(f5r0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m157121g(String str) {
        synchronized (this.f134927b) {
            try {
                f5r0 f5r0Var = new f5r0();
                f5r0Var.f97336b = str;
                if (this.f134927b.contains(f5r0Var)) {
                    for (f5r0 f5r0Var2 : this.f134927b) {
                        if (f5r0Var.equals(f5r0Var2)) {
                            f5r0Var = f5r0Var2;
                            break;
                        }
                    }
                }
                f5r0Var.f97335a++;
                this.f134927b.remove(f5r0Var);
                this.f134927b.add(f5r0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m157122h(String str) {
        synchronized (this.f134927b) {
            try {
                f5r0 f5r0Var = new f5r0();
                f5r0Var.f97336b = str;
                if (this.f134927b.contains(f5r0Var)) {
                    this.f134927b.remove(f5r0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
