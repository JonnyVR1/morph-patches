package p149l;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n0t0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("ScionComponent.class")
    @VisibleForTesting
    public static n0t0 f136584a;

    /* JADX INFO: renamed from: d */
    public static synchronized n0t0 m157287d(Context context) {
        try {
            n0t0 n0t0Var = f136584a;
            if (n0t0Var != null) {
                return n0t0Var;
            }
            Context applicationContext = context.getApplicationContext();
            m7s0.m153417a(applicationContext);
            aiw0 aiw0VarM212279i = vny0.m199079q().m212279i();
            aiw0VarM212279i.mo96952k(applicationContext);
            f0t0 f0t0Var = new f0t0(null);
            f0t0Var.m119052b(applicationContext);
            f0t0Var.m119053c(vny0.m199064b());
            f0t0Var.m119051a(aiw0VarM212279i);
            f0t0Var.m119054d(vny0.m199078p());
            n0t0 n0t0VarM119055e = f0t0Var.m119055e();
            f136584a = n0t0VarM119055e;
            n0t0VarM119055e.mo128975a().m181762a();
            r0t0 r0t0VarMo128977c = f136584a.mo128977c();
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132365q0)).booleanValue()) {
                vny0.m199080r();
                Map mapM12302W = C2075b.m12302W((String) d1s0.m109677c().m144697a(m7s0.f132391s0));
                Iterator it = mapM12302W.keySet().iterator();
                while (it.hasNext()) {
                    r0t0VarMo128977c.m177411c((String) it.next());
                }
                r0t0VarMo128977c.m177412d(new p0t0(r0t0VarMo128977c, mapM12302W));
            }
            return f136584a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract rzs0 mo128975a();

    /* JADX INFO: renamed from: b */
    public abstract vzs0 mo128976b();

    /* JADX INFO: renamed from: c */
    public abstract r0t0 mo128977c();
}
