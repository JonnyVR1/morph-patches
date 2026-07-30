package p153l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v8x0 implements txw0 {

    /* JADX INFO: renamed from: a */
    public static final v8x0 f182910a = new v8x0();

    /* JADX INFO: renamed from: b */
    public static void m200362b() throws GeneralSecurityException {
        zxw0.m222093f(f182910a);
    }

    @Override // p153l.txw0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo147630a(sxw0 sxw0Var) throws GeneralSecurityException {
        if (sxw0Var.m188521a() == null) {
            phw0.m172339a("no primary in primitive set");
            return null;
        }
        Iterator it = sxw0Var.m188524d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new u8x0(sxw0Var, null);
    }

    @Override // p153l.txw0
    public final Class zza() {
        return s8x0.class;
    }

    @Override // p153l.txw0
    public final Class zzb() {
        return s8x0.class;
    }
}
