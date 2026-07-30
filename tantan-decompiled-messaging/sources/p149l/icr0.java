package p149l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzagv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
public final class icr0 implements ncr0 {

    /* JADX INFO: renamed from: a */
    public final long[] f112476a;

    /* JADX INFO: renamed from: b */
    public final long[] f112477b;

    /* JADX INFO: renamed from: c */
    public final long f112478c;

    public icr0(long[] jArr, long[] jArr2, long j) {
        this.f112476a = jArr;
        this.f112477b = jArr2;
        this.f112478c = j == -9223372036854775807L ? ggw0.m126049F(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: c */
    public static icr0 m135363c(long j, zzagv zzagvVar, long j2) {
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
        return new icr0(jArr, jArr2, j2);
    }

    /* JADX INFO: renamed from: d */
    public static Pair m135364d(long j, long[] jArr, long[] jArr2) {
        int iM126076r = ggw0.m126076r(jArr, j, true, true);
        long j2 = jArr[iM126076r];
        long j3 = jArr2[iM126076r];
        int i = iM126076r + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p149l.v6r0
    /* JADX INFO: renamed from: a */
    public final t6r0 mo124628a(long j) {
        Pair pairM135364d = m135364d(ggw0.m126052I(Math.max(0L, Math.min(j, this.f112478c))), this.f112477b, this.f112476a);
        w6r0 w6r0Var = new w6r0(ggw0.m126049F(((Long) pairM135364d.first).longValue()), ((Long) pairM135364d.second).longValue());
        return new t6r0(w6r0Var, w6r0Var);
    }

    @Override // p149l.ncr0
    /* JADX INFO: renamed from: b */
    public final long mo125519b(long j) {
        return ggw0.m126049F(((Long) m135364d(j, this.f112476a, this.f112477b).second).longValue());
    }

    @Override // p149l.v6r0
    public final long zza() {
        return this.f112478c;
    }

    @Override // p149l.ncr0
    public final long zzc() {
        return -1L;
    }

    @Override // p149l.v6r0
    public final boolean zzh() {
        return true;
    }
}
