package p149l;

import com.google.android.gms.internal.ads.C2253t4;
import com.google.android.gms.internal.ads.C2277w4;
import com.google.android.gms.internal.ads.C2285x4;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ynw0 {

    /* JADX INFO: renamed from: a */
    public final List f199241a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final h1x0 f199242b = h1x0.f105474b;

    /* JADX INFO: renamed from: c */
    public boolean f199243c = false;

    /* JADX INFO: renamed from: a */
    public final ynw0 m215468a(wnw0 wnw0Var) {
        if (wnw0Var.f187360f != null) {
            qkq0.m175383a("Entry has already been added to a KeysetHandle.Builder");
            return null;
        }
        if (wnw0Var.f187355a) {
            m215470d();
        }
        wnw0Var.f187360f = this;
        this.f199241a.add(wnw0Var);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final bow0 m215469b() throws GeneralSecurityException {
        int i;
        if (this.f199243c) {
            j8w0.m140474a("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        char c = 1;
        this.f199243c = true;
        List list = this.f199241a;
        h4x0 h4x0VarM13452N = C2285x4.m13452N();
        int i2 = 0;
        while (i2 < list.size() - 1) {
            int i3 = i2 + 1;
            if (((wnw0) list.get(i2)).f187359e == xnw0.f193765a && ((wnw0) list.get(i3)).f187359e != xnw0.f193765a) {
                j8w0.m140474a("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
            i2 = i3;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (wnw0 wnw0Var : this.f199241a) {
            tnw0 unused = wnw0Var.f187356b;
            if (wnw0Var.f187359e == null) {
                j8w0.m140474a("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            int i4 = 3;
            if (wnw0Var.f187359e == xnw0.f193765a) {
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
                xnw0 unused2 = wnw0Var.f187359e;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            wnw0.m204782a(wnw0Var);
            fow0 fow0Var = wnw0Var.f187358d;
            tnw0 tnw0VarM204790c = wnw0Var.m204790c();
            tnw0 tnw0Var = tnw0.f171289b;
            if (!tnw0Var.equals(tnw0VarM204790c)) {
                if (tnw0.f171290c.equals(tnw0VarM204790c)) {
                    i4 = 4;
                } else {
                    if (!tnw0.f171291d.equals(tnw0VarM204790c)) {
                        qkq0.m175383a("Unknown key status");
                        return null;
                    }
                    i4 = 5;
                }
            }
            xxw0 xxw0Var = (xxw0) (fow0Var instanceof lww0 ? ((lww0) fow0Var).m152019b() : dxw0.m114030d().m114035f(fow0Var, xxw0.class));
            C2253t4 c2253t4M189935a = tow0.m189935a(xxw0Var.m211571c());
            i4x0 i4x0VarM13423N = C2277w4.m13423N();
            i4x0VarM13423N.m134433r(i);
            i4x0VarM13423N.m134435t(i4);
            i4x0VarM13423N.m134432q(c2253t4M189935a);
            i4x0VarM13423N.m134434s(xxw0Var.m211571c().m13350P());
            h4x0VarM13452N.m129339q((C2277w4) i4x0VarM13423N.m153521m());
            if (wnw0Var.f187355a) {
                if (num != null) {
                    j8w0.m140474a("Two primaries were set");
                    return null;
                }
                if (wnw0Var.f187356b != tnw0Var) {
                    j8w0.m140474a("Primary key is not enabled");
                    return null;
                }
                num = numValueOf;
            }
            c = 1;
        }
        if (num != null) {
            h4x0VarM13452N.m129340r(num.intValue());
            return bow0.m102993b((C2285x4) h4x0VarM13452N.m153521m(), this.f199242b);
        }
        j8w0.m140474a("No primary was set");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m215470d() {
        Iterator it = this.f199241a.iterator();
        while (it.hasNext()) {
            ((wnw0) it.next()).f187355a = false;
        }
    }
}
