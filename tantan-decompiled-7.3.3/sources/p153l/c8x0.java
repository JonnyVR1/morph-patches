package p153l;

import com.google.android.gms.internal.ads.C2323z3;
import com.google.android.gms.internal.ads.zzgus;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class c8x0 {

    /* JADX INFO: renamed from: a */
    public static final v5x0 f80252a = new v5x0() { // from class: l.z7x0
        @Override // p153l.v5x0
        /* JADX INFO: renamed from: a */
        public final xww0 mo102265a(lxw0 lxw0Var, Integer num) {
            return c8x0.m108387b((h8x0) lxw0Var, null);
        }
    };

    /* JADX INFO: renamed from: b */
    public static final v6x0 f80253b = v6x0.m200155b(new t6x0() { // from class: l.a8x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return c8x0.m108388c((y7x0) xww0Var);
        }
    }, y7x0.class, s8x0.class);

    /* JADX INFO: renamed from: c */
    public static final v6x0 f80254c = v6x0.m200155b(new t6x0() { // from class: l.b8x0
        @Override // p153l.t6x0
        /* JADX INFO: renamed from: a */
        public final Object mo96499a(xww0 xww0Var) {
            return c8x0.m108386a((y7x0) xww0Var);
        }
    }, y7x0.class, kxw0.class);

    /* JADX INFO: renamed from: d */
    public static final yww0 f80255d = o5x0.m166180c("type.googleapis.com/google.crypto.tink.AesCmacKey", kxw0.class, zzgus.SYMMETRIC, C2323z3.m13572R());

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ kxw0 m108386a(y7x0 y7x0Var) throws GeneralSecurityException {
        m108390e(y7x0Var.m214704c());
        return tfx0.m191002a(y7x0Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ y7x0 m108387b(h8x0 h8x0Var, Integer num) throws GeneralSecurityException {
        m108390e(h8x0Var);
        w7x0 w7x0Var = new w7x0(null);
        w7x0Var.m205394c(h8x0Var);
        w7x0Var.m205392a(xfx0.m210862c(h8x0Var.m133993c()));
        w7x0Var.m205393b(null);
        return w7x0Var.m205395d();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ s8x0 m108388c(y7x0 y7x0Var) throws GeneralSecurityException {
        m108390e(y7x0Var.m214704c());
        return new dax0(y7x0Var);
    }

    /* JADX INFO: renamed from: d */
    public static void m108389d(boolean z) throws GeneralSecurityException {
        wfx0 wfx0Var = r8x0.f161773a;
        r8x0.m180285e(j6x0.m143725d());
        w5x0.m204996b().m204998c(f80252a, h8x0.class);
        g6x0.m129300a().m129304e(f80253b);
        g6x0.m129300a().m129304e(f80254c);
        f6x0 f6x0VarM124326b = f6x0.m124326b();
        HashMap map = new HashMap();
        h8x0 h8x0Var = bax0.f75746e;
        map.put("AES_CMAC", h8x0Var);
        map.put("AES256_CMAC", h8x0Var);
        e8x0 e8x0Var = new e8x0(null);
        e8x0Var.m119840a(32);
        e8x0Var.m119841b(16);
        e8x0Var.m119842c(f8x0.f97787e);
        map.put("AES256_CMAC_RAW", e8x0Var.m119843d());
        f6x0VarM124326b.m124329d(Collections.unmodifiableMap(map));
        zxw0.m222092e(f80255d, true);
    }

    /* JADX INFO: renamed from: e */
    public static void m108390e(h8x0 h8x0Var) throws GeneralSecurityException {
        if (h8x0Var.m133993c() == 32) {
            return;
        }
        phw0.m172339a("AesCmacKey size wrong, must be 32 bytes");
    }
}
