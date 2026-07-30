package p149l;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pzw0 implements now0 {

    /* JADX INFO: renamed from: a */
    public static final pzw0 f151979a = new pzw0();

    /* JADX INFO: renamed from: b */
    public static void m172257b() throws GeneralSecurityException {
        tow0.m189940f(f151979a);
    }

    @Override // p149l.now0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo112933a(mow0 mow0Var) throws GeneralSecurityException {
        if (mow0Var.m155722a() == null) {
            j8w0.m140474a("no primary in primitive set");
            return null;
        }
        Iterator it = mow0Var.m155725d().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new ozw0(mow0Var, null);
    }

    @Override // p149l.now0
    public final Class zza() {
        return mzw0.class;
    }

    @Override // p149l.now0
    public final Class zzb() {
        return mzw0.class;
    }
}
