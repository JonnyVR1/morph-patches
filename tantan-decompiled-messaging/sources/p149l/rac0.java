package p149l;

import com.alibaba.fastjson.asm.Opcodes;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.momo.momortc.MMConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.Primes;

/* JADX INFO: loaded from: classes7.dex */
public final class rac0 extends AbstractC21038x7 {

    /* JADX INFO: renamed from: k */
    public static final int[] f158501k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l */
    public static final int[] f158502l = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: m */
    public static final int[] f158503m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n */
    public static final int[][] f158504n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o */
    public static final int[][] f158505o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 7, 21, 63}, new int[]{CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 19, 57, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 91}, new int[]{62, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 169, 85, 44, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA}, new int[]{185, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 188, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 4, 12, 36, 108}, new int[]{113, 128, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256}, new int[]{46, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 203, 187, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 206, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA}, new int[]{43, MMConstants.ERR_WATERMARK_READ, 176, 106, 107, 110, 119, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 200, 178, 112, 125, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, new int[]{70, 210, 208, 202, 184, 130, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 115}, new int[]{134, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 151, 31, 93, 68, 204, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256}, new int[]{148, 22, 66, Opcodes.IFNULL, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, Opcodes.IFNONNULL, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 160, 58, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 100, 89}};

    /* JADX INFO: renamed from: p */
    public static final int[][] f158506p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g */
    public final List<xmf> f158507g = new ArrayList(11);

    /* JADX INFO: renamed from: h */
    public final List<zmf> f158508h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final int[] f158509i = new int[2];

    /* JADX INFO: renamed from: j */
    public boolean f158510j;

    /* JADX INFO: renamed from: A */
    public static boolean m178475A(Iterable<xmf> iterable, Iterable<zmf> iterable2) {
        for (zmf zmfVar : iterable2) {
            for (xmf xmfVar : iterable) {
                Iterator<xmf> it = zmfVar.m219323a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (xmfVar.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m178476B(List<xmf> list) {
        for (int[] iArr : f158506p) {
            if (list.size() <= iArr.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).m210122b().m160057c() == iArr[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static void m178477D(List<xmf> list, List<zmf> list2) {
        Iterator<zmf> it = list2.iterator();
        while (it.hasNext()) {
            zmf next = it.next();
            if (next.m219323a().size() != list.size()) {
                Iterator<xmf> it2 = next.m219323a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    xmf next2 = it2.next();
                    Iterator<xmf> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (!next2.equals(it3.next()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m178478F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* JADX INFO: renamed from: u */
    public static oxc0 m178479u(List<xmf> list) throws NotFoundException, FormatException {
        String strMo117968d = AbstractC17501i7.m134716a(n03.m157192a(list)).mo117968d();
        pxc0[] pxc0VarArrM160055a = list.get(0).m210122b().m160055a();
        pxc0[] pxc0VarArrM160055a2 = list.get(list.size() - 1).m210122b().m160055a();
        return new oxc0(strMo117968d, null, new pxc0[]{pxc0VarArrM160055a[0], pxc0VarArrM160055a[1], pxc0VarArrM160055a2[0], pxc0VarArrM160055a2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* JADX INFO: renamed from: y */
    public static int m178480y(m03 m03Var, int i) {
        return m03Var.m152490f(i) ? m03Var.m152492k(m03Var.m152493l(i)) : m03Var.m152493l(m03Var.m152492k(i));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m178481z(nli nliVar, boolean z, boolean z2) {
        return (nliVar.m160057c() == 0 && z && z2) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final nli m178482C(m03 m03Var, int i, boolean z) {
        int i2;
        int iM152493l;
        int i3;
        int[] iArr = this.f158509i;
        if (z) {
            int i4 = iArr[0] - 1;
            while (i4 >= 0 && !m03Var.m152490f(i4)) {
                i4--;
            }
            i2 = i4 + 1;
            int[] iArr2 = this.f158509i;
            i3 = iArr2[0] - i2;
            iM152493l = iArr2[1];
        } else {
            i2 = iArr[0];
            iM152493l = m03Var.m152493l(iArr[1] + 1);
            i3 = iM152493l - this.f158509i[1];
        }
        int i5 = iM152493l;
        int i6 = i2;
        int[] iArrM207225i = m207225i();
        System.arraycopy(iArrM207225i, 0, iArrM207225i, 1, iArrM207225i.length - 1);
        iArrM207225i[0] = i3;
        try {
            return new nli(AbstractC21038x7.m207223p(iArrM207225i, f158504n), new int[]{i6, i5}, i6, i5, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public xmf m178483E(m03 m03Var, List<xmf> list, int i) throws NotFoundException {
        nli nliVarM178482C;
        i4c i4cVarM178489v;
        boolean z = list.size() % 2 == 0;
        if (this.f158510j) {
            z = !z;
        }
        int iM178480y = -1;
        boolean z2 = true;
        do {
            m178491x(m03Var, list, iM178480y);
            nliVarM178482C = m178482C(m03Var, i, z);
            if (nliVarM178482C == null) {
                iM178480y = m178480y(m03Var, this.f158509i[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        i4c i4cVarM178489v2 = m178489v(m03Var, nliVarM178482C, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m210125f()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            i4cVarM178489v = m178489v(m03Var, nliVarM178482C, z, false);
        } catch (NotFoundException unused) {
            i4cVarM178489v = null;
        }
        return new xmf(i4cVarM178489v2, i4cVarM178489v, nliVarM178482C, true);
    }

    /* JADX INFO: renamed from: G */
    public final void m178484G(int i, boolean z) {
        boolean zM219325c = false;
        int i2 = 0;
        boolean zM219325c2 = false;
        while (i2 < this.f158508h.size()) {
            zmf zmfVar = this.f158508h.get(i2);
            int iM219324b = zmfVar.m219324b();
            List<xmf> list = this.f158507g;
            if (iM219324b > i) {
                zM219325c = zmfVar.m219325c(list);
                break;
            } else {
                zM219325c2 = zmfVar.m219325c(list);
                i2++;
            }
        }
        if (zM219325c || zM219325c2 || m178475A(this.f158507g, this.f158508h)) {
            return;
        }
        this.f158508h.add(i2, new zmf(this.f158507g, i, z));
        m178477D(this.f158507g, this.f158508h);
    }

    @Override // p149l.mh50
    /* JADX INFO: renamed from: b */
    public oxc0 mo100271b(int i, m03 m03Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f158507g.clear();
        this.f158510j = false;
        try {
            return m178479u(m178490w(i, m03Var));
        } catch (NotFoundException unused) {
            this.f158507g.clear();
            this.f158510j = true;
            return m178479u(m178490w(i, m03Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: q */
    public final void m178485q(int i) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iM141165d = jex.m141165d(m207228l());
        int iM141165d2 = jex.m141165d(m207226j());
        boolean z5 = true;
        if (iM141165d > 13) {
            z2 = true;
            z = false;
        } else if (iM141165d < 4) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        if (iM141165d2 > 13) {
            z4 = true;
            z3 = false;
        } else if (iM141165d2 < 4) {
            z3 = true;
            z4 = false;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (iM141165d + iM141165d2) - i;
        boolean z6 = (iM141165d & 1) == 1;
        boolean z7 = (iM141165d2 & 1) == 0;
        if (i2 != 1) {
            if (i2 == -1) {
                if (z6) {
                    if (z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else {
                    if (!z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    z3 = true;
                }
            } else {
                if (i2 != 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (z6) {
                    if (!z7) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (iM141165d < iM141165d2) {
                        z4 = true;
                    } else {
                        z3 = true;
                        z2 = true;
                    }
                } else if (z7) {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z5) {
                if (!z2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC21038x7.m207221n(m207228l(), m207229m());
            }
            if (z2) {
                AbstractC21038x7.m207220g(m207228l(), m207229m());
            }
            if (z3) {
                if (!z4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC21038x7.m207221n(m207226j(), m207229m());
            }
            if (z4) {
                AbstractC21038x7.m207220g(m207226j(), m207227k());
            }
        }
        if (z6) {
            if (z7) {
                throw NotFoundException.getNotFoundInstance();
            }
            z2 = true;
        } else {
            if (!z7) {
                throw NotFoundException.getNotFoundInstance();
            }
            z4 = true;
        }
        z5 = z;
        if (z5) {
            if (!z2) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC21038x7.m207221n(m207228l(), m207229m());
        }
        if (z2) {
            AbstractC21038x7.m207220g(m207228l(), m207229m());
        }
        if (z3) {
            if (!z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC21038x7.m207221n(m207226j(), m207229m());
        }
        if (z4) {
            AbstractC21038x7.m207220g(m207226j(), m207227k());
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m178486r() {
        xmf xmfVar = this.f158507g.get(0);
        i4c i4cVarM210123c = xmfVar.m210123c();
        i4c i4cVarM210124d = xmfVar.m210124d();
        if (i4cVarM210124d == null) {
            return false;
        }
        int iM134323a = i4cVarM210124d.m134323a();
        int i = 2;
        for (int i2 = 1; i2 < this.f158507g.size(); i2++) {
            xmf xmfVar2 = this.f158507g.get(i2);
            iM134323a += xmfVar2.m210123c().m134323a();
            int i3 = i + 1;
            i4c i4cVarM210124d2 = xmfVar2.m210124d();
            if (i4cVarM210124d2 != null) {
                iM134323a += i4cVarM210124d2.m134323a();
                i += 2;
            } else {
                i = i3;
            }
        }
        return ((i + (-4)) * Primes.SMALL_FACTOR_LIMIT) + (iM134323a % Primes.SMALL_FACTOR_LIMIT) == i4cVarM210123c.m134324b();
    }

    @Override // p149l.mh50, p149l.ydc0
    public void reset() {
        this.f158507g.clear();
        this.f158508h.clear();
    }

    /* JADX INFO: renamed from: s */
    public final List<xmf> m178487s(List<zmf> list, int i) throws NotFoundException {
        while (i < this.f158508h.size()) {
            zmf zmfVar = this.f158508h.get(i);
            this.f158507g.clear();
            Iterator<zmf> it = list.iterator();
            while (it.hasNext()) {
                this.f158507g.addAll(it.next().m219323a());
            }
            this.f158507g.addAll(zmfVar.m219323a());
            if (m178476B(this.f158507g)) {
                if (this.m178486r()) {
                    return this.f158507g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(zmfVar);
                try {
                    return this.m178487s(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: t */
    public final List<xmf> m178488t(boolean z) {
        List<xmf> listM178487s = null;
        if (this.f158508h.size() > 25) {
            this.f158508h.clear();
            return null;
        }
        this.f158507g.clear();
        if (z) {
            Collections.reverse(this.f158508h);
        }
        try {
            listM178487s = m178487s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f158508h);
        }
        return listM178487s;
    }

    /* JADX INFO: renamed from: v */
    public i4c m178489v(m03 m03Var, nli nliVar, boolean z, boolean z2) throws NotFoundException {
        int[] iArrM207224h = m207224h();
        for (int i = 0; i < iArrM207224h.length; i++) {
            iArrM207224h[i] = 0;
        }
        if (z2) {
            mh50.m154611f(m03Var, nliVar.m160056b()[0], iArrM207224h);
        } else {
            mh50.m154610e(m03Var, nliVar.m160056b()[1], iArrM207224h);
            int i2 = 0;
            for (int length = iArrM207224h.length - 1; i2 < length; length--) {
                int i3 = iArrM207224h[i2];
                iArrM207224h[i2] = iArrM207224h[length];
                iArrM207224h[length] = i3;
                i2++;
            }
        }
        float fM141165d = jex.m141165d(iArrM207224h) / 17.0f;
        float f = (nliVar.m160056b()[1] - nliVar.m160056b()[0]) / 15.0f;
        if (Math.abs(fM141165d - f) / f > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] iArrM207228l = m207228l();
        int[] iArrM207226j = m207226j();
        float[] fArrM207229m = m207229m();
        float[] fArrM207227k = m207227k();
        for (int i4 = 0; i4 < iArrM207224h.length; i4++) {
            float f2 = (iArrM207224h[i4] * 1.0f) / fM141165d;
            int i5 = (int) (0.5f + f2);
            if (i5 <= 0) {
                if (f2 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 1;
            } else if (i5 > 8) {
                if (f2 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                iArrM207228l[i6] = i5;
                fArrM207229m[i6] = f2 - i5;
            } else {
                iArrM207226j[i6] = i5;
                fArrM207227k[i6] = f2 - i5;
            }
        }
        m178485q(17);
        int iM160057c = (((nliVar.m160057c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i7 = 0;
        int i8 = 0;
        for (int length2 = iArrM207228l.length - 1; length2 >= 0; length2--) {
            if (m178481z(nliVar, z, z2)) {
                i7 += iArrM207228l[length2] * f158505o[iM160057c][length2 * 2];
            }
            i8 += iArrM207228l[length2];
        }
        int i9 = 0;
        for (int length3 = iArrM207226j.length - 1; length3 >= 0; length3--) {
            if (m178481z(nliVar, z, z2)) {
                i9 += iArrM207226j[length3] * f158505o[iM160057c][(length3 * 2) + 1];
            }
        }
        int i10 = i7 + i9;
        if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = (13 - i8) / 2;
        int i12 = f158501k[i11];
        return new i4c((sac0.m182908b(iArrM207228l, i12, true) * f158502l[i11]) + sac0.m182908b(iArrM207226j, 9 - i12, false) + f158503m[i11], i10);
    }

    /* JADX INFO: renamed from: w */
    public List<xmf> m178490w(int i, m03 m03Var) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<xmf> list = this.f158507g;
                list.add(m178483E(m03Var, list, i));
            } catch (NotFoundException e) {
                if (this.f158507g.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (m178486r()) {
            return this.f158507g;
        }
        boolean zIsEmpty = this.f158508h.isEmpty();
        m178484G(i, false);
        if (!zIsEmpty) {
            List<xmf> listM178488t = m178488t(false);
            if (listM178488t != null) {
                return listM178488t;
            }
            List<xmf> listM178488t2 = m178488t(true);
            if (listM178488t2 != null) {
                return listM178488t2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: x */
    public final void m178491x(m03 m03Var, List<xmf> list, int i) throws NotFoundException {
        int[] iArrM207225i = m207225i();
        iArrM207225i[0] = 0;
        iArrM207225i[1] = 0;
        iArrM207225i[2] = 0;
        iArrM207225i[3] = 0;
        int iM152494m = m03Var.m152494m();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).m210122b().m160056b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f158510j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < iM152494m) {
            boolean zM152490f = m03Var.m152490f(i);
            boolean z3 = !zM152490f;
            if (zM152490f) {
                z2 = z3;
                break;
            } else {
                i++;
                z2 = z3;
            }
        }
        int i2 = 0;
        boolean z4 = z2;
        int i3 = i;
        while (i < iM152494m) {
            if (m03Var.m152490f(i) != z4) {
                iArrM207225i[i2] = iArrM207225i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m178478F(iArrM207225i);
                    }
                    if (AbstractC21038x7.m207222o(iArrM207225i)) {
                        int[] iArr = this.f158509i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m178478F(iArrM207225i);
                    }
                    i3 += iArrM207225i[0] + iArrM207225i[1];
                    iArrM207225i[0] = iArrM207225i[2];
                    iArrM207225i[1] = iArrM207225i[3];
                    iArrM207225i[2] = 0;
                    iArrM207225i[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArrM207225i[i2] = 1;
                z4 = !z4;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
