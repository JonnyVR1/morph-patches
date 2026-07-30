package p153l;

import android.content.Context;
import android.os.Process;
import com.xiaomi.push.C14887g;

/* JADX INFO: loaded from: classes2.dex */
public class ga5 {
    /* JADX INFO: renamed from: a */
    public static void m129687a(Context context, uv5 uv5Var, ysl yslVar, l2m l2mVar) {
        ouq0.m169406z("init in  pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        erq0.m122263f(context).m122280i(uv5Var, yslVar, l2mVar);
        if (C14887g.m86762k(context)) {
            ouq0.m169406z("init in process\u3000start scheduleJob");
            erq0.m122263f(context).m122278g();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m129688b(Context context, y3f y3fVar) {
        if (y3fVar != null) {
            erq0.m122263f(context).m122281j(y3fVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m129689c(Context context, gr60 gr60Var) {
        if (gr60Var != null) {
            erq0.m122263f(context).m122282k(gr60Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m129690d(Context context, uv5 uv5Var) {
        if (uv5Var == null) {
            return;
        }
        erq0.m122263f(context).m122283p(uv5Var.m198246g(), uv5Var.m198247h(), uv5Var.m198242c(), uv5Var.m198244e());
    }
}
