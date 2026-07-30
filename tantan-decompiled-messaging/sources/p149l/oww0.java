package p149l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oww0 {

    /* JADX INFO: renamed from: a */
    public static final i1x0 f146092a = new nww0(null);

    /* JADX INFO: renamed from: a */
    public static s1x0 m166450a(mow0 mow0Var) {
        tnw0 tnw0Var;
        k1x0 k1x0Var = new k1x0();
        k1x0Var.m144237b(mow0Var.m155723b());
        Iterator it = mow0Var.m155725d().iterator();
        while (it.hasNext()) {
            for (iow0 iow0Var : (List) it.next()) {
                int iM137398h = iow0Var.m137398h() - 2;
                if (iM137398h == 1) {
                    tnw0Var = tnw0.f171289b;
                } else if (iM137398h == 2) {
                    tnw0Var = tnw0.f171290c;
                } else {
                    if (iM137398h != 3) {
                        qkq0.m175383a("Unknown key status");
                        return null;
                    }
                    tnw0Var = tnw0.f171291d;
                }
                int iM137391a = iow0Var.m137391a();
                String strM137396f = iow0Var.m137396f();
                if (strM137396f.startsWith("type.googleapis.com/google.crypto.")) {
                    strM137396f = strM137396f.substring(34);
                }
                k1x0Var.m144236a(tnw0Var, iM137391a, strM137396f, iow0Var.m137393c().name());
            }
        }
        if (mow0Var.m155722a() != null) {
            k1x0Var.m144238c(mow0Var.m155722a().m137391a());
        }
        try {
            return k1x0Var.m144239d();
        } catch (GeneralSecurityException e) {
            phg0.m168968a(e);
            return null;
        }
    }
}
