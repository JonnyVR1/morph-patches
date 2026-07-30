package p153l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzagv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class olr0 implements tlr0 {

    /* JADX INFO: renamed from: a */
    public final long[] f147864a;

    /* JADX INFO: renamed from: b */
    public final long[] f147865b;

    /* JADX INFO: renamed from: c */
    public final long f147866c;

    public olr0(long[] jArr, long[] jArr2, long j) {
        this.f147864a = jArr;
        this.f147865b = jArr2;
        this.f147866c = j == -9223372036854775807L ? mpw0.m159393F(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: c */
    public static olr0 m168163c(long j, zzagv zzagvVar, long j2) {
        int length = zzagvVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzagvVar.zzb + zzagvVar.zzd[i3]);
            j3 += (long) (zzagvVar.zzc + zzagvVar.zze[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new olr0(jArr, jArr2, j2);
    }

    /* JADX INFO: renamed from: d */
    public static Pair m168164d(long j, long[] jArr, long[] jArr2) {
        int iM159420r = mpw0.m159420r(jArr, j, true, true);
        long j2 = jArr[iM159420r];
        long j3 = jArr2[iM159420r];
        int i = iM159420r + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p153l.bgr0
    /* JADX INFO: renamed from: a */
    public final zfr0 mo97719a(long j) {
        Pair pairM168164d = m168164d(mpw0.m159396I(Math.max(0L, Math.min(j, this.f147866c))), this.f147865b, this.f147864a);
        cgr0 cgr0Var = new cgr0(mpw0.m159393F(((Long) pairM168164d.first).longValue()), ((Long) pairM168164d.second).longValue());
        return new zfr0(cgr0Var, cgr0Var);
    }

    @Override // p153l.tlr0
    /* JADX INFO: renamed from: b */
    public final long mo158947b(long j) {
        return mpw0.m159393F(((Long) m168164d(j, this.f147864a, this.f147865b).second).longValue());
    }

    @Override // p153l.bgr0
    public final long zza() {
        return this.f147866c;
    }

    @Override // p153l.tlr0
    public final long zzc() {
        return -1L;
    }

    @Override // p153l.bgr0
    public final boolean zzh() {
        return true;
    }
}
