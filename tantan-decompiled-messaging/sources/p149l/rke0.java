package p149l;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.foxstatistics.DefaultEnvironment;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public class rke0 {

    /* JADX INFO: renamed from: a */
    public static long f159824a = 0;

    /* JADX INFO: renamed from: b */
    public static String f159825b = "";

    /* JADX INFO: renamed from: c */
    public static String f159826c = "";

    /* JADX INFO: renamed from: d */
    public static AtomicLong f159827d = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public static String m179729a() {
        Context contextM220383e = zvf0.m220383e();
        if (contextM220383e == null) {
            return "";
        }
        f159824a = System.currentTimeMillis();
        f159826c = m179731c(contextM220383e);
        f159825b = f159826c + f159824a + new Random().nextInt(1000);
        m179736h();
        f159827d.set(0L);
        return f159825b;
    }

    /* JADX INFO: renamed from: b */
    public static String m179730b() {
        if (!m179733e() || !m179735g()) {
            return m179729a();
        }
        f159824a = System.currentTimeMillis();
        return f159825b;
    }

    /* JADX INFO: renamed from: c */
    public static String m179731c(Context context) {
        if (!TextUtils.isEmpty(f159826c)) {
            return f159826c;
        }
        String strM128398c = gwe0.m128398c();
        f159826c = strM128398c;
        if (TextUtils.isEmpty(strM128398c)) {
            String string = UUID.randomUUID().toString();
            f159826c = string;
            gwe0.m128401f(string);
        }
        return f159826c;
    }

    /* JADX INFO: renamed from: d */
    public static void m179732d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        jke0 jke0Var = new jke0();
        for (String str2 : queryParameterNames) {
            str2.getClass();
            switch (str2) {
                case "utm_content":
                    jke0Var.f118376e = uri.getQueryParameter(str2);
                    break;
                case "pushid":
                    jke0Var.f118378g = uri.getQueryParameter(str2);
                    break;
                case "utm_campaign":
                    jke0Var.f118377f = uri.getQueryParameter(str2);
                    break;
                case "lch":
                    jke0Var.f118372a = uri.getQueryParameter(str2);
                    break;
                case "utm_term":
                    jke0Var.f118375d = uri.getQueryParameter(str2);
                    break;
                case "utm_medium":
                    jke0Var.f118374c = uri.getQueryParameter(str2);
                    break;
                case "utm_source":
                    jke0Var.f118373b = uri.getQueryParameter(str2);
                    break;
            }
        }
        m179737i(jke0Var);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m179733e() {
        return !TextUtils.isEmpty(f159825b);
    }

    /* JADX INFO: renamed from: f */
    public static long m179734f() {
        return f159827d.getAndIncrement();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m179735g() {
        return System.currentTimeMillis() - f159824a < Constants.INBOX_V2_THROTTLE_WINDOW_MS;
    }

    /* JADX INFO: renamed from: h */
    public static void m179736h() {
        DefaultEnvironment defaultEnvironmentM113873d = dwf0.m113869f().m113873d();
        defaultEnvironmentM113873d.m81327f("lch", defaultEnvironmentM113873d.m81325d("app"));
        defaultEnvironmentM113873d.m81327f("utm_source", "");
        defaultEnvironmentM113873d.m81327f("utm_medium", "");
        defaultEnvironmentM113873d.m81327f("utm_term", "");
        defaultEnvironmentM113873d.m81327f("utm_content", "");
        defaultEnvironmentM113873d.m81327f("utm_campaign", "");
        defaultEnvironmentM113873d.m81327f("pushid", "");
    }

    /* JADX INFO: renamed from: i */
    public static void m179737i(jke0 jke0Var) {
        if (jke0Var == null) {
            return;
        }
        DefaultEnvironment defaultEnvironmentM113873d = dwf0.m113869f().m113873d();
        if ((TextUtils.isEmpty(jke0Var.f118372a) || jke0Var.f118372a.equals(defaultEnvironmentM113873d.m81325d("lch"))) && ((TextUtils.isEmpty(jke0Var.f118373b) || jke0Var.f118373b.equals(defaultEnvironmentM113873d.m81325d("utm_source"))) && (TextUtils.isEmpty(jke0Var.f118378g) || jke0Var.f118378g.equals(defaultEnvironmentM113873d.m81325d("pushid"))))) {
            return;
        }
        m179729a();
        m179738j(jke0Var, defaultEnvironmentM113873d);
    }

    /* JADX INFO: renamed from: j */
    public static void m179738j(jke0 jke0Var, DefaultEnvironment defaultEnvironment) {
        defaultEnvironment.m81327f("lch", jke0Var.f118372a);
        defaultEnvironment.m81327f("pushid", jke0Var.f118378g);
        defaultEnvironment.m81327f("utm_source", jke0Var.f118373b);
        defaultEnvironment.m81327f("utm_medium", jke0Var.f118374c);
        defaultEnvironment.m81327f("utm_term", jke0Var.f118375d);
        defaultEnvironment.m81327f("utm_content", jke0Var.f118376e);
        defaultEnvironment.m81327f("utm_campaign", jke0Var.f118377f);
    }
}
