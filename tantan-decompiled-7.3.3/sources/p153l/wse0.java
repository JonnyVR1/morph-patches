package p153l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes11.dex */
public class wse0 {

    /* JADX INFO: renamed from: a */
    public static long f190621a = 0;

    /* JADX INFO: renamed from: b */
    public static String f190622b = "";

    /* JADX INFO: renamed from: c */
    public static String f190623c = "";

    /* JADX INFO: renamed from: d */
    public static AtomicLong f190624d = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public static String m207753a() {
        Context contextM138507e = i4g0.m138507e();
        if (contextM138507e == null) {
            return "";
        }
        f190621a = System.currentTimeMillis();
        f190623c = m207755c(contextM138507e);
        f190622b = f190623c + f190621a + new Random().nextInt(1000);
        m207760h();
        f190624d.set(0L);
        return f190622b;
    }

    /* JADX INFO: renamed from: b */
    public static String m207754b() {
        if (!m207757e() || !m207759g()) {
            return m207753a();
        }
        f190621a = System.currentTimeMillis();
        return f190622b;
    }

    /* JADX INFO: renamed from: c */
    public static String m207755c(Context context) {
        if (!TextUtils.isEmpty(f190623c)) {
            return f190623c;
        }
        String strM161560c = n4f0.m161560c();
        f190623c = strM161560c;
        if (TextUtils.isEmpty(strM161560c)) {
            String string = UUID.randomUUID().toString();
            f190623c = string;
            n4f0.m161563f(string);
        }
        return f190623c;
    }

    /* JADX INFO: renamed from: d */
    public static void m207756d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        ose0 ose0Var = new ose0();
        for (String str2 : queryParameterNames) {
            str2.getClass();
            switch (str2) {
                case "utm_content":
                    ose0Var.f148822e = uri.getQueryParameter(str2);
                    break;
                case "pushid":
                    ose0Var.f148824g = uri.getQueryParameter(str2);
                    break;
                case "utm_campaign":
                    ose0Var.f148823f = uri.getQueryParameter(str2);
                    break;
                case "lch":
                    ose0Var.f148818a = uri.getQueryParameter(str2);
                    break;
                case "utm_term":
                    ose0Var.f148821d = uri.getQueryParameter(str2);
                    break;
                case "utm_medium":
                    ose0Var.f148820c = uri.getQueryParameter(str2);
                    break;
                case "utm_source":
                    ose0Var.f148819b = uri.getQueryParameter(str2);
                    break;
            }
        }
        m207761i(ose0Var);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m207757e() {
        return !TextUtils.isEmpty(f190622b);
    }

    /* JADX INFO: renamed from: f */
    public static long m207758f() {
        return f190624d.getAndIncrement();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m207759g() {
        return System.currentTimeMillis() - f190621a < Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    /* JADX INFO: renamed from: h */
    public static void m207760h() {
        DefaultEnvironment defaultEnvironmentM157018d = m4g0.m157014f().m157018d();
        defaultEnvironmentM157018d.m82510f("lch", defaultEnvironmentM157018d.m82508d("app"));
        defaultEnvironmentM157018d.m82510f("utm_source", "");
        defaultEnvironmentM157018d.m82510f("utm_medium", "");
        defaultEnvironmentM157018d.m82510f("utm_term", "");
        defaultEnvironmentM157018d.m82510f("utm_content", "");
        defaultEnvironmentM157018d.m82510f("utm_campaign", "");
        defaultEnvironmentM157018d.m82510f("pushid", "");
    }

    /* JADX INFO: renamed from: i */
    public static void m207761i(ose0 ose0Var) {
        if (ose0Var == null) {
            return;
        }
        DefaultEnvironment defaultEnvironmentM157018d = m4g0.m157014f().m157018d();
        if ((TextUtils.isEmpty(ose0Var.f148818a) || ose0Var.f148818a.equals(defaultEnvironmentM157018d.m82508d("lch"))) && ((TextUtils.isEmpty(ose0Var.f148819b) || ose0Var.f148819b.equals(defaultEnvironmentM157018d.m82508d("utm_source"))) && (TextUtils.isEmpty(ose0Var.f148824g) || ose0Var.f148824g.equals(defaultEnvironmentM157018d.m82508d("pushid"))))) {
            return;
        }
        m207753a();
        m207762j(ose0Var, defaultEnvironmentM157018d);
    }

    /* JADX INFO: renamed from: j */
    public static void m207762j(ose0 ose0Var, DefaultEnvironment defaultEnvironment) {
        defaultEnvironment.m82510f("lch", ose0Var.f148818a);
        defaultEnvironment.m82510f("pushid", ose0Var.f148824g);
        defaultEnvironment.m82510f("utm_source", ose0Var.f148819b);
        defaultEnvironment.m82510f("utm_medium", ose0Var.f148820c);
        defaultEnvironment.m82510f("utm_term", ose0Var.f148821d);
        defaultEnvironment.m82510f("utm_content", ose0Var.f148822e);
        defaultEnvironment.m82510f("utm_campaign", ose0Var.f148823f);
    }
}
