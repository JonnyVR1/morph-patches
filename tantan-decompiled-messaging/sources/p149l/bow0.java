package p149l;

import com.google.android.gms.internal.ads.C2277w4;
import com.google.android.gms.internal.ads.C2285x4;
import com.google.android.gms.internal.ads.C2293y4;
import com.google.android.gms.internal.ads.C2301z4;
import com.google.android.gms.internal.ads.zzgpl;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bow0 {

    /* JADX INFO: renamed from: a */
    public final C2285x4 f76573a;

    /* JADX INFO: renamed from: b */
    public final List f76574b;

    /* JADX INFO: renamed from: c */
    public final h1x0 f76575c;

    public bow0(C2285x4 c2285x4, List list) {
        this.f76573a = c2285x4;
        this.f76574b = list;
        this.f76575c = h1x0.f105474b;
    }

    /* JADX INFO: renamed from: a */
    public static final bow0 m102992a(C2285x4 c2285x4) throws GeneralSecurityException {
        m102998i(c2285x4);
        return new bow0(c2285x4, m102997h(c2285x4));
    }

    /* JADX INFO: renamed from: b */
    public static final bow0 m102993b(C2285x4 c2285x4, h1x0 h1x0Var) throws GeneralSecurityException {
        m102998i(c2285x4);
        return new bow0(c2285x4, m102997h(c2285x4), h1x0Var);
    }

    /* JADX INFO: renamed from: c */
    public static final bow0 m102994c(fow0 fow0Var) throws GeneralSecurityException {
        ynw0 ynw0Var = new ynw0();
        wnw0 wnw0Var = new wnw0(fow0Var, null);
        wnw0Var.m204792e();
        wnw0Var.m204791d();
        ynw0Var.m215468a(wnw0Var);
        return ynw0Var.m215469b();
    }

    /* JADX INFO: renamed from: f */
    public static wxw0 m102995f(C2277w4 c2277w4) {
        try {
            return wxw0.m206041a(c2277w4.m13430M().m13327Q(), c2277w4.m13430M().m13326P(), c2277w4.m13430M().m13325M(), c2277w4.m13431P(), c2277w4.m13431P() == zzgvz.RAW ? null : Integer.valueOf(c2277w4.m13429L()));
        } catch (GeneralSecurityException e) {
            throw new zzgpl("Creating a protokey serialization failed", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m102996g(xvw0 xvw0Var, C2277w4 c2277w4, Class cls) throws GeneralSecurityException {
        try {
            return tow0.m189937c(c2277w4.m13430M(), cls);
        } catch (UnsupportedOperationException unused) {
            return null;
        } catch (GeneralSecurityException e) {
            if (e.getMessage().contains("No key manager found for key type ") || e.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: h */
    public static List m102997h(C2285x4 c2285x4) {
        tnw0 tnw0Var;
        ArrayList arrayList = new ArrayList(c2285x4.m13457L());
        for (C2277w4 c2277w4 : c2285x4.m13460R()) {
            int iM13429L = c2277w4.m13429L();
            try {
                rnw0 rnw0VarM114032b = dxw0.m114030d().m114032b(m102995f(c2277w4), uow0.m194569a());
                int iM13433U = c2277w4.m13433U() - 2;
                if (iM13433U == 1) {
                    tnw0Var = tnw0.f171289b;
                } else if (iM13433U == 2) {
                    tnw0Var = tnw0.f171290c;
                } else {
                    if (iM13433U != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    tnw0Var = tnw0.f171291d;
                }
                arrayList.add(new aow0(rnw0VarM114032b, tnw0Var, iM13429L, iM13429L == c2285x4.m13458M(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static void m102998i(C2285x4 c2285x4) throws GeneralSecurityException {
        if (c2285x4 == null || c2285x4.m13457L() <= 0) {
            j8w0.m140474a("empty keyset");
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Object m102999j(xvw0 xvw0Var, rnw0 rnw0Var, Class cls) throws GeneralSecurityException {
        try {
            return axw0.m99526a().m99528c(rnw0Var, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2285x4 m103000d() {
        return this.f76573a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m103001e(hnw0 hnw0Var, Class cls) throws GeneralSecurityException {
        Class clsM189936b = tow0.m189936b(cls);
        if (clsM189936b == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        C2285x4 c2285x4 = this.f76573a;
        Charset charset = xow0.f193885a;
        int iM13458M = c2285x4.m13458M();
        Iterator it = c2285x4.m13460R().iterator();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            gow0 gow0Var = null;
            if (!it.hasNext()) {
                if (i == 0) {
                    j8w0.m140474a("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    j8w0.m140474a("keyset doesn't contain a valid primary key");
                    return null;
                }
                how0 how0Var = new how0(clsM189936b, gow0Var);
                how0Var.m132285c(this.f76575c);
                for (int i2 = 0; i2 < this.f76573a.m13457L(); i2++) {
                    C2277w4 c2277w4M13459O = this.f76573a.m13459O(i2);
                    if (c2277w4M13459O.m13433U() == 3) {
                        xvw0 xvw0Var = (xvw0) hnw0Var;
                        Object objM102996g = m102996g(xvw0Var, c2277w4M13459O, clsM189936b);
                        Object objM102999j = this.f76574b.get(i2) != null ? m102999j(xvw0Var, ((aow0) this.f76574b.get(i2)).m97999a(), clsM189936b) : null;
                        if (objM102999j == null && objM102996g == null) {
                            throw new GeneralSecurityException("Unable to get primitive " + clsM189936b.toString() + " for key of type " + c2277w4M13459O.m13430M().m13327Q());
                        }
                        if (c2277w4M13459O.m13429L() == this.f76573a.m13458M()) {
                            how0Var.m132284b(objM102999j, objM102996g, c2277w4M13459O);
                        } else {
                            how0Var.m132283a(objM102999j, objM102996g, c2277w4M13459O);
                        }
                    }
                }
                return axw0.m99526a().m99529d(how0Var.m132286d(), cls);
            }
            C2277w4 c2277w4 = (C2277w4) it.next();
            if (c2277w4.m13433U() == 3) {
                if (!c2277w4.m13432T()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c2277w4.m13429L())));
                }
                if (c2277w4.m13431P() == zzgvz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c2277w4.m13429L())));
                }
                if (c2277w4.m13433U() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c2277w4.m13429L())));
                }
                if (c2277w4.m13429L() == iM13458M) {
                    if (z) {
                        j8w0.m140474a("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                z2 &= c2277w4.m13430M().m13325M() == zzgus.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
    }

    public final String toString() {
        Charset charset = xow0.f193885a;
        C2285x4 c2285x4 = this.f76573a;
        k4x0 k4x0VarM13524L = C2301z4.m13524L();
        k4x0VarM13524L.m144517r(c2285x4.m13458M());
        for (C2277w4 c2277w4 : c2285x4.m13460R()) {
            l4x0 l4x0VarM13487L = C2293y4.m13487L();
            l4x0VarM13487L.m148465s(c2277w4.m13430M().m13327Q());
            l4x0VarM13487L.m148466t(c2277w4.m13433U());
            l4x0VarM13487L.m148464r(c2277w4.m13431P());
            l4x0VarM13487L.m148463q(c2277w4.m13429L());
            k4x0VarM13524L.m144516q((C2293y4) l4x0VarM13487L.m153521m());
        }
        return ((C2301z4) k4x0VarM13524L.m153521m()).toString();
    }

    public bow0(C2285x4 c2285x4, List list, h1x0 h1x0Var) {
        this.f76573a = c2285x4;
        this.f76574b = list;
        this.f76575c = h1x0Var;
    }
}
