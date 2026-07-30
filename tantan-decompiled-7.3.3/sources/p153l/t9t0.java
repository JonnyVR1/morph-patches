package p153l;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class t9t0 {

    /* JADX INFO: renamed from: a */
    @GuardedBy("ScionComponent.class")
    @VisibleForTesting
    public static t9t0 f172668a;

    /* JADX INFO: renamed from: d */
    public static synchronized t9t0 m189767d(Context context) {
        try {
            t9t0 t9t0Var = f172668a;
            if (t9t0Var != null) {
                return t9t0Var;
            }
            Context applicationContext = context.getApplicationContext();
            sgs0.m185829a(applicationContext);
            grw0 grw0VarM120264i = bxy0.m106933q().m120264i();
            grw0VarM120264i.mo131901k(applicationContext);
            l9t0 l9t0Var = new l9t0(null);
            l9t0Var.m153456b(applicationContext);
            l9t0Var.m153457c(bxy0.m106918b());
            l9t0Var.m153455a(grw0VarM120264i);
            l9t0Var.m153458d(bxy0.m106932p());
            t9t0 t9t0VarM153459e = l9t0Var.m153459e();
            f172668a = t9t0VarM153459e;
            t9t0VarM153459e.mo162047a().m209752a();
            x9t0 x9t0VarMo162049c = f172668a.mo162049c();
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168436q0)).booleanValue()) {
                bxy0.m106934r();
                Map mapM12356W = C2098b.m12356W((String) jas0.m144075c().m176505a(sgs0.f168462s0));
                Iterator it = mapM12356W.keySet().iterator();
                while (it.hasNext()) {
                    x9t0VarMo162049c.m209811c((String) it.next());
                }
                x9t0VarMo162049c.m209812d(new v9t0(x9t0VarMo162049c, mapM12356W));
            }
            return f172668a;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract x8t0 mo162047a();

    /* JADX INFO: renamed from: b */
    public abstract b9t0 mo162048b();

    /* JADX INFO: renamed from: c */
    public abstract x9t0 mo162049c();
}
