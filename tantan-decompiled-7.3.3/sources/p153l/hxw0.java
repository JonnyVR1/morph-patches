package p153l;

import com.google.android.gms.internal.ads.C2300w4;
import com.google.android.gms.internal.ads.C2308x4;
import com.google.android.gms.internal.ads.C2316y4;
import com.google.android.gms.internal.ads.C2324z4;
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
public final class hxw0 {

    /* JADX INFO: renamed from: a */
    public final C2308x4 f112063a;

    /* JADX INFO: renamed from: b */
    public final List f112064b;

    /* JADX INFO: renamed from: c */
    public final nax0 f112065c;

    public hxw0(C2308x4 c2308x4, List list) {
        this.f112063a = c2308x4;
        this.f112064b = list;
        this.f112065c = nax0.f141057b;
    }

    /* JADX INFO: renamed from: a */
    public static final hxw0 m137659a(C2308x4 c2308x4) throws GeneralSecurityException {
        m137665i(c2308x4);
        return new hxw0(c2308x4, m137664h(c2308x4));
    }

    /* JADX INFO: renamed from: b */
    public static final hxw0 m137660b(C2308x4 c2308x4, nax0 nax0Var) throws GeneralSecurityException {
        m137665i(c2308x4);
        return new hxw0(c2308x4, m137664h(c2308x4), nax0Var);
    }

    /* JADX INFO: renamed from: c */
    public static final hxw0 m137661c(lxw0 lxw0Var) throws GeneralSecurityException {
        exw0 exw0Var = new exw0();
        cxw0 cxw0Var = new cxw0(lxw0Var, null);
        cxw0Var.m113083e();
        cxw0Var.m113082d();
        exw0Var.m123114a(cxw0Var);
        return exw0Var.m123115b();
    }

    /* JADX INFO: renamed from: f */
    public static c7x0 m137662f(C2300w4 c2300w4) {
        try {
            return c7x0.m108336a(c2300w4.m13484M().m13381Q(), c2300w4.m13484M().m13380P(), c2300w4.m13484M().m13379M(), c2300w4.m13485P(), c2300w4.m13485P() == zzgvz.RAW ? null : Integer.valueOf(c2300w4.m13483L()));
        } catch (GeneralSecurityException e) {
            throw new zzgpl("Creating a protokey serialization failed", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object m137663g(d5x0 d5x0Var, C2300w4 c2300w4, Class cls) throws GeneralSecurityException {
        try {
            return zxw0.m222090c(c2300w4.m13484M(), cls);
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
    public static List m137664h(C2308x4 c2308x4) {
        zww0 zww0Var;
        ArrayList arrayList = new ArrayList(c2308x4.m13511L());
        for (C2300w4 c2300w4 : c2308x4.m13514R()) {
            int iM13483L = c2300w4.m13483L();
            try {
                xww0 xww0VarM143727b = j6x0.m143725d().m143727b(m137662f(c2300w4), ayw0.m100933a());
                int iM13487U = c2300w4.m13487U() - 2;
                if (iM13487U == 1) {
                    zww0Var = zww0.f206390b;
                } else if (iM13487U == 2) {
                    zww0Var = zww0.f206391c;
                } else {
                    if (iM13487U != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    zww0Var = zww0.f206392d;
                }
                arrayList.add(new gxw0(xww0VarM143727b, zww0Var, iM13483L, iM13483L == c2308x4.m13512M(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static void m137665i(C2308x4 c2308x4) throws GeneralSecurityException {
        if (c2308x4 == null || c2308x4.m13511L() <= 0) {
            phw0.m172339a("empty keyset");
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Object m137666j(d5x0 d5x0Var, xww0 xww0Var, Class cls) throws GeneralSecurityException {
        try {
            return g6x0.m129300a().m129302c(xww0Var, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final C2308x4 m137667d() {
        return this.f112063a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m137668e(nww0 nww0Var, Class cls) throws GeneralSecurityException {
        Class clsM222089b = zxw0.m222089b(cls);
        if (clsM222089b == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
        }
        C2308x4 c2308x4 = this.f112063a;
        Charset charset = dyw0.f91290a;
        int iM13512M = c2308x4.m13512M();
        Iterator it = c2308x4.m13514R().iterator();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            mxw0 mxw0Var = null;
            if (!it.hasNext()) {
                if (i == 0) {
                    phw0.m172339a("keyset must contain at least one ENABLED key");
                    return null;
                }
                if (!z && !z2) {
                    phw0.m172339a("keyset doesn't contain a valid primary key");
                    return null;
                }
                nxw0 nxw0Var = new nxw0(clsM222089b, mxw0Var);
                nxw0Var.m165299c(this.f112065c);
                for (int i2 = 0; i2 < this.f112063a.m13511L(); i2++) {
                    C2300w4 c2300w4M13513O = this.f112063a.m13513O(i2);
                    if (c2300w4M13513O.m13487U() == 3) {
                        d5x0 d5x0Var = (d5x0) nww0Var;
                        Object objM137663g = m137663g(d5x0Var, c2300w4M13513O, clsM222089b);
                        Object objM137666j = this.f112064b.get(i2) != null ? m137666j(d5x0Var, ((gxw0) this.f112064b.get(i2)).m132926a(), clsM222089b) : null;
                        if (objM137666j == null && objM137663g == null) {
                            throw new GeneralSecurityException("Unable to get primitive " + clsM222089b.toString() + " for key of type " + c2300w4M13513O.m13484M().m13381Q());
                        }
                        if (c2300w4M13513O.m13483L() == this.f112063a.m13512M()) {
                            nxw0Var.m165298b(objM137666j, objM137663g, c2300w4M13513O);
                        } else {
                            nxw0Var.m165297a(objM137666j, objM137663g, c2300w4M13513O);
                        }
                    }
                }
                return g6x0.m129300a().m129303d(nxw0Var.m165300d(), cls);
            }
            C2300w4 c2300w4 = (C2300w4) it.next();
            if (c2300w4.m13487U() == 3) {
                if (!c2300w4.m13486T()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c2300w4.m13483L())));
                }
                if (c2300w4.m13485P() == zzgvz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c2300w4.m13483L())));
                }
                if (c2300w4.m13487U() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c2300w4.m13483L())));
                }
                if (c2300w4.m13483L() == iM13512M) {
                    if (z) {
                        phw0.m172339a("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                z2 &= c2300w4.m13484M().m13379M() == zzgus.ASYMMETRIC_PUBLIC;
                i++;
            }
        }
    }

    public final String toString() {
        Charset charset = dyw0.f91290a;
        C2308x4 c2308x4 = this.f112063a;
        qdx0 qdx0VarM13578L = C2324z4.m13578L();
        qdx0VarM13578L.m176212r(c2308x4.m13512M());
        for (C2300w4 c2300w4 : c2308x4.m13514R()) {
            rdx0 rdx0VarM13541L = C2316y4.m13541L();
            rdx0VarM13541L.m180944s(c2300w4.m13484M().m13381Q());
            rdx0VarM13541L.m180945t(c2300w4.m13487U());
            rdx0VarM13541L.m180943r(c2300w4.m13485P());
            rdx0VarM13541L.m180942q(c2300w4.m13483L());
            qdx0VarM13578L.m176211q((C2316y4) rdx0VarM13541L.m185950m());
        }
        return ((C2324z4) qdx0VarM13578L.m185950m()).toString();
    }

    public hxw0(C2308x4 c2308x4, List list, nax0 nax0Var) {
        this.f112063a = c2308x4;
        this.f112064b = list;
        this.f112065c = nax0Var;
    }
}
