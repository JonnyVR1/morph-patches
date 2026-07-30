package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.android.gms.internal.ads.zziz;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q5z0 extends t5z0 {

    /* JADX INFO: renamed from: c */
    @Nullable
    public p5z0 f155776c;

    @Override // p153l.t5z0
    /* JADX INFO: renamed from: e */
    public final u5z0 mo175537e(afy0[] afy0VarArr, q2z0 q2z0Var, kzy0 kzy0Var, d0u0 d0u0Var) throws zziz {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        t2u0[][] t2u0VarArr = new t2u0[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = q2z0Var.f155401a;
            t2u0VarArr[i] = new t2u0[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = afy0VarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < q2z0Var.f155401a) {
            t2u0 t2u0VarM175102b = q2z0Var.m175102b(i5);
            int i6 = t2u0VarM175102b.f171822c;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                afy0 afy0Var = afy0VarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 <= 0; i10++) {
                    iMax = Math.max(iMax, afy0Var.mo97572l(t2u0VarM175102b.m189003b(i10)) & 7);
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
                afy0 afy0Var2 = afy0VarArr[i7];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = afy0Var2.mo97572l(t2u0VarM175102b.m189003b(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i7];
            t2u0VarArr[i7][i12] = t2u0VarM175102b;
            iArr3[i7][i12] = iArr;
            iArr2[i7] = i12 + 1;
            i5++;
            i3 = 2;
        }
        q2z0[] q2z0VarArr = new q2z0[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        while (i13 < i3) {
            int i14 = iArr2[i13];
            q2z0VarArr[i13] = new q2z0((t2u0[]) mpw0.m159414l(t2u0VarArr[i13], i14));
            iArr3[i13] = (int[][]) mpw0.m159414l(iArr3[i13], i14);
            strArr[i13] = afy0VarArr[i13].mo97571e();
            iArr6[i13] = afy0VarArr[i13].mo97570c();
            i13++;
            i3 = 2;
        }
        int i15 = i3;
        p5z0 p5z0Var = new p5z0(strArr, iArr6, q2z0VarArr, iArr4, iArr3, new q2z0((t2u0[]) mpw0.m159414l(t2u0VarArr[i15], iArr2[i15])));
        Pair pairMo153041j = mo153041j(p5z0Var, iArr3, iArr4, kzy0Var, d0u0Var);
        r5z0[] r5z0VarArr = (r5z0[]) pairMo153041j.second;
        List[] listArr = new List[r5z0VarArr.length];
        for (int i16 = 0; i16 < r5z0VarArr.length; i16++) {
            r5z0 r5z0Var = r5z0VarArr[i16];
            listArr[i16] = r5z0Var != null ? zzgaa.zzm(r5z0Var) : zzgaa.zzl();
        }
        mqw0 mqw0Var = new mqw0();
        for (int i17 = 0; i17 < 2; i17++) {
            q2z0 q2z0VarM170704d = p5z0Var.m170704d(i17);
            List list = listArr[i17];
            for (int i18 = 0; i18 < q2z0VarM170704d.f155401a; i18++) {
                t2u0 t2u0VarM175102b2 = q2z0VarM170704d.m175102b(i18);
                boolean z4 = p5z0Var.m170701a(i17, i18, false) != 0;
                int i19 = t2u0VarM175102b2.f171820a;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr7[i20] = p5z0Var.m170702b(i17, i18, i20) & 7;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            z = false;
                            break;
                        }
                        r5z0 r5z0Var2 = (r5z0) list.get(i21);
                        if (r5z0Var2.zze().equals(t2u0VarM175102b2) && r5z0Var2.mo161038e(i20) != -1) {
                            z = true;
                            break;
                        }
                        i21++;
                    }
                    zArr[i20] = z;
                }
                mqw0Var.m159613g(new mgu0(t2u0VarM175102b2, z4, iArr7, zArr));
            }
        }
        q2z0 q2z0VarM170705e = p5z0Var.m170705e();
        for (int i22 = 0; i22 < q2z0VarM170705e.f155401a; i22++) {
            t2u0 t2u0VarM175102b3 = q2z0VarM170705e.m175102b(i22);
            int i23 = t2u0VarM175102b3.f171820a;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            mqw0Var.m159613g(new mgu0(t2u0VarM175102b3, false, iArr8, new boolean[1]));
        }
        return new u5z0((dfy0[]) pairMo153041j.first, (n5z0[]) pairMo153041j.second, new uhu0(mqw0Var.m159616j()), p5z0Var);
    }

    @Override // p153l.t5z0
    /* JADX INFO: renamed from: f */
    public final void mo175538f(@Nullable Object obj) {
        this.f155776c = (p5z0) obj;
    }

    /* JADX INFO: renamed from: j */
    public abstract Pair mo153041j(p5z0 p5z0Var, int[][][] iArr, int[] iArr2, kzy0 kzy0Var, d0u0 d0u0Var) throws zziz;
}
