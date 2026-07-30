package p153l;

import com.google.android.gms.internal.ads.C2276t4;
import com.google.android.gms.internal.ads.C2300w4;
import com.google.android.gms.internal.ads.C2308x4;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class exw0 {

    /* JADX INFO: renamed from: a */
    public final List f96356a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final nax0 f96357b = nax0.f141057b;

    /* JADX INFO: renamed from: c */
    public boolean f96358c = false;

    /* JADX INFO: renamed from: a */
    public final exw0 m123114a(cxw0 cxw0Var) {
        if (cxw0Var.f84283f != null) {
            wtq0.m207906a("Entry has already been added to a KeysetHandle.Builder");
            return null;
        }
        if (cxw0Var.f84278a) {
            m123116d();
        }
        cxw0Var.f84283f = this;
        this.f96356a.add(cxw0Var);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final hxw0 m123115b() throws GeneralSecurityException {
        int i;
        if (this.f96358c) {
            phw0.m172339a("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        char c = 1;
        this.f96358c = true;
        List list = this.f96356a;
        ndx0 ndx0VarM13506N = C2308x4.m13506N();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((cxw0) list.get(i2)).f84282e == dxw0.f91123a && ((cxw0) list.get(i3)).f84282e != dxw0.f91123a) {
                phw0.m172339a("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (cxw0 cxw0Var : this.f96356a) {
            zww0 unused = cxw0Var.f84279b;
            if (cxw0Var.f84282e == null) {
                phw0.m172339a("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            int i4 = 3;
            if (cxw0Var.f84282e == dxw0.f91123a) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i5 = 0;
                    while (i5 == 0) {
                        secureRandom.nextBytes(bArr);
                        i5 = ((bArr[0] & 255) << 24) | ((bArr[c] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                        c = 1;
                    }
                    i = i5;
                }
            } else {
                dxw0 unused2 = cxw0Var.f84282e;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            cxw0.m113073a(cxw0Var);
            lxw0 lxw0Var = cxw0Var.f84281d;
            zww0 zww0VarM113081c = cxw0Var.m113081c();
            zww0 zww0Var = zww0.f206390b;
            if (!zww0Var.equals(zww0VarM113081c)) {
                if (zww0.f206391c.equals(zww0VarM113081c)) {
                    i4 = 4;
                } else {
                    if (!zww0.f206392d.equals(zww0VarM113081c)) {
                        wtq0.m207906a("Unknown key status");
                        return null;
                    }
                    i4 = 5;
                }
            }
            d7x0 d7x0Var = (d7x0) (lxw0Var instanceof r5x0 ? ((r5x0) lxw0Var).m179959b() : j6x0.m143725d().m143730f(lxw0Var, d7x0.class));
            C2276t4 c2276t4M222088a = zxw0.m222088a(d7x0Var.m114763c());
            odx0 odx0VarM13477N = C2300w4.m13477N();
            odx0VarM13477N.m167346r(i);
            odx0VarM13477N.m167348t(i4);
            odx0VarM13477N.m167345q(c2276t4M222088a);
            odx0VarM13477N.m167347s(d7x0Var.m114763c().m13404P());
            ndx0VarM13506N.m162803q((C2300w4) odx0VarM13477N.m185950m());
            if (cxw0Var.f84278a) {
                if (num != null) {
                    phw0.m172339a("Two primaries were set");
                    return null;
                }
                if (cxw0Var.f84279b != zww0Var) {
                    phw0.m172339a("Primary key is not enabled");
                    return null;
                }
                num = numValueOf;
            }
            c = 1;
        }
        if (num != null) {
            ndx0VarM13506N.m162804r(num.intValue());
            return hxw0.m137660b((C2308x4) ndx0VarM13506N.m185950m(), this.f96357b);
        }
        phw0.m172339a("No primary was set");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m123116d() {
        Iterator it = this.f96356a.iterator();
        while (it.hasNext()) {
            ((cxw0) it.next()).f84278a = false;
        }
    }
}
