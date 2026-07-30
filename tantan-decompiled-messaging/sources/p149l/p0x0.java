package p149l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class p0x0 implements now0 {

    /* JADX INFO: renamed from: a */
    public static final p0x0 f146628a = new p0x0();

    /* JADX INFO: renamed from: b */
    public static final pxw0 f146629b = pxw0.m171958b(new nxw0() { // from class: l.m0x0
        @Override // p149l.nxw0
        /* JADX INFO: renamed from: a */
        public final Object mo98574a(rnw0 rnw0Var) {
            return e1x0.m114447a((kww0) rnw0Var);
        }
    }, kww0.class, eow0.class);

    /* JADX INFO: renamed from: b */
    public static void m166994b() throws GeneralSecurityException {
        tow0.m189940f(f146628a);
        axw0.m99526a().m99530e(f146629b);
    }

    @Override // p149l.now0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112933a(mow0 mow0Var) throws GeneralSecurityException {
        Iterator it = mow0Var.m155725d().iterator();
        while (it.hasNext()) {
            for (iow0 iow0Var : (List) it.next()) {
                if (iow0Var.m137392b() instanceof g0x0) {
                    g0x0 g0x0Var = (g0x0) iow0Var.m137392b();
                    q6x0 q6x0VarM173179b = q6x0.m173179b(iow0Var.m137397g());
                    if (!q6x0VarM173179b.equals(g0x0Var.mo124027b())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + String.valueOf(g0x0Var.mo124026a()) + " has wrong output prefix (" + g0x0Var.mo124027b().toString() + ") instead of (" + q6x0VarM173179b.toString() + ")");
                    }
                }
            }
        }
        return new o0x0(mow0Var, null);
    }

    @Override // p149l.now0
    public final Class zza() {
        return eow0.class;
    }

    @Override // p149l.now0
    public final Class zzb() {
        return eow0.class;
    }
}
