package p153l;

import com.google.android.gms.internal.ads.C2276t4;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class kax0 implements kxw0 {

    /* JADX INFO: renamed from: a */
    public final kxw0 f124728a;

    /* JADX INFO: renamed from: b */
    public final zzgvz f124729b;

    /* JADX INFO: renamed from: c */
    public final byte[] f124730c;

    public kax0(kxw0 kxw0Var, zzgvz zzgvzVar, byte[] bArr) {
        this.f124728a = kxw0Var;
        this.f124729b = zzgvzVar;
        this.f124730c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static kxw0 m148997a(q5x0 q5x0Var) throws GeneralSecurityException {
        byte[] bArrArray;
        c7x0 c7x0VarM175535a = q5x0Var.m175535a(www0.m208321a());
        zcx0 zcx0VarM13373L = C2276t4.m13373L();
        zcx0VarM13373L.m219268r(c7x0VarM175535a.m108341f());
        zcx0VarM13373L.m219269s(c7x0VarM175535a.m108339d());
        zcx0VarM13373L.m219267q(c7x0VarM175535a.m108337b());
        kxw0 kxw0Var = (kxw0) zxw0.m222090c((C2276t4) zcx0VarM13373L.m185950m(), kxw0.class);
        zzgvz zzgvzVarM108338c = c7x0VarM175535a.m108338c();
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVarM108338c.ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(q5x0Var.m175536b().intValue()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(q5x0Var.m175536b().intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                phw0.m172339a("unknown output prefix type");
                return null;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(q5x0Var.m175536b().intValue()).array();
        } else {
            bArrArray = new byte[0];
        }
        return new kax0(kxw0Var, zzgvzVarM108338c, bArrArray);
    }
}
