package p149l;

import com.google.android.gms.internal.ads.C2261u4;
import com.google.android.gms.internal.ads.zzgpl;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class unw0 {
    /* JADX INFO: renamed from: a */
    public static final fow0 m194530a(fow0 fow0Var) throws GeneralSecurityException {
        return fow0Var != null ? fow0Var : wow0.m204875a(m194531b(null).m12744h());
    }

    /* JADX INFO: renamed from: b */
    public static final C2261u4 m194531b(fow0 fow0Var) {
        try {
            return ((xxw0) dxw0.m114030d().m114035f(null, xxw0.class)).m211571c();
        } catch (GeneralSecurityException e) {
            throw new zzgpl("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
