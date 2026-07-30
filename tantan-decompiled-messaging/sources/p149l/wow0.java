package p149l;

import com.google.android.gms.internal.ads.C2261u4;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class wow0 {
    /* JADX INFO: renamed from: a */
    public static fow0 m204875a(byte[] bArr) throws GeneralSecurityException {
        try {
            C2261u4 c2261u4M13346O = C2261u4.m13346O(bArr, d8x0.m110397a());
            dxw0 dxw0VarM114030d = dxw0.m114030d();
            xxw0 xxw0VarM211569a = xxw0.m211569a(c2261u4M13346O);
            return !dxw0VarM114030d.m114040k(xxw0VarM211569a) ? new lww0(xxw0VarM211569a) : dxw0VarM114030d.m114033c(xxw0VarM211569a);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m204876b(fow0 fow0Var) throws GeneralSecurityException {
        return ((xxw0) dxw0.m114030d().m114035f(fow0Var, xxw0.class)).m211571c().m12744h();
    }
}
