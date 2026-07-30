package p153l;

import com.google.android.gms.internal.ads.C2141c5;
import com.google.android.gms.internal.ads.C2149d5;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class a3x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f68334a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f68335b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f68336c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f68337d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f68338e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f68334a = wfx0VarM194894a;
        f68335b = r6x0.m180056b(new p6x0() { // from class: l.w2x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return a3x0.m95874d((v2x0) lxw0Var);
            }
        }, v2x0.class, d7x0.class);
        f68336c = n6x0.m161810b(new l6x0() { // from class: l.x2x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return a3x0.m95872b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f68337d = n5x0.m161734b(new l5x0() { // from class: l.y2x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return a3x0.m95873c((q2x0) xww0Var, ayw0Var);
            }
        }, q2x0.class, c7x0.class);
        f68338e = j5x0.m143596b(new h5x0() { // from class: l.z2x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return a3x0.m95871a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ q2x0 m95871a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            wg3.m206174a("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            C2141c5 c2141c5M12686O = C2141c5.m12686O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c7x0Var.m108338c() != zzgvz.RAW) {
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got ".concat(String.valueOf(c2141c5M12686O)));
            }
            if (c2141c5M12686O.m12689L() == 0) {
                return q2x0.m175099a(m95876f(c2141c5M12686O.m12690P()));
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(c2141c5M12686O)));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ v2x0 m95872b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            wg3.m206174a("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            return m95876f(C2149d5.m12712P(d7x0Var.m114763c().m13405Q(), jhx0.m144944a()));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m95873c(q2x0 q2x0Var, ayw0 ayw0Var) {
        xdx0 xdx0VarM12684M = C2141c5.m12684M();
        xdx0VarM12684M.m210493q(m95877g(q2x0Var.m175100b()));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((C2141c5) xdx0VarM12684M.m185950m()).mo12796c(), zzgus.REMOTE, zzgvz.RAW, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m95874d(v2x0 v2x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        edx0VarM13397L.m120527s(m95877g(v2x0Var).mo12796c());
        edx0VarM13397L.m120525q(zzgvz.RAW);
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m95875e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f68335b);
        j6x0Var.m143733i(f68336c);
        j6x0Var.m143732h(f68337d);
        j6x0Var.m143731g(f68338e);
    }

    /* JADX INFO: renamed from: f */
    public static v2x0 m95876f(C2149d5 c2149d5) throws GeneralSecurityException {
        t2x0 t2x0Var;
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r(c2149d5.m12715L().m13406R());
        edx0VarM13397L.m120527s(c2149d5.m12715L().m13405Q());
        edx0VarM13397L.m120525q(zzgvz.RAW);
        lxw0 lxw0VarM113252a = cyw0.m113252a(((C2284u4) edx0VarM13397L.m185950m()).m12798h());
        if (lxw0VarM113252a instanceof o0x0) {
            t2x0Var = t2x0.f171829b;
        } else if (lxw0VarM113252a instanceof r1x0) {
            t2x0Var = t2x0.f171831d;
        } else if (lxw0VarM113252a instanceof o3x0) {
            t2x0Var = t2x0.f171830c;
        } else if (lxw0VarM113252a instanceof xyw0) {
            t2x0Var = t2x0.f171832e;
        } else if (lxw0VarM113252a instanceof rzw0) {
            t2x0Var = t2x0.f171833f;
        } else {
            if (!(lxw0VarM113252a instanceof b1x0)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(lxw0VarM113252a.toString()));
            }
            t2x0Var = t2x0.f171834g;
        }
        s2x0 s2x0Var = new s2x0(null);
        s2x0Var.m184155c(c2149d5.m12716Q());
        s2x0Var.m184153a((gyw0) lxw0VarM113252a);
        s2x0Var.m184154b(t2x0Var);
        return s2x0Var.m184156d();
    }

    /* JADX INFO: renamed from: g */
    public static C2149d5 m95877g(v2x0 v2x0Var) throws GeneralSecurityException {
        try {
            C2284u4 c2284u4M13400O = C2284u4.m13400O(cyw0.m113253b(v2x0Var.m199157b()), jhx0.m144944a());
            zdx0 zdx0VarM12709M = C2149d5.m12709M();
            zdx0VarM12709M.m219388r(v2x0Var.m199158c());
            zdx0VarM12709M.m219387q(c2284u4M13400O);
            return (C2149d5) zdx0VarM12709M.m185950m();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
