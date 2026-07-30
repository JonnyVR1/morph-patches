package p153l;

import com.google.android.gms.internal.ads.C2122a4;
import com.google.android.gms.internal.ads.C2131b4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.C2323z3;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class r8x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f161773a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f161774b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f161775c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f161776d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f161777e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f161773a = wfx0VarM194894a;
        f161774b = r6x0.m180056b(new p6x0() { // from class: l.n8x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return r8x0.m180282b((h8x0) lxw0Var);
            }
        }, h8x0.class, d7x0.class);
        f161775c = n6x0.m161810b(new l6x0() { // from class: l.o8x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return r8x0.m180284d((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f161776d = n5x0.m161734b(new l5x0() { // from class: l.p8x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return r8x0.m180281a((y7x0) xww0Var, ayw0Var);
            }
        }, y7x0.class, c7x0.class);
        f161777e = j5x0.m143596b(new h5x0() { // from class: l.q8x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return r8x0.m180283c((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c7x0 m180281a(y7x0 y7x0Var, ayw0 ayw0Var) {
        bbx0 bbx0VarM13569M = C2323z3.m13569M();
        bbx0VarM13569M.m103318r(m180287g(y7x0Var.m214704c()));
        byte[] bArrM210864d = y7x0Var.m214705d().m210864d(ayw0Var);
        bbx0VarM13569M.m103317q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.AesCmacKey", ((C2323z3) bbx0VarM13569M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m180288h(y7x0Var.m214704c().m133995e()), y7x0Var.m214706e());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ d7x0 m180282b(h8x0 h8x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.AesCmacKey");
        dbx0 dbx0VarM12563M = C2122a4.m12563M();
        dbx0VarM12563M.m115172r(m180287g(h8x0Var));
        dbx0VarM12563M.m115171q(h8x0Var.m133993c());
        edx0VarM13397L.m120527s(((C2122a4) dbx0VarM12563M.m185950m()).mo12796c());
        edx0VarM13397L.m120525q(m180288h(h8x0Var.m133995e()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ y7x0 m180283c(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            wg3.m206174a("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
            return null;
        }
        try {
            C2323z3 c2323z3M13571O = C2323z3.m13571O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2323z3M13571O.m13575L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            e8x0 e8x0Var = new e8x0(null);
            e8x0Var.m119840a(c2323z3M13571O.m13577Q().zzd());
            e8x0Var.m119841b(c2323z3M13571O.m13576P().m12592L());
            e8x0Var.m119842c(m180286f(c7x0Var.m108338c()));
            h8x0 h8x0VarM119843d = e8x0Var.m119843d();
            w7x0 w7x0Var = new w7x0(null);
            w7x0Var.m205394c(h8x0VarM119843d);
            w7x0Var.m205392a(xfx0.m210861b(c2323z3M13571O.m13577Q().zzA(), ayw0Var));
            w7x0Var.m205393b(c7x0Var.m108340e());
            return w7x0Var.m205395d();
        } catch (zzhag | IllegalArgumentException unused) {
            phw0.m172339a("Parsing AesCmacKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ h8x0 m180284d(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            wg3.m206174a("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2122a4 c2122a4M12565O = C2122a4.m12565O(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            e8x0 e8x0Var = new e8x0(null);
            e8x0Var.m119840a(c2122a4M12565O.m12568L());
            e8x0Var.m119841b(c2122a4M12565O.m12569P().m12592L());
            e8x0Var.m119842c(m180286f(d7x0Var.m114763c().m13404P()));
            return e8x0Var.m119843d();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m180285e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f161774b);
        j6x0Var.m143733i(f161775c);
        j6x0Var.m143732h(f161776d);
        j6x0Var.m143731g(f161777e);
    }

    /* JADX INFO: renamed from: f */
    public static f8x0 m180286f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return f8x0.f97784b;
        }
        if (iOrdinal == 2) {
            return f8x0.f97786d;
        }
        if (iOrdinal == 3) {
            return f8x0.f97787e;
        }
        if (iOrdinal == 4) {
            return f8x0.f97785c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
    }

    /* JADX INFO: renamed from: g */
    public static C2131b4 m180287g(h8x0 h8x0Var) {
        fbx0 fbx0VarM12588M = C2131b4.m12588M();
        fbx0VarM12588M.m124964q(h8x0Var.m133992b());
        return (C2131b4) fbx0VarM12588M.m185950m();
    }

    /* JADX INFO: renamed from: h */
    public static zzgvz m180288h(f8x0 f8x0Var) throws GeneralSecurityException {
        if (f8x0.f97784b.equals(f8x0Var)) {
            return zzgvz.TINK;
        }
        if (f8x0.f97785c.equals(f8x0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (f8x0.f97787e.equals(f8x0Var)) {
            return zzgvz.RAW;
        }
        if (f8x0.f97786d.equals(f8x0Var)) {
            return zzgvz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(f8x0Var)));
    }
}
