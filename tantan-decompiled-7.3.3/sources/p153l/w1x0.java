package p153l;

import com.google.android.gms.internal.ads.C2236o4;
import com.google.android.gms.internal.ads.C2244p4;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class w1x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f186846a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f186847b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f186848c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f186849d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f186850e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f186846a = wfx0VarM194894a;
        f186847b = r6x0.m180056b(new p6x0() { // from class: l.s1x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return w1x0.m204481d((r1x0) lxw0Var);
            }
        }, r1x0.class, d7x0.class);
        f186848c = n6x0.m161810b(new l6x0() { // from class: l.t1x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return w1x0.m204479b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f186849d = n5x0.m161734b(new l5x0() { // from class: l.u1x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return w1x0.m204480c((m1x0) xww0Var, ayw0Var);
            }
        }, m1x0.class, c7x0.class);
        f186850e = j5x0.m143596b(new h5x0() { // from class: l.v1x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return w1x0.m204478a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ m1x0 m204478a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            wg3.m206174a("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            C2236o4 c2236o4M13143O = C2236o4.m13143O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2236o4M13143O.m13146L() == 0) {
                return m1x0.m156723a(m204483f(c7x0Var.m108338c()), xfx0.m210861b(c2236o4M13143O.m13147P().zzA(), ayw0Var), c7x0Var.m108340e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            phw0.m172339a("Parsing ChaCha20Poly1305Key failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ r1x0 m204479b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            wg3.m206174a("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2244p4.m13212N(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            return r1x0.m179456c(m204483f(d7x0Var.m114763c().m13404P()));
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m204480c(m1x0 m1x0Var, ayw0 ayw0Var) {
        jcx0 jcx0VarM13141M = C2236o4.m13141M();
        byte[] bArrM210864d = m1x0Var.m156726d().m210864d(ayw0Var);
        jcx0VarM13141M.m144395q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((C2236o4) jcx0VarM13141M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m204484g(m1x0Var.m156724b().m179457b()), m1x0Var.m156727e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m204481d(r1x0 r1x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        edx0VarM13397L.m120527s(C2244p4.m13211M().mo12796c());
        edx0VarM13397L.m120525q(m204484g(r1x0Var.m179457b()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m204482e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f186847b);
        j6x0Var.m143733i(f186848c);
        j6x0Var.m143732h(f186849d);
        j6x0Var.m143731g(f186850e);
    }

    /* JADX INFO: renamed from: f */
    public static q1x0 m204483f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return q1x0.f155227b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return q1x0.f155229d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return q1x0.f155228c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m204484g(q1x0 q1x0Var) throws GeneralSecurityException {
        if (q1x0.f155227b.equals(q1x0Var)) {
            return zzgvz.TINK;
        }
        if (q1x0.f155228c.equals(q1x0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (q1x0.f155229d.equals(q1x0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(q1x0Var.toString()));
    }
}
