package p153l;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class td00 implements pke0 {

    /* JADX INFO: renamed from: a */
    public final long[] f173290a;

    /* JADX INFO: renamed from: b */
    public final long[] f173291b;

    /* JADX INFO: renamed from: c */
    public final long f173292c;

    public td00(long[] jArr, long[] jArr2, long j) {
        this.f173290a = jArr;
        this.f173291b = jArr2;
        this.f173292c = j == -9223372036854775807L ? bmk0.m105084J0(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: a */
    public static td00 m190563a(long j, MlltFrame mlltFrame, long j2) {
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
        return new td00(jArr, jArr2, j2);
    }

    /* JADX INFO: renamed from: b */
    public static Pair<Long, Long> m190564b(long j, long[] jArr, long[] jArr2) {
        int iM105141i = bmk0.m105141i(jArr, j, true, true);
        long j2 = jArr[iM105141i];
        long j3 = jArr2[iM105141i];
        int i = iM105141i + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: c */
    public long mo128052c(long j) {
        return bmk0.m105084J0(((Long) m190564b(j, this.f173290a, this.f173291b).second).longValue());
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: d */
    public mke0.C18640a mo107791d(long j) {
        Pair<Long, Long> pairM190564b = m190564b(bmk0.m105152l1(bmk0.m105164r(j, 0L, this.f173292c)), this.f173291b, this.f173290a);
        return new mke0.C18640a(new oke0(bmk0.m105084J0(((Long) pairM190564b.first).longValue()), ((Long) pairM190564b.second).longValue()));
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: e */
    public boolean mo107792e() {
        return true;
    }

    @Override // p153l.pke0
    /* JADX INFO: renamed from: g */
    public long mo128053g() {
        return -1L;
    }

    @Override // p153l.mke0
    /* JADX INFO: renamed from: i */
    public long mo107793i() {
        return this.f173292c;
    }
}
