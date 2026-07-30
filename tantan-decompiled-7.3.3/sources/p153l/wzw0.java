package p153l;

import com.google.android.gms.internal.ads.C2180h4;
import com.google.android.gms.internal.ads.C2188i4;
import com.google.android.gms.internal.ads.C2196j4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class wzw0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f191834a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f191835b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f191836c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f191837d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f191838e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f191834a = wfx0VarM194894a;
        f191835b = r6x0.m180056b(new p6x0() { // from class: l.szw0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return wzw0.m208776d((rzw0) lxw0Var);
            }
        }, rzw0.class, d7x0.class);
        f191836c = n6x0.m161810b(new l6x0() { // from class: l.tzw0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return wzw0.m208774b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f191837d = n5x0.m161734b(new l5x0() { // from class: l.uzw0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return wzw0.m208775c((jzw0) xww0Var, ayw0Var);
            }
        }, jzw0.class, c7x0.class);
        f191838e = j5x0.m143596b(new h5x0() { // from class: l.vzw0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return wzw0.m208773a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ jzw0 m208773a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            wg3.m206174a("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
            return null;
        }
        try {
            C2180h4 c2180h4M12787O = C2180h4.m12787O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2180h4M12787O.m12791L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ozw0 ozw0Var = new ozw0(null);
            ozw0Var.m170002b(c2180h4M12787O.m12793Q().zzd());
            ozw0Var.m170001a(c2180h4M12787O.m12792P().m12834L());
            ozw0Var.m170003c(16);
            ozw0Var.m170004d(m208778f(c7x0Var.m108338c()));
            rzw0 rzw0VarM170005e = ozw0Var.m170005e();
            hzw0 hzw0Var = new hzw0(null);
            hzw0Var.m137943c(rzw0VarM170005e);
            hzw0Var.m137942b(xfx0.m210861b(c2180h4M12787O.m12793Q().zzA(), ayw0Var));
            hzw0Var.m137941a(c7x0Var.m108340e());
            return hzw0Var.m137944d();
        } catch (zzhag unused) {
            phw0.m172339a("Parsing AesEaxcKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ rzw0 m208774b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            wg3.m206174a("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2188i4 c2188i4M12819O = C2188i4.m12819O(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            ozw0 ozw0Var = new ozw0(null);
            ozw0Var.m170002b(c2188i4M12819O.m12822L());
            ozw0Var.m170001a(c2188i4M12819O.m12823P().m12834L());
            ozw0Var.m170003c(16);
            ozw0Var.m170004d(m208778f(d7x0Var.m114763c().m13404P()));
            return ozw0Var.m170005e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m208775c(jzw0 jzw0Var, ayw0 ayw0Var) {
        vbx0 vbx0VarM12785M = C2180h4.m12785M();
        vbx0VarM12785M.m200746r(m208779g(jzw0Var.m147745a()));
        byte[] bArrM210864d = jzw0Var.m147747c().m210864d(ayw0Var);
        vbx0VarM12785M.m200745q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.AesEaxKey", ((C2180h4) vbx0VarM12785M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m208780h(jzw0Var.m147745a().m183864d()), jzw0Var.m147748d());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m208776d(rzw0 rzw0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.AesEaxKey");
        xbx0 xbx0VarM12817M = C2188i4.m12817M();
        xbx0VarM12817M.m210084r(m208779g(rzw0Var));
        xbx0VarM12817M.m210083q(rzw0Var.m183863c());
        edx0VarM13397L.m120527s(((C2188i4) xbx0VarM12817M.m185950m()).mo12796c());
        edx0VarM13397L.m120525q(m208780h(rzw0Var.m183864d()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m208777e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f191835b);
        j6x0Var.m143733i(f191836c);
        j6x0Var.m143732h(f191837d);
        j6x0Var.m143731g(f191838e);
    }

    /* JADX INFO: renamed from: f */
    public static pzw0 m208778f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return pzw0.f154984b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return pzw0.f154986d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return pzw0.f154985c;
    }

    /* JADX INFO: renamed from: g */
    public static C2196j4 m208779g(rzw0 rzw0Var) throws GeneralSecurityException {
        zbx0 zbx0VarM12830M = C2196j4.m12830M();
        zbx0VarM12830M.m219218q(rzw0Var.m183862b());
        return (C2196j4) zbx0VarM12830M.m185950m();
    }

    /* JADX INFO: renamed from: h */
    public static zzgvz m208780h(pzw0 pzw0Var) throws GeneralSecurityException {
        if (pzw0.f154984b.equals(pzw0Var)) {
            return zzgvz.TINK;
        }
        if (pzw0.f154985c.equals(pzw0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (pzw0.f154986d.equals(pzw0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(pzw0Var)));
    }
}
