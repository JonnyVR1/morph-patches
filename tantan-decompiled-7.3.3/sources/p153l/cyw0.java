package p153l;

import com.google.android.gms.internal.ads.C2284u4;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class cyw0 {
    /* JADX INFO: renamed from: a */
    public static lxw0 m113252a(byte[] bArr) throws GeneralSecurityException {
        try {
            C2284u4 c2284u4M13400O = C2284u4.m13400O(bArr, jhx0.m144944a());
            j6x0 j6x0VarM143725d = j6x0.m143725d();
            d7x0 d7x0VarM114761a = d7x0.m114761a(c2284u4M13400O);
            return !j6x0VarM143725d.m143735k(d7x0VarM114761a) ? new r5x0(d7x0VarM114761a) : j6x0VarM143725d.m143728c(d7x0VarM114761a);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m113253b(lxw0 lxw0Var) throws GeneralSecurityException {
        return ((d7x0) j6x0.m143725d().m143730f(lxw0Var, d7x0.class)).m114763c().m12798h();
    }
}
