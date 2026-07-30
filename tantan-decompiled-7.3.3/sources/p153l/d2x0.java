package p153l;

import com.google.android.gms.internal.ads.C2141c5;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class d2x0 {

    /* JADX INFO: renamed from: a */
    public static final yww0 f84835a = o5x0.m166180c("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", jww0.class, zzgus.SYMMETRIC, C2141c5.m12687Q());

    /* JADX INFO: renamed from: b */
    public static final v5x0 f84836b = new v5x0() { // from class: l.b2x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            return q2x0.m175099a((v2x0) lxw0Var);
        }
    };

    /* JADX INFO: renamed from: c */
    public static final v6x0 f84837c = v6x0.m200155b(new t6x0() { // from class: l.c2x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) throws GeneralSecurityException {
            q2x0 q2x0Var = (q2x0) xww0Var;
            yww0 yww0Var = d2x0.f84835a;
            try {
                return new a2x0(C2284u4.m13400O(cyw0.m113253b(q2x0Var.m175100b().m199157b()), jhx0.m144944a()), jxw0.m147444a(q2x0Var.m175100b().m199158c()).zzb());
            } catch (zzhag e) {
                throw new GeneralSecurityException("Parsing of DEK key template failed: ", e);
            }
        }
    }, q2x0.class, jww0.class);

    /* JADX INFO: renamed from: a */
    public static void m113779a(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = a3x0.f68334a;
        a3x0.m95875e(j6x0.m143725d());
        w5x0.m204996b().m204998c(f84836b, v2x0.class);
        g6x0.m129300a().m129304e(f84837c);
        zxw0.m222092e(f84835a, true);
    }
}
