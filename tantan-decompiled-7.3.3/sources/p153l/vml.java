package p153l;

import android.content.Context;
import android.net.NetworkInfo;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class vml {

    /* JADX INFO: renamed from: c */
    public static boolean f184729c;

    /* JADX INFO: renamed from: e */
    public static vml f184731e;

    /* JADX INFO: renamed from: f */
    public static Context f184732f;

    /* JADX INFO: renamed from: g */
    public static String f184733g;

    /* JADX INFO: renamed from: h */
    public static xul f184734h;

    /* JADX INFO: renamed from: j */
    public static boolean f184736j;

    /* JADX INFO: renamed from: k */
    public static boolean f184737k;

    /* JADX INFO: renamed from: a */
    public volatile boolean f184738a = false;

    /* JADX INFO: renamed from: b */
    public u6e f184739b;

    /* JADX INFO: renamed from: d */
    public static final Object f184730d = new Object();

    /* JADX INFO: renamed from: i */
    public static HashSet<String> f184735i = new HashSet<>();

    public vml(Context context) {
        this.f184739b = new u6e(context, f184736j, f184737k, f184734h, f184735i);
    }

    /* JADX INFO: renamed from: c */
    public static vml m201753c() {
        if (f184731e == null) {
            synchronized (f184730d) {
                try {
                    if (f184731e == null) {
                        f184731e = new vml(f184732f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f184731e;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m201754e() {
        return f184729c;
    }

    /* JADX INFO: renamed from: a */
    public void m201755a() {
        this.f184739b.m194676e();
    }

    /* JADX INFO: renamed from: b */
    public boolean m201756b() {
        return this.f184738a;
    }

    /* JADX INFO: renamed from: d */
    public String m201757d(String str) {
        if (!m201758f(str)) {
            r6e.m180005a("domain:" + str + " is not support!");
            return null;
        }
        if (!this.f184738a) {
            return this.f184739b.m194677f(str);
        }
        r6e.m180005a("domain: shouldDegrade:" + this.f184738a);
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m201758f(String str) {
        return f184735i.contains(str);
    }

    /* JADX INFO: renamed from: g */
    public void m201759g(NetworkInfo networkInfo) {
        r6e.m180005a("net work changed,will call httpdns:" + networkInfo.toString());
        if (this.f184738a) {
            return;
        }
        m201755a();
    }

    /* JADX INFO: renamed from: h */
    public void m201760h() {
        this.f184739b.m194678g();
    }

    /* JADX INFO: renamed from: i */
    public void m201761i(boolean z) {
        this.f184738a = z;
    }
}
