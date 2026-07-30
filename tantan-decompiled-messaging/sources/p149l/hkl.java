package p149l;

import android.content.Context;
import android.net.NetworkInfo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class hkl {

    /* JADX INFO: renamed from: c */
    public static boolean f108244c;

    /* JADX INFO: renamed from: e */
    public static hkl f108246e;

    /* JADX INFO: renamed from: f */
    public static Context f108247f;

    /* JADX INFO: renamed from: g */
    public static String f108248g;

    /* JADX INFO: renamed from: h */
    public static ksl f108249h;

    /* JADX INFO: renamed from: j */
    public static boolean f108251j;

    /* JADX INFO: renamed from: k */
    public static boolean f108252k;

    /* JADX INFO: renamed from: a */
    public volatile boolean f108253a = false;

    /* JADX INFO: renamed from: b */
    public g5e f108254b;

    /* JADX INFO: renamed from: d */
    public static final Object f108245d = new Object();

    /* JADX INFO: renamed from: i */
    public static HashSet<String> f108250i = new HashSet<>();

    public hkl(Context context) {
        this.f108254b = new g5e(context, f108251j, f108252k, f108249h, f108250i);
    }

    /* JADX INFO: renamed from: c */
    public static hkl m131567c() {
        if (f108246e == null) {
            synchronized (f108245d) {
                try {
                    if (f108246e == null) {
                        f108246e = new hkl(f108247f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f108246e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m131568e() {
        return f108244c;
    }

    /* JADX INFO: renamed from: a */
    public void m131569a() {
        this.f108254b.m124488e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m131570b() {
        return this.f108253a;
    }

    /* JADX INFO: renamed from: d */
    public String m131571d(String str) {
        if (!m131572f(str)) {
            d5e.m110050a("domain:" + str + " is not support!");
            return null;
        }
        if (!this.f108253a) {
            return this.f108254b.m124489f(str);
        }
        d5e.m110050a("domain: shouldDegrade:" + this.f108253a);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m131572f(String str) {
        return f108250i.contains(str);
    }

    /* JADX INFO: renamed from: g */
    public void m131573g(NetworkInfo networkInfo) {
        d5e.m110050a("net work changed,will call httpdns:" + networkInfo.toString());
        if (this.f108253a) {
            return;
        }
        m131569a();
    }

    /* JADX INFO: renamed from: h */
    public void m131574h() {
        this.f108254b.m124490g();
    }

    /* JADX INFO: renamed from: i */
    public void m131575i(boolean z) {
        this.f108253a = z;
    }
}
