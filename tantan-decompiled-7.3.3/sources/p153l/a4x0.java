package p153l;

import com.google.android.gms.internal.ads.C2204k4;
import com.google.android.gms.internal.ads.C2212l4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class a4x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f68458a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f68459b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f68460c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f68461d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f68462e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f68458a = wfx0VarM194894a;
        f68459b = r6x0.m180056b(new p6x0() { // from class: l.p3x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return a4x0.m96002d((o0x0) lxw0Var);
            }
        }, o0x0.class, d7x0.class);
        f68460c = n6x0.m161810b(new l6x0() { // from class: l.x3x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return a4x0.m96000b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f68461d = n5x0.m161734b(new l5x0() { // from class: l.y3x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return a4x0.m96001c((a0x0) xww0Var, ayw0Var);
            }
        }, a0x0.class, c7x0.class);
        f68462e = j5x0.m143596b(new h5x0() { // from class: l.z3x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return a4x0.m95999a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ a0x0 m95999a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            wg3.m206174a("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
            return null;
        }
        try {
            C2204k4 c2204k4M12876O = C2204k4.m12876O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2204k4M12876O.m12879L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            l0x0 l0x0VarM165552c = o0x0.m165552c();
            l0x0VarM165552c.m152402b(c2204k4M12876O.m12880P().zzd());
            l0x0VarM165552c.m152401a(12);
            l0x0VarM165552c.m152403c(16);
            l0x0VarM165552c.m152404d(m96004f(c7x0Var.m108338c()));
            o0x0 o0x0VarM152405e = l0x0VarM165552c.m152405e();
            yzw0 yzw0VarM95434a = a0x0.m95434a();
            yzw0VarM95434a.m218089c(o0x0VarM152405e);
            yzw0VarM95434a.m218088b(xfx0.m210861b(c2204k4M12876O.m12880P().zzA(), ayw0Var));
            yzw0VarM95434a.m218087a(c7x0Var.m108340e());
            return yzw0VarM95434a.m218090d();
        } catch (zzhag unused) {
            phw0.m172339a("Parsing AesGcmKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ o0x0 m96000b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            wg3.m206174a("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2212l4 c2212l4M12922P = C2212l4.m12922P(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            if (c2212l4M12922P.m12925M() != 0) {
                phw0.m172339a("Only version 0 parameters are accepted");
                return null;
            }
            l0x0 l0x0VarM165552c = o0x0.m165552c();
            l0x0VarM165552c.m152402b(c2212l4M12922P.m12924L());
            l0x0VarM165552c.m152401a(12);
            l0x0VarM165552c.m152403c(16);
            l0x0VarM165552c.m152404d(m96004f(d7x0Var.m114763c().m13404P()));
            return l0x0VarM165552c.m152405e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m96001c(a0x0 a0x0Var, ayw0 ayw0Var) {
        bcx0 bcx0VarM12874M = C2204k4.m12874M();
        byte[] bArrM210864d = a0x0Var.m95437d().m210864d(ayw0Var);
        bcx0VarM12874M.m103554q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.AesGcmKey", ((C2204k4) bcx0VarM12874M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m96005g(a0x0Var.m95435b().m165554d()), a0x0Var.m95438e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m96002d(o0x0 o0x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.AesGcmKey");
        dcx0 dcx0VarM12920N = C2212l4.m12920N();
        dcx0VarM12920N.m115312q(o0x0Var.m165553b());
        edx0VarM13397L.m120527s(((C2212l4) dcx0VarM12920N.m185950m()).mo12796c());
        edx0VarM13397L.m120525q(m96005g(o0x0Var.m165554d()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m96003e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f68459b);
        j6x0Var.m143733i(f68460c);
        j6x0Var.m143732h(f68461d);
        j6x0Var.m143731g(f68462e);
    }

    /* JADX INFO: renamed from: f */
    public static m0x0 m96004f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return m0x0.f134367b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return m0x0.f134369d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return m0x0.f134368c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m96005g(m0x0 m0x0Var) throws GeneralSecurityException {
        if (m0x0.f134367b.equals(m0x0Var)) {
            return zzgvz.TINK;
        }
        if (m0x0.f134368c.equals(m0x0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (m0x0.f134369d.equals(m0x0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(m0x0Var)));
    }
}
