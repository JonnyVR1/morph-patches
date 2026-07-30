package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kwy0 extends nwy0 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public jwy0 f125040c;

    @Override // p149l.nwy0
    /* JADX INFO: renamed from: e */
    public final owy0 mo147668e(u5y0[] u5y0VarArr, kty0 kty0Var, eqy0 eqy0Var, xqt0 xqt0Var) throws zziz {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        ntt0[][] ntt0VarArr = new ntt0[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = kty0Var.f124629a;
            ntt0VarArr[i] = new ntt0[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = u5y0VarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < kty0Var.f124629a) {
            ntt0 ntt0VarM147224b = kty0Var.m147224b(i5);
            int i6 = ntt0VarM147224b.f140537c;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                u5y0 u5y0Var = u5y0VarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 <= 0; i10++) {
                    iMax = Math.max(iMax, u5y0Var.mo117322l(ntt0VarM147224b.m161414b(i10)) & 7);
                }
                boolean z3 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = iMax;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[1];
            } else {
                u5y0 u5y0Var2 = u5y0VarArr[i7];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = u5y0Var2.mo117322l(ntt0VarM147224b.m161414b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            ntt0VarArr[i7][i12] = ntt0VarM147224b;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i5++;
            i3 = 2;
        }
        kty0[] kty0VarArr = new kty0[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        while (i13 < i3) {
            int i14 = iArr2[i13];
            kty0VarArr[i13] = new kty0((ntt0[]) ggw0.m126070l(ntt0VarArr[i13], i14));
            iArr3[i13] = (int[][]) ggw0.m126070l(iArr3[i13], i14);
            strArr[i13] = u5y0VarArr[i13].mo100005e();
            iArr6[i13] = u5y0VarArr[i13].mo146606c();
            i13++;
            i3 = 2;
        }
        int i15 = i3;
        jwy0 jwy0Var = new jwy0(strArr, iArr6, kty0VarArr, iArr4, iArr3, new kty0((ntt0[]) ggw0.m126070l(ntt0VarArr[i15], iArr2[i15])));
        Pair pairMo123592j = mo123592j(jwy0Var, iArr3, iArr4, eqy0Var, xqt0Var);
        lwy0[] lwy0VarArr = (lwy0[]) pairMo123592j.second;
        List[] listArr = new List[lwy0VarArr.length];
        for (int i16 = 0; i16 < lwy0VarArr.length; i16++) {
            lwy0 lwy0Var = lwy0VarArr[i16];
            listArr[i16] = lwy0Var != null ? zzgaa.zzm(lwy0Var) : zzgaa.zzl();
        }
        ghw0 ghw0Var = new ghw0();
        for (int i17 = 0; i17 < 2; i17++) {
            kty0 kty0VarM143698d = jwy0Var.m143698d(i17);
            List list = listArr[i17];
            for (int i18 = 0; i18 < kty0VarM143698d.f124629a; i18++) {
                ntt0 ntt0VarM147224b2 = kty0VarM143698d.m147224b(i18);
                boolean z4 = jwy0Var.m143695a(i17, i18, false) != 0;
                int i19 = ntt0VarM147224b2.f140535a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr7[i20] = jwy0Var.m143696b(i17, i18, i20) & 7;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            z = false;
                            break;
                        }
                        lwy0 lwy0Var2 = (lwy0) list.get(i21);
                        if (lwy0Var2.zze().equals(ntt0VarM147224b2) && lwy0Var2.mo132765e(i20) != -1) {
                            z = true;
                            break;
                        }
                        i21++;
                    }
                    zArr[i20] = z;
                }
                ghw0Var.m126240g(new g7u0(ntt0VarM147224b2, z4, iArr7, zArr));
            }
        }
        kty0 kty0VarM143699e = jwy0Var.m143699e();
        for (int i22 = 0; i22 < kty0VarM143699e.f124629a; i22++) {
            ntt0 ntt0VarM147224b3 = kty0VarM143699e.m147224b(i22);
            int i23 = ntt0VarM147224b3.f140535a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            ghw0Var.m126240g(new g7u0(ntt0VarM147224b3, false, iArr8, new boolean[1]));
        }
        return new owy0((x5y0[]) pairMo123592j.first, (hwy0[]) pairMo123592j.second, new o8u0(ghw0Var.m126243j()), jwy0Var);
    }

    @Override // p149l.nwy0
    /* JADX INFO: renamed from: f */
    public final void mo147669f(@Nullable Object obj) {
        this.f125040c = (jwy0) obj;
    }

    /* JADX INFO: renamed from: j */
    public abstract Pair mo123592j(jwy0 jwy0Var, int[][][] iArr, int[] iArr2, eqy0 eqy0Var, xqt0 xqt0Var) throws zziz;
}
