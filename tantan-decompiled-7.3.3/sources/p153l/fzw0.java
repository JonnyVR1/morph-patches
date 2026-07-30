package p153l;

import com.google.android.gms.internal.ads.C2140c4;
import com.google.android.gms.internal.ads.C2148d4;
import com.google.android.gms.internal.ads.C2156e4;
import com.google.android.gms.internal.ads.C2164f4;
import com.google.android.gms.internal.ads.C2172g4;
import com.google.android.gms.internal.ads.C2252q4;
import com.google.android.gms.internal.ads.C2260r4;
import com.google.android.gms.internal.ads.C2268s4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class fzw0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f101555a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f101556b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f101557c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f101558d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f101559e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f101555a = wfx0VarM194894a;
        f101556b = r6x0.m180056b(new p6x0() { // from class: l.bzw0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return fzw0.m128345d((xyw0) lxw0Var);
            }
        }, xyw0.class, d7x0.class);
        f101557c = n6x0.m161810b(new l6x0() { // from class: l.czw0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return fzw0.m128343b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f101558d = n5x0.m161734b(new l5x0() { // from class: l.dzw0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return fzw0.m128344c((nyw0) xww0Var, ayw0Var);
            }
        }, nyw0.class, c7x0.class);
        f101559e = j5x0.m143596b(new h5x0() { // from class: l.ezw0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return fzw0.m128342a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ nyw0 m128342a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            wg3.m206174a("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            C2140c4 c2140c4M12677O = C2140c4.m12677O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2140c4M12677O.m12681L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (c2140c4M12677O.m12682P().m12730L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (c2140c4M12677O.m12683Q().m13260L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            tyw0 tyw0Var = new tyw0(null);
            tyw0Var.m193624a(c2140c4M12677O.m12682P().m12732Q().zzd());
            tyw0Var.m193626c(c2140c4M12677O.m12683Q().m13262R().zzd());
            tyw0Var.m193627d(c2140c4M12677O.m12682P().m12731P().m12773L());
            tyw0Var.m193628e(c2140c4M12677O.m12683Q().m13261Q().m13313L());
            tyw0Var.m193625b(m128347f(c2140c4M12677O.m12683Q().m13261Q().m13314M()));
            tyw0Var.m193629f(m128348g(c7x0Var.m108338c()));
            xyw0 xyw0VarM193630g = tyw0Var.m193630g();
            lyw0 lyw0Var = new lyw0(null);
            lyw0Var.m156396d(xyw0VarM193630g);
            lyw0Var.m156393a(xfx0.m210861b(c2140c4M12677O.m12682P().m12732Q().zzA(), ayw0Var));
            lyw0Var.m156394b(xfx0.m210861b(c2140c4M12677O.m12683Q().m13262R().zzA(), ayw0Var));
            lyw0Var.m156395c(c7x0Var.m108340e());
            return lyw0Var.m156397e();
        } catch (zzhag unused) {
            phw0.m172339a("Parsing AesCtrHmacAeadKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ xyw0 m128343b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            wg3.m206174a("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2148d4 c2148d4M12704N = C2148d4.m12704N(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            if (c2148d4M12704N.m12708P().m13285M() != 0) {
                phw0.m172339a("Only version 0 keys are accepted");
                return null;
            }
            tyw0 tyw0Var = new tyw0(null);
            tyw0Var.m193624a(c2148d4M12704N.m12707O().m12753L());
            tyw0Var.m193626c(c2148d4M12704N.m12708P().m13284L());
            tyw0Var.m193627d(c2148d4M12704N.m12707O().m12754P().m12773L());
            tyw0Var.m193628e(c2148d4M12704N.m12708P().m13286R().m13313L());
            tyw0Var.m193625b(m128347f(c2148d4M12704N.m12708P().m13286R().m13314M()));
            tyw0Var.m193629f(m128348g(d7x0Var.m114763c().m13404P()));
            return tyw0Var.m193630g();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m128344c(nyw0 nyw0Var, ayw0 ayw0Var) {
        hbx0 hbx0VarM12675M = C2140c4.m12675M();
        lbx0 lbx0VarM12725M = C2156e4.m12725M();
        tbx0 tbx0VarM12769M = C2172g4.m12769M();
        tbx0VarM12769M.m190096q(nyw0Var.m165356a().m213654d());
        lbx0VarM12725M.m153597r((C2172g4) tbx0VarM12769M.m185950m());
        byte[] bArrM210864d = nyw0Var.m165358c().m210864d(ayw0Var);
        lbx0VarM12725M.m153596q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        hbx0VarM12675M.m134437q((C2156e4) lbx0VarM12725M.m185950m());
        tcx0 tcx0VarM13253M = C2252q4.m13253M();
        tcx0VarM13253M.m190521r(m128349h(nyw0Var.m165356a()));
        byte[] bArrM210864d2 = nyw0Var.m165359d().m210864d(ayw0Var);
        tcx0VarM13253M.m190520q(zzgyl.zzv(bArrM210864d2, 0, bArrM210864d2.length));
        hbx0VarM12675M.m134438r((C2252q4) tcx0VarM13253M.m185950m());
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((C2140c4) hbx0VarM12675M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m128350i(nyw0Var.m165356a().m213657g()), nyw0Var.m165360e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m128345d(xyw0 xyw0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        jbx0 jbx0VarM12702L = C2148d4.m12702L();
        nbx0 nbx0VarM12748M = C2164f4.m12748M();
        tbx0 tbx0VarM12769M = C2172g4.m12769M();
        tbx0VarM12769M.m190096q(xyw0Var.m213654d());
        nbx0VarM12748M.m162273r((C2172g4) tbx0VarM12769M.m185950m());
        nbx0VarM12748M.m162272q(xyw0Var.m213652b());
        jbx0VarM12702L.m144331q((C2164f4) nbx0VarM12748M.m185950m());
        vcx0 vcx0VarM13278N = C2260r4.m13278N();
        vcx0VarM13278N.m200840r(m128349h(xyw0Var));
        vcx0VarM13278N.m200839q(xyw0Var.m213653c());
        jbx0VarM12702L.m144332r((C2260r4) vcx0VarM13278N.m185950m());
        edx0VarM13397L.m120527s(((C2148d4) jbx0VarM12702L.m185950m()).mo12796c());
        edx0VarM13397L.m120525q(m128350i(xyw0Var.m213657g()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m128346e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f101556b);
        j6x0Var.m143733i(f101557c);
        j6x0Var.m143732h(f101558d);
        j6x0Var.m143731g(f101559e);
    }

    /* JADX INFO: renamed from: f */
    public static uyw0 m128347f(zzguf zzgufVar) throws GeneralSecurityException {
        zzguf zzgufVar2 = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgufVar.ordinal();
        if (iOrdinal == 1) {
            return uyw0.f181676b;
        }
        if (iOrdinal == 2) {
            return uyw0.f181679e;
        }
        if (iOrdinal == 3) {
            return uyw0.f181678d;
        }
        if (iOrdinal == 4) {
            return uyw0.f181680f;
        }
        if (iOrdinal == 5) {
            return uyw0.f181677c;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzgufVar.zza());
    }

    /* JADX INFO: renamed from: g */
    public static vyw0 m128348g(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzguf zzgufVar = zzguf.UNKNOWN_HASH;
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return vyw0.f186428b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return vyw0.f186430d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return vyw0.f186429c;
    }

    /* JADX INFO: renamed from: h */
    public static C2268s4 m128349h(xyw0 xyw0Var) throws GeneralSecurityException {
        zzguf zzgufVar;
        xcx0 xcx0VarM13308N = C2268s4.m13308N();
        xcx0VarM13308N.m210439r(xyw0Var.m213655e());
        uyw0 uyw0VarM213656f = xyw0Var.m213656f();
        if (uyw0.f181676b.equals(uyw0VarM213656f)) {
            zzgufVar = zzguf.SHA1;
        } else if (uyw0.f181677c.equals(uyw0VarM213656f)) {
            zzgufVar = zzguf.SHA224;
        } else if (uyw0.f181678d.equals(uyw0VarM213656f)) {
            zzgufVar = zzguf.SHA256;
        } else if (uyw0.f181679e.equals(uyw0VarM213656f)) {
            zzgufVar = zzguf.SHA384;
        } else {
            if (!uyw0.f181680f.equals(uyw0VarM213656f)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(uyw0VarM213656f)));
            }
            zzgufVar = zzguf.SHA512;
        }
        xcx0VarM13308N.m210438q(zzgufVar);
        return (C2268s4) xcx0VarM13308N.m185950m();
    }

    /* JADX INFO: renamed from: i */
    public static zzgvz m128350i(vyw0 vyw0Var) throws GeneralSecurityException {
        if (vyw0.f186428b.equals(vyw0Var)) {
            return zzgvz.TINK;
        }
        if (vyw0.f186429c.equals(vyw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (vyw0.f186430d.equals(vyw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vyw0Var)));
    }
}
