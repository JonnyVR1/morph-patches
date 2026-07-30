package p153l;

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
public final class yic0 extends AbstractC19998s7 {

    /* JADX INFO: renamed from: k */
    public static final int[] f200059k = {7, 5, 4, 3, 1};

    /* JADX INFO: renamed from: l */
    public static final int[] f200060l = {4, 20, 52, 104, 204};

    /* JADX INFO: renamed from: m */
    public static final int[] f200061m = {0, 348, 1388, 2948, 3988};

    /* JADX INFO: renamed from: n */
    public static final int[][] f200062n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* JADX INFO: renamed from: o */
    public static final int[][] f200063o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 7, 21, 63}, new int[]{CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 19, 57, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 91}, new int[]{62, CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256, 169, 85, 44, CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA}, new int[]{185, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA, 188, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 4, 12, 36, 108}, new int[]{113, 128, CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256}, new int[]{46, CipherSuite.TLS_PSK_WITH_RC4_128_SHA, 203, 187, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 206, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA}, new int[]{43, MMConstants.ERR_WATERMARK_READ, 176, 106, 107, 110, 119, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, 200, 178, 112, 125, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, new int[]{70, 210, 208, 202, 184, 130, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 115}, new int[]{134, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256, 151, 31, 93, 68, 204, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256}, new int[]{148, 22, 66, Opcodes.IFNULL, CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, Opcodes.IFNONNULL, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 160, 58, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 100, 89}};

    /* JADX INFO: renamed from: p */
    public static final int[][] f200064p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* JADX INFO: renamed from: g */
    public final List<dof> f200065g = new ArrayList(11);

    /* JADX INFO: renamed from: h */
    public final List<fof> f200066h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final int[] f200067i = new int[2];

    /* JADX INFO: renamed from: j */
    public boolean f200068j;

    /* JADX INFO: renamed from: A */
    public static boolean m216042A(Iterable<dof> iterable, Iterable<fof> iterable2) {
        for (fof fofVar : iterable2) {
            for (dof dofVar : iterable) {
                Iterator<dof> it = fofVar.m126452a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (dofVar.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m216043B(List<dof> list) {
        for (int[] iArr : f200064p) {
            if (list.size() <= iArr.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).m117196b().m146462c() == iArr[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D */
    public static void m216044D(List<dof> list, List<fof> list2) {
        Iterator<fof> it = list2.iterator();
        while (it.hasNext()) {
            fof next = it.next();
            if (next.m126452a().size() != list.size()) {
                Iterator<dof> it2 = next.m126452a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    dof next2 = it2.next();
                    Iterator<dof> it3 = list.iterator();
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
    public static void m216045F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* JADX INFO: renamed from: u */
    public static r5d0 m216046u(List<dof> list) throws NotFoundException, FormatException {
        String strMo114575d = AbstractC16467d7.m114572a(c13.m107520a(list)).mo114575d();
        s5d0[] s5d0VarArrM146460a = list.get(0).m117196b().m146460a();
        s5d0[] s5d0VarArrM146460a2 = list.get(list.size() - 1).m117196b().m146460a();
        return new r5d0(strMo114575d, null, new s5d0[]{s5d0VarArrM146460a[0], s5d0VarArrM146460a[1], s5d0VarArrM146460a2[0], s5d0VarArrM146460a2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    /* JADX INFO: renamed from: y */
    public static int m216047y(b13 b13Var, int i) {
        return b13Var.m101398f(i) ? b13Var.m101400k(b13Var.m101401l(i)) : b13Var.m101401l(b13Var.m101400k(i));
    }

    /* JADX INFO: renamed from: z */
    public static boolean m216048z(joi joiVar, boolean z, boolean z2) {
        return (joiVar.m146462c() == 0 && z && z2) ? false : true;
    }

    /* JADX INFO: renamed from: C */
    public final joi m216049C(b13 b13Var, int i, boolean z) {
        int i2;
        int iM101401l;
        int i3;
        int[] iArr = this.f200067i;
        if (z) {
            int i4 = iArr[0] - 1;
            while (i4 >= 0 && !b13Var.m101398f(i4)) {
                i4--;
            }
            i2 = i4 + 1;
            int[] iArr2 = this.f200067i;
            i3 = iArr2[0] - i2;
            iM101401l = iArr2[1];
        } else {
            i2 = iArr[0];
            iM101401l = b13Var.m101401l(iArr[1] + 1);
            i3 = iM101401l - this.f200067i[1];
        }
        int i5 = iM101401l;
        int i6 = i2;
        int[] iArrM184935i = m184935i();
        System.arraycopy(iArrM184935i, 0, iArrM184935i, 1, iArrM184935i.length - 1);
        iArrM184935i[0] = i3;
        try {
            return new joi(AbstractC19998s7.m184933p(iArrM184935i, f200062n), new int[]{i6, i5}, i6, i5, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public dof m216050E(b13 b13Var, List<dof> list, int i) throws NotFoundException {
        joi joiVarM216049C;
        q5c q5cVarM216056v;
        boolean z = list.size() % 2 == 0;
        if (this.f200068j) {
            z = !z;
        }
        int iM216047y = -1;
        boolean z2 = true;
        do {
            m216058x(b13Var, list, iM216047y);
            joiVarM216049C = m216049C(b13Var, i, z);
            if (joiVarM216049C == null) {
                iM216047y = m216047y(b13Var, this.f200067i[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        q5c q5cVarM216056v2 = m216056v(b13Var, joiVarM216049C, z, true);
        if (!list.isEmpty() && list.get(list.size() - 1).m117199f()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            q5cVarM216056v = m216056v(b13Var, joiVarM216049C, z, false);
        } catch (NotFoundException unused) {
            q5cVarM216056v = null;
        }
        return new dof(q5cVarM216056v2, q5cVarM216056v, joiVarM216049C, true);
    }

    /* JADX INFO: renamed from: G */
    public final void m216051G(int i, boolean z) {
        boolean zM126454c = false;
        int i2 = 0;
        boolean zM126454c2 = false;
        while (i2 < this.f200066h.size()) {
            fof fofVar = this.f200066h.get(i2);
            int iM126453b = fofVar.m126453b();
            List<dof> list = this.f200065g;
            if (iM126453b > i) {
                zM126454c = fofVar.m126454c(list);
                break;
            } else {
                zM126454c2 = fofVar.m126454c(list);
                i2++;
            }
        }
        if (zM126454c || zM126454c2 || m216042A(this.f200065g, this.f200066h)) {
            return;
        }
        this.f200066h.add(i2, new fof(this.f200065g, i, z));
        m216044D(this.f200065g, this.f200066h);
    }

    @Override // p153l.sp50
    /* JADX INFO: renamed from: b */
    public r5d0 mo99812b(int i, b13 b13Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.f200065g.clear();
        this.f200068j = false;
        try {
            return m216046u(m216057w(i, b13Var));
        } catch (NotFoundException unused) {
            this.f200065g.clear();
            this.f200068j = true;
            return m216046u(m216057w(i, b13Var));
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
    public final void m216052q(int i) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int iM140046d = ihx.m140046d(m184938l());
        int iM140046d2 = ihx.m140046d(m184936j());
        boolean z5 = true;
        if (iM140046d > 13) {
            z2 = true;
            z = false;
        } else if (iM140046d < 4) {
            z = true;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        if (iM140046d2 > 13) {
            z4 = true;
            z3 = false;
        } else if (iM140046d2 < 4) {
            z3 = true;
            z4 = false;
        } else {
            z3 = false;
            z4 = false;
        }
        int i2 = (iM140046d + iM140046d2) - i;
        boolean z6 = (iM140046d & 1) == 1;
        boolean z7 = (iM140046d2 & 1) == 0;
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
                    if (iM140046d < iM140046d2) {
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
                AbstractC19998s7.m184931n(m184938l(), m184939m());
            }
            if (z2) {
                AbstractC19998s7.m184930g(m184938l(), m184939m());
            }
            if (z3) {
                if (!z4) {
                    throw NotFoundException.getNotFoundInstance();
                }
                AbstractC19998s7.m184931n(m184936j(), m184939m());
            }
            if (z4) {
                AbstractC19998s7.m184930g(m184936j(), m184937k());
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
            AbstractC19998s7.m184931n(m184938l(), m184939m());
        }
        if (z2) {
            AbstractC19998s7.m184930g(m184938l(), m184939m());
        }
        if (z3) {
            if (!z4) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractC19998s7.m184931n(m184936j(), m184939m());
        }
        if (z4) {
            AbstractC19998s7.m184930g(m184936j(), m184937k());
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m216053r() {
        dof dofVar = this.f200065g.get(0);
        q5c q5cVarM117197c = dofVar.m117197c();
        q5c q5cVarM117198d = dofVar.m117198d();
        if (q5cVarM117198d == null) {
            return false;
        }
        int iM175347a = q5cVarM117198d.m175347a();
        int i = 2;
        for (int i2 = 1; i2 < this.f200065g.size(); i2++) {
            dof dofVar2 = this.f200065g.get(i2);
            iM175347a += dofVar2.m117197c().m175347a();
            int i3 = i + 1;
            q5c q5cVarM117198d2 = dofVar2.m117198d();
            if (q5cVarM117198d2 != null) {
                iM175347a += q5cVarM117198d2.m175347a();
                i += 2;
            } else {
                i = i3;
            }
        }
        return ((i + (-4)) * Primes.SMALL_FACTOR_LIMIT) + (iM175347a % Primes.SMALL_FACTOR_LIMIT) == q5cVarM117197c.m175348b();
    }

    @Override // p153l.sp50, p153l.fmc0
    public void reset() {
        this.f200065g.clear();
        this.f200066h.clear();
    }

    /* JADX INFO: renamed from: s */
    public final List<dof> m216054s(List<fof> list, int i) throws NotFoundException {
        while (i < this.f200066h.size()) {
            fof fofVar = this.f200066h.get(i);
            this.f200065g.clear();
            Iterator<fof> it = list.iterator();
            while (it.hasNext()) {
                this.f200065g.addAll(it.next().m126452a());
            }
            this.f200065g.addAll(fofVar.m126452a());
            if (m216043B(this.f200065g)) {
                if (this.m216053r()) {
                    return this.f200065g;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(fofVar);
                try {
                    return this.m216054s(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: t */
    public final List<dof> m216055t(boolean z) {
        List<dof> listM216054s = null;
        if (this.f200066h.size() > 25) {
            this.f200066h.clear();
            return null;
        }
        this.f200065g.clear();
        if (z) {
            Collections.reverse(this.f200066h);
        }
        try {
            listM216054s = m216054s(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.f200066h);
        }
        return listM216054s;
    }

    /* JADX INFO: renamed from: v */
    public q5c m216056v(b13 b13Var, joi joiVar, boolean z, boolean z2) throws NotFoundException {
        int[] iArrM184934h = m184934h();
        for (int i = 0; i < iArrM184934h.length; i++) {
            iArrM184934h[i] = 0;
        }
        if (z2) {
            sp50.m187326f(b13Var, joiVar.m146461b()[0], iArrM184934h);
        } else {
            sp50.m187325e(b13Var, joiVar.m146461b()[1], iArrM184934h);
            int i2 = 0;
            for (int length = iArrM184934h.length - 1; i2 < length; length--) {
                int i3 = iArrM184934h[i2];
                iArrM184934h[i2] = iArrM184934h[length];
                iArrM184934h[length] = i3;
                i2++;
            }
        }
        float fM140046d = ihx.m140046d(iArrM184934h) / 17.0f;
        float f = (joiVar.m146461b()[1] - joiVar.m146461b()[0]) / 15.0f;
        if (Math.abs(fM140046d - f) / f > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] iArrM184938l = m184938l();
        int[] iArrM184936j = m184936j();
        float[] fArrM184939m = m184939m();
        float[] fArrM184937k = m184937k();
        for (int i4 = 0; i4 < iArrM184934h.length; i4++) {
            float f2 = (iArrM184934h[i4] * 1.0f) / fM140046d;
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
                iArrM184938l[i6] = i5;
                fArrM184939m[i6] = f2 - i5;
            } else {
                iArrM184936j[i6] = i5;
                fArrM184937k[i6] = f2 - i5;
            }
        }
        m216052q(17);
        int iM146462c = (((joiVar.m146462c() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i7 = 0;
        int i8 = 0;
        for (int length2 = iArrM184938l.length - 1; length2 >= 0; length2--) {
            if (m216048z(joiVar, z, z2)) {
                i7 += iArrM184938l[length2] * f200063o[iM146462c][length2 * 2];
            }
            i8 += iArrM184938l[length2];
        }
        int i9 = 0;
        for (int length3 = iArrM184936j.length - 1; length3 >= 0; length3--) {
            if (m216048z(joiVar, z, z2)) {
                i9 += iArrM184936j[length3] * f200063o[iM146462c][(length3 * 2) + 1];
            }
        }
        int i10 = i7 + i9;
        if ((i8 & 1) != 0 || i8 > 13 || i8 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i11 = (13 - i8) / 2;
        int i12 = f200059k[i11];
        return new q5c((zic0.m219727b(iArrM184938l, i12, true) * f200060l[i11]) + zic0.m219727b(iArrM184936j, 9 - i12, false) + f200061m[i11], i10);
    }

    /* JADX INFO: renamed from: w */
    public List<dof> m216057w(int i, b13 b13Var) throws NotFoundException {
        boolean z = false;
        while (!z) {
            try {
                List<dof> list = this.f200065g;
                list.add(m216050E(b13Var, list, i));
            } catch (NotFoundException e) {
                if (this.f200065g.isEmpty()) {
                    throw e;
                }
                z = true;
            }
        }
        if (m216053r()) {
            return this.f200065g;
        }
        boolean zIsEmpty = this.f200066h.isEmpty();
        m216051G(i, false);
        if (!zIsEmpty) {
            List<dof> listM216055t = m216055t(false);
            if (listM216055t != null) {
                return listM216055t;
            }
            List<dof> listM216055t2 = m216055t(true);
            if (listM216055t2 != null) {
                return listM216055t2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: x */
    public final void m216058x(b13 b13Var, List<dof> list, int i) throws NotFoundException {
        int[] iArrM184935i = m184935i();
        iArrM184935i[0] = 0;
        iArrM184935i[1] = 0;
        iArrM184935i[2] = 0;
        iArrM184935i[3] = 0;
        int iM101402m = b13Var.m101402m();
        if (i < 0) {
            i = list.isEmpty() ? 0 : list.get(list.size() - 1).m117196b().m146461b()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.f200068j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < iM101402m) {
            boolean zM101398f = b13Var.m101398f(i);
            boolean z3 = !zM101398f;
            if (zM101398f) {
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
        while (i < iM101402m) {
            if (b13Var.m101398f(i) != z4) {
                iArrM184935i[i2] = iArrM184935i[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        m216045F(iArrM184935i);
                    }
                    if (AbstractC19998s7.m184932o(iArrM184935i)) {
                        int[] iArr = this.f200067i;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m216045F(iArrM184935i);
                    }
                    i3 += iArrM184935i[0] + iArrM184935i[1];
                    iArrM184935i[0] = iArrM184935i[2];
                    iArrM184935i[1] = iArrM184935i[3];
                    iArrM184935i[2] = 0;
                    iArrM184935i[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArrM184935i[i2] = 1;
                z4 = !z4;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
