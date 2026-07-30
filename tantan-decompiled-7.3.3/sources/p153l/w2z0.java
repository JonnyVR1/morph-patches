package p153l;

import com.google.android.gms.internal.ads.AbstractC2139c3;
import com.google.android.gms.internal.ads.zzgaa;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w2z0 extends o3z0 {

    /* JADX INFO: renamed from: f */
    public final b6z0 f186960f;

    /* JADX INFO: renamed from: g */
    public final zzgaa f186961g;

    /* JADX INFO: renamed from: h */
    public final mfv0 f186962h;

    public w2z0(t2u0 t2u0Var, int[] iArr, int i, b6z0 b6z0Var, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, mfv0 mfv0Var) {
        super(t2u0Var, iArr, 0);
        this.f186960f = b6z0Var;
        this.f186961g = zzgaa.zzj(list);
        this.f186962h = mfv0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ zzgaa m204611a(m5z0[] m5z0VarArr) {
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
            m5z0 m5z0Var = m5z0VarArr[i4];
            if (m5z0Var == null || m5z0Var.f134955b.length <= 1) {
                arrayList.add(null);
            } else {
                mqw0 mqw0Var = new mqw0();
                mqw0Var.m159613g(new u2z0(0L, 0L));
                arrayList.add(mqw0Var);
            }
            i4++;
        }
        long[][] jArr2 = new long[2][];
        for (int i5 = 0; i5 < 2; i5++) {
            m5z0 m5z0Var2 = m5z0VarArr[i5];
            if (m5z0Var2 == null) {
                jArr2[i5] = new long[0];
            } else {
                jArr2[i5] = new long[m5z0Var2.f134955b.length];
                int i6 = 0;
                while (true) {
                    int[] iArr = m5z0Var2.f134955b;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    long j = m5z0Var2.f134954a.m189003b(iArr[i6]).f170247h;
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
        m204612b(arrayList, jArr4);
        xrw0 xrw0VarMo12587c = nsw0.m164647b(AbstractC2139c3.zzc()).m155735b(2).mo12587c();
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
                    xrw0VarMo12587c.zzq(Double.valueOf(d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? 1.0d : (((d2 + dArr[i12]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i8));
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
        zzgaa zzgaaVarZzj = zzgaa.zzj(xrw0VarMo12587c.zzr());
        for (int i14 = i13; i14 < zzgaaVarZzj.size(); i14++) {
            int iIntValue = ((Integer) zzgaaVarZzj.get(i14)).intValue();
            int i15 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i15;
            jArr4[iIntValue] = jArr8[iIntValue][i15];
            m204612b(arrayList, jArr4);
        }
        for (int i16 = i13; i16 < 2; i16++) {
            if (arrayList.get(i16) != null) {
                long j3 = jArr4[i16];
                jArr4[i16] = j3 + j3;
            }
        }
        m204612b(arrayList, jArr4);
        mqw0 mqw0Var2 = new mqw0();
        while (i13 < arrayList.size()) {
            mqw0 mqw0Var3 = (mqw0) arrayList.get(i13);
            mqw0Var2.m159613g(mqw0Var3 == null ? zzgaa.zzl() : mqw0Var3.m159616j());
            i13++;
        }
        return mqw0Var2.m159616j();
    }

    /* JADX INFO: renamed from: b */
    public static void m204612b(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            mqw0 mqw0Var = (mqw0) list.get(i2);
            if (mqw0Var != null) {
                mqw0Var.m159613g(new u2z0(j, jArr[i2]));
            }
        }
    }
}
