package p149l;

import com.google.android.gms.internal.ads.AbstractC2116c3;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class qty0 extends iuy0 {

    /* JADX INFO: renamed from: f */
    public final vwy0 f156409f;

    /* JADX INFO: renamed from: g */
    public final zzgaa f156410g;

    /* JADX INFO: renamed from: h */
    public final g6v0 f156411h;

    public qty0(ntt0 ntt0Var, int[] iArr, int i, vwy0 vwy0Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, g6v0 g6v0Var) {
        super(ntt0Var, iArr, 0);
        this.f156409f = vwy0Var;
        this.f156410g = zzgaa.zzj(list);
        this.f156411h = g6v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ zzgaa m176489a(gwy0[] gwy0VarArr) {
        int i;
        int i2;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                break;
            }
            gwy0 gwy0Var = gwy0VarArr[i4];
            if (gwy0Var == null || gwy0Var.f104803b.length <= 1) {
                arrayList.add(null);
            } else {
                ghw0 ghw0Var = new ghw0();
                ghw0Var.m126240g(new oty0(0L, 0L));
                arrayList.add(ghw0Var);
            }
            i4++;
        }
        long[][] jArr2 = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            gwy0 gwy0Var2 = gwy0VarArr[i5];
            if (gwy0Var2 == null) {
                jArr2[i5] = new long[0];
            } else {
                jArr2[i5] = new long[gwy0Var2.f104803b.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = gwy0Var2.f104803b;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j = gwy0Var2.f104802a.m161414b(iArr[i6]).f133888h;
                    long[] jArr3 = jArr2[i5];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i6] = j;
                    i6++;
                }
                Arrays.sort(jArr2[i5]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i7 = 0; i7 < 2; i7++) {
            long[] jArr5 = jArr2[i7];
            jArr4[i7] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        m176490b(arrayList, jArr4);
        riw0 riw0VarMo12533c = hjw0.m131417b(AbstractC2116c3.zzc()).m121637b(2).mo12533c();
        int i8 = 0;
        while (i8 < 2) {
            int length = jArr2[i8].length;
            if (length <= i) {
                i2 = i3;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i9 = i3;
                while (true) {
                    long[] jArr6 = jArr2[i8];
                    int length2 = jArr6.length;
                    double dLog = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    if (i9 >= length2) {
                        break;
                    }
                    int i10 = i3;
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i9];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i9] = dLog;
                    i9++;
                    i3 = i10;
                    jArr2 = jArr7;
                }
                i2 = i3;
                jArr = jArr2;
                int i11 = length - 1;
                double d = dArr[i11] - dArr[i2];
                int i12 = i2;
                while (i12 < i11) {
                    double d2 = dArr[i12];
                    i12++;
                    riw0VarMo12533c.zzq(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i12]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i8));
                    i = i;
                }
            }
            i8++;
            i3 = i2;
            jArr2 = jArr;
            i = i;
        }
        int i13 = i3;
        long[][] jArr8 = jArr2;
        zzgaa zzgaaVarZzj = zzgaa.zzj(riw0VarMo12533c.zzr());
        for (int i14 = i13; i14 < zzgaaVarZzj.size(); i14++) {
            int iIntValue = ((Integer) zzgaaVarZzj.get(i14)).intValue();
            int i15 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i15;
            jArr4[iIntValue] = jArr8[iIntValue][i15];
            m176490b(arrayList, jArr4);
        }
        for (int i16 = i13; i16 < 2; i16++) {
            if (arrayList.get(i16) != null) {
                long j3 = jArr4[i16];
                jArr4[i16] = j3 + j3;
            }
        }
        m176490b(arrayList, jArr4);
        ghw0 ghw0Var2 = new ghw0();
        while (i13 < arrayList.size()) {
            ghw0 ghw0Var3 = (ghw0) arrayList.get(i13);
            ghw0Var2.m126240g(ghw0Var3 == null ? zzgaa.zzl() : ghw0Var3.m126243j());
            i13++;
        }
        return ghw0Var2.m126243j();
    }

    /* JADX INFO: renamed from: b */
    public static void m176490b(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ghw0 ghw0Var = (ghw0) list.get(i2);
            if (ghw0Var != null) {
                ghw0Var.m126240g(new oty0(j, jArr[i2]));
            }
        }
    }
}
