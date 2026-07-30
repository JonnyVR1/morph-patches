package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class kxq0 {

    /* JADX INFO: renamed from: a */
    private static cxq0 f129224a;

    /* JADX INFO: renamed from: b */
    private static dxq0 f129225b;

    /* JADX INFO: renamed from: a */
    public static void m151848a(Context context) {
        m151850c("onSendMsg");
        if (m151854g(context)) {
            nxq0.m165254g(context, System.currentTimeMillis(), m151851d(context));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m151849b(Context context, u1r0 u1r0Var) {
        if (m151854g(context)) {
            if (f129224a == null) {
                f129224a = new cxq0(context);
            }
            if (f129225b == null) {
                f129225b = new dxq0(context);
            }
            cxq0 cxq0Var = f129224a;
            u1r0Var.m194103n(cxq0Var, cxq0Var);
            dxq0 dxq0Var = f129225b;
            u1r0Var.m194110z(dxq0Var, dxq0Var);
            m151850c("startStats");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m151850c(String str) {
        bxq0.m106901b("Push-PowerStats", str);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m151851d(Context context) {
        return u3r0.m194409q(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m151852e(Context context) {
        m151850c("onReceiveMsg");
        if (m151854g(context)) {
            nxq0.m165258k(context, System.currentTimeMillis(), m151851d(context));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m151853f(Context context, u1r0 u1r0Var) {
        cxq0 cxq0Var = f129224a;
        if (cxq0Var != null) {
            u1r0Var.m194102m(cxq0Var);
            f129224a = null;
        }
        dxq0 dxq0Var = f129225b;
        if (dxq0Var != null) {
            u1r0Var.m194109y(dxq0Var);
            f129225b = null;
        }
        m151850c("stopStats");
    }

    /* JADX INFO: renamed from: g */
    private static boolean m151854g(Context context) {
        return bxq0.m106902c(context);
    }

    /* JADX INFO: renamed from: h */
    public static void m151855h(Context context) {
        m151850c("onPing");
        if (m151854g(context)) {
            nxq0.m165259l(context, System.currentTimeMillis(), m151851d(context));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m151856i(Context context) {
        m151850c("onPong");
        if (m151854g(context)) {
            nxq0.m165260m(context, System.currentTimeMillis(), m151851d(context));
        }
    }
}
