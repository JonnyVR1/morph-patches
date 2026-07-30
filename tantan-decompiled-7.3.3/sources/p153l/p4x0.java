package p153l;

import com.google.android.gms.internal.ads.C2165f5;
import com.google.android.gms.internal.ads.C2173g5;
import com.google.android.gms.internal.ads.C2284u4;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class p4x0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f150572a;

    /* JADX INFO: renamed from: b */
    public static final r6x0 f150573b;

    /* JADX INFO: renamed from: c */
    public static final n6x0 f150574c;

    /* JADX INFO: renamed from: d */
    public static final n5x0 f150575d;

    /* JADX INFO: renamed from: e */
    public static final j5x0 f150576e;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f150572a = wfx0VarM194894a;
        f150573b = r6x0.m180056b(new p6x0() { // from class: l.l4x0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return p4x0.m170584d((o3x0) lxw0Var);
            }
        }, o3x0.class, d7x0.class);
        f150574c = n6x0.m161810b(new l6x0() { // from class: l.m4x0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return p4x0.m170582b((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f150575d = n5x0.m161734b(new l5x0() { // from class: l.n4x0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return p4x0.m170583c((i3x0) xww0Var, ayw0Var);
            }
        }, i3x0.class, c7x0.class);
        f150576e = j5x0.m143596b(new h5x0() { // from class: l.o4x0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return p4x0.m170581a((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ i3x0 m170581a(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            wg3.m206174a("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
            return null;
        }
        try {
            C2165f5 c2165f5M12757O = C2165f5.m12757O(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2165f5M12757O.m12760L() == 0) {
                return i3x0.m138347a(m170586f(c7x0Var.m108338c()), xfx0.m210861b(c2165f5M12757O.m12761P().zzA(), ayw0Var), c7x0Var.m108340e());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzhag unused) {
            phw0.m172339a("Parsing XChaCha20Poly1305Key failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ o3x0 m170582b(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            wg3.m206174a("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            if (C2173g5.m12776O(d7x0Var.m114763c().m13405Q(), jhx0.m144944a()).m12777L() == 0) {
                return o3x0.m165892c(m170586f(d7x0Var.m114763c().m13404P()));
            }
            phw0.m172339a("Only version 0 parameters are accepted");
            return null;
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c7x0 m170583c(i3x0 i3x0Var, ayw0 ayw0Var) {
        jex0 jex0VarM12755M = C2165f5.m12755M();
        byte[] bArrM210864d = i3x0Var.m138350d().m210864d(ayw0Var);
        jex0VarM12755M.m144628q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((C2165f5) jex0VarM12755M.m185950m()).mo12796c(), zzgus.SYMMETRIC, m170587g(i3x0Var.m138348b().m165893b()), i3x0Var.m138351e());
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ d7x0 m170584d(o3x0 o3x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        edx0VarM13397L.m120527s(C2173g5.m12775N().mo12796c());
        edx0VarM13397L.m120525q(m170587g(o3x0Var.m165893b()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: e */
    public static void m170585e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f150573b);
        j6x0Var.m143733i(f150574c);
        j6x0Var.m143732h(f150575d);
        j6x0Var.m143731g(f150576e);
    }

    /* JADX INFO: renamed from: f */
    public static n3x0 m170586f(zzgvz zzgvzVar) throws GeneralSecurityException {
        zzgvz zzgvzVar2 = zzgvz.UNKNOWN_PREFIX;
        int iOrdinal = zzgvzVar.ordinal();
        if (iOrdinal == 1) {
            return n3x0.f140042b;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return n3x0.f140044d;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgvzVar.zza());
            }
        }
        return n3x0.f140043c;
    }

    /* JADX INFO: renamed from: g */
    public static zzgvz m170587g(n3x0 n3x0Var) throws GeneralSecurityException {
        if (n3x0.f140042b.equals(n3x0Var)) {
            return zzgvz.TINK;
        }
        if (n3x0.f140043c.equals(n3x0Var)) {
            return zzgvz.CRUNCHY;
        }
        if (n3x0.f140044d.equals(n3x0Var)) {
            return zzgvz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(n3x0Var.toString()));
    }
}
