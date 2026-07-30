package p149l;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e500 implements kce0 {

    /* JADX INFO: renamed from: a */
    public final long[] f89336a;

    /* JADX INFO: renamed from: b */
    public final long[] f89337b;

    /* JADX INFO: renamed from: c */
    public final long f89338c;

    public e500(long[] jArr, long[] jArr2, long j) {
        this.f89336a = jArr;
        this.f89337b = jArr2;
        this.f89338c = j == -9223372036854775807L ? vck0.m197806J0(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: a */
    public static e500 m114734a(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.bytesDeviations.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.bytesBetweenReference + mlltFrame.bytesDeviations[i3]);
            j3 += (long) (mlltFrame.millisecondsBetweenReference + mlltFrame.millisecondsDeviations[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new e500(jArr, jArr2, j2);
    }

    /* JADX INFO: renamed from: b */
    public static Pair<Long, Long> m114735b(long j, long[] jArr, long[] jArr2) {
        int iM197863i = vck0.m197863i(jArr, j, true, true);
        long j2 = jArr[iM197863i];
        long j3 = jArr2[iM197863i];
        int i = iM197863i + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: c */
    public long mo99379c(long j) {
        return vck0.m197806J0(((Long) m114735b(j, this.f89336a, this.f89337b).second).longValue());
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: d */
    public hce0.C17274a mo98121d(long j) {
        Pair<Long, Long> pairM114735b = m114735b(vck0.m197874l1(vck0.m197886r(j, 0L, this.f89338c)), this.f89337b, this.f89336a);
        return new hce0.C17274a(new jce0(vck0.m197806J0(((Long) pairM114735b.first).longValue()), ((Long) pairM114735b.second).longValue()));
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: e */
    public boolean mo98122e() {
        return true;
    }

    @Override // p149l.kce0
    /* JADX INFO: renamed from: g */
    public long mo99380g() {
        return -1L;
    }

    @Override // p149l.hce0
    /* JADX INFO: renamed from: i */
    public long mo98123i() {
        return this.f89338c;
    }
}
