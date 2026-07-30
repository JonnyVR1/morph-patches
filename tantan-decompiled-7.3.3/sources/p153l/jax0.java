package p153l;

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
public final class jax0 {

    /* JADX INFO: renamed from: a */
    public static final wfx0 f119064a;

    /* JADX INFO: renamed from: b */
    public static final c5x0 f119065b;

    /* JADX INFO: renamed from: c */
    public static final c5x0 f119066c;

    /* JADX INFO: renamed from: d */
    public static final r6x0 f119067d;

    /* JADX INFO: renamed from: e */
    public static final n6x0 f119068e;

    /* JADX INFO: renamed from: f */
    public static final n5x0 f119069f;

    /* JADX INFO: renamed from: g */
    public static final j5x0 f119070g;

    static {
        wfx0 wfx0VarM194894a = u7x0.m194894a("type.googleapis.com/google.crypto.tink.HmacKey");
        f119064a = wfx0VarM194894a;
        v4x0 v4x0VarM108082a = c5x0.m108082a();
        v4x0VarM108082a.m199740a(zzgvz.RAW, i9x0.f113527e);
        v4x0VarM108082a.m199740a(zzgvz.TINK, i9x0.f113524b);
        v4x0VarM108082a.m199740a(zzgvz.LEGACY, i9x0.f113526d);
        v4x0VarM108082a.m199740a(zzgvz.CRUNCHY, i9x0.f113525c);
        f119065b = v4x0VarM108082a.m199741b();
        v4x0 v4x0VarM108082a2 = c5x0.m108082a();
        v4x0VarM108082a2.m199740a(zzguf.SHA1, h9x0.f108437b);
        v4x0VarM108082a2.m199740a(zzguf.SHA224, h9x0.f108438c);
        v4x0VarM108082a2.m199740a(zzguf.SHA256, h9x0.f108439d);
        v4x0VarM108082a2.m199740a(zzguf.SHA384, h9x0.f108440e);
        v4x0VarM108082a2.m199740a(zzguf.SHA512, h9x0.f108441f);
        f119066c = v4x0VarM108082a2.m199741b();
        f119067d = r6x0.m180056b(new p6x0() { // from class: l.fax0
            @Override // p153l.p6x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo107269a(lxw0 lxw0Var) {
                return jax0.m144165b((k9x0) lxw0Var);
            }
        }, k9x0.class, d7x0.class);
        f119068e = n6x0.m161810b(new l6x0() { // from class: l.gax0
            @Override // p153l.l6x0
            /* JADX INFO: renamed from: a */
            public final lxw0 mo113350a(l7x0 l7x0Var) {
                return jax0.m144167d((d7x0) l7x0Var);
            }
        }, wfx0VarM194894a, d7x0.class);
        f119069f = n5x0.m161734b(new l5x0() { // from class: l.hax0
            @Override // p153l.l5x0
            /* JADX INFO: renamed from: a */
            public final l7x0 mo118767a(xww0 xww0Var, ayw0 ayw0Var) {
                return jax0.m144164a((z8x0) xww0Var, ayw0Var);
            }
        }, z8x0.class, c7x0.class);
        f119070g = j5x0.m143596b(new h5x0() { // from class: l.iax0
            @Override // p153l.h5x0
            /* JADX INFO: renamed from: a */
            public final xww0 mo123433a(l7x0 l7x0Var, ayw0 ayw0Var) {
                return jax0.m144166c((c7x0) l7x0Var, ayw0Var);
            }
        }, wfx0VarM194894a, c7x0.class);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ c7x0 m144164a(z8x0 z8x0Var, ayw0 ayw0Var) {
        tcx0 tcx0VarM13253M = C2252q4.m13253M();
        tcx0VarM13253M.m190521r(m144169f(z8x0Var.m219033d()));
        byte[] bArrM210864d = z8x0Var.m219034e().m210864d(ayw0Var);
        tcx0VarM13253M.m190520q(zzgyl.zzv(bArrM210864d, 0, bArrM210864d.length));
        return c7x0.m108336a("type.googleapis.com/google.crypto.tink.HmacKey", ((C2252q4) tcx0VarM13253M.m185950m()).mo12796c(), zzgus.SYMMETRIC, (zzgvz) f119065b.m108083b(z8x0Var.m219033d().m148905g()), z8x0Var.m219035f());
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ d7x0 m144165b(k9x0 k9x0Var) {
        edx0 edx0VarM13397L = C2284u4.m13397L();
        edx0VarM13397L.m120526r("type.googleapis.com/google.crypto.tink.HmacKey");
        vcx0 vcx0VarM13278N = C2260r4.m13278N();
        vcx0VarM13278N.m200840r(m144169f(k9x0Var));
        vcx0VarM13278N.m200839q(k9x0Var.m148902c());
        edx0VarM13397L.m120527s(((C2260r4) vcx0VarM13278N.m185950m()).mo12796c());
        edx0VarM13397L.m120525q((zzgvz) f119065b.m108083b(k9x0Var.m148905g()));
        return d7x0.m114762b((C2284u4) edx0VarM13397L.m185950m());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ z8x0 m144166c(c7x0 c7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        if (!c7x0Var.m108341f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            wg3.m206174a("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            C2252q4 c2252q4M13256P = C2252q4.m13256P(c7x0Var.m108339d(), jhx0.m144944a());
            if (c2252q4M13256P.m13260L() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            g9x0 g9x0VarM148900e = k9x0.m148900e();
            g9x0VarM148900e.m129676b(c2252q4M13256P.m13262R().zzd());
            g9x0VarM148900e.m129677c(c2252q4M13256P.m13261Q().m13313L());
            g9x0VarM148900e.m129675a((h9x0) f119066c.m108084c(c2252q4M13256P.m13261Q().m13314M()));
            g9x0VarM148900e.m129678d((i9x0) f119065b.m108084c(c7x0Var.m108338c()));
            k9x0 k9x0VarM129679e = g9x0VarM148900e.m129679e();
            x8x0 x8x0VarM219032c = z8x0.m219032c();
            x8x0VarM219032c.m209758c(k9x0VarM129679e);
            x8x0VarM219032c.m209757b(xfx0.m210861b(c2252q4M13256P.m13262R().zzA(), ayw0Var));
            x8x0VarM219032c.m209756a(c7x0Var.m108340e());
            return x8x0VarM219032c.m209759d();
        } catch (zzhag | IllegalArgumentException unused) {
            phw0.m172339a("Parsing HmacKey failed");
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ k9x0 m144167d(d7x0 d7x0Var) throws GeneralSecurityException {
        if (!d7x0Var.m114763c().m13406R().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            wg3.m206174a("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(d7x0Var.m114763c().m13406R())));
            return null;
        }
        try {
            C2260r4 c2260r4M13281Q = C2260r4.m13281Q(d7x0Var.m114763c().m13405Q(), jhx0.m144944a());
            if (c2260r4M13281Q.m13285M() != 0) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + c2260r4M13281Q.m13285M());
            }
            g9x0 g9x0VarM148900e = k9x0.m148900e();
            g9x0VarM148900e.m129676b(c2260r4M13281Q.m13284L());
            g9x0VarM148900e.m129677c(c2260r4M13281Q.m13286R().m13313L());
            g9x0VarM148900e.m129675a((h9x0) f119066c.m108084c(c2260r4M13281Q.m13286R().m13314M()));
            g9x0VarM148900e.m129678d((i9x0) f119065b.m108084c(d7x0Var.m114763c().m13404P()));
            return g9x0VarM148900e.m129679e();
        } catch (zzhag e) {
            throw new GeneralSecurityException("Parsing HmacParameters failed: ", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m144168e(j6x0 j6x0Var) throws GeneralSecurityException {
        j6x0Var.m143734j(f119067d);
        j6x0Var.m143733i(f119068e);
        j6x0Var.m143732h(f119069f);
        j6x0Var.m143731g(f119070g);
    }

    /* JADX INFO: renamed from: f */
    public static C2268s4 m144169f(k9x0 k9x0Var) throws GeneralSecurityException {
        xcx0 xcx0VarM13308N = C2268s4.m13308N();
        xcx0VarM13308N.m210439r(k9x0Var.m148901b());
        xcx0VarM13308N.m210438q((zzguf) f119066c.m108083b(k9x0Var.m148904f()));
        return (C2268s4) xcx0VarM13308N.m185950m();
    }
}
