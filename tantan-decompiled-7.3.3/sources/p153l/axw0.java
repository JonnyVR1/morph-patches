package p153l;

import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgpl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class axw0 {
    /* JADX INFO: renamed from: a */
    public static final lxw0 m100855a(lxw0 lxw0Var) throws GeneralSecurityException {
        return lxw0Var != null ? lxw0Var : cyw0.m113252a(m100856b(null).m12798h());
    }

    /* JADX INFO: renamed from: b */
    public static final C2284u4 m100856b(lxw0 lxw0Var) {
        try {
            return ((d7x0) j6x0.m143725d().m143730f(null, d7x0.class)).m114763c();
        } catch (GeneralSecurityException e) {
            throw new zzgpl("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
