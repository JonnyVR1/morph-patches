package p153l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v9x0 implements txw0 {

    /* JADX INFO: renamed from: a */
    public static final v9x0 f183055a = new v9x0();

    /* JADX INFO: renamed from: b */
    public static final v6x0 f183056b = v6x0.m200155b(new t6x0() { // from class: l.s9x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return kax0.m148997a((q5x0) xww0Var);
        }
    }, q5x0.class, kxw0.class);

    /* JADX INFO: renamed from: b */
    public static void m200495b() throws GeneralSecurityException {
        zxw0.m222093f(f183055a);
        g6x0.m129300a().m129304e(f183056b);
    }

    @Override // p153l.txw0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo147630a(sxw0 sxw0Var) throws GeneralSecurityException {
        Iterator it = sxw0Var.m188524d().iterator();
        while (it.hasNext()) {
            for (oxw0 oxw0Var : (List) it.next()) {
                if (oxw0Var.m169739b() instanceof m9x0) {
                    m9x0 m9x0Var = (m9x0) oxw0Var.m169739b();
                    wfx0 wfx0VarM206170b = wfx0.m206170b(oxw0Var.m169744g());
                    if (!wfx0VarM206170b.equals(m9x0Var.mo157601b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(m9x0Var.mo157600a()) + " has wrong output prefix (" + m9x0Var.mo157601b().toString() + ") instead of (" + wfx0VarM206170b.toString() + ")");
                    }
                }
            }
        }
        return new u9x0(sxw0Var, null);
    }

    @Override // p153l.txw0
    public final Class zza() {
        return kxw0.class;
    }

    @Override // p153l.txw0
    public final Class zzb() {
        return kxw0.class;
    }
}
