package p153l;

import com.google.android.gms.internal.ads.C2123a5;
import com.google.android.gms.internal.ads.C2132b5;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class k2x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f123665a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f123666b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f123667c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f123668d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f123669e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f123665a = wfx0VarM194894a;
        f123666b = r6x0.m180056b(new p6x0() { // from class: l.g2x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                wfx0 wfx0Var = k2x0.f123665a;
                edx0 edx0VarM13397L = C2284u4.m13397L();
                edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                vdx0 vdx0VarM12593L = C2132b5.m12593L();
                vdx0VarM12593L.m201021q(((f2x0) lxw0Var).m123686c());
                edx0VarM13397L.m120527s(((C2132b5) vdx0VarM12593L.m185950m()).mo12796c());
                edx0VarM13397L.m120525q(zzgvz.RAW);
                return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
            }
        }, f2x0.class, d7x0.class);
        f123667c = n6x0.m161810b(new l6x0() { // from class: l.h2x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) throws GeneralSecurityException {
                wfx0 wfx0Var = k2x0.f123665a;
                d7x0 d7x0Var = (d7x0) l7x0Var;
                if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    wg3.m206174a("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
                    return null;
                }
                try {
                    C2132b5 c2132b5M12596O = C2132b5.m12596O(((d7x0) l7x0Var).m114763c().m13405Q(), jhx0.m144944a());
                    if (d7x0Var.m114763c().m13404P() == zzgvz.RAW) {
                        return f2x0.m123685b(c2132b5M12596O.m12598P());
                    }
                    throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + String.valueOf(d7x0Var.m114763c().m13404P()) + " with format " + String.valueOf(c2132b5M12596O));
                } catch (zzhag e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            }
        }, wfx0VarM194894a, d7x0.class);
        f123668d = n5x0.m161734b(new l5x0() { // from class: l.i2x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                wfx0 wfx0Var = k2x0.f123665a;
                tdx0 tdx0VarM12570M = C2123a5.m12570M();
                vdx0 vdx0VarM12593L = C2132b5.m12593L();
                vdx0VarM12593L.m201021q(((e2x0) xww0Var).m119200b().m123686c());
                tdx0VarM12570M.m190666q((C2132b5) vdx0VarM12593L.m185950m());
                return c7x0.m108336a("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((C2123a5) tdx0VarM12570M.m185950m()).mo12796c(), zzgus.REMOTE, zzgvz.RAW, null);
            }
        }, e2x0.class, c7x0.class);
        f123669e = j5x0.m143596b(new h5x0() { // from class: l.j2x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
                wfx0 wfx0Var = k2x0.f123665a;
                c7x0 c7x0Var = (c7x0) l7x0Var;
                if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    wg3.m206174a("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                    return null;
                }
                if (c7x0Var.m108338c() != zzgvz.RAW) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got ".concat(String.valueOf(c7x0Var.m108338c())));
                }
                try {
                    C2123a5 c2123a5M12572O = C2123a5.m12572O(((c7x0) l7x0Var).m108339d(), jhx0.m144944a());
                    if (c2123a5M12572O.m12575L() == 0) {
                        return e2x0.m119199a(f2x0.m123685b(c2123a5M12572O.m12576P().m12598P()));
                    }
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(c2123a5M12572O)));
                } catch (zzhag e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static void m147995a(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f123666b);
        j6x0Var.m143733i(f123667c);
        j6x0Var.m143732h(f123668d);
        j6x0Var.m143731g(f123669e);
    }
}
