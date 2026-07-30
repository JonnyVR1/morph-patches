package p153l;

import com.google.android.gms.internal.ads.C2220m4;
import com.google.android.gms.internal.ads.C2228n4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class k1x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f123554a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f123555b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f123556c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f123557d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f123558e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f123554a = wfx0VarM194894a;
        f123555b = r6x0.m180056b(new p6x0() { // from class: l.c1x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return k1x0.m147931d((b1x0) lxw0Var);
            }
        }, b1x0.class, d7x0.class);
        f123556c = n6x0.m161810b(new l6x0() { // from class: l.d1x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return k1x0.m147929b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f123557d = n5x0.m161734b(new l5x0() { // from class: l.e1x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return k1x0.m147930c((s0x0) xww0Var, ayw0Var);
            }
        }, s0x0.class, c7x0.class);
        f123558e = j5x0.m143596b(new h5x0() { // from class: l.f1x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return k1x0.m147928a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ s0x0 m147928a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            wg3.m206174a("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
            return null;
        }
        try {
            C2220m4 c2220m4M12958O = C2220m4.m12958O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2220m4M12958O.m12961L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            y0x0 y0x0Var = new y0x0(null);
            y0x0Var.m213907a(c2220m4M12958O.m12962P().zzd());
            y0x0Var.m213908b(m147933f(c7x0Var.m108338c()));
            b1x0 b1x0VarM213909c = y0x0Var.m213909c();
            q0x0 q0x0Var = new q0x0(null);
            q0x0Var.m174795c(b1x0VarM213909c);
            q0x0Var.m174794b(xfx0.m210861b(c2220m4M12958O.m12962P().zzA(), ayw0Var));
            q0x0Var.m174793a(c7x0Var.m108340e());
            return q0x0Var.m174796d();
        } catch (zzhag unused) {
            phw0.m172339a("Parsing AesGcmSivKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ b1x0 m147929b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            wg3.m206174a("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2228n4 c2228n4M13086P = C2228n4.m13086P(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            if (c2228n4M13086P.m13089M() != 0) {
                phw0.m172339a("Only version 0 parameters are accepted");
                return null;
            }
            y0x0 y0x0Var = new y0x0(null);
            y0x0Var.m213907a(c2228n4M13086P.m13088L());
            y0x0Var.m213908b(m147933f(d7x0Var.m114763c().m13404P()));
            return y0x0Var.m213909c();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m147930c(s0x0 s0x0Var, ayw0 ayw0Var) {
        fcx0 fcx0VarM12956M = C2220m4.m12956M();
        byte[] bArrM210864d = s0x0Var.m183989c().m210864d(ayw0Var);
        fcx0VarM12956M.m125074q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((C2220m4) fcx0VarM12956M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m147934g(s0x0Var.m183987a().m101512c()), s0x0Var.m183990d());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m147931d(b1x0 b1x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hcx0 hcx0VarM13084N = C2228n4.m13084N();
        hcx0VarM13084N.m134519q(b1x0Var.m101511b());
        edx0VarM13397L.m120527s(((C2228n4) hcx0VarM13084N.m185950m()).mo12796c());
        edx0VarM13397L.m120525q(m147934g(b1x0Var.m101512c()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m147932e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f123555b);
        j6x0Var.m143733i(f123556c);
        j6x0Var.m143732h(f123557d);
        j6x0Var.m143731g(f123558e);
    }

    /* JADX INFO: renamed from: f */
    public static z0x0 m147933f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return z0x0.f202435b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return z0x0.f202437d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return z0x0.f202436c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m147934g(z0x0 z0x0Var) throws GeneralSecurityException {
        if (z0x0.f202435b.equals(z0x0Var)) {
            return zzgvz.TINK;
        }
        if (z0x0.f202436c.equals(z0x0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (z0x0.f202437d.equals(z0x0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(z0x0Var)));
    }
}
