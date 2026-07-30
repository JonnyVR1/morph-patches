package p153l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u5x0 {

    /* JADX INFO: renamed from: a */
    public static final oax0 f177682a = new t5x0(null);

    /* JADX INFO: renamed from: a */
    public static yax0 m194632a(sxw0 sxw0Var) {
        zww0 zww0Var;
        qax0 qax0Var = new qax0();
        qax0Var.m176001b(sxw0Var.m188522b());
        Iterator it = sxw0Var.m188524d().iterator();
        while (it.hasNext()) {
            for (oxw0 oxw0Var : (List) it.next()) {
                int iM169745h = oxw0Var.m169745h() - 2;
                if (iM169745h == 1) {
                    zww0Var = zww0.f206390b;
                } else if (iM169745h == 2) {
                    zww0Var = zww0.f206391c;
                } else {
                    if (iM169745h != 3) {
                        wtq0.m207906a("Unknown key status");
                        return null;
                    }
                    zww0Var = zww0.f206392d;
                }
                int iM169738a = oxw0Var.m169738a();
                String strM169743f = oxw0Var.m169743f();
                if (strM169743f.startsWith("type.googleapis.com/google.crypto.")) {
                    strM169743f = strM169743f.substring(34);
                }
                qax0Var.m176000a(zww0Var, iM169738a, strM169743f, oxw0Var.m169740c().name());
            }
        }
        if (sxw0Var.m188521a() != null) {
            qax0Var.m176002c(sxw0Var.m188521a().m169738a());
        }
        try {
            return qax0Var.m176003d();
        } catch (GeneralSecurityException e) {
            xpg0.m212648a(e);
            return null;
        }
    }
}
