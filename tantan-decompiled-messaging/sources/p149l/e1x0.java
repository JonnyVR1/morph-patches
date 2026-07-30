package p149l;

import com.google.android.gms.internal.ads.C2253t4;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class e1x0 implements eow0 {

    /* JADX INFO: renamed from: a */
    public final eow0 f88856a;

    /* JADX INFO: renamed from: b */
    public final zzgvz f88857b;

    /* JADX INFO: renamed from: c */
    public final byte[] f88858c;

    public e1x0(eow0 eow0Var, zzgvz zzgvzVar, byte[] bArr) {
        this.f88856a = eow0Var;
        this.f88857b = zzgvzVar;
        this.f88858c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static eow0 m114447a(kww0 kww0Var) throws GeneralSecurityException {
        byte[] bArrArray;
        wxw0 wxw0VarM147666a = kww0Var.m147666a(qnw0.m175705a());
        t3x0 t3x0VarM13319L = C2253t4.m13319L();
        t3x0VarM13319L.m187129r(wxw0VarM147666a.m206046f());
        t3x0VarM13319L.m187130s(wxw0VarM147666a.m206044d());
        t3x0VarM13319L.m187128q(wxw0VarM147666a.m206042b());
        eow0 eow0Var = (eow0) tow0.m189937c((C2253t4) t3x0VarM13319L.m153521m(), eow0.class);
        zzgvz zzgvzVarM206043c = wxw0VarM147666a.m206043c();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVarM206043c.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(kww0Var.m147667b().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(kww0Var.m147667b().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                j8w0.m140474a("unknown output prefix type");
                return null;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(kww0Var.m147667b().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new e1x0(eow0Var, zzgvzVarM206043c, bArrArray);
    }
}
