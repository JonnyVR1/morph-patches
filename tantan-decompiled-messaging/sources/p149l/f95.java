package p149l;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.C14739g;

/* JADX INFO: loaded from: classes2.dex */
public class f95 {
    /* JADX INFO: renamed from: a */
    public static void m120074a(Context context, qu5 qu5Var, mql mqlVar, rzl rzlVar) {
        ilq0.m137053z("init in  pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        zhq0.m218833f(context).m218850i(qu5Var, mqlVar, rzlVar);
        if (C14739g.m85591k(context)) {
            ilq0.m137053z("init in process\u3000start scheduleJob");
            zhq0.m218833f(context).m218848g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m120075b(Context context, t2f t2fVar) {
        if (t2fVar != null) {
            zhq0.m218833f(context).m218851j(t2fVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m120076c(Context context, bj60 bj60Var) {
        if (bj60Var != null) {
            zhq0.m218833f(context).m218852k(bj60Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m120077d(Context context, qu5 qu5Var) {
        if (qu5Var == null) {
            return;
        }
        zhq0.m218833f(context).m218853p(qu5Var.m176523g(), qu5Var.m176524h(), qu5Var.m176519c(), qu5Var.m176521e());
    }
}
