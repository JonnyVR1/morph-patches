package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class eoq0 {

    /* JADX INFO: renamed from: a */
    private static wnq0 f92489a;

    /* JADX INFO: renamed from: b */
    private static xnq0 f92490b;

    /* JADX INFO: renamed from: a */
    public static void m117500a(Context context) {
        m117502c("onSendMsg");
        if (m117506g(context)) {
            hoq0.m132233g(context, System.currentTimeMillis(), m117503d(context));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m117501b(Context context, osq0 osq0Var) {
        if (m117506g(context)) {
            if (f92489a == null) {
                f92489a = new wnq0(context);
            }
            if (f92490b == null) {
                f92490b = new xnq0(context);
            }
            wnq0 wnq0Var = f92489a;
            osq0Var.m165893n(wnq0Var, wnq0Var);
            xnq0 xnq0Var = f92490b;
            osq0Var.m165905z(xnq0Var, xnq0Var);
            m117502c("startStats");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m117502c(String str) {
        vnq0.m199050b("Push-PowerStats", str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m117503d(Context context) {
        return ouq0.m166108q(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m117504e(Context context) {
        m117502c("onReceiveMsg");
        if (m117506g(context)) {
            hoq0.m132237k(context, System.currentTimeMillis(), m117503d(context));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m117505f(Context context, osq0 osq0Var) {
        wnq0 wnq0Var = f92489a;
        if (wnq0Var != null) {
            osq0Var.m165892m(wnq0Var);
            f92489a = null;
        }
        xnq0 xnq0Var = f92490b;
        if (xnq0Var != null) {
            osq0Var.m165904y(xnq0Var);
            f92490b = null;
        }
        m117502c("stopStats");
    }

    /* JADX INFO: renamed from: g */
    private static boolean m117506g(Context context) {
        return vnq0.m199051c(context);
    }

    /* JADX INFO: renamed from: h */
    public static void m117507h(Context context) {
        m117502c("onPing");
        if (m117506g(context)) {
            hoq0.m132238l(context, System.currentTimeMillis(), m117503d(context));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m117508i(Context context) {
        m117502c("onPong");
        if (m117506g(context)) {
            hoq0.m132239m(context, System.currentTimeMillis(), m117503d(context));
        }
    }
}
